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

public class StartConferenceRequest {
    private String conferenceName;

    @RequestField(name="conference_name")
    /**
    * The conference name. The name length must be less than 50 symbols.
    */
    public String getConferenceName() {
        return this.conferenceName;
    }

    public boolean hasConferenceName() {
        return this.conferenceName != null;
    }

    /**
    * The conference name. The name length must be less than 50 symbols.
    */
    public StartConferenceRequest setConferenceName(String d) {
        this.conferenceName = d;
        return this;
    }

    private Long ruleId;

    @RequestField(name="rule_id")
    /**
    * The rule ID.
    */
    public long getRuleId() {
        return this.ruleId.longValue();
    }

    public boolean hasRuleId() {
        return this.ruleId != null;
    }

    /**
    * The rule ID.
    */
    public StartConferenceRequest setRuleId(long d) {
        this.ruleId = Long.valueOf(d);
        return this;
    }

    private Long userId;

    @RequestField(name="user_id")
    /**
    * The user ID. Run the scripts from the user if set.
    */
    public long getUserId() {
        return this.userId.longValue();
    }

    public boolean hasUserId() {
        return this.userId != null;
    }

    /**
    * The user ID. Run the scripts from the user if set.
    */
    public StartConferenceRequest setUserId(long d) {
        this.userId = Long.valueOf(d);
        return this;
    }

    private String userName;

    @RequestField(name="user_name")
    /**
    * The user name that can be used instead of <b>user_id</b>. Run the
    * scripts from the user if set.
    */
    public String getUserName() {
        return this.userName;
    }

    public boolean hasUserName() {
        return this.userName != null;
    }

    /**
    * The user name that can be used instead of <b>user_id</b>. Run the
    * scripts from the user if set.
    */
    public StartConferenceRequest setUserName(String d) {
        this.userName = d;
        return this;
    }

    private Long applicationId;

    @RequestField(name="application_id")
    /**
    * The application ID.
    */
    public long getApplicationId() {
        return this.applicationId.longValue();
    }

    public boolean hasApplicationId() {
        return this.applicationId != null;
    }

    /**
    * The application ID.
    */
    public StartConferenceRequest setApplicationId(long d) {
        this.applicationId = Long.valueOf(d);
        return this;
    }

    private String applicationName;

    @RequestField(name="application_name")
    /**
    * The application name that can be used instead of
    * <b>application_id</b>.
    */
    public String getApplicationName() {
        return this.applicationName;
    }

    public boolean hasApplicationName() {
        return this.applicationName != null;
    }

    /**
    * The application name that can be used instead of
    * <b>application_id</b>.
    */
    public StartConferenceRequest setApplicationName(String d) {
        this.applicationName = d;
        return this;
    }

    private String scriptCustomData;

    @RequestField(name="script_custom_data")
    /**
    * The script custom data (like a script argument). Can be accessed in
    * JS scenario via the <a
    * href='//voximplant.com/docs/references/voxengine/voxengine#customdata'>VoxEngine.customData()</a>
    * method
    */
    public String getScriptCustomData() {
        return this.scriptCustomData;
    }

    public boolean hasScriptCustomData() {
        return this.scriptCustomData != null;
    }

    /**
    * The script custom data (like a script argument). Can be accessed in
    * JS scenario via the <a
    * href='//voximplant.com/docs/references/voxengine/voxengine#customdata'>VoxEngine.customData()</a>
    * method
    */
    public StartConferenceRequest setScriptCustomData(String d) {
        this.scriptCustomData = d;
        return this;
    }

    private String referenceIp;

    @RequestField(name="reference_ip")
    /**
    * Specifies the IP from the geolocation of predicted subscribers. It
    * allows selecting the nearest server for serving subscribers.
    */
    public String getReferenceIp() {
        return this.referenceIp;
    }

    public boolean hasReferenceIp() {
        return this.referenceIp != null;
    }

    /**
    * Specifies the IP from the geolocation of predicted subscribers. It
    * allows selecting the nearest server for serving subscribers.
    */
    public StartConferenceRequest setReferenceIp(String d) {
        this.referenceIp = d;
        return this;
    }

}