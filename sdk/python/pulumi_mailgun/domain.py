# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from . import utilities, tables

class Domain(pulumi.CustomResource):
    name: pulumi.Output[str]
    """
    The domain to add to Mailgun
    """
    receiving_records: pulumi.Output[list]
    """
    A list of DNS records for receiving validation.

      * `priority` (`str`) - The priority of the record.
      * `recordType` (`str`) - The record type.
      * `valid` (`str`) - `"valid"` if the record is valid.
      * `value` (`str`) - The value of the record.
    """
    region: pulumi.Output[str]
    """
    The region where domain will be created. Default value is `us`.
    """
    sending_records: pulumi.Output[list]
    """
    A list of DNS records for sending validation.

      * `name` (`str`) - The domain to add to Mailgun
      * `recordType` (`str`) - The record type.
      * `valid` (`str`) - `"valid"` if the record is valid.
      * `value` (`str`) - The value of the record.
    """
    smtp_login: pulumi.Output[str]
    """
    The login email for the SMTP server.
    """
    smtp_password: pulumi.Output[str]
    """
    The password to the SMTP server.
    """
    spam_action: pulumi.Output[str]
    """
    `disabled` or `tag` Disable, no spam
    filtering will occur for inbound messages. Tag, messages
    will be tagged with a spam header.
    """
    wildcard: pulumi.Output[bool]
    """
    Boolean that determines whether
    the domain will accept email for sub-domains.
    """
    def __init__(__self__, resource_name, opts=None, name=None, region=None, spam_action=None, wildcard=None, __props__=None, __name__=None, __opts__=None):
        """
        Provides a Mailgun App resource. This can be used to
        create and manage applications on Mailgun.

        After DNS records are set, domain verification should be triggered manually using [PUT /domains/\<domain\>/verify](https://documentation.mailgun.com/en/latest/api-domains.html#domains)



        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] name: The domain to add to Mailgun
        :param pulumi.Input[str] region: The region where domain will be created. Default value is `us`.
        :param pulumi.Input[str] spam_action: `disabled` or `tag` Disable, no spam
               filtering will occur for inbound messages. Tag, messages
               will be tagged with a spam header.
        :param pulumi.Input[bool] wildcard: Boolean that determines whether
               the domain will accept email for sub-domains.
        """
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            __props__['name'] = name
            __props__['region'] = region
            __props__['spam_action'] = spam_action
            __props__['wildcard'] = wildcard
            __props__['receiving_records'] = None
            __props__['sending_records'] = None
            __props__['smtp_login'] = None
            __props__['smtp_password'] = None
        super(Domain, __self__).__init__(
            'mailgun:index/domain:Domain',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name, id, opts=None, name=None, receiving_records=None, region=None, sending_records=None, smtp_login=None, smtp_password=None, spam_action=None, wildcard=None):
        """
        Get an existing Domain resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param str id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] name: The domain to add to Mailgun
        :param pulumi.Input[list] receiving_records: A list of DNS records for receiving validation.
        :param pulumi.Input[str] region: The region where domain will be created. Default value is `us`.
        :param pulumi.Input[list] sending_records: A list of DNS records for sending validation.
        :param pulumi.Input[str] smtp_login: The login email for the SMTP server.
        :param pulumi.Input[str] smtp_password: The password to the SMTP server.
        :param pulumi.Input[str] spam_action: `disabled` or `tag` Disable, no spam
               filtering will occur for inbound messages. Tag, messages
               will be tagged with a spam header.
        :param pulumi.Input[bool] wildcard: Boolean that determines whether
               the domain will accept email for sub-domains.

        The **receiving_records** object supports the following:

          * `priority` (`pulumi.Input[str]`) - The priority of the record.
          * `recordType` (`pulumi.Input[str]`) - The record type.
          * `valid` (`pulumi.Input[str]`) - `"valid"` if the record is valid.
          * `value` (`pulumi.Input[str]`) - The value of the record.

        The **sending_records** object supports the following:

          * `name` (`pulumi.Input[str]`) - The domain to add to Mailgun
          * `recordType` (`pulumi.Input[str]`) - The record type.
          * `valid` (`pulumi.Input[str]`) - `"valid"` if the record is valid.
          * `value` (`pulumi.Input[str]`) - The value of the record.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["name"] = name
        __props__["receiving_records"] = receiving_records
        __props__["region"] = region
        __props__["sending_records"] = sending_records
        __props__["smtp_login"] = smtp_login
        __props__["smtp_password"] = smtp_password
        __props__["spam_action"] = spam_action
        __props__["wildcard"] = wildcard
        return Domain(resource_name, opts=opts, __props__=__props__)
    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

