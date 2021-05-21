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
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// using Mailgun = Pulumi.Mailgun;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var domain = Output.Create(Mailgun.GetDomain.InvokeAsync(new Mailgun.GetDomainArgs
        ///         {
        ///             Name = "test.example.com",
        ///         }));
        ///         var mailgun_mx = new Aws.Route53.Record("mailgun-mx", new Aws.Route53.RecordArgs
        ///         {
        ///             Name = data.Mailgun.Domain.Name,
        ///             Records = 
        ///             {
        ///                 Output.Tuple(domain, domain).Apply(values =&gt;
        ///                 {
        ///                     var domain = values.Item1;
        ///                     var domain1 = values.Item2;
        ///                     return $"{domain.ReceivingRecords[0].Priority} {domain1.ReceivingRecords[0].Value}.";
        ///                 }),
        ///                 Output.Tuple(domain, domain).Apply(values =&gt;
        ///                 {
        ///                     var domain = values.Item1;
        ///                     var domain1 = values.Item2;
        ///                     return $"{domain.ReceivingRecords[1].Priority} {domain1.ReceivingRecords[1].Value}.";
        ///                 }),
        ///             },
        ///             Ttl = 3600,
        ///             Type = "MX",
        ///             ZoneId = @var.Zone_id,
        ///         });
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetDomainResult> InvokeAsync(GetDomainArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetDomainResult>("mailgun:index/getDomain:getDomain", args ?? new GetDomainArgs(), options.WithVersion());
    }


    public sealed class GetDomainArgs : Pulumi.InvokeArgs
    {
        [Input("dkimKeySize")]
        public int? DkimKeySize { get; set; }

        [Input("dkimSelector")]
        public string? DkimSelector { get; set; }

        /// <summary>
        /// The name of the domain.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        [Input("region")]
        public string? Region { get; set; }

        /// <summary>
        /// The password to the SMTP server.
        /// </summary>
        [Input("smtpPassword")]
        public string? SmtpPassword { get; set; }

        /// <summary>
        /// The spam filtering setting.
        /// </summary>
        [Input("spamAction")]
        public string? SpamAction { get; set; }

        /// <summary>
        /// Whether or not the domain will accept email for sub-domains.
        /// </summary>
        [Input("wildcard")]
        public bool? Wildcard { get; set; }

        public GetDomainArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetDomainResult
    {
        public readonly int? DkimKeySize;
        public readonly string? DkimSelector;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The name of the record.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// A list of DNS records for receiving validation.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetDomainReceivingRecordResult> ReceivingRecords;
        public readonly string? Region;
        /// <summary>
        /// A list of DNS records for sending validation.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetDomainSendingRecordResult> SendingRecords;
        /// <summary>
        /// The login email for the SMTP server.
        /// </summary>
        public readonly string SmtpLogin;
        /// <summary>
        /// The password to the SMTP server.
        /// </summary>
        public readonly string SmtpPassword;
        /// <summary>
        /// The spam filtering setting.
        /// </summary>
        public readonly string? SpamAction;
        /// <summary>
        /// Whether or not the domain will accept email for sub-domains.
        /// </summary>
        public readonly bool? Wildcard;

        [OutputConstructor]
        private GetDomainResult(
            int? dkimKeySize,

            string? dkimSelector,

            string id,

            string name,

            ImmutableArray<Outputs.GetDomainReceivingRecordResult> receivingRecords,

            string? region,

            ImmutableArray<Outputs.GetDomainSendingRecordResult> sendingRecords,

            string smtpLogin,

            string smtpPassword,

            string? spamAction,

            bool? wildcard)
        {
            DkimKeySize = dkimKeySize;
            DkimSelector = dkimSelector;
            Id = id;
            Name = name;
            ReceivingRecords = receivingRecords;
            Region = region;
            SendingRecords = sendingRecords;
            SmtpLogin = smtpLogin;
            SmtpPassword = smtpPassword;
            SpamAction = spamAction;
            Wildcard = wildcard;
        }
    }
}
