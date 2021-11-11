// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package mailgun

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Mailgun domain credential resource. This can be used to create and manage credential in domain of Mailgun.
//
// > **Note:** Please note that starting of v0.6.1 due to using new Mailgun Client API (v4), there is no possibility to retrieve previously created secrets via API. In order get it worked, it's recommended to mark `password` as ignored under `lifecycle` block. See below.
//
// ## Import
//
// Domain credential can be imported using `region:email` via `import` command. Region has to be chosen from `eu` or `us` (when no selection `us` is applied).
//
// Password is always exported to `null`. hcl
//
// ```sh
//  $ pulumi import mailgun:index/domainCredential:DomainCredential test us:test@domain.com
// ```
type DomainCredential struct {
	pulumi.CustomResourceState

	// The domain to add credential of Mailgun.
	Domain pulumi.StringOutput `pulumi:"domain"`
	Login  pulumi.StringOutput `pulumi:"login"`
	// Password for user authentication.
	Password pulumi.StringOutput `pulumi:"password"`
	// The region where domain will be created. Default value is `us`.
	Region pulumi.StringPtrOutput `pulumi:"region"`
}

// NewDomainCredential registers a new resource with the given unique name, arguments, and options.
func NewDomainCredential(ctx *pulumi.Context,
	name string, args *DomainCredentialArgs, opts ...pulumi.ResourceOption) (*DomainCredential, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Domain == nil {
		return nil, errors.New("invalid value for required argument 'Domain'")
	}
	if args.Login == nil {
		return nil, errors.New("invalid value for required argument 'Login'")
	}
	if args.Password == nil {
		return nil, errors.New("invalid value for required argument 'Password'")
	}
	var resource DomainCredential
	err := ctx.RegisterResource("mailgun:index/domainCredential:DomainCredential", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDomainCredential gets an existing DomainCredential resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDomainCredential(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DomainCredentialState, opts ...pulumi.ResourceOption) (*DomainCredential, error) {
	var resource DomainCredential
	err := ctx.ReadResource("mailgun:index/domainCredential:DomainCredential", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DomainCredential resources.
type domainCredentialState struct {
	// The domain to add credential of Mailgun.
	Domain *string `pulumi:"domain"`
	Login  *string `pulumi:"login"`
	// Password for user authentication.
	Password *string `pulumi:"password"`
	// The region where domain will be created. Default value is `us`.
	Region *string `pulumi:"region"`
}

type DomainCredentialState struct {
	// The domain to add credential of Mailgun.
	Domain pulumi.StringPtrInput
	Login  pulumi.StringPtrInput
	// Password for user authentication.
	Password pulumi.StringPtrInput
	// The region where domain will be created. Default value is `us`.
	Region pulumi.StringPtrInput
}

func (DomainCredentialState) ElementType() reflect.Type {
	return reflect.TypeOf((*domainCredentialState)(nil)).Elem()
}

type domainCredentialArgs struct {
	// The domain to add credential of Mailgun.
	Domain string `pulumi:"domain"`
	Login  string `pulumi:"login"`
	// Password for user authentication.
	Password string `pulumi:"password"`
	// The region where domain will be created. Default value is `us`.
	Region *string `pulumi:"region"`
}

// The set of arguments for constructing a DomainCredential resource.
type DomainCredentialArgs struct {
	// The domain to add credential of Mailgun.
	Domain pulumi.StringInput
	Login  pulumi.StringInput
	// Password for user authentication.
	Password pulumi.StringInput
	// The region where domain will be created. Default value is `us`.
	Region pulumi.StringPtrInput
}

func (DomainCredentialArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*domainCredentialArgs)(nil)).Elem()
}

type DomainCredentialInput interface {
	pulumi.Input

	ToDomainCredentialOutput() DomainCredentialOutput
	ToDomainCredentialOutputWithContext(ctx context.Context) DomainCredentialOutput
}

func (*DomainCredential) ElementType() reflect.Type {
	return reflect.TypeOf((*DomainCredential)(nil))
}

func (i *DomainCredential) ToDomainCredentialOutput() DomainCredentialOutput {
	return i.ToDomainCredentialOutputWithContext(context.Background())
}

func (i *DomainCredential) ToDomainCredentialOutputWithContext(ctx context.Context) DomainCredentialOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DomainCredentialOutput)
}

func (i *DomainCredential) ToDomainCredentialPtrOutput() DomainCredentialPtrOutput {
	return i.ToDomainCredentialPtrOutputWithContext(context.Background())
}

func (i *DomainCredential) ToDomainCredentialPtrOutputWithContext(ctx context.Context) DomainCredentialPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DomainCredentialPtrOutput)
}

type DomainCredentialPtrInput interface {
	pulumi.Input

	ToDomainCredentialPtrOutput() DomainCredentialPtrOutput
	ToDomainCredentialPtrOutputWithContext(ctx context.Context) DomainCredentialPtrOutput
}

type domainCredentialPtrType DomainCredentialArgs

func (*domainCredentialPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**DomainCredential)(nil))
}

func (i *domainCredentialPtrType) ToDomainCredentialPtrOutput() DomainCredentialPtrOutput {
	return i.ToDomainCredentialPtrOutputWithContext(context.Background())
}

func (i *domainCredentialPtrType) ToDomainCredentialPtrOutputWithContext(ctx context.Context) DomainCredentialPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DomainCredentialPtrOutput)
}

