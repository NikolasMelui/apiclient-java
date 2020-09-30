package com.voximplant.apiclient.request;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.voximplant.apiclient.util.DateSerializer;
import com.voximplant.apiclient.util.RequestField;
import com.voximplant.apiclient.util.SerializeUsing;
import com.voximplant.apiclient.util.TimestampSerializer;

public class AttachPhoneNumberRequest {
    private Long phoneCount;

    @RequestField(name="phone_count")
    /**
    * The phone count to attach.
    */
    public long getPhoneCount() {
        return this.phoneCount.longValue();
    }

    public boolean hasPhoneCount() {
        return this.phoneCount != null;
    }

    /**
    * The phone count to attach.
    */
    public AttachPhoneNumberRequest setPhoneCount(long d) {
        this.phoneCount = Long.valueOf(d);
        return this;
    }

    private MultiArgument<String> phoneNumber;

    @RequestField(name="phone_number")
    /**
    * The phone number that can be used instead of <b>phone_count</b>. See
    * the [GetNewPhoneNumbers] method.
    */
    public MultiArgument<String> getPhoneNumber() {
        return this.phoneNumber;
    }

    public boolean hasPhoneNumber() {
        return this.phoneNumber != null;
    }

    /**
    * The phone number that can be used instead of <b>phone_count</b>. See
    * the [GetNewPhoneNumbers] method.
    */
    public AttachPhoneNumberRequest setPhoneNumber(MultiArgument<String> d) {
        this.phoneNumber = d;
        return this;
    }

    private String countryCode;

    @RequestField(name="country_code")
    /**
    * The country code.
    */
    public String getCountryCode() {
        return this.countryCode;
    }

    public boolean hasCountryCode() {
        return this.countryCode != null;
    }

    /**
    * The country code.
    */
    public AttachPhoneNumberRequest setCountryCode(String d) {
        this.countryCode = d;
        return this;
    }

    private String phoneCategoryName;

    @RequestField(name="phone_category_name")
    /**
    * The phone category name. See the [GetPhoneNumberCategories] method.
    */
    public String getPhoneCategoryName() {
        return this.phoneCategoryName;
    }

    public boolean hasPhoneCategoryName() {
        return this.phoneCategoryName != null;
    }

    /**
    * The phone category name. See the [GetPhoneNumberCategories] method.
    */
    public AttachPhoneNumberRequest setPhoneCategoryName(String d) {
        this.phoneCategoryName = d;
        return this;
    }

    private String countryState;

    @RequestField(name="country_state")
    /**
    * The country state. See the [GetPhoneNumberCategories] and
    * [GetPhoneNumberCountryStates] methods.
    */
    public String getCountryState() {
        return this.countryState;
    }

    public boolean hasCountryState() {
        return this.countryState != null;
    }

    /**
    * The country state. See the [GetPhoneNumberCategories] and
    * [GetPhoneNumberCountryStates] methods.
    */
    public AttachPhoneNumberRequest setCountryState(String d) {
        this.countryState = d;
        return this;
    }

    private Long phoneRegionId;

    @RequestField(name="phone_region_id")
    /**
    * The phone region ID. See the [GetPhoneNumberRegions] method.
    */
    public long getPhoneRegionId() {
        return this.phoneRegionId.longValue();
    }

    public boolean hasPhoneRegionId() {
        return this.phoneRegionId != null;
    }

    /**
    * The phone region ID. See the [GetPhoneNumberRegions] method.
    */
    public AttachPhoneNumberRequest setPhoneRegionId(long d) {
        this.phoneRegionId = Long.valueOf(d);
        return this;
    }

    private Long regulationAddressId;

    @RequestField(name="regulation_address_id")
    /**
    * The phone regulation address ID.
    */
    public long getRegulationAddressId() {
        return this.regulationAddressId.longValue();
    }

    public boolean hasRegulationAddressId() {
        return this.regulationAddressId != null;
    }

    /**
    * The phone regulation address ID.
    */
    public AttachPhoneNumberRequest setRegulationAddressId(long d) {
        this.regulationAddressId = Long.valueOf(d);
        return this;
    }

    private Boolean forceVerification;

    @RequestField(name="force_verification")
    /**
    * The force verification flag.
    */
    public boolean getForceVerification() {
        return this.forceVerification.booleanValue();
    }

    public boolean hasForceVerification() {
        return this.forceVerification != null;
    }

    /**
    * The force verification flag.
    */
    public AttachPhoneNumberRequest setForceVerification(boolean d) {
        this.forceVerification = Boolean.valueOf(d);
        return this;
    }

}