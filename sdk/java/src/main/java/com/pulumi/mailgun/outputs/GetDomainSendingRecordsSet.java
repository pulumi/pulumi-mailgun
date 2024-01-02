// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mailgun.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDomainSendingRecordsSet {
    private String id;
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

    private GetDomainSendingRecordsSet() {}
    public String id() {
        return this.id;
    }
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

    public static Builder builder(GetDomainSendingRecordsSet defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String name;
        private String recordType;
        private String valid;
        private String value;
        public Builder() {}
        public Builder(GetDomainSendingRecordsSet defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.recordType = defaults.recordType;
    	      this.valid = defaults.valid;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetDomainSendingRecordsSet", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetDomainSendingRecordsSet", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder recordType(String recordType) {
            if (recordType == null) {
              throw new MissingRequiredPropertyException("GetDomainSendingRecordsSet", "recordType");
            }
            this.recordType = recordType;
            return this;
        }
        @CustomType.Setter
        public Builder valid(String valid) {
            if (valid == null) {
              throw new MissingRequiredPropertyException("GetDomainSendingRecordsSet", "valid");
            }
            this.valid = valid;
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            if (value == null) {
              throw new MissingRequiredPropertyException("GetDomainSendingRecordsSet", "value");
            }
            this.value = value;
            return this;
        }
        public GetDomainSendingRecordsSet build() {
            final var _resultValue = new GetDomainSendingRecordsSet();
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.recordType = recordType;
            _resultValue.valid = valid;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
