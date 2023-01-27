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
    public sealed class DomainReceivingRecord
    {
        public readonly string? Id;
        /// <summary>
        /// The priority of the record.
        /// </summary>
        public readonly string? Priority;
        /// <summary>
        /// The record type.
        /// </summary>
        public readonly string? RecordType;
        /// <summary>
        /// `"valid"` if the record is valid.
        /// </summary>
        public readonly string? Valid;
        /// <summary>
        /// The value of the record.
        /// </summary>
        public readonly string? Value;

        [OutputConstructor]
        private DomainReceivingRecord(
            string? id,

            string? priority,

            string? recordType,

            string? valid,

            string? value)
        {
            Id = id;
            Priority = priority;
            RecordType = recordType;
            Valid = valid;
            Value = value;
        }
    }
}
