// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mailgun

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Mailgun App resource. This can be used to
// create and manage applications on Mailgun.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-mailgun/sdk/v3/go/mailgun"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := mailgun.NewWebhook(ctx, "default", &mailgun.WebhookArgs{
// 			Domain: pulumi.String("test.example.com"),
// 			Kind:   pulumi.String("delivered"),
// 			Region: pulumi.String("us"),
// 			Urls: pulumi.StringArray{
// 				pulumi.String("https://example.com"),
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
type Webhook struct {
	pulumi.CustomResourceState

	// The domain to add to Mailgun
	Domain pulumi.StringOutput `pulumi:"domain"`
	// The kind of webhook. Supported values (`clicked` `complained` `delivered` `opened` `permanentFail`, `temporaryFail` `unsubscribed`)
	Kind pulumi.StringOutput `pulumi:"kind"`
	// The region where domain will be created. Default value is `us`.
	Region pulumi.StringPtrOutput `pulumi:"region"`
	// The urls of webhook
	Urls pulumi.StringArrayOutput `pulumi:"urls"`
}

// NewWebhook registers a new resource with the given unique name, arguments, and options.
func NewWebhook(ctx *pulumi.Context,
	name string, args *WebhookArgs, opts ...pulumi.ResourceOption) (*Webhook, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Domain == nil {
		return nil, errors.New("invalid value for required argument 'Domain'")
	}
	if args.Kind == nil {
		return nil, errors.New("invalid value for required argument 'Kind'")
	}
	if args.Urls == nil {
		return nil, errors.New("invalid value for required argument 'Urls'")
	}
	var resource Webhook
	err := ctx.RegisterResource("mailgun:index/webhook:Webhook", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetWebhook gets an existing Webhook resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetWebhook(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *WebhookState, opts ...pulumi.ResourceOption) (*Webhook, error) {
	var resource Webhook
	err := ctx.ReadResource("mailgun:index/webhook:Webhook", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Webhook resources.
type webhookState struct {
	// The domain to add to Mailgun
	Domain *string `pulumi:"domain"`
	// The kind of webhook. Supported values (`clicked` `complained` `delivered` `opened` `permanentFail`, `temporaryFail` `unsubscribed`)
	Kind *string `pulumi:"kind"`
	// The region where domain will be created. Default value is `us`.
	Region *string `pulumi:"region"`
	// The urls of webhook
	Urls []string `pulumi:"urls"`
}

type WebhookState struct {
	// The domain to add to Mailgun
	Domain pulumi.StringPtrInput
	// The kind of webhook. Supported values (`clicked` `complained` `delivered` `opened` `permanentFail`, `temporaryFail` `unsubscribed`)
	Kind pulumi.StringPtrInput
	// The region where domain will be created. Default value is `us`.
	Region pulumi.StringPtrInput
	// The urls of webhook
	Urls pulumi.StringArrayInput
}

func (WebhookState) ElementType() reflect.Type {
	return reflect.TypeOf((*webhookState)(nil)).Elem()
}

type webhookArgs struct {
	// The domain to add to Mailgun
	Domain string `pulumi:"domain"`
	// The kind of webhook. Supported values (`clicked` `complained` `delivered` `opened` `permanentFail`, `temporaryFail` `unsubscribed`)
	Kind string `pulumi:"kind"`
	// The region where domain will be created. Default value is `us`.
	Region *string `pulumi:"region"`
	// The urls of webhook
	Urls []string `pulumi:"urls"`
}

// The set of arguments for constructing a Webhook resource.
type WebhookArgs struct {
	// The domain to add to Mailgun
	Domain pulumi.StringInput
	// The kind of webhook. Supported values (`clicked` `complained` `delivered` `opened` `permanentFail`, `temporaryFail` `unsubscribed`)
	Kind pulumi.StringInput
	// The region where domain will be created. Default value is `us`.
	Region pulumi.StringPtrInput
	// The urls of webhook
	Urls pulumi.StringArrayInput
}

func (WebhookArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*webhookArgs)(nil)).Elem()
}

type WebhookInput interface {
	pulumi.Input

	ToWebhookOutput() WebhookOutput
	ToWebhookOutputWithContext(ctx context.Context) WebhookOutput
}

func (*Webhook) ElementType() reflect.Type {
	return reflect.TypeOf((**Webhook)(nil)).Elem()
}

func (i *Webhook) ToWebhookOutput() WebhookOutput {
	return i.ToWebhookOutputWithContext(context.Background())
}

func (i *Webhook) ToWebhookOutputWithContext(ctx context.Context) WebhookOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WebhookOutput)
}

