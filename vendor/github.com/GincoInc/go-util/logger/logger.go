package logger

import (
	"bytes"
	"log"
	"os"
	"sync"
	"time"

	"github.com/blendle/zapdriver"
	"go.uber.org/zap"
	"go.uber.org/zap/zapcore"
)

const calldepth = 1

var (
	l    *zap.Logger
	once sync.Once
)

func init() {
	once.Do(func() {
		l = new(os.Getenv("GOENV"))
	})
}

// Debug logs a message at DebugLevel. The message includes any fields passed
// at the log site, as well as any fields accumulated on the logger.
func Debug(msg string, fields ...zap.Field) {
	l.Debug(msg, fields...)
}

// Info logs a message at InfoLevel. The message includes any fields passed
// at the log site, as well as any fields accumulated on the logger.
func Info(msg string, fields ...zap.Field) {
	l.Info(msg, fields...)
}

// Warn logs a message at WarnLevel. The message includes any fields passed
// at the log site, as well as any fields accumulated on the logger.
func Warn(msg string, fields ...zap.Field) {
	l.Warn(msg, fields...)
}

// Error logs a message at ErrorLevel. The message includes any fields passed
// at the log site, as well as any fields accumulated on the logger.
func Error(msg string, fields ...zap.Field) {
	l.Error(msg, fields...)
}

// DPanic logs a message at DPanicLevel. The message includes any fields
// passed at the log site, as well as any fields accumulated on the logger.
//
// If the logger is in development mode, it then panics (DPanic means
// "development panic"). This is useful for catching errors that are
// recoverable, but shouldn't ever happen.
func DPanic(msg string, fields ...zap.Field) {
	l.DPanic(msg, fields...)
}

// Panic logs a message at PanicLevel. The message includes any fields passed
// at the log site, as well as any fields accumulated on the logger.
//
// The logger then panics, even if logging at PanicLevel is disabled.
func Panic(msg string, fields ...zap.Field) {
	l.Panic(msg, fields...)
}

// Fatal logs a message at FatalLevel. The message includes any fields passed
// at the log site, as well as any fields accumulated on the logger.
//
// The logger then calls os.Exit(1), even if logging at FatalLevel is
// disabled.
func Fatal(msg string, fields ...zap.Field) {
	l.Fatal(msg, fields...)
}

// Logger ...
func Logger() *zap.Logger {
	return l
}

// Reset ...
func Reset() {
	l = new(os.Getenv("GOENV"))
}

// SetDummy for test
func SetDummy(buf *bytes.Buffer) {
	var cfg = zap.NewProductionEncoderConfig()
	cfg.EncodeTime = dummyTimeEncoder
	encoder := zapcore.NewJSONEncoder(cfg)
	core := zapcore.NewCore(encoder, zapcore.Lock(zapcore.AddSync(buf)), zapcore.InfoLevel)
	l = zap.New(core)
}

func new(env string) *zap.Logger {
	var cfg zap.Config
	switch env {
	case "qa":
		cfg = qaConfig()
	case "prod":
		cfg = productionConfig()
	default:
		cfg = devConfig()
	}

	logger, err := cfg.Build(zapdriver.WrapCore(), zap.AddCallerSkip(calldepth))
	if err != nil {
		log.Fatalln(err)
	}

	return logger
}

func devConfig() zap.Config {
	var cfg = zapdriver.NewDevelopmentConfig()
	cfg.InitialFields = map[string]interface{}{"env": "dev"}
	cfg.DisableStacktrace = true
	return cfg
}

func qaConfig() zap.Config {
	var cfg = zapdriver.NewDevelopmentConfig()
	cfg.InitialFields = map[string]interface{}{"env": "qa"}
	cfg.DisableStacktrace = true
	return cfg
}

func productionConfig() zap.Config {
	var cfg = zapdriver.NewProductionConfig()
	cfg.InitialFields = map[string]interface{}{"env": "prod"}
	cfg.DisableStacktrace = true
	return cfg
}

func dummyTimeEncoder(_ time.Time, enc zapcore.PrimitiveArrayEncoder) {
	enc.AppendString(time.UnixDate)
}
