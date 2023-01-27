module github.com/pulumi/pulumi-mailgun/provider/v3

go 1.16

require (
	github.com/pulumi/pulumi-terraform-bridge/v3 v3.38.2
	github.com/pulumi/pulumi/sdk/v3 v3.51.0
	github.com/wgebis/terraform-provider-mailgun v0.7.4
)

replace (
	github.com/hashicorp/go-getter v1.5.0 => github.com/hashicorp/go-getter v1.4.0
	github.com/hashicorp/terraform-plugin-sdk/v2 => github.com/pulumi/terraform-plugin-sdk/v2 v2.0.0-20220725190814-23001ad6ec03
	github.com/hashicorp/terraform-plugin-test => github.com/hashicorp/terraform-plugin-test v1.3.0
	github.com/hashicorp/vault => github.com/hashicorp/vault v1.2.0
	github.com/wgebis/terraform-provider-mailgun => github.com/pulumi/terraform-provider-mailgun v0.6.2-0.20230127162148-c611999ecc04
)
