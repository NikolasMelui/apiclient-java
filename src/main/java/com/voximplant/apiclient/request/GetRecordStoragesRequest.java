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

public class GetRecordStoragesRequest {
    private MultiArgument<Long> recordStorageId;

    @RequestField(name="record_storage_id")
    /**
    * The record storage ID list separated by the ';' symbol.
    */
    public MultiArgument<Long> getRecordStorageId() {
        return this.recordStorageId;
    }

    public boolean hasRecordStorageId() {
        return this.recordStorageId != null;
    }

    /**
    * The record storage ID list separated by the ';' symbol.
    */
    public GetRecordStoragesRequest setRecordStorageId(MultiArgument<Long> d) {
        this.recordStorageId = d;
        return this;
    }

    private MultiArgument<String> recordStorageName;

    @RequestField(name="record_storage_name")
    /**
    * The record storage name list separated by the ';' symbol.
    */
    public MultiArgument<String> getRecordStorageName() {
        return this.recordStorageName;
    }

    public boolean hasRecordStorageName() {
        return this.recordStorageName != null;
    }

    /**
    * The record storage name list separated by the ';' symbol.
    */
    public GetRecordStoragesRequest setRecordStorageName(MultiArgument<String> d) {
        this.recordStorageName = d;
        return this;
    }

    private Boolean withPrivate;

    @RequestField(name="with_private")
    /**
    * Set true to get the private record storages. If set to true, there is
    * the __is_public : bool__ parameter in a response.
    */
    public boolean getWithPrivate() {
        return this.withPrivate.booleanValue();
    }

    public boolean hasWithPrivate() {
        return this.withPrivate != null;
    }

    /**
    * Set true to get the private record storages. If set to true, there is
    * the __is_public : bool__ parameter in a response.
    */
    public GetRecordStoragesRequest setWithPrivate(boolean d) {
        this.withPrivate = Boolean.valueOf(d);
        return this;
    }

}