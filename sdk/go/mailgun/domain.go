// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package mailgun

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
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
// 	"github.com/pulumi/pulumi-mailgun/sdk/v2/go/mailgun"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := mailgun.NewDomain(ctx, "_default", &mailgun.DomainArgs{
// 			Region:       pulumi.String("us"),
// 			SmtpPassword: pulumi.String("supersecretpassword1234"),
// 			SpamAction:   pulumi.String("disabled"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// Domains can be imported using `region:domain_name` via `import` command. Region has to be chosen from `eu` or `us` (when no selection `us` is applied).
//
// hcl
//
// ```sh
//  $ pulumi import mailgun:index/domain:Domain test us:example.domain.com
// ```
type Domain struct {
	pulumi.CustomResourceState

	// The domain to add to Mailgun
	Name pulumi.StringOutput `pulumi:"name"`
	// A list of DNS records for receiving validation.
	ReceivingRecords DomainReceivingRecordArrayOutput `pulumi:"receivingRecords"`
	// The region where domain will be created. Default value is `us`.
	Region pulumi.StringPtrOutput `pulumi:"region"`
	// A list of DNS records for sending validation.
	SendingRecords DomainSendingRecordArrayOutput `pulumi:"sendingRecords"`
	// The login email for the SMTP server.
	SmtpLogin pulumi.StringOutput `pulumi:"smtpLogin"`
	// Password for SMTP authentication
	SmtpPassword pulumi.StringPtrOutput `pulumi:"smtpPassword"`
	// `disabled` or `tag` Disable, no spam
	// filtering will occur for inbound messages. Tag, messages
	// will be tagged with a spam header.
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
	// The domain to add to Mailgun
	Name *string `pulumi:"name"`
	// A list of DNS records for receiving validation.
	ReceivingRecords []DomainReceivingRecord `pulumi:"receivingRecords"`
	// The region where domain will be created. Default value is `us`.
	Region *string `pulumi:"region"`
	// A list of DNS records for sending validation.
	SendingRecords []DomainSendingRecord `pulumi:"sendingRecords"`
	// The login email for the SMTP server.
	SmtpLogin *string `pulumi:"smtpLogin"`
	// Password for SMTP authentication
	SmtpPassword *string `pulumi:"smtpPassword"`
	// `disabled` or `tag` Disable, no spam
	// filtering will occur for inbound messages. Tag, messages
	// will be tagged with a spam header.
	SpamAction *string `pulumi:"spamAction"`
	// Boolean that determines whether
	// the domain will accept email for sub-domains.
	Wildcard *bool `pulumi:"wildcard"`
}

type DomainState struct {
	// The domain to add to Mailgun
	Name pulumi.StringPtrInput
	// A list of DNS records for receiving validation.
	ReceivingRecords DomainReceivingRecordArrayInput
	// The region where domain will be created. Default value is `us`.
	Region pulumi.StringPtrInput
	// A list of DNS records for sending validation.
	SendingRecords DomainSendingRecordArrayInput
	// The login email for the SMTP server.
	SmtpLogin pulumi.StringPtrInput
	// Password for SMTP authentication
	SmtpPassword pulumi.StringPtrInput
	// `disabled` or `tag` Disable, no spam
	// filtering will occur for inbound messages. Tag, messages
	// will be tagged with a spam header.
	SpamAction pulumi.StringPtrInput
	// Boolean that determines whether
	// the domain will accept email for sub-domains.
	Wildcard pulumi.BoolPtrInput
}

func (DomainState) ElementType() reflect.Type {
	return reflect.TypeOf((*domainState)(nil)).Elem()
}

type domainArgs struct {
	// The domain to add to Mailgun
	Name *string `pulumi:"name"`
	// The region where domain will be created. Default value is `us`.
	Region *string `pulumi:"region"`
	// Password for SMTP authentication
	SmtpPassword *string `pulumi:"smtpPassword"`
	// `disabled` or `tag` Disable, no spam
	// filtering will occur for inbound messages. Tag, messages
	// will be tagged with a spam header.
	SpamAction *string `pulumi:"spamAction"`
	// Boolean that determines whether
	// the domain will accept email for sub-domains.
	Wildcard *bool `pulumi:"wildcard"`
}

// The set of arguments for constructing a Domain resource.
type DomainArgs struct {
	// The domain to add to Mailgun
	Name pulumi.StringPtrInput
	// The region where domain will be created. Default value is `us`.
	Region pulumi.StringPtrInput
	// Password for SMTP authentication
	SmtpPassword pulumi.StringPtrInput
	// `disabled` or `tag` Disable, no spam
	// filtering will occur for inbound messages. Tag, messages
	// will be tagged with a spam header.
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

func (Domain) ElementType() reflect.Type {
	return reflect.TypeOf((*Domain)(nil)).Elem()
}

func (i Domain) ToDomainOutput() DomainOutput {
	return i.ToDomainOutputWithContext(context.Background())
}

func (i Domain) ToDomainOutputWithContext(ctx context.Context) DomainOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DomainOutput)
}

type DomainOutput struct {
	*pulumi.OutputState
}

func (DomainOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*DomainOutput)(nil)).Elem()
}

func (o DomainOutput) ToDomainOutput() DomainOutput {
	return o
}

func (o DomainOutput) ToDomainOutputWithContext(ctx context.Context) DomainOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(DomainOutput{})
}
