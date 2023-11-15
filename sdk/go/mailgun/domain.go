// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mailgun

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-mailgun/sdk/v3/go/mailgun/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Mailgun App resource. This can be used to
// create and manage applications on Mailgun.
//
// After DNS records are set, domain verification should be triggered manually using [PUT /domains/\<domain\>/verify](https://documentation.mailgun.com/en/latest/api-domains.html#domains)
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
//			_, err := mailgun.NewDomain(ctx, "default", &mailgun.DomainArgs{
//				DkimKeySize:  pulumi.Int(1024),
//				Region:       pulumi.String("us"),
//				SmtpPassword: pulumi.String("supersecretpassword1234"),
//				SpamAction:   pulumi.String("disabled"),
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
// Domains can be imported using `region:domain_name` via `import` command. Region has to be chosen from `eu` or `us` (when no selection `us` is applied).
//
// hcl
//
// ```sh
//
//	$ pulumi import mailgun:index/domain:Domain test us:example.domain.com
//
// ```
type Domain struct {
	pulumi.CustomResourceState

	// The length of your domain’s generated DKIM key. Default value is `1024`.
	DkimKeySize pulumi.IntPtrOutput `pulumi:"dkimKeySize"`
	// The name of your DKIM selector if you want to specify it whereas MailGun will make it's own choice.
	DkimSelector pulumi.StringPtrOutput `pulumi:"dkimSelector"`
	// If set to true, the domain will be the DKIM authority for itself even if the root domain is registered on the same mailgun account. If set to false, the domain will have the same DKIM authority as the root domain registered on the same mailgun account. The default is `false`.
	ForceDkimAuthority pulumi.BoolPtrOutput `pulumi:"forceDkimAuthority"`
	// The domain to add to Mailgun
	Name pulumi.StringOutput `pulumi:"name"`
	// (Enum: `yes` or `no`) The open tracking settings for the domain. Default: `no`
	OpenTracking pulumi.BoolPtrOutput `pulumi:"openTracking"`
	// A list of DNS records for receiving validation.  **Deprecated** Use `receivingRecordsSet` instead.
	//
	// Deprecated: Use `receiving_records_set` instead.
	ReceivingRecords DomainReceivingRecordArrayOutput `pulumi:"receivingRecords"`
	// A set of DNS records for receiving validation.
	ReceivingRecordsSets DomainReceivingRecordsSetArrayOutput `pulumi:"receivingRecordsSets"`
	// The region where domain will be created. Default value is `us`.
	Region pulumi.StringPtrOutput `pulumi:"region"`
	// A list of DNS records for sending validation. **Deprecated** Use `sendingRecordsSet` instead.
	//
	// Deprecated: Use `sending_records_set` instead.
	SendingRecords DomainSendingRecordArrayOutput `pulumi:"sendingRecords"`
	// A set of DNS records for sending validation.
	SendingRecordsSets DomainSendingRecordsSetArrayOutput `pulumi:"sendingRecordsSets"`
	// The login email for the SMTP server.
	SmtpLogin pulumi.StringOutput `pulumi:"smtpLogin"`
	// Password for SMTP authentication
	SmtpPassword pulumi.StringPtrOutput `pulumi:"smtpPassword"`
	// `disabled` or `tag` Disable, no spam
	// filtering will occur for inbound messages. Tag, messages
	// will be tagged with a spam header. Default value is `disabled`.
	SpamAction pulumi.StringPtrOutput `pulumi:"spamAction"`
	// Boolean that determines whether
	// the domain will accept email for sub-domains.
	Wildcard pulumi.BoolPtrOutput `pulumi:"wildcard"`
}

