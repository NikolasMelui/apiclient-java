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

public class LinkregulationAddressRequest {
    private Long regulationAddressId;

    @RequestField(name="regulation_address_id")
    /**
    * The regulation address ID
    */
    public long getRegulationAddressId() {
        return this.regulationAddressId.longValue();
    }

    public boolean hasRegulationAddressId() {
        return this.regulationAddressId != null;
    }

    /**
    * The regulation address ID
    */
    public LinkregulationAddressRequest setRegulationAddressId(long d) {
        this.regulationAddressId = Long.valueOf(d);
        return this;
    }

    private Long phoneId;

    @RequestField(name="phone_id")
    /**
    * The phone ID for link
    */
    public long getPhoneId() {
        return this.phoneId.longValue();
    }

    public boolean hasPhoneId() {
        return this.phoneId != null;
    }

    /**
    * The phone ID for link
    */
    public LinkregulationAddressRequest setPhoneId(long d) {
        this.phoneId = Long.valueOf(d);
        return this;
    }

    private String phoneNumber;

    @RequestField(name="phone_number")
    /**
    * The phone number for link
    */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public boolean hasPhoneNumber() {
        return this.phoneNumber != null;
    }

    /**
    * The phone number for link
    */
    public LinkregulationAddressRequest setPhoneNumber(String d) {
        this.phoneNumber = d;
        return this;
    }

}