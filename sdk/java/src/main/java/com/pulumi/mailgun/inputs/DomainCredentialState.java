// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mailgun.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DomainCredentialState extends com.pulumi.resources.ResourceArgs {

    public static final DomainCredentialState Empty = new DomainCredentialState();

    /**
     * The domain to add credential of Mailgun.
     * 
     */
    @Import(name="domain")
    private @Nullable Output<String> domain;

    /**
     * @return The domain to add credential of Mailgun.
     * 
     */
    public Optional<Output<String>> domain() {
        return Optional.ofNullable(this.domain);
    }

    /**
     * The local-part of the email address to create.
     * 
     */
    @Import(name="login")
    private @Nullable Output<String> login;

    /**
     * @return The local-part of the email address to create.
     * 
     */
    public Optional<Output<String>> login() {
        return Optional.ofNullable(this.login);
    }

    /**
     * Password for user authentication.
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    /**
     * @return Password for user authentication.
     * 
     */
    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
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

    private DomainCredentialState() {}

    private DomainCredentialState(DomainCredentialState $) {
        this.domain = $.domain;
        this.login = $.login;
        this.password = $.password;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DomainCredentialState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DomainCredentialState $;

        public Builder() {
            $ = new DomainCredentialState();
        }

        public Builder(DomainCredentialState defaults) {
            $ = new DomainCredentialState(Objects.requireNonNull(defaults));
        }

        /**
         * @param domain The domain to add credential of Mailgun.
         * 
         * @return builder
         * 
         */
        public Builder domain(@Nullable Output<String> domain) {
            $.domain = domain;
            return this;
        }

        /**
         * @param domain The domain to add credential of Mailgun.
         * 
         * @return builder
         * 
         */
        public Builder domain(String domain) {
            return domain(Output.of(domain));
        }

        /**
         * @param login The local-part of the email address to create.
         * 
         * @return builder
         * 
         */
        public Builder login(@Nullable Output<String> login) {
            $.login = login;
            return this;
        }

        /**
         * @param login The local-part of the email address to create.
         * 
         * @return builder
         * 
         */
        public Builder login(String login) {
            return login(Output.of(login));
        }

        /**
         * @param password Password for user authentication.
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password Password for user authentication.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
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

        public DomainCredentialState build() {
            return $;
        }
    }

}