// NewDomain registers a new resource with the given unique name, arguments, and options.
func NewDomain(ctx *pulumi.Context,
	name string, args *DomainArgs, opts ...pulumi.ResourceOption) (*Domain, error) {
	if args == nil {
		args = &DomainArgs{}
	}

	if args.SmtpPassword != nil {
		args.SmtpPassword = pulumi.ToSecret(args.SmtpPassword).(pulumi.StringPtrInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"smtpPassword",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Domain
	err := ctx.RegisterResource("mailgun:index/domain:Domain", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDomain gets an existing Domain resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDomain(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DomainState, opts ...pulumi.ResourceOption) (*Domain, error) {
	var resource Domain
	err := ctx.ReadResource("mailgun:index/domain:Domain", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Domain resources.
type domainState struct {
	// The length of your domain’s generated DKIM key. Default value is `1024`.
	DkimKeySize *int `pulumi:"dkimKeySize"`
	// The name of your DKIM selector if you want to specify it whereas MailGun will make it's own choice.
	DkimSelector *string `pulumi:"dkimSelector"`
	// If set to true, the domain will be the DKIM authority for itself even if the root domain is registered on the same mailgun account. If set to false, the domain will have the same DKIM authority as the root domain registered on the same mailgun account. The default is `false`.
	ForceDkimAuthority *bool `pulumi:"forceDkimAuthority"`
	// The domain to add to Mailgun
	Name *string `pulumi:"name"`
	// (Enum: `yes` or `no`) The open tracking settings for the domain. Default: `no`
	OpenTracking *bool `pulumi:"openTracking"`
	// A list of DNS records for receiving validation.  **Deprecated** Use `receivingRecordsSet` instead.
	//
	// Deprecated: Use `receiving_records_set` instead.
	ReceivingRecords []DomainReceivingRecord `pulumi:"receivingRecords"`
	// A set of DNS records for receiving validation.
	ReceivingRecordsSets []DomainReceivingRecordsSet `pulumi:"receivingRecordsSets"`
	// The region where domain will be created. Default value is `us`.
	Region *string `pulumi:"region"`
	// A list of DNS records for sending validation. **Deprecated** Use `sendingRecordsSet` instead.
	//
	// Deprecated: Use `sending_records_set` instead.
	SendingRecords []DomainSendingRecord `pulumi:"sendingRecords"`
	// A set of DNS records for sending validation.
	SendingRecordsSets []DomainSendingRecordsSet `pulumi:"sendingRecordsSets"`
	// The login email for the SMTP server.
	SmtpLogin *string `pulumi:"smtpLogin"`
	// Password for SMTP authentication
	SmtpPassword *string `pulumi:"smtpPassword"`
	// `disabled` or `tag` Disable, no spam
	// filtering will occur for inbound messages. Tag, messages
	// will be tagged with a spam header. Default value is `disabled`.
	SpamAction *string `pulumi:"spamAction"`
	// Boolean that determines whether
	// the domain will accept email for sub-domains.
	Wildcard *bool `pulumi:"wildcard"`
}

type DomainState struct {
	// The length of your domain’s generated DKIM key. Default value is `1024`.
	DkimKeySize pulumi.IntPtrInput
	// The name of your DKIM selector if you want to specify it whereas MailGun will make it's own choice.
	DkimSelector pulumi.StringPtrInput
	// If set to true, the domain will be the DKIM authority for itself even if the root domain is registered on the same mailgun account. If set to false, the domain will have the same DKIM authority as the root domain registered on the same mailgun account. The default is `false`.
	ForceDkimAuthority pulumi.BoolPtrInput
	// The domain to add to Mailgun
	Name pulumi.StringPtrInput
	// (Enum: `yes` or `no`) The open tracking settings for the domain. Default: `no`
	OpenTracking pulumi.BoolPtrInput
	// A list of DNS records for receiving validation.  **Deprecated** Use `receivingRecordsSet` instead.
	//
	// Deprecated: Use `receiving_records_set` instead.
	ReceivingRecords DomainReceivingRecordArrayInput
	// A set of DNS records for receiving validation.
	ReceivingRecordsSets DomainReceivingRecordsSetArrayInput
	// The region where domain will be created. Default value is `us`.
	Region pulumi.StringPtrInput
	// A list of DNS records for sending validation. **Deprecated** Use `sendingRecordsSet` instead.
	//
	// Deprecated: Use `sending_records_set` instead.
	SendingRecords DomainSendingRecordArrayInput
	// A set of DNS records for sending validation.
	SendingRecordsSets DomainSendingRecordsSetArrayInput
	// The login email for the SMTP server.
	SmtpLogin pulumi.StringPtrInput
	// Password for SMTP authentication
	SmtpPassword pulumi.StringPtrInput
	// `disabled` or `tag` Disable, no spam
	// filtering will occur for inbound messages. Tag, messages
	// will be tagged with a spam header. Default value is `disabled`.
	SpamAction pulumi.StringPtrInput
	// Boolean that determines whether
	// the domain will accept email for sub-domains.
	Wildcard pulumi.BoolPtrInput
}

func (DomainState) ElementType() reflect.Type {
	return reflect.TypeOf((*domainState)(nil)).Elem()
}

type domainArgs struct {
	// The length of your domain’s generated DKIM key. Default value is `1024`.
	DkimKeySize *int `pulumi:"dkimKeySize"`
	// The name of your DKIM selector if you want to specify it whereas MailGun will make it's own choice.
	DkimSelector *string `pulumi:"dkimSelector"`
	// If set to true, the domain will be the DKIM authority for itself even if the root domain is registered on the same mailgun account. If set to false, the domain will have the same DKIM authority as the root domain registered on the same mailgun account. The default is `false`.
	ForceDkimAuthority *bool `pulumi:"forceDkimAuthority"`
	// The domain to add to Mailgun
	Name *string `pulumi:"name"`
	// (Enum: `yes` or `no`) The open tracking settings for the domain. Default: `no`
	OpenTracking *bool `pulumi:"openTracking"`
	// The region where domain will be created. Default value is `us`.
	Region *string `pulumi:"region"`
	// Password for SMTP authentication
	SmtpPassword *string `pulumi:"smtpPassword"`
	// `disabled` or `tag` Disable, no spam
	// filtering will occur for inbound messages. Tag, messages
	// will be tagged with a spam header. Default value is `disabled`.
	SpamAction *string `pulumi:"spamAction"`
	// Boolean that determines whether
	// the domain will accept email for sub-domains.
	Wildcard *bool `pulumi:"wildcard"`
}

// The set of arguments for constructing a Domain resource.
type DomainArgs struct {
	// The length of your domain’s generated DKIM key. Default value is `1024`.
	DkimKeySize pulumi.IntPtrInput
	// The name of your DKIM selector if you want to specify it whereas MailGun will make it's own choice.
	DkimSelector pulumi.StringPtrInput
	// If set to true, the domain will be the DKIM authority for itself even if the root domain is registered on the same mailgun account. If set to false, the domain will have the same DKIM authority as the root domain registered on the same mailgun account. The default is `false`.
	ForceDkimAuthority pulumi.BoolPtrInput
	// The domain to add to Mailgun
	Name pulumi.StringPtrInput
	// (Enum: `yes` or `no`) The open tracking settings for the domain. Default: `no`
	OpenTracking pulumi.BoolPtrInput
	// The region where domain will be created. Default value is `us`.
	Region pulumi.StringPtrInput
	// Password for SMTP authentication
	SmtpPassword pulumi.StringPtrInput
	// `disabled` or `tag` Disable, no spam
	// filtering will occur for inbound messages. Tag, messages
	// will be tagged with a spam header. Default value is `disabled`.
	SpamAction pulumi.StringPtrInput
	// Boolean that determines whether
	// the domain will accept email for sub-domains.
	Wildcard pulumi.BoolPtrInput
}

func (DomainArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*domainArgs)(nil)).Elem()
}

type DomainInput interface {
	pulumi.Input

	ToDomainOutput() DomainOutput
	ToDomainOutputWithContext(ctx context.Context) DomainOutput
}

func (*Domain) ElementType() reflect.Type {
	return reflect.TypeOf((**Domain)(nil)).Elem()
}

func (i *Domain) ToDomainOutput() DomainOutput {
	return i.ToDomainOutputWithContext(context.Background())
}

func (i *Domain) ToDomainOutputWithContext(ctx context.Context) DomainOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DomainOutput)
}

// DomainArrayInput is an input type that accepts DomainArray and DomainArrayOutput values.
// You can construct a concrete instance of `DomainArrayInput` via:
//
//	DomainArray{ DomainArgs{...} }
type DomainArrayInput interface {
	pulumi.Input

	ToDomainArrayOutput() DomainArrayOutput
	ToDomainArrayOutputWithContext(context.Context) DomainArrayOutput
}

type DomainArray []DomainInput

func (DomainArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Domain)(nil)).Elem()
}

