// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mailgun;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.mailgun.DomainArgs;
import com.pulumi.mailgun.Utilities;
import com.pulumi.mailgun.inputs.DomainState;
import com.pulumi.mailgun.outputs.DomainReceivingRecord;
import com.pulumi.mailgun.outputs.DomainReceivingRecordsSet;
import com.pulumi.mailgun.outputs.DomainSendingRecord;
import com.pulumi.mailgun.outputs.DomainSendingRecordsSet;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Mailgun App resource. This can be used to
 * create and manage applications on Mailgun.
 * 
 * After DNS records are set, domain verification should be triggered manually using [PUT /domains/\&lt;domain\&gt;/verify](https://documentation.mailgun.com/en/latest/api-domains.html#domains)
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.mailgun.Domain;
 * import com.pulumi.mailgun.DomainArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var default_ = new Domain(&#34;default&#34;, DomainArgs.builder()        
 *             .dkimKeySize(1024)
 *             .region(&#34;us&#34;)
 *             .smtpPassword(&#34;supersecretpassword1234&#34;)
 *             .spamAction(&#34;disabled&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Domains can be imported using `region:domain_name` via `import` command. Region has to be chosen from `eu` or `us` (when no selection `us` is applied).
 * 
 * hcl
 * 
 * ```sh
 *  $ pulumi import mailgun:index/domain:Domain test us:example.domain.com
 * ```
 * 
 */
@ResourceType(type="mailgun:index/domain:Domain")
public class Domain extends com.pulumi.resources.CustomResource {
    /**
     * The length of your domain’s generated DKIM key. Default value is `1024`.
     * 
     */
    @Export(name="dkimKeySize", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> dkimKeySize;

    /**
     * @return The length of your domain’s generated DKIM key. Default value is `1024`.
     * 
     */
    public Output<Optional<Integer>> dkimKeySize() {
        return Codegen.optional(this.dkimKeySize);
    }
    /**
     * The name of your DKIM selector if you want to specify it whereas MailGun will make it&#39;s own choice.
     * 
     */
    @Export(name="dkimSelector", type=String.class, parameters={})
    private Output</* @Nullable */ String> dkimSelector;

    /**
     * @return The name of your DKIM selector if you want to specify it whereas MailGun will make it&#39;s own choice.
     * 
     */
    public Output<Optional<String>> dkimSelector() {
        return Codegen.optional(this.dkimSelector);
    }
    /**
     * If set to true, the domain will be the DKIM authority for itself even if the root domain is registered on the same mailgun account. If set to false, the domain will have the same DKIM authority as the root domain registered on the same mailgun account. The default is `false`.
     * 
     */
    @Export(name="forceDkimAuthority", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> forceDkimAuthority;

    /**
     * @return If set to true, the domain will be the DKIM authority for itself even if the root domain is registered on the same mailgun account. If set to false, the domain will have the same DKIM authority as the root domain registered on the same mailgun account. The default is `false`.
     * 
     */
    public Output<Optional<Boolean>> forceDkimAuthority() {
        return Codegen.optional(this.forceDkimAuthority);
    }
    /**
     * The domain to add to Mailgun
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The domain to add to Mailgun
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * (Enum: `yes` or `no`) The open tracking settings for the domain. Default: `no`
     * 
     */
    @Export(name="openTracking", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> openTracking;

    /**
     * @return (Enum: `yes` or `no`) The open tracking settings for the domain. Default: `no`
     * 
     */
    public Output<Optional<Boolean>> openTracking() {
        return Codegen.optional(this.openTracking);
    }
    /**
     * A list of DNS records for receiving validation.  **Deprecated** Use `receiving_records_set` instead.
     * 
     * @deprecated
     * Use `receiving_records_set` instead.
     * 
     */
    @Deprecated /* Use `receiving_records_set` instead. */
    @Export(name="receivingRecords", type=List.class, parameters={DomainReceivingRecord.class})
    private Output<List<DomainReceivingRecord>> receivingRecords;

    /**
     * @return A list of DNS records for receiving validation.  **Deprecated** Use `receiving_records_set` instead.
     * 
     */
    public Output<List<DomainReceivingRecord>> receivingRecords() {
        return this.receivingRecords;
    }
    /**
     * A set of DNS records for receiving validation.
     * 
     */
    @Export(name="receivingRecordsSets", type=List.class, parameters={DomainReceivingRecordsSet.class})
    private Output<List<DomainReceivingRecordsSet>> receivingRecordsSets;

    /**
     * @return A set of DNS records for receiving validation.
     * 
     */
    public Output<List<DomainReceivingRecordsSet>> receivingRecordsSets() {
        return this.receivingRecordsSets;
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
     * A list of DNS records for sending validation. **Deprecated** Use `sending_records_set` instead.
     * 
     * @deprecated
     * Use `sending_records_set` instead.
     * 
     */
    @Deprecated /* Use `sending_records_set` instead. */
    @Export(name="sendingRecords", type=List.class, parameters={DomainSendingRecord.class})
    private Output<List<DomainSendingRecord>> sendingRecords;

    /**
     * @return A list of DNS records for sending validation. **Deprecated** Use `sending_records_set` instead.
     * 
     */
    public Output<List<DomainSendingRecord>> sendingRecords() {
        return this.sendingRecords;
    }
    /**
     * A set of DNS records for sending validation.
     * 
     */
    @Export(name="sendingRecordsSets", type=List.class, parameters={DomainSendingRecordsSet.class})
    private Output<List<DomainSendingRecordsSet>> sendingRecordsSets;

    /**
     * @return A set of DNS records for sending validation.
     * 
     */
    public Output<List<DomainSendingRecordsSet>> sendingRecordsSets() {
        return this.sendingRecordsSets;
    }
    /**
     * The login email for the SMTP server.
     * 
     */
    @Export(name="smtpLogin", type=String.class, parameters={})
    private Output<String> smtpLogin;

    /**
     * @return The login email for the SMTP server.
     * 
     */
    public Output<String> smtpLogin() {
        return this.smtpLogin;
    }
    /**
     * Password for SMTP authentication
     * 
     */
    @Export(name="smtpPassword", type=String.class, parameters={})
    private Output</* @Nullable */ String> smtpPassword;

    /**
     * @return Password for SMTP authentication
     * 
     */
    public Output<Optional<String>> smtpPassword() {
        return Codegen.optional(this.smtpPassword);
    }
    /**
     * `disabled` or `tag` Disable, no spam
     * filtering will occur for inbound messages. Tag, messages
     * will be tagged with a spam header.
     * 
     */
    @Export(name="spamAction", type=String.class, parameters={})
    private Output</* @Nullable */ String> spamAction;

    /**
     * @return `disabled` or `tag` Disable, no spam
     * filtering will occur for inbound messages. Tag, messages
     * will be tagged with a spam header.
     * 
     */
    public Output<Optional<String>> spamAction() {
        return Codegen.optional(this.spamAction);
    }
    /**
     * Boolean that determines whether
     * the domain will accept email for sub-domains.
     * 
     */
    @Export(name="wildcard", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> wildcard;

    /**
     * @return Boolean that determines whether
     * the domain will accept email for sub-domains.
     * 
     */
    public Output<Optional<Boolean>> wildcard() {
        return Codegen.optional(this.wildcard);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Domain(String name) {
        this(name, DomainArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Domain(String name, @Nullable DomainArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Domain(String name, @Nullable DomainArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mailgun:index/domain:Domain", name, args == null ? DomainArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Domain(String name, Output<String> id, @Nullable DomainState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mailgun:index/domain:Domain", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "smtpPassword"
            ))
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
    public static Domain get(String name, Output<String> id, @Nullable DomainState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Domain(name, id, state, options);
    }
}
