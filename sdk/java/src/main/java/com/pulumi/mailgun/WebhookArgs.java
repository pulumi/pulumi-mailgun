// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mailgun;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebhookArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebhookArgs Empty = new WebhookArgs();

    /**
     * The domain to add to Mailgun
     * 
     */
    @Import(name="domain", required=true)
    private Output<String> domain;

    /**
     * @return The domain to add to Mailgun
     * 
     */
    public Output<String> domain() {
        return this.domain;
    }

    /**
     * The kind of webhook. Supported values (`accepted` `clicked` `complained` `delivered` `opened` `permanent_fail`, `temporary_fail` `unsubscribed`)
     * 
     */
    @Import(name="kind", required=true)
    private Output<String> kind;

    /**
     * @return The kind of webhook. Supported values (`accepted` `clicked` `complained` `delivered` `opened` `permanent_fail`, `temporary_fail` `unsubscribed`)
     * 
     */
    public Output<String> kind() {
        return this.kind;
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
    @Import(name="urls", required=true)
    private Output<List<String>> urls;

    /**
     * @return The urls of webhook
     * 
     */
    public Output<List<String>> urls() {
        return this.urls;
    }

    private WebhookArgs() {}

    private WebhookArgs(WebhookArgs $) {
        this.domain = $.domain;
        this.kind = $.kind;
        this.region = $.region;
        this.urls = $.urls;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebhookArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebhookArgs $;

        public Builder() {
            $ = new WebhookArgs();
        }

        public Builder(WebhookArgs defaults) {
            $ = new WebhookArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param domain The domain to add to Mailgun
         * 
         * @return builder
         * 
         */
        public Builder domain(Output<String> domain) {
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
        public Builder kind(Output<String> kind) {
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
        public Builder urls(Output<List<String>> urls) {
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

        public WebhookArgs build() {
            if ($.domain == null) {
                throw new MissingRequiredPropertyException("WebhookArgs", "domain");
            }
            if ($.kind == null) {
                throw new MissingRequiredPropertyException("WebhookArgs", "kind");
            }
            if ($.urls == null) {
                throw new MissingRequiredPropertyException("WebhookArgs", "urls");
            }
            return $;
        }
    }

}
