# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: gincoinc/adamant/teller/v1/adamanttellerv1/event.proto
# Protobuf Python Version: 4.25.3
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


import importlib
gincoinc_dot_global_dot_v1_dot_gincoincglobalv1_dot_enum__pb2 = importlib.import_module('gincoinc.global_.v1.gincoincglobalv1.enum_pb2')
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from validate import validate_pb2 as validate_dot_validate__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n6gincoinc/adamant/teller/v1/adamanttellerv1/event.proto\x12\x11\x61\x64\x61mant.teller.v1\x1a.gincoinc/global/v1/gincoincglobalv1/enum.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x17validate/validate.proto\"\xba\x08\n\x0fTransferUpdated\x12\x1b\n\twallet_id\x18\x01 \x01(\tR\x08walletId\x12\x1f\n\x0btransfer_id\x18\x02 \x01(\tR\ntransferId\x12,\n\x04\x63oin\x18\x03 \x01(\x0e\x32\x18.gincoinc.global.v1.CoinR\x04\x63oin\x12\x13\n\x05tx_id\x18\x04 \x01(\tR\x04txId\x12\x19\n\x08tx_index\x18\x05 \x01(\rR\x07txIndex\x12\x14\n\x05value\x18\x06 \x01(\x01R\x05value\x12!\n\x0cstring_value\x18\x07 \x01(\tR\x0bstringValue\x12\x19\n\x08jpy_rate\x18\x08 \x01(\x01R\x07jpyRate\x12\x1c\n\x07\x61\x64\x64ress\x18\t \x01(\tB\x02\x18\x01R\x07\x61\x64\x64ress\x12\'\n\x0f\x64\x65stination_tag\x18\n \x01(\rR\x0e\x64\x65stinationTag\x12\x17\n\x07memo_id\x18\x0e \x01(\x04R\x06memoId\x12\x18\n\x07message\x18\x15 \x01(\tR\x07message\x12:\n\x05state\x18\x0b \x01(\x0e\x32$.gincoinc.global.v1.TransactionStateR\x05state\x12=\n\x06result\x18\x0c \x01(\x0e\x32%.gincoinc.global.v1.TransactionResultR\x06result\x12\x45\n\rtransfer_type\x18\r \x01(\x0e\x32 .gincoinc.global.v1.TransferTypeR\x0ctransferType\x12\x12\n\x04\x66rom\x18\x0f \x01(\tR\x04\x66rom\x12\x0e\n\x02to\x18\x10 \x01(\tR\x02to\x12.\n\x04time\x18\x11 \x01(\x0b\x32\x1a.google.protobuf.TimestampR\x04time\x12\x19\n\x08\x65vent_id\x18\x12 \x01(\tR\x07\x65ventId\x12\x10\n\x03\x66\x65\x65\x18\x13 \x01(\x01R\x03\x66\x65\x65\x12\x1d\n\nstring_fee\x18\x14 \x01(\tR\tstringFee\x12X\n\x0f\x63osmos_specific\x18\x16 \x01(\x0b\x32/.adamant.teller.v1.TransferUpdateCosmosSpecificR\x0e\x63osmosSpecific\x12\x61\n\x12substrate_specific\x18\x17 \x01(\x0b\x32\x32.adamant.teller.v1.TransferUpdateSubstrateSpecificR\x11substrateSpecific\x12\x16\n\x06method\x18\x18 \x01(\tR\x06method\x12\x35\n\x07network\x18\x19 \x01(\x0e\x32\x1b.gincoinc.global.v1.NetworkR\x07network\x12O\n\x0cton_specific\x18\x1a \x01(\x0b\x32,.adamant.teller.v1.TransferUpdateTonSpecificR\x0btonSpecific\"\xa3\x01\n\x1cTransferUpdateCosmosSpecific\x12\x35\n\x04type\x18\x01 \x01(\x0e\x32!.gincoinc.global.v1.CosmosMsgTypeR\x04type\x12\'\n\x0f\x64\x65legate_amount\x18\x02 \x01(\x01R\x0e\x64\x65legateAmount\x12#\n\rreward_amount\x18\x03 \x01(\x01R\x0crewardAmount\"k\n\x1fTransferUpdateSubstrateSpecific\x12!\n\x0c\x65xtrinsic_id\x18\x01 \x01(\tR\x0b\x65xtrinsicId\x12%\n\x0e\x65xtrinsic_hash\x18\x02 \x01(\tR\rextrinsicHash\"@\n\x19TransferUpdateTonSpecific\x12#\n\rtransfer_hash\x18\x01 \x01(\tR\x0ctransferHash\"\xb0\x05\n\x13TransferUpdateEvent\x12\x19\n\x08\x65vent_id\x18\x01 \x01(\tR\x07\x65ventId\x12\x1b\n\twallet_id\x18\x0e \x01(\tR\x08walletId\x12,\n\x04\x63oin\x18\x02 \x01(\x0e\x32\x18.gincoinc.global.v1.CoinR\x04\x63oin\x12\x13\n\x05tx_id\x18\x03 \x01(\tR\x04txId\x12\x19\n\x08tx_index\x18\x04 \x01(\rR\x07txIndex\x12\x14\n\x05value\x18\x05 \x01(\x01R\x05value\x12!\n\x0cstring_value\x18\x06 \x01(\tR\x0bstringValue\x12\x19\n\x08jpy_rate\x18\r \x01(\x01R\x07jpyRate\x12\x18\n\x07\x61\x64\x64ress\x18\x07 \x01(\tR\x07\x61\x64\x64ress\x12\'\n\x0f\x64\x65stination_tag\x18\x08 \x01(\rR\x0e\x64\x65stinationTag\x12\x17\n\x07memo_id\x18\x0f \x01(\x04R\x06memoId\x12:\n\x05state\x18\t \x01(\x0e\x32$.gincoinc.global.v1.TransactionStateR\x05state\x12=\n\x06result\x18\n \x01(\x0e\x32%.gincoinc.global.v1.TransactionResultR\x06result\x12\x45\n\rtransfer_type\x18\x0b \x01(\x0e\x32 .gincoinc.global.v1.TransferTypeR\x0ctransferType\x12.\n\x04time\x18\x0c \x01(\x0b\x32\x1a.google.protobuf.TimestampR\x04time\x12\x61\n\x12substrate_specific\x18\x10 \x01(\x0b\x32\x32.adamant.teller.v1.TransferUpdateSubstrateSpecificR\x11substrateSpecific\"\xe5\x04\n\x15\x45thereumStakingReward\x12\x19\n\x08\x65vent_id\x18\x01 \x01(\tR\x07\x65ventId\x12)\n\x10withdrawal_index\x18\x02 \x01(\x04R\x0fwithdrawalIndex\x12!\n\x0c\x62lock_number\x18\x03 \x01(\x04R\x0b\x62lockNumber\x12\x39\n\nblock_time\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.TimestampR\tblockTime\x12\'\n\x0fvalidator_index\x18\x05 \x01(\x04R\x0evalidatorIndex\x12\x18\n\x07\x61\x64\x64ress\x18\x06 \x01(\tR\x07\x61\x64\x64ress\x12\x14\n\x05value\x18\x07 \x01(\x01R\x05value\x12i\n\twallet_id\x18\x08 \x01(\tBL\xfa\x42IrG2E^[0-9a-f]{8}-[0-9a-f]{4}-4[0-9a-f]{3}-[89ab][0-9a-f]{3}-[0-9a-f]{12}$R\x08walletId\x12~\n\"ethereum_staking_reward_layer_type\x18\t \x01(\x0e\x32\x32.gincoinc.global.v1.EthereumStakingRewardLayerTypeR\x1e\x65thereumStakingRewardLayerType\x12!\n\x0cstring_value\x18\n \x01(\tR\x0bstringValue\x12\x1d\n\nblock_hash\x18\x0b \x01(\tR\tblockHash\x12\x18\n\x05tx_id\x18\x0c \x01(\tH\x00R\x04txId\x88\x01\x01\x42\x08\n\x06_tx_id\"\xd3\x02\n\x15StakingRewardReceived\x12\x19\n\x08\x65vent_id\x18\x01 \x01(\tR\x07\x65ventId\x12!\n\x0cvalidator_id\x18\x02 \x01(\tR\x0bvalidatorId\x12\x14\n\x05value\x18\x03 \x01(\x01R\x05value\x12!\n\x0cstring_value\x18\x04 \x01(\tR\x0bstringValue\x12\x13\n\x05tx_id\x18\x05 \x01(\tR\x04txId\x12\x19\n\x08tx_index\x18\x06 \x01(\rR\x07txIndex\x12\x1b\n\twallet_id\x18\x07 \x01(\tR\x08walletId\x12\x18\n\x07\x61\x64\x64ress\x18\x08 \x01(\tR\x07\x61\x64\x64ress\x12,\n\x04\x63oin\x18\t \x01(\x0e\x32\x18.gincoinc.global.v1.CoinR\x04\x63oin\x12.\n\x04time\x18\n \x01(\x0b\x32\x1a.google.protobuf.TimestampR\x04timeBLZJgithub.com/GincoInc/gew-kmp/gen/gincoinc/adamant/teller/v1/adamanttellerv1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'gincoinc.adamant.teller.v1.adamanttellerv1.event_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'ZJgithub.com/GincoInc/gew-kmp/gen/gincoinc/adamant/teller/v1/adamanttellerv1'
  _globals['_TRANSFERUPDATED'].fields_by_name['address']._options = None
  _globals['_TRANSFERUPDATED'].fields_by_name['address']._serialized_options = b'\030\001'
  _globals['_ETHEREUMSTAKINGREWARD'].fields_by_name['wallet_id']._options = None
  _globals['_ETHEREUMSTAKINGREWARD'].fields_by_name['wallet_id']._serialized_options = b'\372BIrG2E^[0-9a-f]{8}-[0-9a-f]{4}-4[0-9a-f]{3}-[89ab][0-9a-f]{3}-[0-9a-f]{12}$'
  _globals['_TRANSFERUPDATED']._serialized_start=184
  _globals['_TRANSFERUPDATED']._serialized_end=1266
  _globals['_TRANSFERUPDATECOSMOSSPECIFIC']._serialized_start=1269
  _globals['_TRANSFERUPDATECOSMOSSPECIFIC']._serialized_end=1432
  _globals['_TRANSFERUPDATESUBSTRATESPECIFIC']._serialized_start=1434
  _globals['_TRANSFERUPDATESUBSTRATESPECIFIC']._serialized_end=1541
  _globals['_TRANSFERUPDATETONSPECIFIC']._serialized_start=1543
  _globals['_TRANSFERUPDATETONSPECIFIC']._serialized_end=1607
  _globals['_TRANSFERUPDATEEVENT']._serialized_start=1610
  _globals['_TRANSFERUPDATEEVENT']._serialized_end=2298
  _globals['_ETHEREUMSTAKINGREWARD']._serialized_start=2301
  _globals['_ETHEREUMSTAKINGREWARD']._serialized_end=2914
  _globals['_STAKINGREWARDRECEIVED']._serialized_start=2917
  _globals['_STAKINGREWARDRECEIVED']._serialized_end=3256
# @@protoc_insertion_point(module_scope)
