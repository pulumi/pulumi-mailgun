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

__all__ = ['DomainCredentialArgs', 'DomainCredential']

@pulumi.input_type
class DomainCredentialArgs:
    def __init__(__self__, *,
                 domain: pulumi.Input[str],
                 login: pulumi.Input[str],
                 password: pulumi.Input[str],
                 region: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a DomainCredential resource.
        :param pulumi.Input[str] domain: The domain to add credential of Mailgun.
        :param pulumi.Input[str] login: The local-part of the email address to create.
        :param pulumi.Input[str] password: Password for user authentication.
        :param pulumi.Input[str] region: The region where domain will be created. Default value is `us`.
        """
        pulumi.set(__self__, "domain", domain)
        pulumi.set(__self__, "login", login)
        pulumi.set(__self__, "password", password)
        if region is not None:
            pulumi.set(__self__, "region", region)

    @property
    @pulumi.getter
    def domain(self) -> pulumi.Input[str]:
        """
        The domain to add credential of Mailgun.
        """
        return pulumi.get(self, "domain")

    @domain.setter
    def domain(self, value: pulumi.Input[str]):
        pulumi.set(self, "domain", value)

    @property
    @pulumi.getter
    def login(self) -> pulumi.Input[str]:
        """
        The local-part of the email address to create.
        """
        return pulumi.get(self, "login")

    @login.setter
    def login(self, value: pulumi.Input[str]):
        pulumi.set(self, "login", value)

    @property
    @pulumi.getter
    def password(self) -> pulumi.Input[str]:
        """
        Password for user authentication.
        """
        return pulumi.get(self, "password")

    @password.setter
    def password(self, value: pulumi.Input[str]):
        pulumi.set(self, "password", value)

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
class _DomainCredentialState:
    def __init__(__self__, *,
                 domain: Optional[pulumi.Input[str]] = None,
                 login: Optional[pulumi.Input[str]] = None,
                 password: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering DomainCredential resources.
        :param pulumi.Input[str] domain: The domain to add credential of Mailgun.
        :param pulumi.Input[str] login: The local-part of the email address to create.
        :param pulumi.Input[str] password: Password for user authentication.
        :param pulumi.Input[str] region: The region where domain will be created. Default value is `us`.
        """
        if domain is not None:
            pulumi.set(__self__, "domain", domain)
        if login is not None:
            pulumi.set(__self__, "login", login)
        if password is not None:
            pulumi.set(__self__, "password", password)
        if region is not None:
            pulumi.set(__self__, "region", region)

    @property
    @pulumi.getter
    def domain(self) -> Optional[pulumi.Input[str]]:
        """
        The domain to add credential of Mailgun.
        """
        return pulumi.get(self, "domain")

    @domain.setter
    def domain(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "domain", value)

    @property
    @pulumi.getter
    def login(self) -> Optional[pulumi.Input[str]]:
        """
        The local-part of the email address to create.
        """
        return pulumi.get(self, "login")

    @login.setter
    def login(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "login", value)

    @property
    @pulumi.getter
    def password(self) -> Optional[pulumi.Input[str]]:
        """
        Password for user authentication.
        """
        return pulumi.get(self, "password")

    @password.setter
    def password(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "password", value)

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


class DomainCredential(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 domain: Optional[pulumi.Input[str]] = None,
                 login: Optional[pulumi.Input[str]] = None,
                 password: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Mailgun domain credential resource. This can be used to create and manage credential in domain of Mailgun.

        > **Note:** Please note that starting of v0.6.1 due to using new Mailgun Client API (v4), there is no possibility to retrieve previously created secrets via API. In order get it worked, it's recommended to mark `password` as ignored under `lifecycle` block. See below.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_mailgun as mailgun

        # Create a new Mailgun credential
        foobar = mailgun.DomainCredential("foobar",
            domain="toto.com",
            login="test",
            password="supersecretpassword1234",
            region="us")
        ```

        ## Import

        Domain credential can be imported using `region:email` via `import` command. Region has to be chosen from `eu` or `us` (when no selection `us` is applied).

        Password is always exported to `null`.

        hcl

        ```sh
        $ pulumi import mailgun:index/domainCredential:DomainCredential test us:test@domain.com
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] domain: The domain to add credential of Mailgun.
        :param pulumi.Input[str] login: The local-part of the email address to create.
        :param pulumi.Input[str] password: Password for user authentication.
        :param pulumi.Input[str] region: The region where domain will be created. Default value is `us`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: DomainCredentialArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Mailgun domain credential resource. This can be used to create and manage credential in domain of Mailgun.

        > **Note:** Please note that starting of v0.6.1 due to using new Mailgun Client API (v4), there is no possibility to retrieve previously created secrets via API. In order get it worked, it's recommended to mark `password` as ignored under `lifecycle` block. See below.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_mailgun as mailgun

        # Create a new Mailgun credential
        foobar = mailgun.DomainCredential("foobar",
            domain="toto.com",
            login="test",
            password="supersecretpassword1234",
            region="us")
        ```

        ## Import

        Domain credential can be imported using `region:email` via `import` command. Region has to be chosen from `eu` or `us` (when no selection `us` is applied).

        Password is always exported to `null`.

        hcl

        ```sh
        $ pulumi import mailgun:index/domainCredential:DomainCredential test us:test@domain.com
        ```

        :param str resource_name: The name of the resource.
        :param DomainCredentialArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(DomainCredentialArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 domain: Optional[pulumi.Input[str]] = None,
                 login: Optional[pulumi.Input[str]] = None,
                 password: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = DomainCredentialArgs.__new__(DomainCredentialArgs)

            if domain is None and not opts.urn:
                raise TypeError("Missing required property 'domain'")
            __props__.__dict__["domain"] = domain
            if login is None and not opts.urn:
                raise TypeError("Missing required property 'login'")
            __props__.__dict__["login"] = login
            if password is None and not opts.urn:
                raise TypeError("Missing required property 'password'")
            __props__.__dict__["password"] = None if password is None else pulumi.Output.secret(password)
            __props__.__dict__["region"] = region
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["password"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(DomainCredential, __self__).__init__(
            'mailgun:index/domainCredential:DomainCredential',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            domain: Optional[pulumi.Input[str]] = None,
            login: Optional[pulumi.Input[str]] = None,
            password: Optional[pulumi.Input[str]] = None,
            region: Optional[pulumi.Input[str]] = None) -> 'DomainCredential':
        """
        Get an existing DomainCredential resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] domain: The domain to add credential of Mailgun.
        :param pulumi.Input[str] login: The local-part of the email address to create.
        :param pulumi.Input[str] password: Password for user authentication.
        :param pulumi.Input[str] region: The region where domain will be created. Default value is `us`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _DomainCredentialState.__new__(_DomainCredentialState)

        __props__.__dict__["domain"] = domain
        __props__.__dict__["login"] = login
        __props__.__dict__["password"] = password
        __props__.__dict__["region"] = region
        return DomainCredential(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def domain(self) -> pulumi.Output[str]:
        """
        The domain to add credential of Mailgun.
        """
        return pulumi.get(self, "domain")

    @property
    @pulumi.getter
    def login(self) -> pulumi.Output[str]:
        """
        The local-part of the email address to create.
        """
        return pulumi.get(self, "login")

    @property
    @pulumi.getter
    def password(self) -> pulumi.Output[str]:
        """
        Password for user authentication.
        """
        return pulumi.get(self, "password")

    @property
    @pulumi.getter
    def region(self) -> pulumi.Output[Optional[str]]:
        """
        The region where domain will be created. Default value is `us`.
        """
        return pulumi.get(self, "region")

