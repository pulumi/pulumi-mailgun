# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins as _builtins
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

__all__ = ['RouteArgs', 'Route']

@pulumi.input_type
class RouteArgs:
    def __init__(__self__, *,
                 actions: pulumi.Input[Sequence[pulumi.Input[_builtins.str]]],
                 expression: pulumi.Input[_builtins.str],
                 priority: pulumi.Input[_builtins.int],
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 region: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a Route resource.
        :param pulumi.Input[_builtins.str] expression: A filter expression like `match_recipient('.*@gmail.com')`
        :param pulumi.Input[_builtins.int] priority: Smaller number indicates higher priority. Higher priority routes are handled first.
        :param pulumi.Input[_builtins.str] region: The region where domain will be created. Default value is `us`.
        """
        pulumi.set(__self__, "actions", actions)
        pulumi.set(__self__, "expression", expression)
        pulumi.set(__self__, "priority", priority)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if region is not None:
            pulumi.set(__self__, "region", region)

    @_builtins.property
    @pulumi.getter
    def actions(self) -> pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]:
        return pulumi.get(self, "actions")

    @actions.setter
    def actions(self, value: pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]):
        pulumi.set(self, "actions", value)

    @_builtins.property
    @pulumi.getter
    def expression(self) -> pulumi.Input[_builtins.str]:
        """
        A filter expression like `match_recipient('.*@gmail.com')`
        """
        return pulumi.get(self, "expression")

    @expression.setter
    def expression(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "expression", value)

    @_builtins.property
    @pulumi.getter
    def priority(self) -> pulumi.Input[_builtins.int]:
        """
        Smaller number indicates higher priority. Higher priority routes are handled first.
        """
        return pulumi.get(self, "priority")

    @priority.setter
    def priority(self, value: pulumi.Input[_builtins.int]):
        pulumi.set(self, "priority", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter
    def region(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The region where domain will be created. Default value is `us`.
        """
        return pulumi.get(self, "region")

    @region.setter
    def region(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "region", value)


@pulumi.input_type
class _RouteState:
    def __init__(__self__, *,
                 actions: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 expression: Optional[pulumi.Input[_builtins.str]] = None,
                 priority: Optional[pulumi.Input[_builtins.int]] = None,
                 region: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering Route resources.
        :param pulumi.Input[_builtins.str] expression: A filter expression like `match_recipient('.*@gmail.com')`
        :param pulumi.Input[_builtins.int] priority: Smaller number indicates higher priority. Higher priority routes are handled first.
        :param pulumi.Input[_builtins.str] region: The region where domain will be created. Default value is `us`.
        """
        if actions is not None:
            pulumi.set(__self__, "actions", actions)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if expression is not None:
            pulumi.set(__self__, "expression", expression)
        if priority is not None:
            pulumi.set(__self__, "priority", priority)
        if region is not None:
            pulumi.set(__self__, "region", region)

    @_builtins.property
    @pulumi.getter
    def actions(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]:
        return pulumi.get(self, "actions")

    @actions.setter
    def actions(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "actions", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter
    def expression(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        A filter expression like `match_recipient('.*@gmail.com')`
        """
        return pulumi.get(self, "expression")

    @expression.setter
    def expression(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "expression", value)

    @_builtins.property
    @pulumi.getter
    def priority(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        Smaller number indicates higher priority. Higher priority routes are handled first.
        """
        return pulumi.get(self, "priority")

    @priority.setter
    def priority(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "priority", value)

    @_builtins.property
    @pulumi.getter
    def region(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The region where domain will be created. Default value is `us`.
        """
        return pulumi.get(self, "region")

    @region.setter
    def region(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "region", value)


@pulumi.type_token("mailgun:index/route:Route")
class Route(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 actions: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 expression: Optional[pulumi.Input[_builtins.str]] = None,
                 priority: Optional[pulumi.Input[_builtins.int]] = None,
                 region: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Provides a Mailgun Route resource. This can be used to create and manage routes on Mailgun.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_mailgun as mailgun

        # Create a new Mailgun route
        default = mailgun.Route("default",
            priority=0,
            description="inbound",
            expression="match_recipient('.*@foo.example.com')",
            actions=[
                "forward('http://example.com/api/v1/foos/')",
                "stop()",
            ])
        ```

        ## Import

        Routes can be imported using `ROUTE_ID` and `region` via `import` command. Route ID can be found on Mailgun portal in section `Receiving/Routes`. Region has to be chosen from `eu` or `us` (when no selection `us` is applied).

        hcl

        ```sh
        $ pulumi import mailgun:index/route:Route test eu:123456789
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] expression: A filter expression like `match_recipient('.*@gmail.com')`
        :param pulumi.Input[_builtins.int] priority: Smaller number indicates higher priority. Higher priority routes are handled first.
        :param pulumi.Input[_builtins.str] region: The region where domain will be created. Default value is `us`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: RouteArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Mailgun Route resource. This can be used to create and manage routes on Mailgun.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_mailgun as mailgun

        # Create a new Mailgun route
        default = mailgun.Route("default",
            priority=0,
            description="inbound",
            expression="match_recipient('.*@foo.example.com')",
            actions=[
                "forward('http://example.com/api/v1/foos/')",
                "stop()",
            ])
        ```

        ## Import

        Routes can be imported using `ROUTE_ID` and `region` via `import` command. Route ID can be found on Mailgun portal in section `Receiving/Routes`. Region has to be chosen from `eu` or `us` (when no selection `us` is applied).

        hcl

        ```sh
        $ pulumi import mailgun:index/route:Route test eu:123456789
        ```

        :param str resource_name: The name of the resource.
        :param RouteArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(RouteArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 actions: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 expression: Optional[pulumi.Input[_builtins.str]] = None,
                 priority: Optional[pulumi.Input[_builtins.int]] = None,
                 region: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = RouteArgs.__new__(RouteArgs)

            if actions is None and not opts.urn:
                raise TypeError("Missing required property 'actions'")
            __props__.__dict__["actions"] = actions
            __props__.__dict__["description"] = description
            if expression is None and not opts.urn:
                raise TypeError("Missing required property 'expression'")
            __props__.__dict__["expression"] = expression
            if priority is None and not opts.urn:
                raise TypeError("Missing required property 'priority'")
            __props__.__dict__["priority"] = priority
            __props__.__dict__["region"] = region
        super(Route, __self__).__init__(
            'mailgun:index/route:Route',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            actions: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
            description: Optional[pulumi.Input[_builtins.str]] = None,
            expression: Optional[pulumi.Input[_builtins.str]] = None,
            priority: Optional[pulumi.Input[_builtins.int]] = None,
            region: Optional[pulumi.Input[_builtins.str]] = None) -> 'Route':
        """
        Get an existing Route resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] expression: A filter expression like `match_recipient('.*@gmail.com')`
        :param pulumi.Input[_builtins.int] priority: Smaller number indicates higher priority. Higher priority routes are handled first.
        :param pulumi.Input[_builtins.str] region: The region where domain will be created. Default value is `us`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _RouteState.__new__(_RouteState)

        __props__.__dict__["actions"] = actions
        __props__.__dict__["description"] = description
        __props__.__dict__["expression"] = expression
        __props__.__dict__["priority"] = priority
        __props__.__dict__["region"] = region
        return Route(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def actions(self) -> pulumi.Output[Sequence[_builtins.str]]:
        return pulumi.get(self, "actions")

    @_builtins.property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[_builtins.str]]:
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter
    def expression(self) -> pulumi.Output[_builtins.str]:
        """
        A filter expression like `match_recipient('.*@gmail.com')`
        """
        return pulumi.get(self, "expression")

    @_builtins.property
    @pulumi.getter
    def priority(self) -> pulumi.Output[_builtins.int]:
        """
        Smaller number indicates higher priority. Higher priority routes are handled first.
        """
        return pulumi.get(self, "priority")

    @_builtins.property
    @pulumi.getter
    def region(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The region where domain will be created. Default value is `us`.
        """
        return pulumi.get(self, "region")

