module github.com/pulumi/pulumi-mailgun/provider/v3

go 1.16

require (
	github.com/hashicorp/terraform-plugin-sdk v1.15.0
	github.com/pulumi/pulumi-terraform-bridge/v3 v3.0.0-beta.1
	github.com/pulumi/pulumi/sdk/v3 v3.0.0-beta.2
	github.com/terraform-providers/terraform-provider-mailgun v0.4.3
)

replace (
	github.com/hashicorp/go-getter v1.5.0 => github.com/hashicorp/go-getter v1.4.0
	github.com/hashicorp/terraform-plugin-test => github.com/hashicorp/terraform-plugin-test v1.3.0
	github.com/hashicorp/vault => github.com/hashicorp/vault v1.2.0
)
