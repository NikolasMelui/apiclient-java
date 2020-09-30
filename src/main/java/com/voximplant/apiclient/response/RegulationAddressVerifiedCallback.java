package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The specific account callback details. Received as part of the
* [AccountCallback] structure.
*/
public class RegulationAddressVerifiedCallback {

    private Long regulationAddressId;

    /**
    * The uploaded document ID.
    */
    public long getRegulationAddressId() {
        return this.regulationAddressId.longValue();
    }

    public boolean hasRegulationAddressId() {
        return this.regulationAddressId != null;
    }

    private String regulationAddressStatus;

    /**
    * The document verification status. The following values are possible:
    * WAITING_CONFIRMATION_DOCS, VERIFIED, REJECTED,
    * WAITING_PERIOD_EXPIRED.
    */
    public String getRegulationAddressStatus() {
        return this.regulationAddressStatus;
    }

    public boolean hasRegulationAddressStatus() {
        return this.regulationAddressStatus != null;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.TimestampDeserializer.class)
    private Date uploaded;

    /**
    * The UTC date of the document upload in format: YYYY-MM-DD HH::mm:ss
    */
    public Date getUploaded() {
        return this.uploaded;
    }

    public boolean hasUploaded() {
        return this.uploaded != null;
    }

    private Boolean isIndividual;

    /**
    * Is individual, isn't legal entity?
    */
    public boolean getIsIndividual() {
        return this.isIndividual.booleanValue();
    }

    public boolean hasIsIndividual() {
        return this.isIndividual != null;
    }

    private String comment;

    /**
    * The reviewer's comment.
    */
    public String getComment() {
        return this.comment;
    }

    public boolean hasComment() {
        return this.comment != null;
    }

    private String regulationAddressName;

    /**
    * The regulation address name.
    */
    public String getRegulationAddressName() {
        return this.regulationAddressName;
    }

    public boolean hasRegulationAddressName() {
        return this.regulationAddressName != null;
    }

}