// DomainCredentialArrayInput is an input type that accepts DomainCredentialArray and DomainCredentialArrayOutput values.
// You can construct a concrete instance of `DomainCredentialArrayInput` via:
//
//          DomainCredentialArray{ DomainCredentialArgs{...} }
type DomainCredentialArrayInput interface {
	pulumi.Input

	ToDomainCredentialArrayOutput() DomainCredentialArrayOutput
	ToDomainCredentialArrayOutputWithContext(context.Context) DomainCredentialArrayOutput
}

type DomainCredentialArray []DomainCredentialInput

func (DomainCredentialArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DomainCredential)(nil)).Elem()
}

func (i DomainCredentialArray) ToDomainCredentialArrayOutput() DomainCredentialArrayOutput {
	return i.ToDomainCredentialArrayOutputWithContext(context.Background())
}

func (i DomainCredentialArray) ToDomainCredentialArrayOutputWithContext(ctx context.Context) DomainCredentialArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DomainCredentialArrayOutput)
}

// DomainCredentialMapInput is an input type that accepts DomainCredentialMap and DomainCredentialMapOutput values.
// You can construct a concrete instance of `DomainCredentialMapInput` via:
//
//          DomainCredentialMap{ "key": DomainCredentialArgs{...} }
type DomainCredentialMapInput interface {
	pulumi.Input

	ToDomainCredentialMapOutput() DomainCredentialMapOutput
	ToDomainCredentialMapOutputWithContext(context.Context) DomainCredentialMapOutput
}

type DomainCredentialMap map[string]DomainCredentialInput

func (DomainCredentialMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DomainCredential)(nil)).Elem()
}

func (i DomainCredentialMap) ToDomainCredentialMapOutput() DomainCredentialMapOutput {
	return i.ToDomainCredentialMapOutputWithContext(context.Background())
}

func (i DomainCredentialMap) ToDomainCredentialMapOutputWithContext(ctx context.Context) DomainCredentialMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DomainCredentialMapOutput)
}

type DomainCredentialOutput struct{ *pulumi.OutputState }

func (DomainCredentialOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*DomainCredential)(nil))
}

func (o DomainCredentialOutput) ToDomainCredentialOutput() DomainCredentialOutput {
	return o
}

func (o DomainCredentialOutput) ToDomainCredentialOutputWithContext(ctx context.Context) DomainCredentialOutput {
	return o
}

func (o DomainCredentialOutput) ToDomainCredentialPtrOutput() DomainCredentialPtrOutput {
	return o.ToDomainCredentialPtrOutputWithContext(context.Background())
}

func (o DomainCredentialOutput) ToDomainCredentialPtrOutputWithContext(ctx context.Context) DomainCredentialPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v DomainCredential) *DomainCredential {
		return &v
	}).(DomainCredentialPtrOutput)
}

type DomainCredentialPtrOutput struct{ *pulumi.OutputState }

func (DomainCredentialPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DomainCredential)(nil))
}

func (o DomainCredentialPtrOutput) ToDomainCredentialPtrOutput() DomainCredentialPtrOutput {
	return o
}

func (o DomainCredentialPtrOutput) ToDomainCredentialPtrOutputWithContext(ctx context.Context) DomainCredentialPtrOutput {
	return o
}

func (o DomainCredentialPtrOutput) Elem() DomainCredentialOutput {
	return o.ApplyT(func(v *DomainCredential) DomainCredential {
		if v != nil {
			return *v
		}
		var ret DomainCredential
		return ret
	}).(DomainCredentialOutput)
}

type DomainCredentialArrayOutput struct{ *pulumi.OutputState }

func (DomainCredentialArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]DomainCredential)(nil))
}

func (o DomainCredentialArrayOutput) ToDomainCredentialArrayOutput() DomainCredentialArrayOutput {
	return o
}

func (o DomainCredentialArrayOutput) ToDomainCredentialArrayOutputWithContext(ctx context.Context) DomainCredentialArrayOutput {
	return o
}

func (o DomainCredentialArrayOutput) Index(i pulumi.IntInput) DomainCredentialOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) DomainCredential {
		return vs[0].([]DomainCredential)[vs[1].(int)]
	}).(DomainCredentialOutput)
}

type DomainCredentialMapOutput struct{ *pulumi.OutputState }

func (DomainCredentialMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]DomainCredential)(nil))
}

func (o DomainCredentialMapOutput) ToDomainCredentialMapOutput() DomainCredentialMapOutput {
	return o
}

func (o DomainCredentialMapOutput) ToDomainCredentialMapOutputWithContext(ctx context.Context) DomainCredentialMapOutput {
	return o
}

func (o DomainCredentialMapOutput) MapIndex(k pulumi.StringInput) DomainCredentialOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) DomainCredential {
		return vs[0].(map[string]DomainCredential)[vs[1].(string)]
	}).(DomainCredentialOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DomainCredentialInput)(nil)).Elem(), &DomainCredential{})
	pulumi.RegisterInputType(reflect.TypeOf((*DomainCredentialPtrInput)(nil)).Elem(), &DomainCredential{})
	pulumi.RegisterInputType(reflect.TypeOf((*DomainCredentialArrayInput)(nil)).Elem(), DomainCredentialArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DomainCredentialMapInput)(nil)).Elem(), DomainCredentialMap{})
	pulumi.RegisterOutputType(DomainCredentialOutput{})
	pulumi.RegisterOutputType(DomainCredentialPtrOutput{})
	pulumi.RegisterOutputType(DomainCredentialArrayOutput{})
	pulumi.RegisterOutputType(DomainCredentialMapOutput{})
}
