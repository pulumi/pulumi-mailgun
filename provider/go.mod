module github.com/pulumi/pulumi-mailgun/provider/v2

go 1.14

require (
	github.com/hashicorp/terraform-plugin-sdk v1.15.0
	github.com/pulumi/pulumi-terraform-bridge/v2 v2.8.0
	github.com/pulumi/pulumi/sdk/v2 v2.10.0
	github.com/terraform-providers/terraform-provider-mailgun v0.4.3
)

replace (
	github.com/Azure/go-autorest => github.com/Azure/go-autorest v12.4.3+incompatible
	github.com/hashicorp/vault => github.com/hashicorp/vault v1.2.0
)
