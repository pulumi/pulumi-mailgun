CHANGELOG
=========

## Notice (2022-01-06)

*As of this notice, using CHANGELOG.md is DEPRECATED. We will be using [GitHub Releases](https://github.com/pulumi/pulumi-mailgun/releases) for this repository*

## HEAD (Unreleased)
_(none)_

---

## 3.3.0 (2021-11-11)
* Upgrade to terraform-bridge 3.11.0
* Upgrade to pulumi 3.17.0

## 3.2.0 (2021-10-19)
* Upgrade to v0.7.1 of the Mailgun Terraform Provider

## 3.1.0 (2021-05-21)
* Upgrade to v0.6.1 of the Mailgun Terraform Provider

## 3.0.0 (2021-04-19)
* Depend on Pulumi 3.0, which includes improvements to Python resource arguments and key translation, Go SDK performance,
  Node SDK performance, general availability of Automation API, and more.

## 2.6.0 (2021-04-12)
* Upgrade to pulumi-terraform-bridge v2.23.0

## 2.5.1 (2021-03-23)
* Upgrade to pulumi-terraform-bridge v2.22.1  
  **Please Note:** This includes a bug fix to the refresh operation regarding arrays

## 2.5.0 (2021-03-16)
* Upgrade to pulumi-terraform-bridge v2.21.0
* Release macOS arm64 binary

## 2.4.1 (2021-02-16)
* Upgrade to pulumi-terraform-bridge v2.19.0  
  **Please Note:** This includes a bug fix that stops mutating resources options in the nodejs provider
* Avoid storing config from the environment into the state

## 2.4.0 (2021-02-01)
* Upgrade to pulumi-terraform-bridge v2.18.1

## 2.3.2 (2021-01-13)
* Upgrade to pulumi-terraform-bridge v2.17.0
* Upgrade to Pulumi v2.17.0

## 2.3.1 (2020-11-24)
* Upgrade to pulumi-terraform-bridge v2.13.2  
  * This adds support for import specific examples in documentation

## 2.3.0 (2020-10-26)
* Upgrade to Pulumi v2.12.0 and pulumi-terraform-bridge v2.11.0
* Improving the accuracy of previews leading to a more accurate understanding of what will actually change rather than assuming all output properties will change.  
  ** PLEASE NOTE:**  
  This new preview functionality can be disabled by setting `PULUMI_DISABLE_PROVIDER_PREVIEW` to `1` or `false`.

## 2.2.0 (2020-08-31)
* Upgrade to pulumi-terraform-bridge v2.7.3
* Upgrade to Pulumi v2.9.0, which adds type annotations and input/output classes to Python

## 2.1.4 (2020-07-28)
* Upgrade to v0.4.3 of the Mailgun Terraform Provider

## v2.1.3 (2020-06-10)
* Switch to GitHub actions for build

## 2.1.2 (2020-05-28)
* Upgrade to Pulumi v2.3.0
* Upgrade to pulumi-terraform-bridge v2.4.0

## 2.1.1 (2020-05-12)
* Upgrade to pulumi-terraform-bridge v2.3.1

## 2.1.0 (2020-04-28)
* Upgrade to pulumi-terraform-bridge v2.1.0

## 2.0.0 (2020-04-21)
* Upgrade to Pulumi v2.0.0
* Upgrade to pulumi-terraform-bridge v2.0.0

## 1.0.0 (2020-01-26)
* Initial release of the provider against 0.4.1 of the Mailgun Terraform Provider
