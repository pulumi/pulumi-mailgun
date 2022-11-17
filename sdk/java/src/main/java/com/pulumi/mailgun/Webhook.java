// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mailgun;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.mailgun.Utilities;
import com.pulumi.mailgun.WebhookArgs;
import com.pulumi.mailgun.inputs.WebhookState;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Mailgun App resource. This can be used to
 * create and manage applications on Mailgun.
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="mailgun:index/webhook:Webhook")
public class Webhook extends com.pulumi.resources.CustomResource {
    /**
     * The domain to add to Mailgun
     * 
     */
    @Export(name="domain", type=String.class, parameters={})
    private Output<String> domain;

    /**
     * @return The domain to add to Mailgun
     * 
     */
    public Output<String> domain() {
        return this.domain;
    }
    /**
     * The kind of webhook. Supported values (`clicked` `complained` `delivered` `opened` `permanent_fail`, `temporary_fail` `unsubscribed`)
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return The kind of webhook. Supported values (`clicked` `complained` `delivered` `opened` `permanent_fail`, `temporary_fail` `unsubscribed`)
     * 
     */
    public Output<String> kind() {
        return this.kind;
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
     * The urls of webhook
     * 
     */
    @Export(name="urls", type=List.class, parameters={String.class})
    private Output<List<String>> urls;

    /**
     * @return The urls of webhook
     * 
     */
    public Output<List<String>> urls() {
        return this.urls;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Webhook(String name) {
        this(name, WebhookArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Webhook(String name, WebhookArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Webhook(String name, WebhookArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mailgun:index/webhook:Webhook", name, args == null ? WebhookArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Webhook(String name, Output<String> id, @Nullable WebhookState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mailgun:index/webhook:Webhook", name, state, makeResourceOptions(options, id));
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
    public static Webhook get(String name, Output<String> id, @Nullable WebhookState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Webhook(name, id, state, options);
    }
}
