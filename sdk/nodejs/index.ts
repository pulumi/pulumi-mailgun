// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

// Export members:
export * from "./domain";
export * from "./domainCredential";
export * from "./getDomain";
export * from "./provider";
export * from "./route";

// Export sub-modules:
import * as config from "./config";
import * as types from "./types";

export {
    config,
    types,
};

// Import resources to register:
import { Domain } from "./domain";
import { DomainCredential } from "./domainCredential";
import { Route } from "./route";

const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "mailgun:index/domain:Domain":
                return new Domain(name, <any>undefined, { urn })
            case "mailgun:index/domainCredential:DomainCredential":
                return new DomainCredential(name, <any>undefined, { urn })
            case "mailgun:index/route:Route":
                return new Route(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("mailgun", "index/domain", _module)
pulumi.runtime.registerResourceModule("mailgun", "index/domainCredential", _module)
pulumi.runtime.registerResourceModule("mailgun", "index/route", _module)

import { Provider } from "./provider";

pulumi.runtime.registerResourcePackage("mailgun", {
    version: utilities.getVersion(),
    constructProvider: (name: string, type: string, urn: string): pulumi.ProviderResource => {
        if (type !== "pulumi:providers:mailgun") {
            throw new Error(`unknown provider type ${type}`);
        }
        return new Provider(name, <any>undefined, { urn });
    },
});
