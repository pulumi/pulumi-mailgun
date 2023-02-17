// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mailgun.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DomainReceivingRecord {
    private @Nullable String id;
    /**
     * @return The priority of the record.
     * 
     */
    private @Nullable String priority;
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

    private DomainReceivingRecord() {}
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return The priority of the record.
     * 
     */
    public Optional<String> priority() {
        return Optional.ofNullable(this.priority);
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

    public static Builder builder(DomainReceivingRecord defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String id;
        private @Nullable String priority;
        private @Nullable String recordType;
        private @Nullable String valid;
        private @Nullable String value;
        public Builder() {}
        public Builder(DomainReceivingRecord defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.priority = defaults.priority;
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
        public Builder priority(@Nullable String priority) {
            this.priority = priority;
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
        public DomainReceivingRecord build() {
            final var o = new DomainReceivingRecord();
            o.id = id;
            o.priority = priority;
            o.recordType = recordType;
            o.valid = valid;
            o.value = value;
            return o;
        }
    }
}