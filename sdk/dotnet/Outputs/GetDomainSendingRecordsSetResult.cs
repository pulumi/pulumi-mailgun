// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mailgun.Outputs
{

    [OutputType]
    public sealed class GetDomainSendingRecordsSetResult
    {
        public readonly string Id;
        /// <summary>
        /// The name of the domain.
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
        private GetDomainSendingRecordsSetResult(
            string id,

            string name,

            string recordType,

            string valid,

            string value)
        {
            Id = id;
            Name = name;
            RecordType = recordType;
            Valid = valid;
            Value = value;
        }
    }
}
