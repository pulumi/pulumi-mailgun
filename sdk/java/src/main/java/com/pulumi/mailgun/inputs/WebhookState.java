// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mailgun.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebhookState extends com.pulumi.resources.ResourceArgs {

    public static final WebhookState Empty = new WebhookState();

    /**
     * The domain to add to Mailgun
     * 
     */
    @Import(name="domain")
    private @Nullable Output<String> domain;

    /**
     * @return The domain to add to Mailgun
     * 
     */
    public Optional<Output<String>> domain() {
        return Optional.ofNullable(this.domain);
    }

    /**
     * The kind of webhook. Supported values (`accepted` `clicked` `complained` `delivered` `opened` `permanent_fail`, `temporary_fail` `unsubscribed`)
     * 
     */
    @Import(name="kind")
    private @Nullable Output<String> kind;

    /**
     * @return The kind of webhook. Supported values (`accepted` `clicked` `complained` `delivered` `opened` `permanent_fail`, `temporary_fail` `unsubscribed`)
     * 
     */
    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * The region where domain will be created. Default value is `us`.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return The region where domain will be created. Default value is `us`.
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * The urls of webhook
     * 
     */
    @Import(name="urls")
    private @Nullable Output<List<String>> urls;

    /**
     * @return The urls of webhook
     * 
     */
    public Optional<Output<List<String>>> urls() {
        return Optional.ofNullable(this.urls);
    }

    private WebhookState() {}

    private WebhookState(WebhookState $) {
        this.domain = $.domain;
        this.kind = $.kind;
        this.region = $.region;
        this.urls = $.urls;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebhookState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebhookState $;

        public Builder() {
            $ = new WebhookState();
        }

        public Builder(WebhookState defaults) {
            $ = new WebhookState(Objects.requireNonNull(defaults));
        }

        /**
         * @param domain The domain to add to Mailgun
         * 
         * @return builder
         * 
         */
        public Builder domain(@Nullable Output<String> domain) {
            $.domain = domain;
            return this;
        }

        /**
         * @param domain The domain to add to Mailgun
         * 
         * @return builder
         * 
         */
        public Builder domain(String domain) {
            return domain(Output.of(domain));
        }

        /**
         * @param kind The kind of webhook. Supported values (`accepted` `clicked` `complained` `delivered` `opened` `permanent_fail`, `temporary_fail` `unsubscribed`)
         * 
         * @return builder
         * 
         */
        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind The kind of webhook. Supported values (`accepted` `clicked` `complained` `delivered` `opened` `permanent_fail`, `temporary_fail` `unsubscribed`)
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param region The region where domain will be created. Default value is `us`.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region The region where domain will be created. Default value is `us`.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param urls The urls of webhook
         * 
         * @return builder
         * 
         */
        public Builder urls(@Nullable Output<List<String>> urls) {
            $.urls = urls;
            return this;
        }

        /**
         * @param urls The urls of webhook
         * 
         * @return builder
         * 
         */
        public Builder urls(List<String> urls) {
            return urls(Output.of(urls));
        }

        /**
         * @param urls The urls of webhook
         * 
         * @return builder
         * 
         */
        public Builder urls(String... urls) {
            return urls(List.of(urls));
        }

        public WebhookState build() {
            return $;
        }
    }

}
