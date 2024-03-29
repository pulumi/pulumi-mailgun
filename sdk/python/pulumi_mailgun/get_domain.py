# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs

__all__ = [
    'GetDomainResult',
    'AwaitableGetDomainResult',
    'get_domain',
    'get_domain_output',
]

@pulumi.output_type
class GetDomainResult:
    """
    A collection of values returned by getDomain.
    """
    def __init__(__self__, dkim_key_size=None, dkim_selector=None, force_dkim_authority=None, id=None, name=None, open_tracking=None, receiving_records=None, receiving_records_sets=None, region=None, sending_records=None, sending_records_sets=None, smtp_login=None, smtp_password=None, spam_action=None, wildcard=None):
        if dkim_key_size and not isinstance(dkim_key_size, int):
            raise TypeError("Expected argument 'dkim_key_size' to be a int")
        pulumi.set(__self__, "dkim_key_size", dkim_key_size)
        if dkim_selector and not isinstance(dkim_selector, str):
            raise TypeError("Expected argument 'dkim_selector' to be a str")
        pulumi.set(__self__, "dkim_selector", dkim_selector)
        if force_dkim_authority and not isinstance(force_dkim_authority, bool):
            raise TypeError("Expected argument 'force_dkim_authority' to be a bool")
        pulumi.set(__self__, "force_dkim_authority", force_dkim_authority)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if open_tracking and not isinstance(open_tracking, bool):
            raise TypeError("Expected argument 'open_tracking' to be a bool")
        pulumi.set(__self__, "open_tracking", open_tracking)
        if receiving_records and not isinstance(receiving_records, list):
            raise TypeError("Expected argument 'receiving_records' to be a list")
        pulumi.set(__self__, "receiving_records", receiving_records)
        if receiving_records_sets and not isinstance(receiving_records_sets, list):
            raise TypeError("Expected argument 'receiving_records_sets' to be a list")
        pulumi.set(__self__, "receiving_records_sets", receiving_records_sets)
        if region and not isinstance(region, str):
            raise TypeError("Expected argument 'region' to be a str")
        pulumi.set(__self__, "region", region)
        if sending_records and not isinstance(sending_records, list):
            raise TypeError("Expected argument 'sending_records' to be a list")
        pulumi.set(__self__, "sending_records", sending_records)
        if sending_records_sets and not isinstance(sending_records_sets, list):
            raise TypeError("Expected argument 'sending_records_sets' to be a list")
        pulumi.set(__self__, "sending_records_sets", sending_records_sets)
        if smtp_login and not isinstance(smtp_login, str):
            raise TypeError("Expected argument 'smtp_login' to be a str")
        pulumi.set(__self__, "smtp_login", smtp_login)
        if smtp_password and not isinstance(smtp_password, str):
            raise TypeError("Expected argument 'smtp_password' to be a str")
        pulumi.set(__self__, "smtp_password", smtp_password)
        if spam_action and not isinstance(spam_action, str):
            raise TypeError("Expected argument 'spam_action' to be a str")
        pulumi.set(__self__, "spam_action", spam_action)
        if wildcard and not isinstance(wildcard, bool):
            raise TypeError("Expected argument 'wildcard' to be a bool")
        pulumi.set(__self__, "wildcard", wildcard)

    @property
    @pulumi.getter(name="dkimKeySize")
    def dkim_key_size(self) -> Optional[int]:
        return pulumi.get(self, "dkim_key_size")

    @property
    @pulumi.getter(name="dkimSelector")
    def dkim_selector(self) -> Optional[str]:
        return pulumi.get(self, "dkim_selector")

    @property
    @pulumi.getter(name="forceDkimAuthority")
    def force_dkim_authority(self) -> Optional[bool]:
        return pulumi.get(self, "force_dkim_authority")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The name of the record.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="openTracking")
    def open_tracking(self) -> Optional[bool]:
        return pulumi.get(self, "open_tracking")

    @property
    @pulumi.getter(name="receivingRecords")
    def receiving_records(self) -> Sequence['outputs.GetDomainReceivingRecordResult']:
        """
        A list of DNS records for receiving validation.
        """
        warnings.warn("""Use `receiving_records_set` instead.""", DeprecationWarning)
        pulumi.log.warn("""receiving_records is deprecated: Use `receiving_records_set` instead.""")

        return pulumi.get(self, "receiving_records")

    @property
    @pulumi.getter(name="receivingRecordsSets")
    def receiving_records_sets(self) -> Sequence['outputs.GetDomainReceivingRecordsSetResult']:
        return pulumi.get(self, "receiving_records_sets")

    @property
    @pulumi.getter
    def region(self) -> Optional[str]:
        return pulumi.get(self, "region")

    @property
    @pulumi.getter(name="sendingRecords")
    def sending_records(self) -> Sequence['outputs.GetDomainSendingRecordResult']:
        """
        A list of DNS records for sending validation.
        """
        warnings.warn("""Use `sending_records_set` instead.""", DeprecationWarning)
        pulumi.log.warn("""sending_records is deprecated: Use `sending_records_set` instead.""")

        return pulumi.get(self, "sending_records")

    @property
    @pulumi.getter(name="sendingRecordsSets")
    def sending_records_sets(self) -> Sequence['outputs.GetDomainSendingRecordsSetResult']:
        return pulumi.get(self, "sending_records_sets")

    @property
    @pulumi.getter(name="smtpLogin")
    def smtp_login(self) -> str:
        """
        The login email for the SMTP server.
        """
        return pulumi.get(self, "smtp_login")

    @property
    @pulumi.getter(name="smtpPassword")
    def smtp_password(self) -> Optional[str]:
        """
        The password to the SMTP server.
        """
        return pulumi.get(self, "smtp_password")

    @property
    @pulumi.getter(name="spamAction")
    def spam_action(self) -> Optional[str]:
        """
        The spam filtering setting.
        """
        return pulumi.get(self, "spam_action")

    @property
    @pulumi.getter
    def wildcard(self) -> Optional[bool]:
        """
        Whether or not the domain will accept email for sub-domains.
        """
        return pulumi.get(self, "wildcard")