func (i DomainArray) ToDomainArrayOutput() DomainArrayOutput {
	return i.ToDomainArrayOutputWithContext(context.Background())
}

func (i DomainArray) ToDomainArrayOutputWithContext(ctx context.Context) DomainArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DomainArrayOutput)
}

// DomainMapInput is an input type that accepts DomainMap and DomainMapOutput values.
// You can construct a concrete instance of `DomainMapInput` via:
//
//	DomainMap{ "key": DomainArgs{...} }
type DomainMapInput interface {
	pulumi.Input

	ToDomainMapOutput() DomainMapOutput
	ToDomainMapOutputWithContext(context.Context) DomainMapOutput
}

type DomainMap map[string]DomainInput

func (DomainMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Domain)(nil)).Elem()
}

func (i DomainMap) ToDomainMapOutput() DomainMapOutput {
	return i.ToDomainMapOutputWithContext(context.Background())
}

func (i DomainMap) ToDomainMapOutputWithContext(ctx context.Context) DomainMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DomainMapOutput)
}

type DomainOutput struct{ *pulumi.OutputState }

func (DomainOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Domain)(nil)).Elem()
}

func (o DomainOutput) ToDomainOutput() DomainOutput {
	return o
}

func (o DomainOutput) ToDomainOutputWithContext(ctx context.Context) DomainOutput {
	return o
}

