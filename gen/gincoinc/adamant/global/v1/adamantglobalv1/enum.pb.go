// Code generated by protoc-gen-go. DO NOT EDIT.
// source: gincoinc/adamant/global/v1/adamantglobalv1/enum.proto

package adamantglobalv1

import (
	fmt "fmt"
	proto "github.com/golang/protobuf/proto"
	math "math"
)

// Reference imports to suppress errors if they are not otherwise used.
var _ = proto.Marshal
var _ = fmt.Errorf
var _ = math.Inf

// This is a compile-time assertion to ensure that this generated file
// is compatible with the proto package it is being compiled against.
// A compilation error at this line likely means your copy of the
// proto package needs to be updated.
const _ = proto.ProtoPackageIsVersion3 // please upgrade the proto package

// WalletType is a type of wallet.
type WalletType int32

const (
	WalletType_WALLET_TYPE_INVALID           WalletType = 0
	WalletType_WALLET_TYPE_SELF_CUSTODY_HOT  WalletType = 1
	WalletType_WALLET_TYPE_SELF_CUSTODY_COLD WalletType = 2
)

var WalletType_name = map[int32]string{
	0: "WALLET_TYPE_INVALID",
	1: "WALLET_TYPE_SELF_CUSTODY_HOT",
	2: "WALLET_TYPE_SELF_CUSTODY_COLD",
}

var WalletType_value = map[string]int32{
	"WALLET_TYPE_INVALID":           0,
	"WALLET_TYPE_SELF_CUSTODY_HOT":  1,
	"WALLET_TYPE_SELF_CUSTODY_COLD": 2,
}

func (x WalletType) String() string {
	return proto.EnumName(WalletType_name, int32(x))
}

func (WalletType) EnumDescriptor() ([]byte, []int) {
	return fileDescriptor_16c66c285f92ee3d, []int{0}
}

// WalletState is a state of wallet.
// PROPOSED:         Wallet作成
// KEY_REGISTERED:   鍵の登録
// AUDITOR_REVIEWED: 監査役の承認済
// ACTIVATING:       アクティベート中
// ACTIVATED:        アクティベート完了
// CREATING:         TX送信
// COMPLETED:        Wallet完成
// CANCELLED:        キャンセル済み
// ARCHIVED:         アーカイブ済み
type WalletState int32

const (
	WalletState_WALLET_STATE_INVALID            WalletState = 0
	WalletState_WALLET_STATE_PROPOSED           WalletState = 1
	WalletState_WALLET_STATE_KEY_REGISTERED     WalletState = 2
	WalletState_WALLET_STATE_VALIDATOR_REVIEWED WalletState = 3
	WalletState_WALLET_STATE_ACTIVATING         WalletState = 4
	WalletState_WALLET_STATE_ACTIVATED          WalletState = 5
	WalletState_WALLET_STATE_CREATING           WalletState = 6
	WalletState_WALLET_STATE_COMPLETED          WalletState = 7
	WalletState_WALLET_STATE_CANCELLED          WalletState = 8
	WalletState_WALLET_STATE_ARCHIVED           WalletState = 9
)

var WalletState_name = map[int32]string{
	0: "WALLET_STATE_INVALID",
	1: "WALLET_STATE_PROPOSED",
	2: "WALLET_STATE_KEY_REGISTERED",
	3: "WALLET_STATE_VALIDATOR_REVIEWED",
	4: "WALLET_STATE_ACTIVATING",
	5: "WALLET_STATE_ACTIVATED",
	6: "WALLET_STATE_CREATING",
	7: "WALLET_STATE_COMPLETED",
	8: "WALLET_STATE_CANCELLED",
	9: "WALLET_STATE_ARCHIVED",
}

var WalletState_value = map[string]int32{
	"WALLET_STATE_INVALID":            0,
	"WALLET_STATE_PROPOSED":           1,
	"WALLET_STATE_KEY_REGISTERED":     2,
	"WALLET_STATE_VALIDATOR_REVIEWED": 3,
	"WALLET_STATE_ACTIVATING":         4,
	"WALLET_STATE_ACTIVATED":          5,
	"WALLET_STATE_CREATING":           6,
	"WALLET_STATE_COMPLETED":          7,
	"WALLET_STATE_CANCELLED":          8,
	"WALLET_STATE_ARCHIVED":           9,
}

func (x WalletState) String() string {
	return proto.EnumName(WalletState_name, int32(x))
}

func (WalletState) EnumDescriptor() ([]byte, []int) {
	return fileDescriptor_16c66c285f92ee3d, []int{1}
}

// AddressState is a state of address.
// CREATING:         作成中
// COMPLETED:        Address完成
type AddressState int32