// WebhookArrayInput is an input type that accepts WebhookArray and WebhookArrayOutput values.
// You can construct a concrete instance of `WebhookArrayInput` via:
//
//          WebhookArray{ WebhookArgs{...} }
type WebhookArrayInput interface {
	pulumi.Input

	ToWebhookArrayOutput() WebhookArrayOutput
	ToWebhookArrayOutputWithContext(context.Context) WebhookArrayOutput
}

type WebhookArray []WebhookInput

func (WebhookArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Webhook)(nil)).Elem()
}

func (i WebhookArray) ToWebhookArrayOutput() WebhookArrayOutput {
	return i.ToWebhookArrayOutputWithContext(context.Background())
}

func (i WebhookArray) ToWebhookArrayOutputWithContext(ctx context.Context) WebhookArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WebhookArrayOutput)
}

// WebhookMapInput is an input type that accepts WebhookMap and WebhookMapOutput values.
// You can construct a concrete instance of `WebhookMapInput` via:
//
//          WebhookMap{ "key": WebhookArgs{...} }
type WebhookMapInput interface {
	pulumi.Input

	ToWebhookMapOutput() WebhookMapOutput
	ToWebhookMapOutputWithContext(context.Context) WebhookMapOutput
}

type WebhookMap map[string]WebhookInput

func (WebhookMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Webhook)(nil)).Elem()
}

func (i WebhookMap) ToWebhookMapOutput() WebhookMapOutput {
	return i.ToWebhookMapOutputWithContext(context.Background())
}

func (i WebhookMap) ToWebhookMapOutputWithContext(ctx context.Context) WebhookMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WebhookMapOutput)
}

type WebhookOutput struct{ *pulumi.OutputState }

func (WebhookOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Webhook)(nil)).Elem()
}

func (o WebhookOutput) ToWebhookOutput() WebhookOutput {
	return o
}

func (o WebhookOutput) ToWebhookOutputWithContext(ctx context.Context) WebhookOutput {
	return o
}

type WebhookArrayOutput struct{ *pulumi.OutputState }

func (WebhookArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Webhook)(nil)).Elem()
}

func (o WebhookArrayOutput) ToWebhookArrayOutput() WebhookArrayOutput {
	return o
}

func (o WebhookArrayOutput) ToWebhookArrayOutputWithContext(ctx context.Context) WebhookArrayOutput {
	return o
}

func (o WebhookArrayOutput) Index(i pulumi.IntInput) WebhookOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Webhook {
		return vs[0].([]*Webhook)[vs[1].(int)]
	}).(WebhookOutput)
}

type WebhookMapOutput struct{ *pulumi.OutputState }

func (WebhookMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Webhook)(nil)).Elem()
}

func (o WebhookMapOutput) ToWebhookMapOutput() WebhookMapOutput {
	return o
}

func (o WebhookMapOutput) ToWebhookMapOutputWithContext(ctx context.Context) WebhookMapOutput {
	return o
}

func (o WebhookMapOutput) MapIndex(k pulumi.StringInput) WebhookOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Webhook {
		return vs[0].(map[string]*Webhook)[vs[1].(string)]
	}).(WebhookOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*WebhookInput)(nil)).Elem(), &Webhook{})
	pulumi.RegisterInputType(reflect.TypeOf((*WebhookArrayInput)(nil)).Elem(), WebhookArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*WebhookMapInput)(nil)).Elem(), WebhookMap{})
	pulumi.RegisterOutputType(WebhookOutput{})
	pulumi.RegisterOutputType(WebhookArrayOutput{})
	pulumi.RegisterOutputType(WebhookMapOutput{})
}
