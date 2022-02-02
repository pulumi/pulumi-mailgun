// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a Mailgun Route resource. This can be used to create and manage routes on Mailgun.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mailgun from "@pulumi/mailgun";
 *
 * // Create a new Mailgun route
 * const defaultRoute = new mailgun.Route("default", {
 *     actions: [
 *         "forward('http://example.com/api/v1/foos/')",
 *         "stop()",
 *     ],
 *     description: "inbound",
 *     expression: "match_recipient('.*@foo.example.com')",
 *     priority: 0,
 * });
 * ```
 *
 * ## Import
 *
 * Routes can be imported using `ROUTE_ID` and `region` via `import` command. Route ID can be found on Mailgun portal in section `Receiving/Routes`. Region has to be chosen from `eu` or `us` (when no selection `us` is applied).
 *
 * hcl
 *
 * ```sh
 *  $ pulumi import mailgun:index/route:Route test eu:123456789
 * ```
 */
export class Route extends pulumi.CustomResource {
    /**
     * Get an existing Route resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RouteState, opts?: pulumi.CustomResourceOptions): Route {
        return new Route(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'mailgun:index/route:Route';

    /**
     * Returns true if the given object is an instance of Route.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Route {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Route.__pulumiType;
    }

    public readonly actions!: pulumi.Output<string[]>;
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * A filter expression like `match_recipient('.*@gmail.com')`
     */
    public readonly expression!: pulumi.Output<string>;
    /**
     * Smaller number indicates higher priority. Higher priority routes are handled first.
     */
    public readonly priority!: pulumi.Output<number>;
    /**
     * The region where domain will be created. Default value is `us`.
     */
    public readonly region!: pulumi.Output<string | undefined>;

    /**
     * Create a Route resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: RouteArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: RouteArgs | RouteState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as RouteState | undefined;
            resourceInputs["actions"] = state ? state.actions : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["expression"] = state ? state.expression : undefined;
            resourceInputs["priority"] = state ? state.priority : undefined;
            resourceInputs["region"] = state ? state.region : undefined;
        } else {
            const args = argsOrState as RouteArgs | undefined;
            if ((!args || args.actions === undefined) && !opts.urn) {
                throw new Error("Missing required property 'actions'");
            }
            if ((!args || args.expression === undefined) && !opts.urn) {
                throw new Error("Missing required property 'expression'");
            }
            if ((!args || args.priority === undefined) && !opts.urn) {
                throw new Error("Missing required property 'priority'");
            }
            resourceInputs["actions"] = args ? args.actions : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["expression"] = args ? args.expression : undefined;
            resourceInputs["priority"] = args ? args.priority : undefined;
            resourceInputs["region"] = args ? args.region : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Route.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Route resources.
 */
export interface RouteState {
    actions?: pulumi.Input<pulumi.Input<string>[]>;
    description?: pulumi.Input<string>;
    /**
     * A filter expression like `match_recipient('.*@gmail.com')`
     */
    expression?: pulumi.Input<string>;
    /**
     * Smaller number indicates higher priority. Higher priority routes are handled first.
     */
    priority?: pulumi.Input<number>;
    /**
     * The region where domain will be created. Default value is `us`.
     */
    region?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Route resource.
 */
export interface RouteArgs {
    actions: pulumi.Input<pulumi.Input<string>[]>;
    description?: pulumi.Input<string>;
    /**
     * A filter expression like `match_recipient('.*@gmail.com')`
     */
    expression: pulumi.Input<string>;
    /**
     * Smaller number indicates higher priority. Higher priority routes are handled first.
     */
    priority: pulumi.Input<number>;
    /**
     * The region where domain will be created. Default value is `us`.
     */
    region?: pulumi.Input<string>;
}
