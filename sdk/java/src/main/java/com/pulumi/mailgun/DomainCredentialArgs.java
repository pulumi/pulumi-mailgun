// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mailgun;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DomainCredentialArgs extends com.pulumi.resources.ResourceArgs {

    public static final DomainCredentialArgs Empty = new DomainCredentialArgs();

    /**
     * The domain to add credential of Mailgun.
     * 
     */
    @Import(name="domain", required=true)
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
    @Import(name="login", required=true)
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
    @Import(name="password", required=true)
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
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return The region where domain will be created. Default value is `us`.
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    private DomainCredentialArgs() {}

    private DomainCredentialArgs(DomainCredentialArgs $) {
        this.domain = $.domain;
        this.login = $.login;
        this.password = $.password;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DomainCredentialArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DomainCredentialArgs $;

        public Builder() {
            $ = new DomainCredentialArgs();
        }

        public Builder(DomainCredentialArgs defaults) {
            $ = new DomainCredentialArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param domain The domain to add credential of Mailgun.
         * 
         * @return builder
         * 
         */
        public Builder domain(Output<String> domain) {
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
        public Builder login(Output<String> login) {
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
        public Builder password(Output<String> password) {
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

        public DomainCredentialArgs build() {
            $.domain = Objects.requireNonNull($.domain, "expected parameter 'domain' to be non-null");
            $.login = Objects.requireNonNull($.login, "expected parameter 'login' to be non-null");
            $.password = Objects.requireNonNull($.password, "expected parameter 'password' to be non-null");
            return $;
        }
    }

}
