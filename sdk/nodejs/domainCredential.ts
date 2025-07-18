// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a Mailgun domain credential resource. This can be used to create and manage credential in domain of Mailgun.
 *
 * > **Note:** Please note that starting of v0.6.1 due to using new Mailgun Client API (v4), there is no possibility to retrieve previously created secrets via API. In order get it worked, it's recommended to mark `password` as ignored under `lifecycle` block. See below.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mailgun from "@pulumi/mailgun";
 *
 * // Create a new Mailgun credential
 * const foobar = new mailgun.DomainCredential("foobar", {
 *     domain: "toto.com",
 *     login: "test",
 *     password: "supersecretpassword1234",
 *     region: "us",
 * });
 * ```
 *
 * ## Import
 *
 * Domain credential can be imported using `region:email` via `import` command. Region has to be chosen from `eu` or `us` (when no selection `us` is applied).
 *
 * Password is always exported to `null`.
 *
 * hcl
 *
 * ```sh
 * $ pulumi import mailgun:index/domainCredential:DomainCredential test us:test@domain.com
 * ```
 */
export class DomainCredential extends pulumi.CustomResource {
    /**
     * Get an existing DomainCredential resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DomainCredentialState, opts?: pulumi.CustomResourceOptions): DomainCredential {
        return new DomainCredential(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'mailgun:index/domainCredential:DomainCredential';

    /**
     * Returns true if the given object is an instance of DomainCredential.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is DomainCredential {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === DomainCredential.__pulumiType;
    }

    /**
     * The domain to add credential of Mailgun.
     */
    public readonly domain!: pulumi.Output<string>;
    /**
     * The local-part of the email address to create.
     */
    public readonly login!: pulumi.Output<string>;
    /**
     * Password for user authentication.
     */
    public readonly password!: pulumi.Output<string>;
    /**
     * The region where domain will be created. Default value is `us`.
     */
    public readonly region!: pulumi.Output<string | undefined>;

    /**
     * Create a DomainCredential resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DomainCredentialArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DomainCredentialArgs | DomainCredentialState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DomainCredentialState | undefined;
            resourceInputs["domain"] = state ? state.domain : undefined;
            resourceInputs["login"] = state ? state.login : undefined;
            resourceInputs["password"] = state ? state.password : undefined;
            resourceInputs["region"] = state ? state.region : undefined;
        } else {
            const args = argsOrState as DomainCredentialArgs | undefined;
            if ((!args || args.domain === undefined) && !opts.urn) {
                throw new Error("Missing required property 'domain'");
            }
            if ((!args || args.login === undefined) && !opts.urn) {
                throw new Error("Missing required property 'login'");
            }
            if ((!args || args.password === undefined) && !opts.urn) {
                throw new Error("Missing required property 'password'");
            }
            resourceInputs["domain"] = args ? args.domain : undefined;
            resourceInputs["login"] = args ? args.login : undefined;
            resourceInputs["password"] = args?.password ? pulumi.secret(args.password) : undefined;
            resourceInputs["region"] = args ? args.region : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["password"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(DomainCredential.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering DomainCredential resources.
 */
export interface DomainCredentialState {
    /**
     * The domain to add credential of Mailgun.
     */
    domain?: pulumi.Input<string>;
    /**
     * The local-part of the email address to create.
     */
    login?: pulumi.Input<string>;
    /**
     * Password for user authentication.
     */
    password?: pulumi.Input<string>;
    /**
     * The region where domain will be created. Default value is `us`.
     */
    region?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a DomainCredential resource.
 */
export interface DomainCredentialArgs {
    /**
     * The domain to add credential of Mailgun.
     */
    domain: pulumi.Input<string>;
    /**
     * The local-part of the email address to create.
     */
    login: pulumi.Input<string>;
    /**
     * Password for user authentication.
     */
    password: pulumi.Input<string>;
    /**
     * The region where domain will be created. Default value is `us`.
     */
    region?: pulumi.Input<string>;
}
