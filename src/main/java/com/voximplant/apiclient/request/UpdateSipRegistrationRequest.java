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

public class UpdateSipRegistrationRequest {
    private Long sipRegistrationId;

    @RequestField(name="sip_registration_id")
    /**
    * The registration ID
    */
    public long getSipRegistrationId() {
        return this.sipRegistrationId.longValue();
    }

    public boolean hasSipRegistrationId() {
        return this.sipRegistrationId != null;
    }

    /**
    * The registration ID
    */
    public UpdateSipRegistrationRequest setSipRegistrationId(long d) {
        this.sipRegistrationId = Long.valueOf(d);
        return this;
    }

    private String sipUsername;

    @RequestField(name="sip_username")
    /**
    * The user name.
    */
    public String getSipUsername() {
        return this.sipUsername;
    }

    public boolean hasSipUsername() {
        return this.sipUsername != null;
    }

    /**
    * The user name.
    */
    public UpdateSipRegistrationRequest setSipUsername(String d) {
        this.sipUsername = d;
        return this;
    }

    private String proxy;

    @RequestField(name="proxy")
    /**
    * The SIP proxy
    */
    public String getProxy() {
        return this.proxy;
    }

    public boolean hasProxy() {
        return this.proxy != null;
    }

    /**
    * The SIP proxy
    */
    public UpdateSipRegistrationRequest setProxy(String d) {
        this.proxy = d;
        return this;
    }

    private String authUser;

    @RequestField(name="auth_user")
    /**
    * The SIP authentications user
    */
    public String getAuthUser() {
        return this.authUser;
    }

    public boolean hasAuthUser() {
        return this.authUser != null;
    }

    /**
    * The SIP authentications user
    */
    public UpdateSipRegistrationRequest setAuthUser(String d) {
        this.authUser = d;
        return this;
    }

    private String outboundProxy;

    @RequestField(name="outbound_proxy")
    /**
    * The outbound SIP proxy
    */
    public String getOutboundProxy() {
        return this.outboundProxy;
    }

    public boolean hasOutboundProxy() {
        return this.outboundProxy != null;
    }

    /**
    * The outbound SIP proxy
    */
    public UpdateSipRegistrationRequest setOutboundProxy(String d) {
        this.outboundProxy = d;
        return this;
    }

    private String password;

    @RequestField(name="password")
    /**
    * The SIP password
    */
    public String getPassword() {
        return this.password;
    }

    public boolean hasPassword() {
        return this.password != null;
    }

    /**
    * The SIP password
    */
    public UpdateSipRegistrationRequest setPassword(String d) {
        this.password = d;
        return this;
    }

    private Long applicationId;

    @RequestField(name="application_id")
    /**
    * The application ID which the SIP registration will be bound to. Can
    * be used instead of the <b>application_name</b> parameter.
    */
    public long getApplicationId() {
        return this.applicationId.longValue();
    }

    public boolean hasApplicationId() {
        return this.applicationId != null;
    }

    /**
    * The application ID which the SIP registration will be bound to. Can
    * be used instead of the <b>application_name</b> parameter.
    */
    public UpdateSipRegistrationRequest setApplicationId(long d) {
        this.applicationId = Long.valueOf(d);
        return this;
    }

    private String applicationName;

    @RequestField(name="application_name")
    /**
    * The application name which the SIP registration will be bound to. Can
    * be used instead of the <b>application_id</b> parameter.
    */
    public String getApplicationName() {
        return this.applicationName;
    }

    public boolean hasApplicationName() {
        return this.applicationName != null;
    }

    /**
    * The application name which the SIP registration will be bound to. Can
    * be used instead of the <b>application_id</b> parameter.
    */
    public UpdateSipRegistrationRequest setApplicationName(String d) {
        this.applicationName = d;
        return this;
    }

    private Long ruleId;

    @RequestField(name="rule_id")
    /**
    * The rule ID which the SIP registration will be bound to. Can be used
    * instead of the <b>rule_name</b> parameter.
    */
    public long getRuleId() {
        return this.ruleId.longValue();
    }

    public boolean hasRuleId() {
        return this.ruleId != null;
    }

    /**
    * The rule ID which the SIP registration will be bound to. Can be used
    * instead of the <b>rule_name</b> parameter.
    */
    public UpdateSipRegistrationRequest setRuleId(long d) {
        this.ruleId = Long.valueOf(d);
        return this;
    }

    private String ruleName;

    @RequestField(name="rule_name")
    /**
    * The rule name which the SIP registration will be bound to. Can be
    * used instead of the <b>rule_id</b> parameter.
    */
    public String getRuleName() {
        return this.ruleName;
    }

    public boolean hasRuleName() {
        return this.ruleName != null;
    }

    /**
    * The rule name which the SIP registration will be bound to. Can be
    * used instead of the <b>rule_id</b> parameter.
    */
    public UpdateSipRegistrationRequest setRuleName(String d) {
        this.ruleName = d;
        return this;
    }

    private Long userId;

    @RequestField(name="user_id")
    /**
    * The user ID which the SIP registration will be bound to. Can be used
    * instead of the <b>user_name</b> parameter.
    */
    public long getUserId() {
        return this.userId.longValue();
    }

    public boolean hasUserId() {
        return this.userId != null;
    }

    /**
    * The user ID which the SIP registration will be bound to. Can be used
    * instead of the <b>user_name</b> parameter.
    */
    public UpdateSipRegistrationRequest setUserId(long d) {
        this.userId = Long.valueOf(d);
        return this;
    }

    private String userName;

    @RequestField(name="user_name")
    /**
    * The user name which the SIP registration will be bound to. Can be
    * used instead of the <b>user_id</b> parameter.
    */
    public String getUserName() {
        return this.userName;
    }

    public boolean hasUserName() {
        return this.userName != null;
    }

    /**
    * The user name which the SIP registration will be bound to. Can be
    * used instead of the <b>user_id</b> parameter.
    */
    public UpdateSipRegistrationRequest setUserName(String d) {
        this.userName = d;
        return this;
    }

}