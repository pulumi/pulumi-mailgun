// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mailgun.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.mailgun.outputs.GetDomainReceivingRecord;
import com.pulumi.mailgun.outputs.GetDomainReceivingRecordsSet;
import com.pulumi.mailgun.outputs.GetDomainSendingRecord;
import com.pulumi.mailgun.outputs.GetDomainSendingRecordsSet;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetDomainResult {
    private @Nullable Integer dkimKeySize;
    private @Nullable String dkimSelector;
    private @Nullable Boolean forceDkimAuthority;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The name of the record.
     * 
     */
    private String name;
    private @Nullable Boolean openTracking;
    /**
     * @return A list of DNS records for receiving validation.
     * 
     * @deprecated
     * Use `receiving_records_set` instead.
     * 
     */
    @Deprecated /* Use `receiving_records_set` instead. */
    private List<GetDomainReceivingRecord> receivingRecords;
    private List<GetDomainReceivingRecordsSet> receivingRecordsSets;
    private @Nullable String region;
    /**
     * @return A list of DNS records for sending validation.
     * 
     * @deprecated
     * Use `sending_records_set` instead.
     * 
     */
    @Deprecated /* Use `sending_records_set` instead. */
    private List<GetDomainSendingRecord> sendingRecords;
    private List<GetDomainSendingRecordsSet> sendingRecordsSets;
    /**
     * @return The login email for the SMTP server.
     * 
     */
    private String smtpLogin;
    /**
     * @return The password to the SMTP server.
     * 
     */
    private @Nullable String smtpPassword;
    /**
     * @return The spam filtering setting.
     * 
     */
    private @Nullable String spamAction;
    /**
     * @return Whether or not the domain will accept email for sub-domains.
     * 
     */
    private @Nullable Boolean wildcard;

    private GetDomainResult() {}
    public Optional<Integer> dkimKeySize() {
        return Optional.ofNullable(this.dkimKeySize);
    }
    public Optional<String> dkimSelector() {
        return Optional.ofNullable(this.dkimSelector);
    }
    public Optional<Boolean> forceDkimAuthority() {
        return Optional.ofNullable(this.forceDkimAuthority);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The name of the record.
     * 
     */
    public String name() {
        return this.name;
    }
    public Optional<Boolean> openTracking() {
        return Optional.ofNullable(this.openTracking);
    }
    /**
     * @return A list of DNS records for receiving validation.
     * 
     * @deprecated
     * Use `receiving_records_set` instead.
     * 
     */
    @Deprecated /* Use `receiving_records_set` instead. */
    public List<GetDomainReceivingRecord> receivingRecords() {
        return this.receivingRecords;
    }
    public List<GetDomainReceivingRecordsSet> receivingRecordsSets() {
        return this.receivingRecordsSets;
    }
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }
    /**
     * @return A list of DNS records for sending validation.
     * 
     * @deprecated
     * Use `sending_records_set` instead.
     * 
     */
    @Deprecated /* Use `sending_records_set` instead. */
    public List<GetDomainSendingRecord> sendingRecords() {
        return this.sendingRecords;
    }
    public List<GetDomainSendingRecordsSet> sendingRecordsSets() {
        return this.sendingRecordsSets;
    }
    /**
     * @return The login email for the SMTP server.
     * 
     */
    public String smtpLogin() {
        return this.smtpLogin;
    }
    /**
     * @return The password to the SMTP server.
     * 
     */
    public Optional<String> smtpPassword() {
        return Optional.ofNullable(this.smtpPassword);
    }
    /**
     * @return The spam filtering setting.
     * 
     */
    public Optional<String> spamAction() {
        return Optional.ofNullable(this.spamAction);
    }
    /**
     * @return Whether or not the domain will accept email for sub-domains.
     * 
     */
    public Optional<Boolean> wildcard() {
        return Optional.ofNullable(this.wildcard);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDomainResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer dkimKeySize;
        private @Nullable String dkimSelector;
        private @Nullable Boolean forceDkimAuthority;
        private String id;
        private String name;
        private @Nullable Boolean openTracking;
        private List<GetDomainReceivingRecord> receivingRecords;
        private List<GetDomainReceivingRecordsSet> receivingRecordsSets;
        private @Nullable String region;
        private List<GetDomainSendingRecord> sendingRecords;
        private List<GetDomainSendingRecordsSet> sendingRecordsSets;
        private String smtpLogin;
        private @Nullable String smtpPassword;
        private @Nullable String spamAction;
        private @Nullable Boolean wildcard;
        public Builder() {}
        public Builder(GetDomainResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dkimKeySize = defaults.dkimKeySize;
    	      this.dkimSelector = defaults.dkimSelector;
    	      this.forceDkimAuthority = defaults.forceDkimAuthority;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.openTracking = defaults.openTracking;
    	      this.receivingRecords = defaults.receivingRecords;
    	      this.receivingRecordsSets = defaults.receivingRecordsSets;
    	      this.region = defaults.region;
    	      this.sendingRecords = defaults.sendingRecords;
    	      this.sendingRecordsSets = defaults.sendingRecordsSets;
    	      this.smtpLogin = defaults.smtpLogin;
    	      this.smtpPassword = defaults.smtpPassword;
    	      this.spamAction = defaults.spamAction;
    	      this.wildcard = defaults.wildcard;
        }

        @CustomType.Setter
        public Builder dkimKeySize(@Nullable Integer dkimKeySize) {
            this.dkimKeySize = dkimKeySize;
            return this;
        }
        @CustomType.Setter
        public Builder dkimSelector(@Nullable String dkimSelector) {
            this.dkimSelector = dkimSelector;
            return this;
        }
        @CustomType.Setter
        public Builder forceDkimAuthority(@Nullable Boolean forceDkimAuthority) {
            this.forceDkimAuthority = forceDkimAuthority;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder openTracking(@Nullable Boolean openTracking) {
            this.openTracking = openTracking;
            return this;
        }
        @CustomType.Setter
        public Builder receivingRecords(List<GetDomainReceivingRecord> receivingRecords) {
            this.receivingRecords = Objects.requireNonNull(receivingRecords);
            return this;
        }
        public Builder receivingRecords(GetDomainReceivingRecord... receivingRecords) {
            return receivingRecords(List.of(receivingRecords));
        }
        @CustomType.Setter
        public Builder receivingRecordsSets(List<GetDomainReceivingRecordsSet> receivingRecordsSets) {
            this.receivingRecordsSets = Objects.requireNonNull(receivingRecordsSets);
            return this;
        }
        public Builder receivingRecordsSets(GetDomainReceivingRecordsSet... receivingRecordsSets) {
            return receivingRecordsSets(List.of(receivingRecordsSets));
        }
        @CustomType.Setter
        public Builder region(@Nullable String region) {
            this.region = region;
            return this;
        }
        @CustomType.Setter
        public Builder sendingRecords(List<GetDomainSendingRecord> sendingRecords) {
            this.sendingRecords = Objects.requireNonNull(sendingRecords);
            return this;
        }
        public Builder sendingRecords(GetDomainSendingRecord... sendingRecords) {
            return sendingRecords(List.of(sendingRecords));
        }
        @CustomType.Setter
        public Builder sendingRecordsSets(List<GetDomainSendingRecordsSet> sendingRecordsSets) {
            this.sendingRecordsSets = Objects.requireNonNull(sendingRecordsSets);
            return this;
        }
        public Builder sendingRecordsSets(GetDomainSendingRecordsSet... sendingRecordsSets) {
            return sendingRecordsSets(List.of(sendingRecordsSets));
        }
        @CustomType.Setter
        public Builder smtpLogin(String smtpLogin) {
            this.smtpLogin = Objects.requireNonNull(smtpLogin);
            return this;
        }
        @CustomType.Setter
        public Builder smtpPassword(@Nullable String smtpPassword) {
            this.smtpPassword = smtpPassword;
            return this;
        }
        @CustomType.Setter
        public Builder spamAction(@Nullable String spamAction) {
            this.spamAction = spamAction;
            return this;
        }
        @CustomType.Setter
        public Builder wildcard(@Nullable Boolean wildcard) {
            this.wildcard = wildcard;
            return this;
        }
        public GetDomainResult build() {
            final var _resultValue = new GetDomainResult();
            _resultValue.dkimKeySize = dkimKeySize;
            _resultValue.dkimSelector = dkimSelector;
            _resultValue.forceDkimAuthority = forceDkimAuthority;
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.openTracking = openTracking;
            _resultValue.receivingRecords = receivingRecords;
            _resultValue.receivingRecordsSets = receivingRecordsSets;
            _resultValue.region = region;
            _resultValue.sendingRecords = sendingRecords;
            _resultValue.sendingRecordsSets = sendingRecordsSets;
            _resultValue.smtpLogin = smtpLogin;
            _resultValue.smtpPassword = smtpPassword;
            _resultValue.spamAction = spamAction;
            _resultValue.wildcard = wildcard;
            return _resultValue;
        }
    }
}
