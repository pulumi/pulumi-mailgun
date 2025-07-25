// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mailgun

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-mailgun/sdk/v3/go/mailgun/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Mailgun Route resource. This can be used to create and manage routes on Mailgun.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-mailgun/sdk/v3/go/mailgun"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			// Create a new Mailgun route
//			_, err := mailgun.NewRoute(ctx, "default", &mailgun.RouteArgs{
//				Priority:    pulumi.Int(0),
//				Description: pulumi.String("inbound"),
//				Expression:  pulumi.String("match_recipient('.*@foo.example.com')"),
//				Actions: pulumi.StringArray{
//					pulumi.String("forward('http://example.com/api/v1/foos/')"),
//					pulumi.String("stop()"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// Routes can be imported using `ROUTE_ID` and `region` via `import` command. Route ID can be found on Mailgun portal in section `Receiving/Routes`. Region has to be chosen from `eu` or `us` (when no selection `us` is applied).
//
// hcl
//
// ```sh
// $ pulumi import mailgun:index/route:Route test eu:123456789
// ```
type Route struct {
	pulumi.CustomResourceState

	Actions     pulumi.StringArrayOutput `pulumi:"actions"`
	Description pulumi.StringPtrOutput   `pulumi:"description"`
	// A filter expression like `match_recipient('.*@gmail.com')`
	Expression pulumi.StringOutput `pulumi:"expression"`
	// Smaller number indicates higher priority. Higher priority routes are handled first.
	Priority pulumi.IntOutput `pulumi:"priority"`
	// The region where domain will be created. Default value is `us`.
	Region pulumi.StringPtrOutput `pulumi:"region"`
}

// NewRoute registers a new resource with the given unique name, arguments, and options.
func NewRoute(ctx *pulumi.Context,
	name string, args *RouteArgs, opts ...pulumi.ResourceOption) (*Route, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Actions == nil {
		return nil, errors.New("invalid value for required argument 'Actions'")
	}
	if args.Expression == nil {
		return nil, errors.New("invalid value for required argument 'Expression'")
	}
	if args.Priority == nil {
		return nil, errors.New("invalid value for required argument 'Priority'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Route
	err := ctx.RegisterResource("mailgun:index/route:Route", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRoute gets an existing Route resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRoute(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RouteState, opts ...pulumi.ResourceOption) (*Route, error) {
	var resource Route
	err := ctx.ReadResource("mailgun:index/route:Route", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Route resources.
type routeState struct {
	Actions     []string `pulumi:"actions"`
	Description *string  `pulumi:"description"`
	// A filter expression like `match_recipient('.*@gmail.com')`
	Expression *string `pulumi:"expression"`
	// Smaller number indicates higher priority. Higher priority routes are handled first.
	Priority *int `pulumi:"priority"`
	// The region where domain will be created. Default value is `us`.
	Region *string `pulumi:"region"`
}

type RouteState struct {
	Actions     pulumi.StringArrayInput
	Description pulumi.StringPtrInput
	// A filter expression like `match_recipient('.*@gmail.com')`
	Expression pulumi.StringPtrInput
	// Smaller number indicates higher priority. Higher priority routes are handled first.
	Priority pulumi.IntPtrInput
	// The region where domain will be created. Default value is `us`.
	Region pulumi.StringPtrInput
}

func (RouteState) ElementType() reflect.Type {
	return reflect.TypeOf((*routeState)(nil)).Elem()
}

type routeArgs struct {
	Actions     []string `pulumi:"actions"`
	Description *string  `pulumi:"description"`
	// A filter expression like `match_recipient('.*@gmail.com')`
	Expression string `pulumi:"expression"`
	// Smaller number indicates higher priority. Higher priority routes are handled first.
	Priority int `pulumi:"priority"`
	// The region where domain will be created. Default value is `us`.
	Region *string `pulumi:"region"`
}

// The set of arguments for constructing a Route resource.
type RouteArgs struct {
	Actions     pulumi.StringArrayInput
	Description pulumi.StringPtrInput
	// A filter expression like `match_recipient('.*@gmail.com')`
	Expression pulumi.StringInput
	// Smaller number indicates higher priority. Higher priority routes are handled first.
	Priority pulumi.IntInput
	// The region where domain will be created. Default value is `us`.
	Region pulumi.StringPtrInput
}

func (RouteArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*routeArgs)(nil)).Elem()
}

type RouteInput interface {
	pulumi.Input

	ToRouteOutput() RouteOutput
	ToRouteOutputWithContext(ctx context.Context) RouteOutput
}

func (*Route) ElementType() reflect.Type {
	return reflect.TypeOf((**Route)(nil)).Elem()
}

func (i *Route) ToRouteOutput() RouteOutput {
	return i.ToRouteOutputWithContext(context.Background())
}

func (i *Route) ToRouteOutputWithContext(ctx context.Context) RouteOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RouteOutput)
}

// RouteArrayInput is an input type that accepts RouteArray and RouteArrayOutput values.
// You can construct a concrete instance of `RouteArrayInput` via:
//
//	RouteArray{ RouteArgs{...} }
type RouteArrayInput interface {
	pulumi.Input

	ToRouteArrayOutput() RouteArrayOutput
	ToRouteArrayOutputWithContext(context.Context) RouteArrayOutput
}

type RouteArray []RouteInput

func (RouteArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Route)(nil)).Elem()
}