const (
	AddressState_ADDRESS_STATE_INVALID   AddressState = 0
	AddressState_ADDRESS_STATE_CREATING  AddressState = 1
	AddressState_ADDRESS_STATE_COMPLETED AddressState = 2
)

var AddressState_name = map[int32]string{
	0: "ADDRESS_STATE_INVALID",
	1: "ADDRESS_STATE_CREATING",
	2: "ADDRESS_STATE_COMPLETED",
}

var AddressState_value = map[string]int32{
	"ADDRESS_STATE_INVALID":   0,
	"ADDRESS_STATE_CREATING":  1,
	"ADDRESS_STATE_COMPLETED": 2,
}

func (x AddressState) String() string {
	return proto.EnumName(AddressState_name, int32(x))
}

func (AddressState) EnumDescriptor() ([]byte, []int) {
	return fileDescriptor_16c66c285f92ee3d, []int{2}
}

// TransactionState is a state of transaction.
// SIGNING:    署名中
// SIGNED:     署名完了
// REVIEWED:   =AUDITOR_REVIEWED
// SUBMITTED:  SendTx成功
// CANCELLED:    キャンセル
type TransactionState int32

const (
	TransactionState_TRANSACTION_STATE_INVALID   TransactionState = 0
	TransactionState_TRANSACTION_STATE_SIGNING   TransactionState = 1
	TransactionState_TRANSACTION_STATE_SIGNED    TransactionState = 2
	TransactionState_TRANSACTION_STATE_REVIEWED  TransactionState = 3
	TransactionState_TRANSACTION_STATE_SUBMITTED TransactionState = 4
	TransactionState_TRANSACTION_STATE_CANCELLED TransactionState = 5
)

var TransactionState_name = map[int32]string{
	0: "TRANSACTION_STATE_INVALID",
	1: "TRANSACTION_STATE_SIGNING",
	2: "TRANSACTION_STATE_SIGNED",
	3: "TRANSACTION_STATE_REVIEWED",
	4: "TRANSACTION_STATE_SUBMITTED",
	5: "TRANSACTION_STATE_CANCELLED",
}

var TransactionState_value = map[string]int32{
	"TRANSACTION_STATE_INVALID":   0,
	"TRANSACTION_STATE_SIGNING":   1,
	"TRANSACTION_STATE_SIGNED":    2,
	"TRANSACTION_STATE_REVIEWED":  3,
	"TRANSACTION_STATE_SUBMITTED": 4,
	"TRANSACTION_STATE_CANCELLED": 5,
}

func (x TransactionState) String() string {
	return proto.EnumName(TransactionState_name, int32(x))
}

func (TransactionState) EnumDescriptor() ([]byte, []int) {
	return fileDescriptor_16c66c285f92ee3d, []int{3}
}

// -----------------------------------------------------------------------------
// Account
// -----------------------------------------------------------------------------
type AccountType int32

const (
	AccountType_ACCOUNT_TYPE_INVALID         AccountType = 0
	AccountType_ACCOUNT_TYPE_USER            AccountType = 1
	AccountType_ACCOUNT_TYPE_SERVICE_ACCOUNT AccountType = 2
)

var AccountType_name = map[int32]string{
	0: "ACCOUNT_TYPE_INVALID",
	1: "ACCOUNT_TYPE_USER",
	2: "ACCOUNT_TYPE_SERVICE_ACCOUNT",
}

var AccountType_value = map[string]int32{
	"ACCOUNT_TYPE_INVALID":         0,
	"ACCOUNT_TYPE_USER":            1,
	"ACCOUNT_TYPE_SERVICE_ACCOUNT": 2,
}

func (x AccountType) String() string {
	return proto.EnumName(AccountType_name, int32(x))
}

func (AccountType) EnumDescriptor() ([]byte, []int) {
	return fileDescriptor_16c66c285f92ee3d, []int{4}
}

// UserState is a state of user.
type UserState int32

const (
	UserState_USER_STATE_INVALID     UserState = 0
	UserState_USER_STATE_UNCONFIRMED UserState = 1
	UserState_USER_STATE_CONFIRMED   UserState = 2
	UserState_USER_STATE_DEACTIVATED UserState = 3
)

var UserState_name = map[int32]string{
	0: "USER_STATE_INVALID",
	1: "USER_STATE_UNCONFIRMED",
	2: "USER_STATE_CONFIRMED",
	3: "USER_STATE_DEACTIVATED",
}

var UserState_value = map[string]int32{
	"USER_STATE_INVALID":     0,
	"USER_STATE_UNCONFIRMED": 1,
	"USER_STATE_CONFIRMED":   2,
	"USER_STATE_DEACTIVATED": 3,
}

