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

public class DeactivateChildAccountSubscriptionRequest {
    private Long subscriptionId;

    @RequestField(name="subscription_id")
    /**
    * The subscription ID to be deactivated.
    */
    public long getSubscriptionId() {
        return this.subscriptionId.longValue();
    }

    public boolean hasSubscriptionId() {
        return this.subscriptionId != null;
    }

    /**
    * The subscription ID to be deactivated.
    */
    public DeactivateChildAccountSubscriptionRequest setSubscriptionId(long d) {
        this.subscriptionId = Long.valueOf(d);
        return this;
    }

    private Long childAccountId;

    @RequestField(name="child_account_id")
    /**
    * The child account ID.
    */
    public long getChildAccountId() {
        return this.childAccountId.longValue();
    }

    public boolean hasChildAccountId() {
        return this.childAccountId != null;
    }

    /**
    * The child account ID.
    */
    public DeactivateChildAccountSubscriptionRequest setChildAccountId(long d) {
        this.childAccountId = Long.valueOf(d);
        return this;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.TimestampDeserializer.class)
    private Date subscriptionFinishDate;

    @RequestField(name="subscription_finish_date")
    @SerializeUsing(serializer = TimestampSerializer.class)
    /**
    * The deactivation UTC date in 24-h format: YYYY-MM-DD HH:mm:ss. If
    * empty, then the current date + 1 day is used as a cancellation date.
    */
    public Date getSubscriptionFinishDate() {
        return this.subscriptionFinishDate;
    }

    public boolean hasSubscriptionFinishDate() {
        return this.subscriptionFinishDate != null;
    }

    /**
    * The deactivation UTC date in 24-h format: YYYY-MM-DD HH:mm:ss. If
    * empty, then the current date + 1 day is used as a cancellation date.
    */
    public DeactivateChildAccountSubscriptionRequest setSubscriptionFinishDate(Date d) {
        this.subscriptionFinishDate = d;
        return this;
    }

}