// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";

export interface DomainReceivingRecord {
    /**
     * The priority of the record.
     */
    priority?: pulumi.Input<string>;
    /**
     * The record type.
     */
    recordType?: pulumi.Input<string>;
    /**
     * `"valid"` if the record is valid.
     */
    valid?: pulumi.Input<string>;
    /**
     * The value of the record.
     */
    value?: pulumi.Input<string>;
}

export interface DomainSendingRecord {
    /**
     * The domain to add to Mailgun
     */
    name?: pulumi.Input<string>;
    /**
     * The record type.
     */
    recordType?: pulumi.Input<string>;
    /**
     * `"valid"` if the record is valid.
     */
    valid?: pulumi.Input<string>;
    /**
     * The value of the record.
     */
    value?: pulumi.Input<string>;
}