func (x UserState) String() string {
	return proto.EnumName(UserState_name, int32(x))
}

func (UserState) EnumDescriptor() ([]byte, []int) {
	return fileDescriptor_16c66c285f92ee3d, []int{5}
}

// Role is a type of role
type RoleType int32

const (
	RoleType_ROLE_TYPE_INVALID           RoleType = 0
	RoleType_ROLE_TYPE_ORG_MANAGER       RoleType = 1
	RoleType_ROLE_TYPE_ORG_SIGNER        RoleType = 2
	RoleType_ROLE_TYPE_ORG_VALIDATOR     RoleType = 3
	RoleType_ROLE_TYPE_ORG_VIEWER        RoleType = 4
	RoleType_ROLE_TYPE_ORG_DEVELOPER     RoleType = 5
	RoleType_ROLE_TYPE_HOT_WALLET_ADMIN  RoleType = 6
	RoleType_ROLE_TYPE_HOT_WALLET_VIEWER RoleType = 7
)

var RoleType_name = map[int32]string{
	0: "ROLE_TYPE_INVALID",
	1: "ROLE_TYPE_ORG_MANAGER",
	2: "ROLE_TYPE_ORG_SIGNER",
	3: "ROLE_TYPE_ORG_VALIDATOR",
	4: "ROLE_TYPE_ORG_VIEWER",
	5: "ROLE_TYPE_ORG_DEVELOPER",
	6: "ROLE_TYPE_HOT_WALLET_ADMIN",
	7: "ROLE_TYPE_HOT_WALLET_VIEWER",
}

var RoleType_value = map[string]int32{
	"ROLE_TYPE_INVALID":           0,
	"ROLE_TYPE_ORG_MANAGER":       1,
	"ROLE_TYPE_ORG_SIGNER":        2,
	"ROLE_TYPE_ORG_VALIDATOR":     3,
	"ROLE_TYPE_ORG_VIEWER":        4,
	"ROLE_TYPE_ORG_DEVELOPER":     5,
	"ROLE_TYPE_HOT_WALLET_ADMIN":  6,
	"ROLE_TYPE_HOT_WALLET_VIEWER": 7,
}

func (x RoleType) String() string {
	return proto.EnumName(RoleType_name, int32(x))
}

func (RoleType) EnumDescriptor() ([]byte, []int) {
	return fileDescriptor_16c66c285f92ee3d, []int{6}
}

// ResourceType is a target type of role
type ResourceType int32

const (
	ResourceType_RESOURCE_TYPE_INVALID      ResourceType = 0
	ResourceType_RESOURCE_TYPE_WALLET       ResourceType = 1
	ResourceType_RESOURCE_TYPE_ORGANIZATION ResourceType = 2
)

var ResourceType_name = map[int32]string{
	0: "RESOURCE_TYPE_INVALID",
	1: "RESOURCE_TYPE_WALLET",
	2: "RESOURCE_TYPE_ORGANIZATION",
}

var ResourceType_value = map[string]int32{
	"RESOURCE_TYPE_INVALID":      0,
	"RESOURCE_TYPE_WALLET":       1,
	"RESOURCE_TYPE_ORGANIZATION": 2,
}

func (x ResourceType) String() string {
	return proto.EnumName(ResourceType_name, int32(x))
}

func (ResourceType) EnumDescriptor() ([]byte, []int) {
	return fileDescriptor_16c66c285f92ee3d, []int{7}
}

// TokenType is a type of token.
type TokenType int32

const (
	TokenType_TOKEN_TYPE_INVALID               TokenType = 0
	TokenType_TOKEN_TYPE_LOGIN_TOKEN           TokenType = 1
	TokenType_TOKEN_TYPE_MAIL_TOKEN            TokenType = 2
	TokenType_TOKEN_TYPE_PASSWORD_RESET_TOKEN  TokenType = 3
	TokenType_TOKEN_TYPE_PASSWORD_UPDATE_TOKEN TokenType = 4
	TokenType_TOKEN_TYPE_SIGNUP_TOKEN          TokenType = 5
)

var TokenType_name = map[int32]string{
	0: "TOKEN_TYPE_INVALID",
	1: "TOKEN_TYPE_LOGIN_TOKEN",
	2: "TOKEN_TYPE_MAIL_TOKEN",
	3: "TOKEN_TYPE_PASSWORD_RESET_TOKEN",
	4: "TOKEN_TYPE_PASSWORD_UPDATE_TOKEN",
	5: "TOKEN_TYPE_SIGNUP_TOKEN",
}