// The length of your domain’s generated DKIM key. Default value is `1024`.
func (o DomainOutput) DkimKeySize() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Domain) pulumi.IntPtrOutput { return v.DkimKeySize }).(pulumi.IntPtrOutput)
}

// The name of your DKIM selector if you want to specify it whereas MailGun will make it's own choice.
func (o DomainOutput) DkimSelector() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Domain) pulumi.StringPtrOutput { return v.DkimSelector }).(pulumi.StringPtrOutput)
}

// If set to true, the domain will be the DKIM authority for itself even if the root domain is registered on the same mailgun account. If set to false, the domain will have the same DKIM authority as the root domain registered on the same mailgun account. The default is `false`.
func (o DomainOutput) ForceDkimAuthority() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Domain) pulumi.BoolPtrOutput { return v.ForceDkimAuthority }).(pulumi.BoolPtrOutput)
}

// The domain to add to Mailgun
func (o DomainOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Domain) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// (Enum: `yes` or `no`) The open tracking settings for the domain. Default: `no`
func (o DomainOutput) OpenTracking() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Domain) pulumi.BoolPtrOutput { return v.OpenTracking }).(pulumi.BoolPtrOutput)
}

// A list of DNS records for receiving validation.  **Deprecated** Use `receivingRecordsSet` instead.
//
// Deprecated: Use `receiving_records_set` instead.
func (o DomainOutput) ReceivingRecords() DomainReceivingRecordArrayOutput {
	return o.ApplyT(func(v *Domain) DomainReceivingRecordArrayOutput { return v.ReceivingRecords }).(DomainReceivingRecordArrayOutput)
}

