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

public class DelRuleRequest {
    private MultiArgument<Long> ruleId;

    @RequestField(name="rule_id")
    /**
    * The rule ID list separated by the ';' symbol or the 'all' value.
    */
    public MultiArgument<Long> getRuleId() {
        return this.ruleId;
    }

    public boolean hasRuleId() {
        return this.ruleId != null;
    }

    /**
    * The rule ID list separated by the ';' symbol or the 'all' value.
    */
    public DelRuleRequest setRuleId(MultiArgument<Long> d) {
        this.ruleId = d;
        return this;
    }

    private MultiArgument<String> ruleName;

    @RequestField(name="rule_name")
    /**
    * The rule name list separated by the ';' symbol. Can be used instead
    * of <b>rule_id</b>.
    */
    public MultiArgument<String> getRuleName() {
        return this.ruleName;
    }

    public boolean hasRuleName() {
        return this.ruleName != null;
    }

    /**
    * The rule name list separated by the ';' symbol. Can be used instead
    * of <b>rule_id</b>.
    */
    public DelRuleRequest setRuleName(MultiArgument<String> d) {
        this.ruleName = d;
        return this;
    }

    private MultiArgument<Long> applicationId;

    @RequestField(name="application_id")
    /**
    * The application ID list separated by the ';' symbol or the 'all'
    * value.
    */
    public MultiArgument<Long> getApplicationId() {
        return this.applicationId;
    }

    public boolean hasApplicationId() {
        return this.applicationId != null;
    }

    /**
    * The application ID list separated by the ';' symbol or the 'all'
    * value.
    */
    public DelRuleRequest setApplicationId(MultiArgument<Long> d) {
        this.applicationId = d;
        return this;
    }

    private MultiArgument<String> applicationName;

    @RequestField(name="application_name")
    /**
    * The application name list separated by the ';' symbol. Can be used
    * instead of <b>application_id</b>.
    */
    public MultiArgument<String> getApplicationName() {
        return this.applicationName;
    }

    public boolean hasApplicationName() {
        return this.applicationName != null;
    }

    /**
    * The application name list separated by the ';' symbol. Can be used
    * instead of <b>application_id</b>.
    */
    public DelRuleRequest setApplicationName(MultiArgument<String> d) {
        this.applicationName = d;
        return this;
    }

}