var TokenType_value = map[string]int32{
	"TOKEN_TYPE_INVALID":               0,
	"TOKEN_TYPE_LOGIN_TOKEN":           1,
	"TOKEN_TYPE_MAIL_TOKEN":            2,
	"TOKEN_TYPE_PASSWORD_RESET_TOKEN":  3,
	"TOKEN_TYPE_PASSWORD_UPDATE_TOKEN": 4,
	"TOKEN_TYPE_SIGNUP_TOKEN":          5,
}

func (x TokenType) String() string {
	return proto.EnumName(TokenType_name, int32(x))
}

func (TokenType) EnumDescriptor() ([]byte, []int) {
	return fileDescriptor_16c66c285f92ee3d, []int{8}
}

// PolicyType is a type of policy.
type PolicyType int32

const (
	PolicyType_POLICY_TYPE_INVALID            PolicyType = 0
	PolicyType_POLICY_TYPE_HOT_WALLET_POLICY  PolicyType = 1
	PolicyType_POLICY_TYPE_COLD_WALLET_POLICY PolicyType = 2
)

var PolicyType_name = map[int32]string{
	0: "POLICY_TYPE_INVALID",
	1: "POLICY_TYPE_HOT_WALLET_POLICY",
	2: "POLICY_TYPE_COLD_WALLET_POLICY",
}

var PolicyType_value = map[string]int32{
	"POLICY_TYPE_INVALID":            0,
	"POLICY_TYPE_HOT_WALLET_POLICY":  1,
	"POLICY_TYPE_COLD_WALLET_POLICY": 2,
}

func (x PolicyType) String() string {
	return proto.EnumName(PolicyType_name, int32(x))
}

func (PolicyType) EnumDescriptor() ([]byte, []int) {
	return fileDescriptor_16c66c285f92ee3d, []int{9}
}

type TransferLimitType int32

const (
	TransferLimitType_TRANSFER_LIMIT_TYPE_INVALID  TransferLimitType = 0
	TransferLimitType_TRANSFER_LIMIT_TYPE_HOURLY   TransferLimitType = 1
	TransferLimitType_TRANSFER_LIMIT_TYPE_DAILY    TransferLimitType = 2
	TransferLimitType_TRANSFER_LIMIT_TYPE_ONE_TIME TransferLimitType = 3
)

var TransferLimitType_name = map[int32]string{
	0: "TRANSFER_LIMIT_TYPE_INVALID",
	1: "TRANSFER_LIMIT_TYPE_HOURLY",
	2: "TRANSFER_LIMIT_TYPE_DAILY",
	3: "TRANSFER_LIMIT_TYPE_ONE_TIME",
}

var TransferLimitType_value = map[string]int32{
	"TRANSFER_LIMIT_TYPE_INVALID":  0,
	"TRANSFER_LIMIT_TYPE_HOURLY":   1,
	"TRANSFER_LIMIT_TYPE_DAILY":    2,
	"TRANSFER_LIMIT_TYPE_ONE_TIME": 3,
}

func (x TransferLimitType) String() string {
	return proto.EnumName(TransferLimitType_name, int32(x))
}

func (TransferLimitType) EnumDescriptor() ([]byte, []int) {
	return fileDescriptor_16c66c285f92ee3d, []int{10}
}

type NotificationType int32

const (
	NotificationType_NOTIFICATION_TYPE_INVALID                               NotificationType = 0
	NotificationType_NOTIFICATION_TYPE_WALLET_SIGNER_APPROVE_REQUEST         NotificationType = 1
	NotificationType_NOTIFICATION_TYPE_WALLET_VALIDATOR_APPROVE_REQUEST      NotificationType = 2
	NotificationType_NOTIFICATION_TYPE_WALLET_ACTIVATE_FAILED                NotificationType = 3
	NotificationType_NOTIFICATION_TYPE_WALLET_CANCELLED                      NotificationType = 4
	NotificationType_NOTIFICATION_TYPE_WALLET_COMPLETED                      NotificationType = 5
	NotificationType_NOTIFICATION_TYPE_WALLET_FAILED                         NotificationType = 6
	NotificationType_NOTIFICATION_TYPE_TRANSACTION_SIGNER_APPROVE_REQUEST    NotificationType = 7
	NotificationType_NOTIFICATION_TYPE_TRANSACTION_VALIDATOR_APPROVE_REQUEST NotificationType = 8
	NotificationType_NOTIFICATION_TYPE_TRANSACTION_SUBMITTED                 NotificationType = 9
	NotificationType_NOTIFICATION_TYPE_TRANSACTION_CANCELLED                 NotificationType = 10
	NotificationType_NOTIFICATION_TYPE_TRANSFER_SEND_COMPLETED               NotificationType = 11
	NotificationType_NOTIFICATION_TYPE_TRANSFER_SEND_FAILED                  NotificationType = 12
	NotificationType_NOTIFICATION_TYPE_TRANSFER_RECEIVE_COMPLETED            NotificationType = 13
	NotificationType_NOTIFICATION_TYPE_TRANSFER_RECEIVE_FAILED               NotificationType = 14
)

