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

public class GetSmsHistoryRequest {
    private String sourceNumber;

    @RequestField(name="source_number")
    /**
    * The source phone number.
    */
    public String getSourceNumber() {
        return this.sourceNumber;
    }

    public boolean hasSourceNumber() {
        return this.sourceNumber != null;
    }

    /**
    * The source phone number.
    */
    public GetSmsHistoryRequest setSourceNumber(String d) {
        this.sourceNumber = d;
        return this;
    }

    private String destinationNumber;

    @RequestField(name="destination_number")
    /**
    * The destination phone number.
    */
    public String getDestinationNumber() {
        return this.destinationNumber;
    }

    public boolean hasDestinationNumber() {
        return this.destinationNumber != null;
    }

    /**
    * The destination phone number.
    */
    public GetSmsHistoryRequest setDestinationNumber(String d) {
        this.destinationNumber = d;
        return this;
    }

    private String direction;

    @RequestField(name="direction")
    /**
    * Sent or received SMS. Possible values: 'IN', 'OUT', 'in, 'out'. Leave
    * blank to get both incoming and outgoing messages.
    */
    public String getDirection() {
        return this.direction;
    }

    public boolean hasDirection() {
        return this.direction != null;
    }

    /**
    * Sent or received SMS. Possible values: 'IN', 'OUT', 'in, 'out'. Leave
    * blank to get both incoming and outgoing messages.
    */
    public GetSmsHistoryRequest setDirection(String d) {
        this.direction = d;
        return this;
    }

    private Long count;

    @RequestField(name="count")
    /**
    * Maximum number of resulting rows fetched. Must be not more than 1000.
    * If left blank, then the default value of 1000 will be used.
    */
    public long getCount() {
        return this.count.longValue();
    }

    public boolean hasCount() {
        return this.count != null;
    }

    /**
    * Maximum number of resulting rows fetched. Must be not more than 1000.
    * If left blank, then the default value of 1000 will be used.
    */
    public GetSmsHistoryRequest setCount(long d) {
        this.count = Long.valueOf(d);
        return this;
    }

    private Long offset;

    @RequestField(name="offset")
    /**
    * The first <b>N</b> records will be skipped in the output.
    */
    public long getOffset() {
        return this.offset.longValue();
    }

    public boolean hasOffset() {
        return this.offset != null;
    }

    /**
    * The first <b>N</b> records will be skipped in the output.
    */
    public GetSmsHistoryRequest setOffset(long d) {
        this.offset = Long.valueOf(d);
        return this;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.TimestampDeserializer.class)
    private Date fromDate;

    @RequestField(name="from_date")
    @SerializeUsing(serializer = TimestampSerializer.class)
    /**
    * Date from which to perform search. Format is 'yyyy-MM-dd HH:mm:ss'.
    */
    public Date getFromDate() {
        return this.fromDate;
    }

    public boolean hasFromDate() {
        return this.fromDate != null;
    }

    /**
    * Date from which to perform search. Format is 'yyyy-MM-dd HH:mm:ss'.
    */
    public GetSmsHistoryRequest setFromDate(Date d) {
        this.fromDate = d;
        return this;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.TimestampDeserializer.class)
    private Date toDate;

    @RequestField(name="to_date")
    @SerializeUsing(serializer = TimestampSerializer.class)
    /**
    * Date until which to perform search. Format is 'yyyy-MM-dd HH:mm:ss'.
    */
    public Date getToDate() {
        return this.toDate;
    }

    public boolean hasToDate() {
        return this.toDate != null;
    }

    /**
    * Date until which to perform search. Format is 'yyyy-MM-dd HH:mm:ss'.
    */
    public GetSmsHistoryRequest setToDate(Date d) {
        this.toDate = d;
        return this;
    }

    private String output;

    @RequestField(name="output")
    /**
    * The output format. The following values available: json, csv.
    */
    public String getOutput() {
        return this.output;
    }

    public boolean hasOutput() {
        return this.output != null;
    }

    /**
    * The output format. The following values available: json, csv.
    */
    public GetSmsHistoryRequest setOutput(String d) {
        this.output = d;
        return this;
    }

}