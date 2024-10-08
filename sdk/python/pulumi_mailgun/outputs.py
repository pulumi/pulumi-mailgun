# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from . import _utilities

__all__ = [
    'DomainReceivingRecord',
    'DomainReceivingRecordsSet',
    'DomainSendingRecord',
    'DomainSendingRecordsSet',
    'GetDomainReceivingRecordResult',
    'GetDomainReceivingRecordsSetResult',
    'GetDomainSendingRecordResult',
    'GetDomainSendingRecordsSetResult',
]

@pulumi.output_type
class DomainReceivingRecord(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "recordType":
            suggest = "record_type"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in DomainReceivingRecord. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        DomainReceivingRecord.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        DomainReceivingRecord.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 id: Optional[str] = None,
                 priority: Optional[str] = None,
                 record_type: Optional[str] = None,
                 valid: Optional[str] = None,
                 value: Optional[str] = None):
        """
        :param str priority: The priority of the record.
        :param str record_type: The record type.
        :param str valid: `"valid"` if the record is valid.
        :param str value: The value of the record.
        """
        if id is not None:
            pulumi.set(__self__, "id", id)
        if priority is not None:
            pulumi.set(__self__, "priority", priority)
        if record_type is not None:
            pulumi.set(__self__, "record_type", record_type)
        if valid is not None:
            pulumi.set(__self__, "valid", valid)
        if value is not None:
            pulumi.set(__self__, "value", value)

    @property
    @pulumi.getter
    def id(self) -> Optional[str]:
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def priority(self) -> Optional[str]:
        """
        The priority of the record.
        """
        return pulumi.get(self, "priority")

    @property
    @pulumi.getter(name="recordType")
    def record_type(self) -> Optional[str]:
        """
        The record type.
        """
        return pulumi.get(self, "record_type")

    @property
    @pulumi.getter
    def valid(self) -> Optional[str]:
        """
        `"valid"` if the record is valid.
        """
        return pulumi.get(self, "valid")

    @property
    @pulumi.getter
    def value(self) -> Optional[str]:
        """
        The value of the record.
        """
        return pulumi.get(self, "value")


@pulumi.output_type
class DomainReceivingRecordsSet(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "recordType":
            suggest = "record_type"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in DomainReceivingRecordsSet. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        DomainReceivingRecordsSet.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        DomainReceivingRecordsSet.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 id: Optional[str] = None,
                 priority: Optional[str] = None,
                 record_type: Optional[str] = None,
                 valid: Optional[str] = None,
                 value: Optional[str] = None):
        """
        :param str priority: The priority of the record.
        :param str record_type: The record type.
        :param str valid: `"valid"` if the record is valid.
        :param str value: The value of the record.
        """
        if id is not None:
            pulumi.set(__self__, "id", id)
        if priority is not None:
            pulumi.set(__self__, "priority", priority)
        if record_type is not None:
            pulumi.set(__self__, "record_type", record_type)
        if valid is not None:
            pulumi.set(__self__, "valid", valid)
        if value is not None:
            pulumi.set(__self__, "value", value)

    @property
    @pulumi.getter
    def id(self) -> Optional[str]:
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def priority(self) -> Optional[str]:
        """
        The priority of the record.
        """
        return pulumi.get(self, "priority")

    @property
    @pulumi.getter(name="recordType")
    def record_type(self) -> Optional[str]:
        """
        The record type.
        """
        return pulumi.get(self, "record_type")

    @property
    @pulumi.getter
    def valid(self) -> Optional[str]:
        """
        `"valid"` if the record is valid.
        """
        return pulumi.get(self, "valid")

    @property
    @pulumi.getter
    def value(self) -> Optional[str]:
        """
        The value of the record.
        """
        return pulumi.get(self, "value")


@pulumi.output_type
class DomainSendingRecord(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "recordType":
            suggest = "record_type"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in DomainSendingRecord. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        DomainSendingRecord.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        DomainSendingRecord.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 id: Optional[str] = None,
                 name: Optional[str] = None,
                 record_type: Optional[str] = None,
                 valid: Optional[str] = None,
                 value: Optional[str] = None):
        """
        :param str name: The domain to add to Mailgun
        :param str record_type: The record type.
        :param str valid: `"valid"` if the record is valid.
        :param str value: The value of the record.
        """
        if id is not None:
            pulumi.set(__self__, "id", id)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if record_type is not None:
            pulumi.set(__self__, "record_type", record_type)
        if valid is not None:
            pulumi.set(__self__, "valid", valid)
        if value is not None:
            pulumi.set(__self__, "value", value)

    @property
    @pulumi.getter
    def id(self) -> Optional[str]:
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> Optional[str]:
        """
        The domain to add to Mailgun
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="recordType")
    def record_type(self) -> Optional[str]:
        """
        The record type.
        """
        return pulumi.get(self, "record_type")

    @property
    @pulumi.getter
    def valid(self) -> Optional[str]:
        """
        `"valid"` if the record is valid.
        """
        return pulumi.get(self, "valid")

    @property
    @pulumi.getter
    def value(self) -> Optional[str]:
        """
        The value of the record.
        """
        return pulumi.get(self, "value")


@pulumi.output_type
class DomainSendingRecordsSet(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "recordType":
            suggest = "record_type"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in DomainSendingRecordsSet. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        DomainSendingRecordsSet.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        DomainSendingRecordsSet.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 id: Optional[str] = None,
                 name: Optional[str] = None,
                 record_type: Optional[str] = None,
                 valid: Optional[str] = None,
                 value: Optional[str] = None):
        """
        :param str name: The domain to add to Mailgun
        :param str record_type: The record type.
        :param str valid: `"valid"` if the record is valid.
        :param str value: The value of the record.
        """
        if id is not None:
            pulumi.set(__self__, "id", id)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if record_type is not None:
            pulumi.set(__self__, "record_type", record_type)
        if valid is not None:
            pulumi.set(__self__, "valid", valid)
        if value is not None:
            pulumi.set(__self__, "value", value)

    @property
    @pulumi.getter
    def id(self) -> Optional[str]:
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> Optional[str]:
        """
        The domain to add to Mailgun
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="recordType")
    def record_type(self) -> Optional[str]:
        """
        The record type.
        """
        return pulumi.get(self, "record_type")

    @property
    @pulumi.getter
    def valid(self) -> Optional[str]:
        """
        `"valid"` if the record is valid.
        """
        return pulumi.get(self, "valid")

    @property
    @pulumi.getter
    def value(self) -> Optional[str]:
        """
        The value of the record.
        """
        return pulumi.get(self, "value")