class AwaitableGetDomainResult(GetDomainResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetDomainResult(
            dkim_key_size=self.dkim_key_size,
            dkim_selector=self.dkim_selector,
            force_dkim_authority=self.force_dkim_authority,
            id=self.id,
            name=self.name,
            open_tracking=self.open_tracking,
            receiving_records=self.receiving_records,
            receiving_records_sets=self.receiving_records_sets,
            region=self.region,
            sending_records=self.sending_records,
            sending_records_sets=self.sending_records_sets,
            smtp_login=self.smtp_login,
            smtp_password=self.smtp_password,
            spam_action=self.spam_action,
            wildcard=self.wildcard)


def get_domain(dkim_key_size: Optional[int] = None,
               dkim_selector: Optional[str] = None,
               force_dkim_authority: Optional[bool] = None,
               name: Optional[str] = None,
               open_tracking: Optional[bool] = None,
               region: Optional[str] = None,
               smtp_password: Optional[str] = None,
               spam_action: Optional[str] = None,
               wildcard: Optional[bool] = None,
               opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetDomainResult:
    """
    `Domain` provides details about a Mailgun domain.

    ## Example Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_aws as aws
    import pulumi_mailgun as mailgun

    domain = mailgun.get_domain(name="test.example.com")
    mailgun_mx = aws.route53.Record("mailgun-mx",
        name=data["mailgun"]["domain"]["name"],
        records=[
            f"{domain.receiving_records[0].priority} {domain.receiving_records[0].value}.",
            f"{domain.receiving_records[1].priority} {domain.receiving_records[1].value}.",
        ],
        ttl=3600,
        type=aws.route53.RecordType.MX,
        zone_id=var["zone_id"])
    ```
    <!--End PulumiCodeChooser -->


    :param str name: The name of the domain.
    :param str region: The region where domain will be created. Default value is `us`.
    :param str smtp_password: The password to the SMTP server.
    :param str spam_action: The spam filtering setting.
    :param bool wildcard: Whether or not the domain will accept email for sub-domains.
    """
    __args__ = dict()
    __args__['dkimKeySize'] = dkim_key_size
    __args__['dkimSelector'] = dkim_selector
    __args__['forceDkimAuthority'] = force_dkim_authority
    __args__['name'] = name
    __args__['openTracking'] = open_tracking
    __args__['region'] = region
    __args__['smtpPassword'] = smtp_password
    __args__['spamAction'] = spam_action
    __args__['wildcard'] = wildcard
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('mailgun:index/getDomain:getDomain', __args__, opts=opts, typ=GetDomainResult).value

    return AwaitableGetDomainResult(
        dkim_key_size=pulumi.get(__ret__, 'dkim_key_size'),
        dkim_selector=pulumi.get(__ret__, 'dkim_selector'),
        force_dkim_authority=pulumi.get(__ret__, 'force_dkim_authority'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        open_tracking=pulumi.get(__ret__, 'open_tracking'),
        receiving_records=pulumi.get(__ret__, 'receiving_records'),
        receiving_records_sets=pulumi.get(__ret__, 'receiving_records_sets'),
        region=pulumi.get(__ret__, 'region'),
        sending_records=pulumi.get(__ret__, 'sending_records'),
        sending_records_sets=pulumi.get(__ret__, 'sending_records_sets'),
        smtp_login=pulumi.get(__ret__, 'smtp_login'),
        smtp_password=pulumi.get(__ret__, 'smtp_password'),
        spam_action=pulumi.get(__ret__, 'spam_action'),
        wildcard=pulumi.get(__ret__, 'wildcard'))


@_utilities.lift_output_func(get_domain)
def get_domain_output(dkim_key_size: Optional[pulumi.Input[Optional[int]]] = None,
                      dkim_selector: Optional[pulumi.Input[Optional[str]]] = None,
                      force_dkim_authority: Optional[pulumi.Input[Optional[bool]]] = None,
                      name: Optional[pulumi.Input[str]] = None,
                      open_tracking: Optional[pulumi.Input[Optional[bool]]] = None,
                      region: Optional[pulumi.Input[Optional[str]]] = None,
                      smtp_password: Optional[pulumi.Input[Optional[str]]] = None,
                      spam_action: Optional[pulumi.Input[Optional[str]]] = None,
                      wildcard: Optional[pulumi.Input[Optional[bool]]] = None,
                      opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetDomainResult]:
    """
    `Domain` provides details about a Mailgun domain.

    ## Example Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_aws as aws
    import pulumi_mailgun as mailgun

    domain = mailgun.get_domain(name="test.example.com")
    mailgun_mx = aws.route53.Record("mailgun-mx",
        name=data["mailgun"]["domain"]["name"],
        records=[
            f"{domain.receiving_records[0].priority} {domain.receiving_records[0].value}.",
            f"{domain.receiving_records[1].priority} {domain.receiving_records[1].value}.",
        ],
        ttl=3600,
        type=aws.route53.RecordType.MX,
        zone_id=var["zone_id"])
    ```
    <!--End PulumiCodeChooser -->


    :param str name: The name of the domain.
    :param str region: The region where domain will be created. Default value is `us`.
    :param str smtp_password: The password to the SMTP server.
    :param str spam_action: The spam filtering setting.
    :param bool wildcard: Whether or not the domain will accept email for sub-domains.
    """
    ...
