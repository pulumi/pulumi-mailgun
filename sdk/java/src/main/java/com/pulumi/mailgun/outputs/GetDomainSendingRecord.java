// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mailgun.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDomainSendingRecord {
    /**
     * @return The name of the domain.
     * 
     */
    private String name;
    /**
     * @return The record type.
     * 
     */
    private String recordType;
    /**
     * @return `&#34;valid&#34;` if the record is valid.
     * 
     */
    private String valid;
    /**
     * @return The value of the record.
     * 
     */
    private String value;

    private GetDomainSendingRecord() {}
    /**
     * @return The name of the domain.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The record type.
     * 
     */
    public String recordType() {
        return this.recordType;
    }
    /**
     * @return `&#34;valid&#34;` if the record is valid.
     * 
     */
    public String valid() {
        return this.valid;
    }
    /**
     * @return The value of the record.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDomainSendingRecord defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private String recordType;
        private String valid;
        private String value;
        public Builder() {}
        public Builder(GetDomainSendingRecord defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.recordType = defaults.recordType;
    	      this.valid = defaults.valid;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder recordType(String recordType) {
            this.recordType = Objects.requireNonNull(recordType);
            return this;
        }
        @CustomType.Setter
        public Builder valid(String valid) {
            this.valid = Objects.requireNonNull(valid);
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public GetDomainSendingRecord build() {
            final var o = new GetDomainSendingRecord();
            o.name = name;
            o.recordType = recordType;
            o.valid = valid;
            o.value = value;
            return o;
        }
    }
}
