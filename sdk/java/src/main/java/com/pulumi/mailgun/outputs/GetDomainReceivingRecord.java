// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mailgun.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
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
            if (id == null) {
              throw new MissingRequiredPropertyException("GetDomainReceivingRecord", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder priority(String priority) {
            if (priority == null) {
              throw new MissingRequiredPropertyException("GetDomainReceivingRecord", "priority");
            }
            this.priority = priority;
            return this;
        }
        @CustomType.Setter
        public Builder recordType(String recordType) {
            if (recordType == null) {
              throw new MissingRequiredPropertyException("GetDomainReceivingRecord", "recordType");
            }
            this.recordType = recordType;
            return this;
        }
        @CustomType.Setter
        public Builder valid(String valid) {
            if (valid == null) {
              throw new MissingRequiredPropertyException("GetDomainReceivingRecord", "valid");
            }
            this.valid = valid;
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            if (value == null) {
              throw new MissingRequiredPropertyException("GetDomainReceivingRecord", "value");
            }
            this.value = value;
            return this;
        }
        public GetDomainReceivingRecord build() {
            final var _resultValue = new GetDomainReceivingRecord();
            _resultValue.id = id;
            _resultValue.priority = priority;
            _resultValue.recordType = recordType;
            _resultValue.valid = valid;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
