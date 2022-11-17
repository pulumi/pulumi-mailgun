// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mailgun;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.mailgun.DomainCredentialArgs;
import com.pulumi.mailgun.Utilities;
import com.pulumi.mailgun.inputs.DomainCredentialState;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Mailgun domain credential resource. This can be used to create and manage credential in domain of Mailgun.
 * 
 * &gt; **Note:** Please note that starting of v0.6.1 due to using new Mailgun Client API (v4), there is no possibility to retrieve previously created secrets via API. In order get it worked, it&#39;s recommended to mark `password` as ignored under `lifecycle` block. See below.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Domain credential can be imported using `region:email` via `import` command. Region has to be chosen from `eu` or `us` (when no selection `us` is applied).
 * 
 * Password is always exported to `null`. hcl
 * 
 * ```sh
 *  $ pulumi import mailgun:index/domainCredential:DomainCredential test us:test@domain.com
 * ```
 * 
 */
@ResourceType(type="mailgun:index/domainCredential:DomainCredential")
public class DomainCredential extends com.pulumi.resources.CustomResource {
    /**
     * The domain to add credential of Mailgun.
     * 
     */
    @Export(name="domain", type=String.class, parameters={})
    private Output<String> domain;

    /**
     * @return The domain to add credential of Mailgun.
     * 
     */
    public Output<String> domain() {
        return this.domain;
    }
    /**
     * The local-part of the email address to create.
     * 
     */
    @Export(name="login", type=String.class, parameters={})
    private Output<String> login;

    /**
     * @return The local-part of the email address to create.
     * 
     */
    public Output<String> login() {
        return this.login;
    }
    /**
     * Password for user authentication.
     * 
     */
    @Export(name="password", type=String.class, parameters={})
    private Output<String> password;

    /**
     * @return Password for user authentication.
     * 
     */
    public Output<String> password() {
        return this.password;
    }
    /**
     * The region where domain will be created. Default value is `us`.
     * 
     */
    @Export(name="region", type=String.class, parameters={})
    private Output</* @Nullable */ String> region;

    /**
     * @return The region where domain will be created. Default value is `us`.
     * 
     */
    public Output<Optional<String>> region() {
        return Codegen.optional(this.region);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DomainCredential(String name) {
        this(name, DomainCredentialArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DomainCredential(String name, DomainCredentialArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DomainCredential(String name, DomainCredentialArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mailgun:index/domainCredential:DomainCredential", name, args == null ? DomainCredentialArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DomainCredential(String name, Output<String> id, @Nullable DomainCredentialState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mailgun:index/domainCredential:DomainCredential", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static DomainCredential get(String name, Output<String> id, @Nullable DomainCredentialState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DomainCredential(name, id, state, options);
    }
}
