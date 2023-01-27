// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mailgun.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DomainSendingRecord {
    private @Nullable String id;
    /**
     * @return The domain to add to Mailgun
     * 
     */
    private @Nullable String name;
    /**
     * @return The record type.
     * 
     */
    private @Nullable String recordType;
    /**
     * @return `&#34;valid&#34;` if the record is valid.
     * 
     */
    private @Nullable String valid;
    /**
     * @return The value of the record.
     * 
     */
    private @Nullable String value;

    private DomainSendingRecord() {}
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return The domain to add to Mailgun
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return The record type.
     * 
     */
    public Optional<String> recordType() {
        return Optional.ofNullable(this.recordType);
    }
    /**
     * @return `&#34;valid&#34;` if the record is valid.
     * 
     */
    public Optional<String> valid() {
        return Optional.ofNullable(this.valid);
    }
    /**
     * @return The value of the record.
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainSendingRecord defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String id;
        private @Nullable String name;
        private @Nullable String recordType;
        private @Nullable String valid;
        private @Nullable String value;
        public Builder() {}
        public Builder(DomainSendingRecord defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.recordType = defaults.recordType;
    	      this.valid = defaults.valid;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder recordType(@Nullable String recordType) {
            this.recordType = recordType;
            return this;
        }
        @CustomType.Setter
        public Builder valid(@Nullable String valid) {
            this.valid = valid;
            return this;
        }
        @CustomType.Setter
        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }
        public DomainSendingRecord build() {
            final var o = new DomainSendingRecord();
            o.id = id;
            o.name = name;
            o.recordType = recordType;
            o.valid = valid;
            o.value = value;
            return o;
        }
    }
}
