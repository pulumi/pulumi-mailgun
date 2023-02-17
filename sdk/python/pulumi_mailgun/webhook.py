# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['WebhookArgs', 'Webhook']

@pulumi.input_type
class WebhookArgs:
    def __init__(__self__, *,
                 domain: pulumi.Input[str],
                 kind: pulumi.Input[str],
                 urls: pulumi.Input[Sequence[pulumi.Input[str]]],
                 region: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Webhook resource.
        :param pulumi.Input[str] domain: The domain to add to Mailgun
        :param pulumi.Input[str] kind: The kind of webhook. Supported values (`clicked` `complained` `delivered` `opened` `permanent_fail`, `temporary_fail` `unsubscribed`)
        :param pulumi.Input[Sequence[pulumi.Input[str]]] urls: The urls of webhook
        :param pulumi.Input[str] region: The region where domain will be created. Default value is `us`.
        """
        pulumi.set(__self__, "domain", domain)
        pulumi.set(__self__, "kind", kind)
        pulumi.set(__self__, "urls", urls)
        if region is not None:
            pulumi.set(__self__, "region", region)

    @property
    @pulumi.getter
    def domain(self) -> pulumi.Input[str]:
        """
        The domain to add to Mailgun
        """
        return pulumi.get(self, "domain")

    @domain.setter
    def domain(self, value: pulumi.Input[str]):
        pulumi.set(self, "domain", value)

    @property
    @pulumi.getter
    def kind(self) -> pulumi.Input[str]:
        """
        The kind of webhook. Supported values (`clicked` `complained` `delivered` `opened` `permanent_fail`, `temporary_fail` `unsubscribed`)
        """
        return pulumi.get(self, "kind")

    @kind.setter
    def kind(self, value: pulumi.Input[str]):
        pulumi.set(self, "kind", value)

    @property
    @pulumi.getter
    def urls(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        The urls of webhook
        """
        return pulumi.get(self, "urls")

    @urls.setter
    def urls(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "urls", value)

    @property
    @pulumi.getter
    def region(self) -> Optional[pulumi.Input[str]]:
        """
        The region where domain will be created. Default value is `us`.
        """
        return pulumi.get(self, "region")

    @region.setter
    def region(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "region", value)


@pulumi.input_type
class _WebhookState:
    def __init__(__self__, *,
                 domain: Optional[pulumi.Input[str]] = None,
                 kind: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 urls: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering Webhook resources.
        :param pulumi.Input[str] domain: The domain to add to Mailgun
        :param pulumi.Input[str] kind: The kind of webhook. Supported values (`clicked` `complained` `delivered` `opened` `permanent_fail`, `temporary_fail` `unsubscribed`)
        :param pulumi.Input[str] region: The region where domain will be created. Default value is `us`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] urls: The urls of webhook
        """
        if domain is not None:
            pulumi.set(__self__, "domain", domain)
        if kind is not None:
            pulumi.set(__self__, "kind", kind)
        if region is not None:
            pulumi.set(__self__, "region", region)
        if urls is not None:
            pulumi.set(__self__, "urls", urls)

    @property
    @pulumi.getter
    def domain(self) -> Optional[pulumi.Input[str]]:
        """
        The domain to add to Mailgun
        """
        return pulumi.get(self, "domain")

    @domain.setter
    def domain(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "domain", value)

    @property
    @pulumi.getter
    def kind(self) -> Optional[pulumi.Input[str]]:
        """
        The kind of webhook. Supported values (`clicked` `complained` `delivered` `opened` `permanent_fail`, `temporary_fail` `unsubscribed`)
        """
        return pulumi.get(self, "kind")

    @kind.setter
    def kind(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "kind", value)

    @property
    @pulumi.getter
    def region(self) -> Optional[pulumi.Input[str]]:
        """
        The region where domain will be created. Default value is `us`.
        """
        return pulumi.get(self, "region")

    @region.setter
    def region(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "region", value)

    @property
    @pulumi.getter
    def urls(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The urls of webhook
        """
        return pulumi.get(self, "urls")

    @urls.setter
    def urls(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "urls", value)


class Webhook(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 domain: Optional[pulumi.Input[str]] = None,
                 kind: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 urls: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        Provides a Mailgun App resource. This can be used to
        create and manage applications on Mailgun.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_mailgun as mailgun

        # Create a new Mailgun webhook
        default = mailgun.Webhook("default",
            domain="test.example.com",
            kind="delivered",
            region="us",
            urls=["https://example.com"])
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] domain: The domain to add to Mailgun
        :param pulumi.Input[str] kind: The kind of webhook. Supported values (`clicked` `complained` `delivered` `opened` `permanent_fail`, `temporary_fail` `unsubscribed`)
        :param pulumi.Input[str] region: The region where domain will be created. Default value is `us`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] urls: The urls of webhook
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: WebhookArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Mailgun App resource. This can be used to
        create and manage applications on Mailgun.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_mailgun as mailgun

        # Create a new Mailgun webhook
        default = mailgun.Webhook("default",
            domain="test.example.com",
            kind="delivered",
            region="us",
            urls=["https://example.com"])
        ```

        :param str resource_name: The name of the resource.
        :param WebhookArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(WebhookArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 domain: Optional[pulumi.Input[str]] = None,
                 kind: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 urls: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = WebhookArgs.__new__(WebhookArgs)

            if domain is None and not opts.urn:
                raise TypeError("Missing required property 'domain'")
            __props__.__dict__["domain"] = domain
            if kind is None and not opts.urn:
                raise TypeError("Missing required property 'kind'")
            __props__.__dict__["kind"] = kind
            __props__.__dict__["region"] = region
            if urls is None and not opts.urn:
                raise TypeError("Missing required property 'urls'")
            __props__.__dict__["urls"] = urls
        super(Webhook, __self__).__init__(
            'mailgun:index/webhook:Webhook',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            domain: Optional[pulumi.Input[str]] = None,
            kind: Optional[pulumi.Input[str]] = None,
            region: Optional[pulumi.Input[str]] = None,
            urls: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None) -> 'Webhook':
        """
        Get an existing Webhook resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] domain: The domain to add to Mailgun
        :param pulumi.Input[str] kind: The kind of webhook. Supported values (`clicked` `complained` `delivered` `opened` `permanent_fail`, `temporary_fail` `unsubscribed`)
        :param pulumi.Input[str] region: The region where domain will be created. Default value is `us`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] urls: The urls of webhook
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _WebhookState.__new__(_WebhookState)

        __props__.__dict__["domain"] = domain
        __props__.__dict__["kind"] = kind
        __props__.__dict__["region"] = region
        __props__.__dict__["urls"] = urls
        return Webhook(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def domain(self) -> pulumi.Output[str]:
        """
        The domain to add to Mailgun
        """
        return pulumi.get(self, "domain")

    @property
    @pulumi.getter
    def kind(self) -> pulumi.Output[str]:
        """
        The kind of webhook. Supported values (`clicked` `complained` `delivered` `opened` `permanent_fail`, `temporary_fail` `unsubscribed`)
        """
        return pulumi.get(self, "kind")

    @property
    @pulumi.getter
    def region(self) -> pulumi.Output[Optional[str]]:
        """
        The region where domain will be created. Default value is `us`.
        """
        return pulumi.get(self, "region")

    @property
    @pulumi.getter
    def urls(self) -> pulumi.Output[Sequence[str]]:
        """
        The urls of webhook
        """
        return pulumi.get(self, "urls")
