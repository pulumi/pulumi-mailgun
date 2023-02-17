// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mailgun.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDomainReceivingRecord {
    private String id;
    /**
     * @return The priority of the record.
     * 
     */
    private String priority;
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

    private GetDomainReceivingRecord() {}
    public String id() {
        return this.id;
    }
    /**
     * @return The priority of the record.
     * 
     */
    public String priority() {
        return this.priority;
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

    public static Builder builder(GetDomainReceivingRecord defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String priority;
        private String recordType;
        private String valid;
        private String value;
        public Builder() {}
        public Builder(GetDomainReceivingRecord defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.priority = defaults.priority;
    	      this.recordType = defaults.recordType;
    	      this.valid = defaults.valid;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder priority(String priority) {
            this.priority = Objects.requireNonNull(priority);
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
        public GetDomainReceivingRecord build() {
            final var o = new GetDomainReceivingRecord();
            o.id = id;
            o.priority = priority;
            o.recordType = recordType;
            o.valid = valid;
            o.value = value;
            return o;
        }
    }
}