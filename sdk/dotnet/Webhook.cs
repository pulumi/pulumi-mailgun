// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mailgun
{
    /// <summary>
    /// Provides a Mailgun App resource. This can be used to
    /// create and manage applications on Mailgun.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Mailgun = Pulumi.Mailgun;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         // Create a new Mailgun webhook
    ///         var @default = new Mailgun.Webhook("default", new Mailgun.WebhookArgs
    ///         {
    ///             Domain = "test.example.com",
    ///             Kind = "delivered",
    ///             Region = "us",
    ///             Urls = 
    ///             {
    ///                 "https://example.com",
    ///             },
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// </summary>
    [MailgunResourceType("mailgun:index/webhook:Webhook")]
    public partial class Webhook : Pulumi.CustomResource
    {
        /// <summary>
        /// The domain to add to Mailgun
        /// </summary>
        [Output("domain")]
        public Output<string> Domain { get; private set; } = null!;

        /// <summary>
        /// The kind of webhook. Supported values (`clicked` `complained` `delivered` `opened` `permanent_fail`, `temporary_fail` `unsubscribed`)
        /// </summary>
        [Output("kind")]
        public Output<string> Kind { get; private set; } = null!;

        /// <summary>
        /// The region where domain will be created. Default value is `us`.
        /// </summary>
        [Output("region")]
        public Output<string?> Region { get; private set; } = null!;

        /// <summary>
        /// The urls of webhook
        /// </summary>
        [Output("urls")]
        public Output<ImmutableArray<string>> Urls { get; private set; } = null!;


        /// <summary>
        /// Create a Webhook resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Webhook(string name, WebhookArgs args, CustomResourceOptions? options = null)
            : base("mailgun:index/webhook:Webhook", name, args ?? new WebhookArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Webhook(string name, Input<string> id, WebhookState? state = null, CustomResourceOptions? options = null)
            : base("mailgun:index/webhook:Webhook", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Webhook resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Webhook Get(string name, Input<string> id, WebhookState? state = null, CustomResourceOptions? options = null)
        {
            return new Webhook(name, id, state, options);
        }
    }

    public sealed class WebhookArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The domain to add to Mailgun
        /// </summary>
        [Input("domain", required: true)]
        public Input<string> Domain { get; set; } = null!;

        /// <summary>
        /// The kind of webhook. Supported values (`clicked` `complained` `delivered` `opened` `permanent_fail`, `temporary_fail` `unsubscribed`)
        /// </summary>
        [Input("kind", required: true)]
        public Input<string> Kind { get; set; } = null!;

        /// <summary>
        /// The region where domain will be created. Default value is `us`.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        [Input("urls", required: true)]
        private InputList<string>? _urls;

        /// <summary>
        /// The urls of webhook
        /// </summary>
        public InputList<string> Urls
        {
            get => _urls ?? (_urls = new InputList<string>());
            set => _urls = value;
        }

        public WebhookArgs()
        {
        }
    }

    public sealed class WebhookState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The domain to add to Mailgun
        /// </summary>
        [Input("domain")]
        public Input<string>? Domain { get; set; }

        /// <summary>
        /// The kind of webhook. Supported values (`clicked` `complained` `delivered` `opened` `permanent_fail`, `temporary_fail` `unsubscribed`)
        /// </summary>
        [Input("kind")]
        public Input<string>? Kind { get; set; }

        /// <summary>
        /// The region where domain will be created. Default value is `us`.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        [Input("urls")]
        private InputList<string>? _urls;

        /// <summary>
        /// The urls of webhook
        /// </summary>
        public InputList<string> Urls
        {
            get => _urls ?? (_urls = new InputList<string>());
            set => _urls = value;
        }

        public WebhookState()
        {
        }
    }
}
