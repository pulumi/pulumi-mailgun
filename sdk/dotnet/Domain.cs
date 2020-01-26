// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

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
    /// &gt; This content is derived from https://github.com/terraform-providers/terraform-provider-mailgun/blob/master/website/docs/r/domain.html.markdown.
    /// </summary>
    public partial class Domain : Pulumi.CustomResource
    {
        /// <summary>
        /// The domain to add to Mailgun
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// A list of DNS records for receiving validation.
        /// </summary>
        [Output("receivingRecords")]
        public Output<ImmutableArray<Outputs.DomainReceivingRecords>> ReceivingRecords { get; private set; } = null!;

        /// <summary>
        /// The region where domain will be created. Default value is `us`.
        /// </summary>
        [Output("region")]
        public Output<string?> Region { get; private set; } = null!;

        /// <summary>
        /// A list of DNS records for sending validation.
        /// </summary>
        [Output("sendingRecords")]
        public Output<ImmutableArray<Outputs.DomainSendingRecords>> SendingRecords { get; private set; } = null!;

        /// <summary>
        /// The login email for the SMTP server.
        /// </summary>
        [Output("smtpLogin")]
        public Output<string> SmtpLogin { get; private set; } = null!;

        /// <summary>
        /// The password to the SMTP server.
        /// </summary>
        [Output("smtpPassword")]
        public Output<string> SmtpPassword { get; private set; } = null!;

        /// <summary>
        /// `disabled` or `tag` Disable, no spam
        /// filtering will occur for inbound messages. Tag, messages
        /// will be tagged with a spam header.
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
            : base("mailgun:index/domain:Domain", name, args ?? ResourceArgs.Empty, MakeResourceOptions(options, ""))
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

    public sealed class DomainArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The domain to add to Mailgun
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The region where domain will be created. Default value is `us`.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// `disabled` or `tag` Disable, no spam
        /// filtering will occur for inbound messages. Tag, messages
        /// will be tagged with a spam header.
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
    }

    public sealed class DomainState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The domain to add to Mailgun
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("receivingRecords")]
        private InputList<Inputs.DomainReceivingRecordsGetArgs>? _receivingRecords;

        /// <summary>
        /// A list of DNS records for receiving validation.
        /// </summary>
        public InputList<Inputs.DomainReceivingRecordsGetArgs> ReceivingRecords
        {
            get => _receivingRecords ?? (_receivingRecords = new InputList<Inputs.DomainReceivingRecordsGetArgs>());
            set => _receivingRecords = value;
        }

        /// <summary>
        /// The region where domain will be created. Default value is `us`.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        [Input("sendingRecords")]
        private InputList<Inputs.DomainSendingRecordsGetArgs>? _sendingRecords;

        /// <summary>
        /// A list of DNS records for sending validation.
        /// </summary>
        public InputList<Inputs.DomainSendingRecordsGetArgs> SendingRecords
        {
            get => _sendingRecords ?? (_sendingRecords = new InputList<Inputs.DomainSendingRecordsGetArgs>());
            set => _sendingRecords = value;
        }

        /// <summary>
        /// The login email for the SMTP server.
        /// </summary>
        [Input("smtpLogin")]
        public Input<string>? SmtpLogin { get; set; }

        /// <summary>
        /// The password to the SMTP server.
        /// </summary>
        [Input("smtpPassword")]
        public Input<string>? SmtpPassword { get; set; }

        /// <summary>
        /// `disabled` or `tag` Disable, no spam
        /// filtering will occur for inbound messages. Tag, messages
        /// will be tagged with a spam header.
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
    }

    namespace Inputs
    {

    public sealed class DomainReceivingRecordsGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The priority of the record.
        /// </summary>
        [Input("priority")]
        public Input<string>? Priority { get; set; }

        /// <summary>
        /// The record type.
        /// </summary>
        [Input("recordType")]
        public Input<string>? RecordType { get; set; }

        /// <summary>
        /// `"valid"` if the record is valid.
        /// </summary>
        [Input("valid")]
        public Input<string>? Valid { get; set; }

        /// <summary>
        /// The value of the record.
        /// </summary>
        [Input("value")]
        public Input<string>? Value { get; set; }

        public DomainReceivingRecordsGetArgs()
        {
        }
    }

    public sealed class DomainSendingRecordsGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The domain to add to Mailgun
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The record type.
        /// </summary>
        [Input("recordType")]
        public Input<string>? RecordType { get; set; }

        /// <summary>
        /// `"valid"` if the record is valid.
        /// </summary>
        [Input("valid")]
        public Input<string>? Valid { get; set; }

        /// <summary>
        /// The value of the record.
        /// </summary>
        [Input("value")]
        public Input<string>? Value { get; set; }

        public DomainSendingRecordsGetArgs()
        {
        }
    }
    }

    namespace Outputs
    {

    [OutputType]
    public sealed class DomainReceivingRecords
    {
        /// <summary>
        /// The priority of the record.
        /// </summary>
        public readonly string Priority;
        /// <summary>
        /// The record type.
        /// </summary>
        public readonly string RecordType;
        /// <summary>
        /// `"valid"` if the record is valid.
        /// </summary>
        public readonly string Valid;
        /// <summary>
        /// The value of the record.
        /// </summary>
        public readonly string Value;

        [OutputConstructor]
        private DomainReceivingRecords(
            string priority,
            string recordType,
            string valid,
            string value)
        {
            Priority = priority;
            RecordType = recordType;
            Valid = valid;
            Value = value;
        }
    }

    [OutputType]
    public sealed class DomainSendingRecords
    {
        /// <summary>
        /// The domain to add to Mailgun
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The record type.
        /// </summary>
        public readonly string RecordType;
        /// <summary>
        /// `"valid"` if the record is valid.
        /// </summary>
        public readonly string Valid;
        /// <summary>
        /// The value of the record.
        /// </summary>
        public readonly string Value;

        [OutputConstructor]
        private DomainSendingRecords(
            string name,
            string recordType,
            string valid,
            string value)
        {
            Name = name;
            RecordType = recordType;
            Valid = valid;
            Value = value;
        }
    }
    }
}
