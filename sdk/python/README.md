[![Actions Status](https://github.com/pulumi/pulumi-mailgun/workflows/master/badge.svg)](https://github.com/pulumi/pulumi-mailgun/actions)
[![Slack](http://www.pulumi.com/images/docs/badges/slack.svg)](https://slack.pulumi.com)
[![NPM version](https://badge.fury.io/js/%40pulumi%2Fmailgun.svg)](https://www.npmjs.com/package/@pulumi/mailgun)
[![Python version](https://badge.fury.io/py/pulumi-mailgun.svg)](https://pypi.org/project/pulumi-mailgun)
[![NuGet version](https://badge.fury.io/nu/pulumi.mailgun.svg)](https://badge.fury.io/nu/pulumi.mailgun)
[![PkgGoDev](https://pkg.go.dev/badge/github.com/pulumi/pulumi-mailgun/sdk/v3/go)](https://pkg.go.dev/github.com/pulumi/pulumi-mailgun/sdk/v3/go)
[![License](https://img.shields.io/npm/l/%40pulumi%2Fpulumi.svg)](https://github.com/pulumi/pulumi-mailgun/blob/master/LICENSE)

# Mailgun Resource Provider

The Mailgun resource provider for Pulumi lets you manage Mailgun resources in your cloud programs. To use
this package, please [install the Pulumi CLI first](https://www.mailgun.com//).

## Installing

This package is available in many languages in the standard packaging formats.

### Node.js (Java/TypeScript)

To use from JavaScript or TypeScript in Node.js, install using either `npm`:

    $ npm install @pulumi/mailgun

or `yarn`:

    $ yarn add @pulumi/mailgun

### Python

To use from Python, install using `pip`:

    $ pip install pulumi_mailgun

### Go

To use from Go, use `go get` to grab the latest version of the library

    $ go get github.com/pulumi/pulumi-mailgun/sdk/v3

### .NET

To use from .NET, install using `dotnet add package`:

    $ dotnet add package Pulumi.Mailgun

## Configuration

The following configuration points are available:

- `mailgun:apikey` - (Required) Key used to authentication to the Mailgun API. May be set via the `MAILGUN_API_KEY` environment variable.

## Reference

For further information, please visit [the Mailgun provider docs](https://www.pulumi.com/docs/intro/cloud-providers/mailgun) or for detailed reference documentation, please visit [the API docs](https://www.pulumi.com/docs/reference/pkg/mailgun).