@pulumi.output_type
class GetDomainReceivingRecordResult(dict):
    def __init__(__self__, *,
                 id: str,
                 priority: str,
                 record_type: str,
                 valid: str,
                 value: str):
        """
        :param str priority: The priority of the record.
        :param str record_type: The record type.
        :param str valid: `"valid"` if the record is valid.
        :param str value: The value of the record.
        """
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "priority", priority)
        pulumi.set(__self__, "record_type", record_type)
        pulumi.set(__self__, "valid", valid)
        pulumi.set(__self__, "value", value)

    @property
    @pulumi.getter
    def id(self) -> str:
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def priority(self) -> str:
        """
        The priority of the record.
        """
        return pulumi.get(self, "priority")

    @property
    @pulumi.getter(name="recordType")
    def record_type(self) -> str:
        """
        The record type.
        """
        return pulumi.get(self, "record_type")

    @property
    @pulumi.getter
    def valid(self) -> str:
        """
        `"valid"` if the record is valid.
        """
        return pulumi.get(self, "valid")

    @property
    @pulumi.getter
    def value(self) -> str:
        """
        The value of the record.
        """
        return pulumi.get(self, "value")


@pulumi.output_type
class GetDomainReceivingRecordsSetResult(dict):
    def __init__(__self__, *,
                 id: str,
                 priority: str,
                 record_type: str,
                 valid: str,
                 value: str):
        """
        :param str priority: The priority of the record.
        :param str record_type: The record type.
        :param str valid: `"valid"` if the record is valid.
        :param str value: The value of the record.
        """
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "priority", priority)
        pulumi.set(__self__, "record_type", record_type)
        pulumi.set(__self__, "valid", valid)
        pulumi.set(__self__, "value", value)

    @property
    @pulumi.getter
    def id(self) -> str:
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def priority(self) -> str:
        """
        The priority of the record.
        """
        return pulumi.get(self, "priority")

    @property
    @pulumi.getter(name="recordType")
    def record_type(self) -> str:
        """
        The record type.
        """
        return pulumi.get(self, "record_type")

    @property
    @pulumi.getter
    def valid(self) -> str:
        """
        `"valid"` if the record is valid.
        """
        return pulumi.get(self, "valid")

    @property
    @pulumi.getter
    def value(self) -> str:
        """
        The value of the record.
        """
        return pulumi.get(self, "value")


@pulumi.output_type
class GetDomainSendingRecordResult(dict):
    def __init__(__self__, *,
                 id: str,
                 name: str,
                 record_type: str,
                 valid: str,
                 value: str):
        """
        :param str name: The name of the domain.
        :param str record_type: The record type.
        :param str valid: `"valid"` if the record is valid.
        :param str value: The value of the record.
        """
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "record_type", record_type)
        pulumi.set(__self__, "valid", valid)
        pulumi.set(__self__, "value", value)

    @property
    @pulumi.getter
    def id(self) -> str:
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The name of the domain.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="recordType")
    def record_type(self) -> str:
        """
        The record type.
        """
        return pulumi.get(self, "record_type")

    @property
    @pulumi.getter
    def valid(self) -> str:
        """
        `"valid"` if the record is valid.
        """
        return pulumi.get(self, "valid")

    @property
    @pulumi.getter
    def value(self) -> str:
        """
        The value of the record.
        """
        return pulumi.get(self, "value")


@pulumi.output_type
class GetDomainSendingRecordsSetResult(dict):
    def __init__(__self__, *,
                 id: str,
                 name: str,
                 record_type: str,
                 valid: str,
                 value: str):
        """
        :param str name: The name of the domain.
        :param str record_type: The record type.
        :param str valid: `"valid"` if the record is valid.
        :param str value: The value of the record.
        """
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "record_type", record_type)
        pulumi.set(__self__, "valid", valid)
        pulumi.set(__self__, "value", value)

    @property
    @pulumi.getter
    def id(self) -> str:
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The name of the domain.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="recordType")
    def record_type(self) -> str:
        """
        The record type.
        """
        return pulumi.get(self, "record_type")

    @property
    @pulumi.getter
    def valid(self) -> str:
        """
        `"valid"` if the record is valid.
        """
        return pulumi.get(self, "valid")

    @property
    @pulumi.getter
    def value(self) -> str:
        """
        The value of the record.
        """
        return pulumi.get(self, "value")