func (i RouteArray) ToRouteArrayOutput() RouteArrayOutput {
	return i.ToRouteArrayOutputWithContext(context.Background())
}

func (i RouteArray) ToRouteArrayOutputWithContext(ctx context.Context) RouteArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RouteArrayOutput)
}

// RouteMapInput is an input type that accepts RouteMap and RouteMapOutput values.
// You can construct a concrete instance of `RouteMapInput` via:
//
//	RouteMap{ "key": RouteArgs{...} }
type RouteMapInput interface {
	pulumi.Input

	ToRouteMapOutput() RouteMapOutput
	ToRouteMapOutputWithContext(context.Context) RouteMapOutput
}

type RouteMap map[string]RouteInput

func (RouteMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Route)(nil)).Elem()
}

func (i RouteMap) ToRouteMapOutput() RouteMapOutput {
	return i.ToRouteMapOutputWithContext(context.Background())
}

func (i RouteMap) ToRouteMapOutputWithContext(ctx context.Context) RouteMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RouteMapOutput)
}

type RouteOutput struct{ *pulumi.OutputState }

func (RouteOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Route)(nil)).Elem()
}

func (o RouteOutput) ToRouteOutput() RouteOutput {
	return o
}

func (o RouteOutput) ToRouteOutputWithContext(ctx context.Context) RouteOutput {
	return o
}

func (o RouteOutput) Actions() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Route) pulumi.StringArrayOutput { return v.Actions }).(pulumi.StringArrayOutput)
}

func (o RouteOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Route) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// A filter expression like `match_recipient('.*@gmail.com')`
func (o RouteOutput) Expression() pulumi.StringOutput {
	return o.ApplyT(func(v *Route) pulumi.StringOutput { return v.Expression }).(pulumi.StringOutput)
}

// Smaller number indicates higher priority. Higher priority routes are handled first.
func (o RouteOutput) Priority() pulumi.IntOutput {
	return o.ApplyT(func(v *Route) pulumi.IntOutput { return v.Priority }).(pulumi.IntOutput)
}

// The region where domain will be created. Default value is `us`.
func (o RouteOutput) Region() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Route) pulumi.StringPtrOutput { return v.Region }).(pulumi.StringPtrOutput)
}

type RouteArrayOutput struct{ *pulumi.OutputState }

func (RouteArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Route)(nil)).Elem()
}

func (o RouteArrayOutput) ToRouteArrayOutput() RouteArrayOutput {
	return o
}

func (o RouteArrayOutput) ToRouteArrayOutputWithContext(ctx context.Context) RouteArrayOutput {
	return o
}

func (o RouteArrayOutput) Index(i pulumi.IntInput) RouteOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Route {
		return vs[0].([]*Route)[vs[1].(int)]
	}).(RouteOutput)
}

type RouteMapOutput struct{ *pulumi.OutputState }

func (RouteMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Route)(nil)).Elem()
}

func (o RouteMapOutput) ToRouteMapOutput() RouteMapOutput {
	return o
}

func (o RouteMapOutput) ToRouteMapOutputWithContext(ctx context.Context) RouteMapOutput {
	return o
}

func (o RouteMapOutput) MapIndex(k pulumi.StringInput) RouteOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Route {
		return vs[0].(map[string]*Route)[vs[1].(string)]
	}).(RouteOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RouteInput)(nil)).Elem(), &Route{})
	pulumi.RegisterInputType(reflect.TypeOf((*RouteArrayInput)(nil)).Elem(), RouteArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*RouteMapInput)(nil)).Elem(), RouteMap{})
	pulumi.RegisterOutputType(RouteOutput{})
	pulumi.RegisterOutputType(RouteArrayOutput{})
	pulumi.RegisterOutputType(RouteMapOutput{})
}