var NotificationType_name = map[int32]string{
	0:  "NOTIFICATION_TYPE_INVALID",
	1:  "NOTIFICATION_TYPE_WALLET_SIGNER_APPROVE_REQUEST",
	2:  "NOTIFICATION_TYPE_WALLET_VALIDATOR_APPROVE_REQUEST",
	3:  "NOTIFICATION_TYPE_WALLET_ACTIVATE_FAILED",
	4:  "NOTIFICATION_TYPE_WALLET_CANCELLED",
	5:  "NOTIFICATION_TYPE_WALLET_COMPLETED",
	6:  "NOTIFICATION_TYPE_WALLET_FAILED",
	7:  "NOTIFICATION_TYPE_TRANSACTION_SIGNER_APPROVE_REQUEST",
	8:  "NOTIFICATION_TYPE_TRANSACTION_VALIDATOR_APPROVE_REQUEST",
	9:  "NOTIFICATION_TYPE_TRANSACTION_SUBMITTED",
	10: "NOTIFICATION_TYPE_TRANSACTION_CANCELLED",
	11: "NOTIFICATION_TYPE_TRANSFER_SEND_COMPLETED",
	12: "NOTIFICATION_TYPE_TRANSFER_SEND_FAILED",
	13: "NOTIFICATION_TYPE_TRANSFER_RECEIVE_COMPLETED",
	14: "NOTIFICATION_TYPE_TRANSFER_RECEIVE_FAILED",
}

var NotificationType_value = map[string]int32{
	"NOTIFICATION_TYPE_INVALID":                               0,
	"NOTIFICATION_TYPE_WALLET_SIGNER_APPROVE_REQUEST":         1,
	"NOTIFICATION_TYPE_WALLET_VALIDATOR_APPROVE_REQUEST":      2,
	"NOTIFICATION_TYPE_WALLET_ACTIVATE_FAILED":                3,
	"NOTIFICATION_TYPE_WALLET_CANCELLED":                      4,
	"NOTIFICATION_TYPE_WALLET_COMPLETED":                      5,
	"NOTIFICATION_TYPE_WALLET_FAILED":                         6,
	"NOTIFICATION_TYPE_TRANSACTION_SIGNER_APPROVE_REQUEST":    7,
	"NOTIFICATION_TYPE_TRANSACTION_VALIDATOR_APPROVE_REQUEST": 8,
	"NOTIFICATION_TYPE_TRANSACTION_SUBMITTED":                 9,
	"NOTIFICATION_TYPE_TRANSACTION_CANCELLED":                 10,
	"NOTIFICATION_TYPE_TRANSFER_SEND_COMPLETED":               11,
	"NOTIFICATION_TYPE_TRANSFER_SEND_FAILED":                  12,
	"NOTIFICATION_TYPE_TRANSFER_RECEIVE_COMPLETED":            13,
	"NOTIFICATION_TYPE_TRANSFER_RECEIVE_FAILED":               14,
}

func (x NotificationType) String() string {
	return proto.EnumName(NotificationType_name, int32(x))
}

func (NotificationType) EnumDescriptor() ([]byte, []int) {
	return fileDescriptor_16c66c285f92ee3d, []int{11}
}

func init() {
	proto.RegisterEnum("adamant.global.v1.WalletType", WalletType_name, WalletType_value)
	proto.RegisterEnum("adamant.global.v1.WalletState", WalletState_name, WalletState_value)
	proto.RegisterEnum("adamant.global.v1.AddressState", AddressState_name, AddressState_value)
	proto.RegisterEnum("adamant.global.v1.TransactionState", TransactionState_name, TransactionState_value)
	proto.RegisterEnum("adamant.global.v1.AccountType", AccountType_name, AccountType_value)
	proto.RegisterEnum("adamant.global.v1.UserState", UserState_name, UserState_value)
	proto.RegisterEnum("adamant.global.v1.RoleType", RoleType_name, RoleType_value)
	proto.RegisterEnum("adamant.global.v1.ResourceType", ResourceType_name, ResourceType_value)
	proto.RegisterEnum("adamant.global.v1.TokenType", TokenType_name, TokenType_value)
	proto.RegisterEnum("adamant.global.v1.PolicyType", PolicyType_name, PolicyType_value)
	proto.RegisterEnum("adamant.global.v1.TransferLimitType", TransferLimitType_name, TransferLimitType_value)
	proto.RegisterEnum("adamant.global.v1.NotificationType", NotificationType_name, NotificationType_value)
}

