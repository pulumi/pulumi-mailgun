// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mailgun.Inputs
{

    public sealed class DomainReceivingRecordArgs : global::Pulumi.ResourceArgs
    {
        [Input("id")]
        public Input<string>? Id { get; set; }

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

        public DomainReceivingRecordArgs()
        {
        }
        public static new DomainReceivingRecordArgs Empty => new DomainReceivingRecordArgs();
    }
}
