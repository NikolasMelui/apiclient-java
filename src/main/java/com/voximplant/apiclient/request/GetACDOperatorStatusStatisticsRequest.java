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

public class GetACDOperatorStatusStatisticsRequest {
    @JsonDeserialize(using=com.voximplant.apiclient.util.TimestampDeserializer.class)
    private Date fromDate;

    @RequestField(name="from_date")
    @SerializeUsing(serializer = TimestampSerializer.class)
    /**
    * Date and time of statistics interval begin. Time zone is UTC, format
    * is 24-h 'YYYY-MM-DD HH:mm:ss'
    */
    public Date getFromDate() {
        return this.fromDate;
    }

    public boolean hasFromDate() {
        return this.fromDate != null;
    }

    /**
    * Date and time of statistics interval begin. Time zone is UTC, format
    * is 24-h 'YYYY-MM-DD HH:mm:ss'
    */
    public GetACDOperatorStatusStatisticsRequest setFromDate(Date d) {
        this.fromDate = d;
        return this;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.TimestampDeserializer.class)
    private Date toDate;

    @RequestField(name="to_date")
    @SerializeUsing(serializer = TimestampSerializer.class)
    /**
    * Date and time of statistics interval begin. Time zone is UTC, format
    * is 24-h 'YYYY-MM-DD HH:mm:ss'.
    */
    public Date getToDate() {
        return this.toDate;
    }

    public boolean hasToDate() {
        return this.toDate != null;
    }

    /**
    * Date and time of statistics interval begin. Time zone is UTC, format
    * is 24-h 'YYYY-MM-DD HH:mm:ss'.
    */
    public GetACDOperatorStatusStatisticsRequest setToDate(Date d) {
        this.toDate = d;
        return this;
    }

    private MultiArgument<String> acdStatus;

    @RequestField(name="acd_status")
    /**
    * The ACD status list separated by the ';' symbol. The following values
    * are possible: OFFLINE, ONLINE, READY, BANNED, IN_SERVICE,
    * AFTER_SERVICE, TIMEOUT, DND.
    */
    public MultiArgument<String> getAcdStatus() {
        return this.acdStatus;
    }

    public boolean hasAcdStatus() {
        return this.acdStatus != null;
    }

    /**
    * The ACD status list separated by the ';' symbol. The following values
    * are possible: OFFLINE, ONLINE, READY, BANNED, IN_SERVICE,
    * AFTER_SERVICE, TIMEOUT, DND.
    */
    public GetACDOperatorStatusStatisticsRequest setAcdStatus(MultiArgument<String> d) {
        this.acdStatus = d;
        return this;
    }

    private MultiArgument<String> userId;

    @RequestField(name="user_id")
    /**
    * The user ID list separated by the ';' symbol or the 'all' value. 
    */
    public MultiArgument<String> getUserId() {
        return this.userId;
    }

    public boolean hasUserId() {
        return this.userId != null;
    }

    /**
    * The user ID list separated by the ';' symbol or the 'all' value. 
    */
    public GetACDOperatorStatusStatisticsRequest setUserId(MultiArgument<String> d) {
        this.userId = d;
        return this;
    }

    private String aggregation;

    @RequestField(name="aggregation")
    /**
    * Specifies how records are grouped by date and time. If set to 'day',
    * the criteria is a day number. If set to 'hour_of_day', the criteria
    * is a 60-minute interval within a day. If set to 'hour', the criteria
    * is both day number and 60-minute interval within that day. If set to
    * 'none', records are not grouped by date and time.
    */
    public String getAggregation() {
        return this.aggregation;
    }

    public boolean hasAggregation() {
        return this.aggregation != null;
    }

    /**
    * Specifies how records are grouped by date and time. If set to 'day',
    * the criteria is a day number. If set to 'hour_of_day', the criteria
    * is a 60-minute interval within a day. If set to 'hour', the criteria
    * is both day number and 60-minute interval within that day. If set to
    * 'none', records are not grouped by date and time.
    */
    public GetACDOperatorStatusStatisticsRequest setAggregation(String d) {
        this.aggregation = d;
        return this;
    }

    private String group;

    @RequestField(name="group")
    /**
    * If set to 'user', first-level array in the resulting JSON will group
    * records by the user ID, and second-level array will group them by
    * date according to the 'aggregation' parameter. If set to
    * 'aggregation', first-level array in the resulting JSON will group
    * records according to the 'aggregation' parameter, and second-level
    * array will group them by the user ID.
    */
    public String getGroup() {
        return this.group;
    }

    public boolean hasGroup() {
        return this.group != null;
    }

    /**
    * If set to 'user', first-level array in the resulting JSON will group
    * records by the user ID, and second-level array will group them by
    * date according to the 'aggregation' parameter. If set to
    * 'aggregation', first-level array in the resulting JSON will group
    * records according to the 'aggregation' parameter, and second-level
    * array will group them by the user ID.
    */
    public GetACDOperatorStatusStatisticsRequest setGroup(String d) {
        this.group = d;
        return this;
    }

}