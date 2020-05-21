[![Build Status](https://travis-ci.com/pulumi/pulumi-mailgun.svg?token=eHg7Zp5zdDDJfTjY8ejq&branch=master)](https://travis-ci.com/pulumi/pulumi-mailgun)

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

    $ go get github.com/pulumi/pulumi-mailgun/sdk/go/...

### .NET

To use from .NET, install using `dotnet add package`:

    $ dotnet add package Pulumi.Mailgun

## Configuration

The following configuration points are available:

- `mailgun:apikey` - (Required) Key used to authentication to the Mailgun API. May be set via the `MAILGUN_API_KEY` environment variable.

## Reference

For further information, please visit [the Mailgun provider docs](https://www.pulumi.com/docs/intro/cloud-providers/mailgun) or for detailed reference documentation, please visit [the API docs](https://www.pulumi.com/docs/reference/pkg/mailgun).
