// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides a Mailgun App resource. This can be used to
 * create and manage applications on Mailgun.
 * 
 * After DNS records are set, domain verification should be triggered manually using [PUT /domains/\<domain\>/verify](https://documentation.mailgun.com/en/latest/api-domains.html#domains)
 * 
 * ## Example Usage
 * 
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mailgun from "@pulumi/mailgun";
 * 
 * // Create a new Mailgun domain
 * const defaultDomain = new mailgun.Domain("default", {
 *     region: "us",
 *     spamAction: "disabled",
 * });
 * ```
 *
 * > This content is derived from https://github.com/terraform-providers/terraform-provider-mailgun/blob/master/website/docs/r/domain.html.markdown.
 */
export class Domain extends pulumi.CustomResource {
    /**
     * Get an existing Domain resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DomainState, opts?: pulumi.CustomResourceOptions): Domain {
        return new Domain(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'mailgun:index/domain:Domain';

    /**
     * Returns true if the given object is an instance of Domain.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Domain {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Domain.__pulumiType;
    }

    /**
     * The domain to add to Mailgun
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * A list of DNS records for receiving validation.
     */
    public /*out*/ readonly receivingRecords!: pulumi.Output<outputs.DomainReceivingRecord[]>;
    /**
     * The region where domain will be created. Default value is `us`.
     */
    public readonly region!: pulumi.Output<string | undefined>;
    /**
     * A list of DNS records for sending validation.
     */
    public /*out*/ readonly sendingRecords!: pulumi.Output<outputs.DomainSendingRecord[]>;
    /**
     * The login email for the SMTP server.
     */
    public /*out*/ readonly smtpLogin!: pulumi.Output<string>;
    /**
     * The password to the SMTP server.
     */
    public /*out*/ readonly smtpPassword!: pulumi.Output<string>;
    /**
     * `disabled` or `tag` Disable, no spam
     * filtering will occur for inbound messages. Tag, messages
     * will be tagged with a spam header.
     */
    public readonly spamAction!: pulumi.Output<string | undefined>;
    /**
     * Boolean that determines whether
     * the domain will accept email for sub-domains.
     */
    public readonly wildcard!: pulumi.Output<boolean | undefined>;

    /**
     * Create a Domain resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: DomainArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DomainArgs | DomainState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as DomainState | undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["receivingRecords"] = state ? state.receivingRecords : undefined;
            inputs["region"] = state ? state.region : undefined;
            inputs["sendingRecords"] = state ? state.sendingRecords : undefined;
            inputs["smtpLogin"] = state ? state.smtpLogin : undefined;
            inputs["smtpPassword"] = state ? state.smtpPassword : undefined;
            inputs["spamAction"] = state ? state.spamAction : undefined;
            inputs["wildcard"] = state ? state.wildcard : undefined;
        } else {
            const args = argsOrState as DomainArgs | undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["region"] = args ? args.region : undefined;
            inputs["spamAction"] = args ? args.spamAction : undefined;
            inputs["wildcard"] = args ? args.wildcard : undefined;
            inputs["receivingRecords"] = undefined /*out*/;
            inputs["sendingRecords"] = undefined /*out*/;
            inputs["smtpLogin"] = undefined /*out*/;
            inputs["smtpPassword"] = undefined /*out*/;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(Domain.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Domain resources.
 */
export interface DomainState {
    /**
     * The domain to add to Mailgun
     */
    readonly name?: pulumi.Input<string>;
    /**
     * A list of DNS records for receiving validation.
     */
    readonly receivingRecords?: pulumi.Input<pulumi.Input<inputs.DomainReceivingRecord>[]>;
    /**
     * The region where domain will be created. Default value is `us`.
     */
    readonly region?: pulumi.Input<string>;
    /**
     * A list of DNS records for sending validation.
     */
    readonly sendingRecords?: pulumi.Input<pulumi.Input<inputs.DomainSendingRecord>[]>;
    /**
     * The login email for the SMTP server.
     */
    readonly smtpLogin?: pulumi.Input<string>;
    /**
     * The password to the SMTP server.
     */
    readonly smtpPassword?: pulumi.Input<string>;
    /**
     * `disabled` or `tag` Disable, no spam
     * filtering will occur for inbound messages. Tag, messages
     * will be tagged with a spam header.
     */
    readonly spamAction?: pulumi.Input<string>;
    /**
     * Boolean that determines whether
     * the domain will accept email for sub-domains.
     */
    readonly wildcard?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a Domain resource.
 */
export interface DomainArgs {
    /**
     * The domain to add to Mailgun
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The region where domain will be created. Default value is `us`.
     */
    readonly region?: pulumi.Input<string>;
    /**
     * `disabled` or `tag` Disable, no spam
     * filtering will occur for inbound messages. Tag, messages
     * will be tagged with a spam header.
     */
    readonly spamAction?: pulumi.Input<string>;
    /**
     * Boolean that determines whether
     * the domain will accept email for sub-domains.
     */
    readonly wildcard?: pulumi.Input<boolean>;
}
