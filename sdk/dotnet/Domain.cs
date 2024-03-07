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
    /// After DNS records are set, domain verification should be triggered manually using [PUT /domains/\&lt;domain\&gt;/verify](https://documentation.mailgun.com/en/latest/api-domains.html#domains)
    /// 
    /// ## Example Usage
    /// 
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Mailgun = Pulumi.Mailgun;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     // Create a new Mailgun domain
    ///     var @default = new Mailgun.Domain("default", new()
    ///     {
    ///         DkimKeySize = 1024,
    ///         Region = "us",
    ///         SmtpPassword = "supersecretpassword1234",
    ///         SpamAction = "disabled",
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// Domains can be imported using `region:domain_name` via `import` command. Region has to be chosen from `eu` or `us` (when no selection `us` is applied).
    /// 
    /// hcl
    /// 
    /// ```sh
    /// $ pulumi import mailgun:index/domain:Domain test us:example.domain.com
    /// ```
    /// </summary>
    [MailgunResourceType("mailgun:index/domain:Domain")]
    public partial class Domain : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The length of your domain’s generated DKIM key. Default value is `1024`.
        /// </summary>
        [Output("dkimKeySize")]
        public Output<int?> DkimKeySize { get; private set; } = null!;

        /// <summary>
        /// The name of your DKIM selector if you want to specify it whereas MailGun will make it's own choice.
        /// </summary>
        [Output("dkimSelector")]
        public Output<string?> DkimSelector { get; private set; } = null!;

        /// <summary>
        /// If set to true, the domain will be the DKIM authority for itself even if the root domain is registered on the same mailgun account. If set to false, the domain will have the same DKIM authority as the root domain registered on the same mailgun account. The default is `false`.
        /// </summary>
        [Output("forceDkimAuthority")]
        public Output<bool?> ForceDkimAuthority { get; private set; } = null!;

        /// <summary>
        /// The domain to add to Mailgun
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// (Enum: `yes` or `no`) The open tracking settings for the domain. Default: `no`
        /// </summary>
        [Output("openTracking")]
        public Output<bool?> OpenTracking { get; private set; } = null!;

        /// <summary>
        /// A list of DNS records for receiving validation.  **Deprecated** Use `receiving_records_set` instead.
        /// </summary>
        [Output("receivingRecords")]
        public Output<ImmutableArray<Outputs.DomainReceivingRecord>> ReceivingRecords { get; private set; } = null!;

        /// <summary>
        /// A set of DNS records for receiving validation.
        /// </summary>
        [Output("receivingRecordsSets")]
        public Output<ImmutableArray<Outputs.DomainReceivingRecordsSet>> ReceivingRecordsSets { get; private set; } = null!;

        /// <summary>
        /// The region where domain will be created. Default value is `us`.
        /// </summary>
        [Output("region")]
        public Output<string?> Region { get; private set; } = null!;

        /// <summary>
        /// A list of DNS records for sending validation. **Deprecated** Use `sending_records_set` instead.
        /// </summary>
        [Output("sendingRecords")]
        public Output<ImmutableArray<Outputs.DomainSendingRecord>> SendingRecords { get; private set; } = null!;

        /// <summary>
        /// A set of DNS records for sending validation.
        /// </summary>
        [Output("sendingRecordsSets")]
        public Output<ImmutableArray<Outputs.DomainSendingRecordsSet>> SendingRecordsSets { get; private set; } = null!;

        /// <summary>
        /// The login email for the SMTP server.
        /// </summary>
        [Output("smtpLogin")]
        public Output<string> SmtpLogin { get; private set; } = null!;

        /// <summary>
        /// Password for SMTP authentication
        /// </summary>
        [Output("smtpPassword")]
        public Output<string?> SmtpPassword { get; private set; } = null!;

        /// <summary>
        /// `disabled` or `tag` Disable, no spam
        /// filtering will occur for inbound messages. Tag, messages
        /// will be tagged with a spam header. Default value is `disabled`.
        /// </summary>
        [Output("spamAction")]
        public Output<string?> SpamAction { get; private set; } = null!;

        /// <summary>
        /// Boolean that determines whether
        /// the domain will accept email for sub-domains.
        /// </summary>
        [Output("wildcard")]
        public Output<bool?> Wildcard { get; private set; } = null!;


        /// <summary>
        /// Create a Domain resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Domain(string name, DomainArgs? args = null, CustomResourceOptions? options = null)
            : base("mailgun:index/domain:Domain", name, args ?? new DomainArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Domain(string name, Input<string> id, DomainState? state = null, CustomResourceOptions? options = null)
            : base("mailgun:index/domain:Domain", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "smtpPassword",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Domain resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Domain Get(string name, Input<string> id, DomainState? state = null, CustomResourceOptions? options = null)
        {
            return new Domain(name, id, state, options);
        }
    }

    public sealed class DomainArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The length of your domain’s generated DKIM key. Default value is `1024`.
        /// </summary>
        [Input("dkimKeySize")]
        public Input<int>? DkimKeySize { get; set; }

        /// <summary>
        /// The name of your DKIM selector if you want to specify it whereas MailGun will make it's own choice.
        /// </summary>
        [Input("dkimSelector")]
        public Input<string>? DkimSelector { get; set; }

        /// <summary>
        /// If set to true, the domain will be the DKIM authority for itself even if the root domain is registered on the same mailgun account. If set to false, the domain will have the same DKIM authority as the root domain registered on the same mailgun account. The default is `false`.
        /// </summary>
        [Input("forceDkimAuthority")]
        public Input<bool>? ForceDkimAuthority { get; set; }

        /// <summary>
        /// The domain to add to Mailgun
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// (Enum: `yes` or `no`) The open tracking settings for the domain. Default: `no`
        /// </summary>
        [Input("openTracking")]
        public Input<bool>? OpenTracking { get; set; }

        /// <summary>
        /// The region where domain will be created. Default value is `us`.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        [Input("smtpPassword")]
        private Input<string>? _smtpPassword;

        /// <summary>
        /// Password for SMTP authentication
        /// </summary>
        public Input<string>? SmtpPassword
        {
            get => _smtpPassword;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _smtpPassword = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// `disabled` or `tag` Disable, no spam
        /// filtering will occur for inbound messages. Tag, messages
        /// will be tagged with a spam header. Default value is `disabled`.
        /// </summary>
        [Input("spamAction")]
        public Input<string>? SpamAction { get; set; }

        /// <summary>
        /// Boolean that determines whether
        /// the domain will accept email for sub-domains.
        /// </summary>
        [Input("wildcard")]
        public Input<bool>? Wildcard { get; set; }

        public DomainArgs()
        {
        }
        public static new DomainArgs Empty => new DomainArgs();
    }

    public sealed class DomainState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The length of your domain’s generated DKIM key. Default value is `1024`.
        /// </summary>
        [Input("dkimKeySize")]
        public Input<int>? DkimKeySize { get; set; }

        /// <summary>
        /// The name of your DKIM selector if you want to specify it whereas MailGun will make it's own choice.
        /// </summary>
        [Input("dkimSelector")]
        public Input<string>? DkimSelector { get; set; }

        /// <summary>
        /// If set to true, the domain will be the DKIM authority for itself even if the root domain is registered on the same mailgun account. If set to false, the domain will have the same DKIM authority as the root domain registered on the same mailgun account. The default is `false`.
        /// </summary>
        [Input("forceDkimAuthority")]
        public Input<bool>? ForceDkimAuthority { get; set; }

        /// <summary>
        /// The domain to add to Mailgun
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// (Enum: `yes` or `no`) The open tracking settings for the domain. Default: `no`
        /// </summary>
        [Input("openTracking")]
        public Input<bool>? OpenTracking { get; set; }

        [Input("receivingRecords")]
        private InputList<Inputs.DomainReceivingRecordGetArgs>? _receivingRecords;

        /// <summary>
        /// A list of DNS records for receiving validation.  **Deprecated** Use `receiving_records_set` instead.
        /// </summary>
        [Obsolete(@"Use `receiving_records_set` instead.")]
        public InputList<Inputs.DomainReceivingRecordGetArgs> ReceivingRecords
        {
            get => _receivingRecords ?? (_receivingRecords = new InputList<Inputs.DomainReceivingRecordGetArgs>());
            set => _receivingRecords = value;
        }

        [Input("receivingRecordsSets")]
        private InputList<Inputs.DomainReceivingRecordsSetGetArgs>? _receivingRecordsSets;

        /// <summary>
        /// A set of DNS records for receiving validation.
        /// </summary>
        public InputList<Inputs.DomainReceivingRecordsSetGetArgs> ReceivingRecordsSets
        {
            get => _receivingRecordsSets ?? (_receivingRecordsSets = new InputList<Inputs.DomainReceivingRecordsSetGetArgs>());
            set => _receivingRecordsSets = value;
        }

        /// <summary>
        /// The region where domain will be created. Default value is `us`.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        [Input("sendingRecords")]
        private InputList<Inputs.DomainSendingRecordGetArgs>? _sendingRecords;

        /// <summary>
        /// A list of DNS records for sending validation. **Deprecated** Use `sending_records_set` instead.
        /// </summary>
        [Obsolete(@"Use `sending_records_set` instead.")]
        public InputList<Inputs.DomainSendingRecordGetArgs> SendingRecords
        {
            get => _sendingRecords ?? (_sendingRecords = new InputList<Inputs.DomainSendingRecordGetArgs>());
            set => _sendingRecords = value;
        }

        [Input("sendingRecordsSets")]
        private InputList<Inputs.DomainSendingRecordsSetGetArgs>? _sendingRecordsSets;

        /// <summary>
        /// A set of DNS records for sending validation.
        /// </summary>
        public InputList<Inputs.DomainSendingRecordsSetGetArgs> SendingRecordsSets
        {
            get => _sendingRecordsSets ?? (_sendingRecordsSets = new InputList<Inputs.DomainSendingRecordsSetGetArgs>());
            set => _sendingRecordsSets = value;
        }

        /// <summary>
        /// The login email for the SMTP server.
        /// </summary>
        [Input("smtpLogin")]
        public Input<string>? SmtpLogin { get; set; }

        [Input("smtpPassword")]
        private Input<string>? _smtpPassword;

        /// <summary>
        /// Password for SMTP authentication
        /// </summary>
        public Input<string>? SmtpPassword
        {
            get => _smtpPassword;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _smtpPassword = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// `disabled` or `tag` Disable, no spam
        /// filtering will occur for inbound messages. Tag, messages
        /// will be tagged with a spam header. Default value is `disabled`.
        /// </summary>
        [Input("spamAction")]
        public Input<string>? SpamAction { get; set; }

        /// <summary>
        /// Boolean that determines whether
        /// the domain will accept email for sub-domains.
        /// </summary>
        [Input("wildcard")]
        public Input<bool>? Wildcard { get; set; }

        public DomainState()
        {
        }
        public static new DomainState Empty => new DomainState();
    }
}
