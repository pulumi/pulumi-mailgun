// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mailgun
{
    public static class GetDomain
    {
        /// <summary>
        /// `mailgun.Domain` provides details about a Mailgun domain.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// using Mailgun = Pulumi.Mailgun;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var domain = Mailgun.GetDomain.Invoke(new()
        ///     {
        ///         Name = "test.example.com",
        ///     });
        /// 
        ///     var mailgun_mx = new Aws.Index.Route53Record("mailgun-mx", new()
        ///     {
        ///         ZoneId = zoneId,
        ///         Name = domainMailgun.Name,
        ///         Type = "MX",
        ///         Ttl = 3600,
        ///         Records = new[]
        ///         {
        ///             $"{domain.Apply(getDomainResult =&gt; getDomainResult.ReceivingRecords[0]?.Priority)} {domain.Apply(getDomainResult =&gt; getDomainResult.ReceivingRecords[0]?.Value)}.",
        ///             $"{domain.Apply(getDomainResult =&gt; getDomainResult.ReceivingRecords[1]?.Priority)} {domain.Apply(getDomainResult =&gt; getDomainResult.ReceivingRecords[1]?.Value)}.",
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetDomainResult> InvokeAsync(GetDomainArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetDomainResult>("mailgun:index/getDomain:getDomain", args ?? new GetDomainArgs(), options.WithDefaults());

        /// <summary>
        /// `mailgun.Domain` provides details about a Mailgun domain.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// using Mailgun = Pulumi.Mailgun;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var domain = Mailgun.GetDomain.Invoke(new()
        ///     {
        ///         Name = "test.example.com",
        ///     });
        /// 
        ///     var mailgun_mx = new Aws.Index.Route53Record("mailgun-mx", new()
        ///     {
        ///         ZoneId = zoneId,
        ///         Name = domainMailgun.Name,
        ///         Type = "MX",
        ///         Ttl = 3600,
        ///         Records = new[]
        ///         {
        ///             $"{domain.Apply(getDomainResult =&gt; getDomainResult.ReceivingRecords[0]?.Priority)} {domain.Apply(getDomainResult =&gt; getDomainResult.ReceivingRecords[0]?.Value)}.",
        ///             $"{domain.Apply(getDomainResult =&gt; getDomainResult.ReceivingRecords[1]?.Priority)} {domain.Apply(getDomainResult =&gt; getDomainResult.ReceivingRecords[1]?.Value)}.",
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetDomainResult> Invoke(GetDomainInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetDomainResult>("mailgun:index/getDomain:getDomain", args ?? new GetDomainInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// `mailgun.Domain` provides details about a Mailgun domain.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// using Mailgun = Pulumi.Mailgun;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var domain = Mailgun.GetDomain.Invoke(new()
        ///     {
        ///         Name = "test.example.com",
        ///     });
        /// 
        ///     var mailgun_mx = new Aws.Index.Route53Record("mailgun-mx", new()
        ///     {
        ///         ZoneId = zoneId,
        ///         Name = domainMailgun.Name,
        ///         Type = "MX",
        ///         Ttl = 3600,
        ///         Records = new[]
        ///         {
        ///             $"{domain.Apply(getDomainResult =&gt; getDomainResult.ReceivingRecords[0]?.Priority)} {domain.Apply(getDomainResult =&gt; getDomainResult.ReceivingRecords[0]?.Value)}.",
        ///             $"{domain.Apply(getDomainResult =&gt; getDomainResult.ReceivingRecords[1]?.Priority)} {domain.Apply(getDomainResult =&gt; getDomainResult.ReceivingRecords[1]?.Value)}.",
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetDomainResult> Invoke(GetDomainInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetDomainResult>("mailgun:index/getDomain:getDomain", args ?? new GetDomainInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetDomainArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The click tracking setting.
        /// </summary>
        [Input("clickTracking")]
        public bool? ClickTracking { get; set; }

        [Input("dkimKeySize")]
        public int? DkimKeySize { get; set; }

        [Input("dkimSelector")]
        public string? DkimSelector { get; set; }

        [Input("forceDkimAuthority")]
        public bool? ForceDkimAuthority { get; set; }

        /// <summary>
        /// The name of the domain.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// The open tracking setting.
        /// </summary>
        [Input("openTracking")]
        public bool? OpenTracking { get; set; }

        /// <summary>
        /// The region where domain will be created. Default value is `us`.
        /// </summary>
        [Input("region")]
        public string? Region { get; set; }

        [Input("smtpPassword")]
        private string? _smtpPassword;

        /// <summary>
        /// The password to the SMTP server.
        /// </summary>
        public string? SmtpPassword
        {
            get => _smtpPassword;
            set => _smtpPassword = value;
        }

        /// <summary>
        /// The spam filtering setting.
        /// </summary>
        [Input("spamAction")]
        public string? SpamAction { get; set; }

        /// <summary>
        /// The tracking web scheme.
        /// </summary>
        [Input("webScheme")]
        public string? WebScheme { get; set; }

        /// <summary>
        /// Whether or not the domain will accept email for sub-domains.
        /// </summary>
        [Input("wildcard")]
        public bool? Wildcard { get; set; }

        public GetDomainArgs()
        {
        }
        public static new GetDomainArgs Empty => new GetDomainArgs();
    }

    public sealed class GetDomainInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The click tracking setting.
        /// </summary>
        [Input("clickTracking")]
        public Input<bool>? ClickTracking { get; set; }

        [Input("dkimKeySize")]
        public Input<int>? DkimKeySize { get; set; }

        [Input("dkimSelector")]
        public Input<string>? DkimSelector { get; set; }

        [Input("forceDkimAuthority")]
        public Input<bool>? ForceDkimAuthority { get; set; }

        /// <summary>
        /// The name of the domain.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The open tracking setting.
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
        /// The password to the SMTP server.
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
        /// The spam filtering setting.
        /// </summary>
        [Input("spamAction")]
        public Input<string>? SpamAction { get; set; }

        /// <summary>
        /// The tracking web scheme.
        /// </summary>
        [Input("webScheme")]
        public Input<string>? WebScheme { get; set; }

        /// <summary>
        /// Whether or not the domain will accept email for sub-domains.
        /// </summary>
        [Input("wildcard")]
        public Input<bool>? Wildcard { get; set; }

        public GetDomainInvokeArgs()
        {
        }
        public static new GetDomainInvokeArgs Empty => new GetDomainInvokeArgs();
    }


    [OutputType]
    public sealed class GetDomainResult
    {
        /// <summary>
        /// The click tracking setting.
        /// </summary>
        public readonly bool? ClickTracking;
        public readonly int? DkimKeySize;
        public readonly string? DkimSelector;
        public readonly bool? ForceDkimAuthority;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The name of the record.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The open tracking setting.
        /// </summary>
        public readonly bool? OpenTracking;
        /// <summary>
        /// A list of DNS records for receiving validation.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetDomainReceivingRecordResult> ReceivingRecords;
        public readonly ImmutableArray<Outputs.GetDomainReceivingRecordsSetResult> ReceivingRecordsSets;
        public readonly string? Region;
        /// <summary>
        /// A list of DNS records for sending validation.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetDomainSendingRecordResult> SendingRecords;
        public readonly ImmutableArray<Outputs.GetDomainSendingRecordsSetResult> SendingRecordsSets;
        /// <summary>
        /// The login email for the SMTP server.
        /// </summary>
        public readonly string SmtpLogin;
        /// <summary>
        /// The password to the SMTP server.
        /// </summary>
        public readonly string? SmtpPassword;
        /// <summary>
        /// The spam filtering setting.
        /// </summary>
        public readonly string? SpamAction;
        /// <summary>
        /// The tracking web scheme.
        /// </summary>
        public readonly string? WebScheme;
        /// <summary>
        /// Whether or not the domain will accept email for sub-domains.
        /// </summary>
        public readonly bool? Wildcard;

        [OutputConstructor]
        private GetDomainResult(
            bool? clickTracking,

            int? dkimKeySize,

            string? dkimSelector,

            bool? forceDkimAuthority,

            string id,

            string name,

            bool? openTracking,

            ImmutableArray<Outputs.GetDomainReceivingRecordResult> receivingRecords,

            ImmutableArray<Outputs.GetDomainReceivingRecordsSetResult> receivingRecordsSets,

            string? region,

            ImmutableArray<Outputs.GetDomainSendingRecordResult> sendingRecords,

            ImmutableArray<Outputs.GetDomainSendingRecordsSetResult> sendingRecordsSets,

            string smtpLogin,

            string? smtpPassword,

            string? spamAction,

            string? webScheme,

            bool? wildcard)
        {
            ClickTracking = clickTracking;
            DkimKeySize = dkimKeySize;
            DkimSelector = dkimSelector;
            ForceDkimAuthority = forceDkimAuthority;
            Id = id;
            Name = name;
            OpenTracking = openTracking;
            ReceivingRecords = receivingRecords;
            ReceivingRecordsSets = receivingRecordsSets;
            Region = region;
            SendingRecords = sendingRecords;
            SendingRecordsSets = sendingRecordsSets;
            SmtpLogin = smtpLogin;
            SmtpPassword = smtpPassword;
            SpamAction = spamAction;
            WebScheme = webScheme;
            Wildcard = wildcard;
        }
    }
}
