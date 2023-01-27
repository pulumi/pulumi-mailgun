// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mailgun.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DomainReceivingRecordArgs extends com.pulumi.resources.ResourceArgs {

    public static final DomainReceivingRecordArgs Empty = new DomainReceivingRecordArgs();

    @Import(name="id")
    private @Nullable Output<String> id;

    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The priority of the record.
     * 
     */
    @Import(name="priority")
    private @Nullable Output<String> priority;

    /**
     * @return The priority of the record.
     * 
     */
    public Optional<Output<String>> priority() {
        return Optional.ofNullable(this.priority);
    }

    /**
     * The record type.
     * 
     */
    @Import(name="recordType")
    private @Nullable Output<String> recordType;

    /**
     * @return The record type.
     * 
     */
    public Optional<Output<String>> recordType() {
        return Optional.ofNullable(this.recordType);
    }

    /**
     * `&#34;valid&#34;` if the record is valid.
     * 
     */
    @Import(name="valid")
    private @Nullable Output<String> valid;

    /**
     * @return `&#34;valid&#34;` if the record is valid.
     * 
     */
    public Optional<Output<String>> valid() {
        return Optional.ofNullable(this.valid);
    }

    /**
     * The value of the record.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return The value of the record.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private DomainReceivingRecordArgs() {}

    private DomainReceivingRecordArgs(DomainReceivingRecordArgs $) {
        this.id = $.id;
        this.priority = $.priority;
        this.recordType = $.recordType;
        this.valid = $.valid;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DomainReceivingRecordArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DomainReceivingRecordArgs $;

        public Builder() {
            $ = new DomainReceivingRecordArgs();
        }

        public Builder(DomainReceivingRecordArgs defaults) {
            $ = new DomainReceivingRecordArgs(Objects.requireNonNull(defaults));
        }

        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param priority The priority of the record.
         * 
         * @return builder
         * 
         */
        public Builder priority(@Nullable Output<String> priority) {
            $.priority = priority;
            return this;
        }

        /**
         * @param priority The priority of the record.
         * 
         * @return builder
         * 
         */
        public Builder priority(String priority) {
            return priority(Output.of(priority));
        }

        /**
         * @param recordType The record type.
         * 
         * @return builder
         * 
         */
        public Builder recordType(@Nullable Output<String> recordType) {
            $.recordType = recordType;
            return this;
        }

        /**
         * @param recordType The record type.
         * 
         * @return builder
         * 
         */
        public Builder recordType(String recordType) {
            return recordType(Output.of(recordType));
        }

        /**
         * @param valid `&#34;valid&#34;` if the record is valid.
         * 
         * @return builder
         * 
         */
        public Builder valid(@Nullable Output<String> valid) {
            $.valid = valid;
            return this;
        }

        /**
         * @param valid `&#34;valid&#34;` if the record is valid.
         * 
         * @return builder
         * 
         */
        public Builder valid(String valid) {
            return valid(Output.of(valid));
        }

        /**
         * @param value The value of the record.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The value of the record.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public DomainReceivingRecordArgs build() {
            return $;
        }
    }

}