func init() {
	proto.RegisterFile("gincoinc/adamant/global/v1/adamantglobalv1/enum.proto", fileDescriptor_16c66c285f92ee3d)
}

var fileDescriptor_16c66c285f92ee3d = []byte{
	// 976 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0x84, 0x56, 0xeb, 0x72, 0xdb, 0x44,
	0x14, 0x46, 0x4a, 0x9c, 0xcb, 0x49, 0x80, 0xcd, 0x92, 0xb8, 0x76, 0xd2, 0x34, 0x6d, 0x61, 0x0a,
	0x88, 0x12, 0x13, 0xca, 0x6d, 0x86, 0x5f, 0x5b, 0x69, 0xed, 0xec, 0x54, 0xd6, 0x8a, 0x95, 0xe4,
	0x8c, 0xfb, 0x47, 0x38, 0x8e, 0xda, 0x31, 0x38, 0x56, 0xc7, 0x76, 0x32, 0xd3, 0x07, 0xe1, 0x39,
	0x78, 0x07, 0x1e, 0x80, 0xe1, 0x3d, 0x78, 0x89, 0xce, 0xae, 0x7c, 0xd1, 0xcd, 0xc9, 0xdf, 0xf3,
	0x7d, 0x67, 0xcf, 0xfd, 0x93, 0xe0, 0xc7, 0xb7, 0x83, 0x51, 0x3f, 0x1e, 0x8c, 0xfa, 0x8d, 0xde,
	0x55, 0xef, 0xba, 0x37, 0x9a, 0x36, 0xde, 0x0e, 0xe3, 0xcb, 0xde, 0xb0, 0x71, 0x7b, 0x36, 0xb7,
	0x24, 0x86, 0xdb, 0xb3, 0x46, 0x34, 0xba, 0xb9, 0x3e, 0x7d, 0x37, 0x8e, 0xa7, 0x31, 0xde, 0x9b,
	0x61, 0xa7, 0x09, 0x78, 0x7a, 0x7b, 0x66, 0xfc, 0x01, 0x70, 0xd1, 0x1b, 0x0e, 0xa3, 0xa9, 0xff,
	0xfe, 0x5d, 0x84, 0x1f, 0xc0, 0x67, 0x17, 0xc4, 0xb6, 0xa9, 0x1f, 0xfa, 0x5d, 0x97, 0x86, 0xcc,
	0xe9, 0x10, 0x9b, 0x59, 0xe8, 0x23, 0xfc, 0x18, 0x1e, 0xa6, 0x01, 0x8f, 0xda, 0xcd, 0xd0, 0x0c,
	0x3c, 0x9f, 0x5b, 0xdd, 0xf0, 0x9c, 0xfb, 0x48, 0xc3, 0x4f, 0xe0, 0x78, 0x25, 0xc3, 0xe4, 0xb6,
	0x85, 0x74, 0xe3, 0x6f, 0x1d, 0x76, 0x92, 0x60, 0xde, 0xb4, 0x37, 0x8d, 0x70, 0x0d, 0xf6, 0x67,
	0x2e, 0x9e, 0x4f, 0xfc, 0x74, 0xb8, 0x3a, 0x1c, 0x64, 0x10, 0x57, 0x70, 0x97, 0x7b, 0xd4, 0x42,
	0x1a, 0x3e, 0x81, 0xa3, 0x0c, 0xf4, 0x8a, 0x76, 0x43, 0x41, 0x5b, 0xcc, 0xf3, 0xa9, 0xa0, 0x16,
	0xd2, 0xf1, 0xe7, 0x70, 0x92, 0x21, 0xa8, 0x37, 0x89, 0xcf, 0x45, 0x28, 0x68, 0x87, 0xd1, 0x0b,
	0x6a, 0xa1, 0x35, 0x7c, 0x04, 0x0f, 0x32, 0x24, 0x62, 0xfa, 0xac, 0x43, 0x7c, 0xe6, 0xb4, 0xd0,
	0x3a, 0x3e, 0x84, 0x6a, 0x19, 0x48, 0x2d, 0x54, 0x29, 0x64, 0x66, 0x0a, 0x9a, 0xb8, 0x6d, 0x14,
	0xdc, 0x4c, 0xde, 0x76, 0x6d, 0x2a, 0xdd, 0x36, 0x8b, 0x18, 0x71, 0x4c, 0x6a, 0xdb, 0xd4, 0x42,
	0x5b, 0x85, 0x27, 0x89, 0x30, 0xcf, 0x59, 0x87, 0x5a, 0x68, 0xdb, 0xb8, 0x84, 0x5d, 0x72, 0x75,
	0x35, 0x8e, 0x26, 0x93, 0xa4, 0x63, 0x75, 0x38, 0x20, 0x96, 0x25, 0xa8, 0xe7, 0x15, 0x5a, 0x76,
	0x08, 0xd5, 0x2c, 0xb4, 0xc8, 0x4c, 0x93, 0xd5, 0xe6, 0xb0, 0x45, 0x6a, 0xba, 0xf1, 0x9f, 0x06,
	0xc8, 0x1f, 0xf7, 0x46, 0x93, 0x5e, 0x7f, 0x3a, 0x88, 0x47, 0x49, 0xa0, 0x63, 0xa8, 0xfb, 0x82,
	0x38, 0x9e, 0x2c, 0x9d, 0x3b, 0x85, 0x60, 0xa5, 0xb0, 0xc7, 0x5a, 0x4e, 0x12, 0xef, 0x21, 0xd4,
	0xca, 0x61, 0x35, 0xa0, 0x47, 0x70, 0x58, 0x44, 0x53, 0xb3, 0x39, 0x81, 0xa3, 0x12, 0xef, 0xe0,
	0x65, 0x9b, 0xf9, 0x32, 0xe3, 0xf5, 0x72, 0xc2, 0xb2, 0xa3, 0x15, 0xe3, 0x77, 0xd8, 0x21, 0xfd,
	0x7e, 0x7c, 0x33, 0x4a, 0xb6, 0xba, 0x06, 0xfb, 0xc4, 0x34, 0x79, 0xe0, 0x14, 0xd6, 0xfa, 0x00,
	0xf6, 0x32, 0x48, 0xe0, 0x51, 0x81, 0x34, 0xb9, 0xed, 0x19, 0xb3, 0x47, 0x45, 0x87, 0x99, 0x72,
	0x11, 0x94, 0x11, 0xe9, 0xc6, 0x0d, 0x6c, 0x07, 0x93, 0x68, 0x9c, 0x34, 0xab, 0x0a, 0x58, 0x3a,
	0x96, 0x8d, 0x24, 0x65, 0x0f, 0x1c, 0x93, 0x3b, 0x4d, 0x26, 0xda, 0x6a, 0x8d, 0x6b, 0xb0, 0x9f,
	0xc2, 0x96, 0x88, 0x9e, 0xf3, 0xb2, 0xe8, 0x72, 0xfb, 0xd6, 0x8c, 0xff, 0x35, 0xd8, 0x12, 0xf1,
	0x30, 0x52, 0x65, 0x1d, 0xc0, 0x9e, 0xe0, 0x36, 0xcd, 0xd7, 0x54, 0x87, 0x83, 0xa5, 0x99, 0x8b,
	0x56, 0xd8, 0x26, 0x0e, 0x69, 0xa9, 0xba, 0x6a, 0xb0, 0x9f, 0x85, 0xd4, 0x4c, 0x04, 0xd2, 0xe5,
	0x86, 0x64, 0x91, 0xc5, 0xd5, 0xa0, 0xb5, 0xa2, 0x9b, 0x1a, 0x95, 0x40, 0xeb, 0x45, 0x37, 0x8b,
	0x76, 0xa8, 0xcd, 0x5d, 0x2a, 0x50, 0x45, 0xce, 0x79, 0x09, 0x9e, 0x73, 0x3f, 0x9c, 0x6d, 0x39,
	0xb1, 0xda, 0xcc, 0x41, 0x1b, 0x72, 0x8c, 0xa5, 0xf8, 0xec, 0xf5, 0x4d, 0xa3, 0x0f, 0xbb, 0x22,
	0x9a, 0xc4, 0x37, 0xe3, 0x7e, 0x52, 0xb0, 0xac, 0x8c, 0x7a, 0x3c, 0x10, 0x66, 0xa1, 0x68, 0x99,
	0x62, 0x06, 0x4a, 0xde, 0x42, 0x9a, 0xca, 0x22, 0x83, 0x70, 0xd1, 0x22, 0x0e, 0x7b, 0x4d, 0xe4,
	0xee, 0x20, 0xdd, 0xf8, 0x47, 0x83, 0x6d, 0x3f, 0xfe, 0x33, 0x1a, 0xa9, 0x10, 0x55, 0xc0, 0x3e,
	0x7f, 0x45, 0x9d, 0xfc, 0xfb, 0x87, 0x50, 0x4d, 0xd9, 0x6d, 0xde, 0x62, 0x4e, 0xa8, 0x0c, 0x48,
	0x93, 0x69, 0xa5, 0xb0, 0x36, 0x61, 0xf6, 0x0c, 0x52, 0x5a, 0x94, 0x82, 0x5c, 0xe2, 0x79, 0x17,
	0x5c, 0x58, 0xa1, 0xa0, 0x9e, 0xd4, 0x49, 0x45, 0x5a, 0xc3, 0x5f, 0xc0, 0xe3, 0x32, 0x52, 0xe0,
	0x5a, 0x72, 0x01, 0x12, 0x96, 0x6a, 0x75, 0x8a, 0x25, 0x07, 0x17, 0xb8, 0x33, 0xb0, 0x62, 0x0c,
	0x01, 0xdc, 0x78, 0x38, 0xe8, 0xbf, 0x9f, 0xab, 0xb8, 0xcb, 0x6d, 0x66, 0x76, 0xf3, 0x55, 0x3c,
	0x81, 0xe3, 0x34, 0x90, 0xea, 0x79, 0x62, 0x46, 0x1a, 0x7e, 0x0a, 0x8f, 0xd2, 0x14, 0xa9, 0xdc,
	0x39, 0x8e, 0x6e, 0xfc, 0xa5, 0xc1, 0x9e, 0x52, 0x8c, 0x37, 0xd1, 0xd8, 0x1e, 0x5c, 0x0f, 0x92,
	0x2b, 0x9b, 0x5f, 0x65, 0x93, 0x8a, 0xd0, 0x66, 0x6d, 0x56, 0x38, 0xb6, 0xf9, 0xdd, 0xe7, 0x08,
	0xe7, 0x3c, 0x10, 0xb6, 0x0c, 0x3d, 0x17, 0x95, 0x1c, 0x6e, 0x11, 0x66, 0x77, 0x91, 0x2e, 0x8f,
	0xb2, 0x0c, 0xe6, 0x0e, 0x0d, 0x7d, 0xd6, 0xa6, 0x68, 0xcd, 0xf8, 0xb7, 0x02, 0xc8, 0x89, 0xa7,
	0x83, 0x37, 0x83, 0x7e, 0x4f, 0x4a, 0x99, 0x4a, 0xeb, 0x18, 0xea, 0x0e, 0xf7, 0x59, 0x93, 0x99,
	0x6a, 0xe2, 0xf9, 0xa4, 0x5e, 0x40, 0xa3, 0x08, 0xcf, 0xe5, 0x58, 0x5d, 0x47, 0x48, 0x5c, 0x57,
	0xf0, 0x8e, 0x94, 0xa8, 0xdf, 0x02, 0xea, 0xc9, 0x9d, 0xfa, 0x09, 0xbe, 0x5f, 0xe9, 0xb4, 0xfc,
	0xdc, 0xe4, 0xfd, 0x74, 0xfc, 0x1c, 0xbe, 0x5a, 0xe9, 0x37, 0x3f, 0xf3, 0xb0, 0x49, 0x98, 0xad,
	0x74, 0xf0, 0x19, 0x3c, 0x5d, 0xc9, 0x5e, 0xaa, 0xdd, 0xfa, 0xdd, 0xbc, 0x85, 0xd0, 0x57, 0xe4,
	0x32, 0xae, 0xe4, 0xcd, 0x82, 0x6e, 0xe0, 0x5f, 0xe0, 0x87, 0x22, 0x29, 0xa3, 0xb6, 0xe5, 0x4d,
	0xd9, 0xc4, 0xbf, 0xc2, 0xcf, 0x77, 0x7b, 0xae, 0xee, 0xcc, 0x16, 0xfe, 0x06, 0xbe, 0xbc, 0x27,
	0xec, 0x42, 0xff, 0xb7, 0xef, 0x27, 0x2f, 0xbb, 0x03, 0xf8, 0x5b, 0xf8, 0x7a, 0x05, 0x59, 0x2e,
	0x92, 0x47, 0x1d, 0x2b, 0xd5, 0xa4, 0x1d, 0x6c, 0xc0, 0xb3, 0xfb, 0xe8, 0xb3, 0x5e, 0xed, 0xe2,
	0xef, 0xe0, 0xf9, 0x1d, 0x5c, 0x41, 0x4d, 0xca, 0x3a, 0xe9, 0x6f, 0xed, 0xc7, 0xf7, 0x24, 0x33,
	0xf7, 0x98, 0x05, 0xf8, 0xe4, 0xe5, 0xde, 0xeb, 0x4f, 0x73, 0x7f, 0x73, 0x97, 0x1b, 0xea, 0x4f,
	0xee, 0xc5, 0x87, 0x00, 0x00, 0x00, 0xff, 0xff, 0x5f, 0x9d, 0xcd, 0xbf, 0x02, 0x0a, 0x00, 0x00,
}