// A set of DNS records for receiving validation.
func (o DomainOutput) ReceivingRecordsSets() DomainReceivingRecordsSetArrayOutput {
	return o.ApplyT(func(v *Domain) DomainReceivingRecordsSetArrayOutput { return v.ReceivingRecordsSets }).(DomainReceivingRecordsSetArrayOutput)
}

// The region where domain will be created. Default value is `us`.
func (o DomainOutput) Region() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Domain) pulumi.StringPtrOutput { return v.Region }).(pulumi.StringPtrOutput)
}

// A list of DNS records for sending validation. **Deprecated** Use `sendingRecordsSet` instead.
//
// Deprecated: Use `sending_records_set` instead.
func (o DomainOutput) SendingRecords() DomainSendingRecordArrayOutput {
	return o.ApplyT(func(v *Domain) DomainSendingRecordArrayOutput { return v.SendingRecords }).(DomainSendingRecordArrayOutput)
}

// A set of DNS records for sending validation.
func (o DomainOutput) SendingRecordsSets() DomainSendingRecordsSetArrayOutput {
	return o.ApplyT(func(v *Domain) DomainSendingRecordsSetArrayOutput { return v.SendingRecordsSets }).(DomainSendingRecordsSetArrayOutput)
}

// The login email for the SMTP server.
func (o DomainOutput) SmtpLogin() pulumi.StringOutput {
	return o.ApplyT(func(v *Domain) pulumi.StringOutput { return v.SmtpLogin }).(pulumi.StringOutput)
}

// Password for SMTP authentication
func (o DomainOutput) SmtpPassword() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Domain) pulumi.StringPtrOutput { return v.SmtpPassword }).(pulumi.StringPtrOutput)
}

// `disabled` or `tag` Disable, no spam
// filtering will occur for inbound messages. Tag, messages
// will be tagged with a spam header. Default value is `disabled`.
func (o DomainOutput) SpamAction() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Domain) pulumi.StringPtrOutput { return v.SpamAction }).(pulumi.StringPtrOutput)
}

// Boolean that determines whether
// the domain will accept email for sub-domains.
func (o DomainOutput) Wildcard() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Domain) pulumi.BoolPtrOutput { return v.Wildcard }).(pulumi.BoolPtrOutput)
}

type DomainArrayOutput struct{ *pulumi.OutputState }

func (DomainArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Domain)(nil)).Elem()
}

func (o DomainArrayOutput) ToDomainArrayOutput() DomainArrayOutput {
	return o
}

func (o DomainArrayOutput) ToDomainArrayOutputWithContext(ctx context.Context) DomainArrayOutput {
	return o
}

func (o DomainArrayOutput) Index(i pulumi.IntInput) DomainOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Domain {
		return vs[0].([]*Domain)[vs[1].(int)]
	}).(DomainOutput)
}

type DomainMapOutput struct{ *pulumi.OutputState }

func (DomainMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Domain)(nil)).Elem()
}

func (o DomainMapOutput) ToDomainMapOutput() DomainMapOutput {
	return o
}

func (o DomainMapOutput) ToDomainMapOutputWithContext(ctx context.Context) DomainMapOutput {
	return o
}

func (o DomainMapOutput) MapIndex(k pulumi.StringInput) DomainOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Domain {
		return vs[0].(map[string]*Domain)[vs[1].(string)]
	}).(DomainOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DomainInput)(nil)).Elem(), &Domain{})
	pulumi.RegisterInputType(reflect.TypeOf((*DomainArrayInput)(nil)).Elem(), DomainArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DomainMapInput)(nil)).Elem(), DomainMap{})
	pulumi.RegisterOutputType(DomainOutput{})
	pulumi.RegisterOutputType(DomainArrayOutput{})
	pulumi.RegisterOutputType(DomainMapOutput{})
}
