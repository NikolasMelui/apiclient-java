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

public class AddAdminUserRequest {
    private String newAdminUserName;

    @RequestField(name="new_admin_user_name")
    /**
    * The admin user name. The length must be less than 50.
    */
    public String getNewAdminUserName() {
        return this.newAdminUserName;
    }

    public boolean hasNewAdminUserName() {
        return this.newAdminUserName != null;
    }

    /**
    * The admin user name. The length must be less than 50.
    */
    public AddAdminUserRequest setNewAdminUserName(String d) {
        this.newAdminUserName = d;
        return this;
    }

    private String adminUserDisplayName;

    @RequestField(name="admin_user_display_name")
    /**
    * The admin user display name. The length must be less than 256.
    */
    public String getAdminUserDisplayName() {
        return this.adminUserDisplayName;
    }

    public boolean hasAdminUserDisplayName() {
        return this.adminUserDisplayName != null;
    }

    /**
    * The admin user display name. The length must be less than 256.
    */
    public AddAdminUserRequest setAdminUserDisplayName(String d) {
        this.adminUserDisplayName = d;
        return this;
    }

    private String newAdminUserPassword;

    @RequestField(name="new_admin_user_password")
    /**
    * The admin user password. The length must be at least 6 symbols.
    */
    public String getNewAdminUserPassword() {
        return this.newAdminUserPassword;
    }

    public boolean hasNewAdminUserPassword() {
        return this.newAdminUserPassword != null;
    }

    /**
    * The admin user password. The length must be at least 6 symbols.
    */
    public AddAdminUserRequest setNewAdminUserPassword(String d) {
        this.newAdminUserPassword = d;
        return this;
    }

    private Boolean adminUserActive;

    @RequestField(name="admin_user_active")
    /**
    * The admin user enable flag.
    */
    public boolean getAdminUserActive() {
        return this.adminUserActive.booleanValue();
    }

    public boolean hasAdminUserActive() {
        return this.adminUserActive != null;
    }

    /**
    * The admin user enable flag.
    */
    public AddAdminUserRequest setAdminUserActive(boolean d) {
        this.adminUserActive = Boolean.valueOf(d);
        return this;
    }

    private String adminRoleId;

    @RequestField(name="admin_role_id")
    /**
    * The role(s) ID created via <a
    * href='//voximplant.com/docs/references/httpapi/adminroles'>Managing
    * Admin Roles</a> methods. The attaching admin role ID list separated
    * by the ';' symbol or the 'all' value.
    */
    public String getAdminRoleId() {
        return this.adminRoleId;
    }

    public boolean hasAdminRoleId() {
        return this.adminRoleId != null;
    }

    /**
    * The role(s) ID created via <a
    * href='//voximplant.com/docs/references/httpapi/adminroles'>Managing
    * Admin Roles</a> methods. The attaching admin role ID list separated
    * by the ';' symbol or the 'all' value.
    */
    public AddAdminUserRequest setAdminRoleId(String d) {
        this.adminRoleId = d;
        return this;
    }

    private MultiArgument<String> adminRoleName;

    @RequestField(name="admin_role_name")
    /**
    * The role(s) name(s) created via <a
    * href='//voximplant.com/docs/references/httpapi/adminroles'>Managing
    * Admin Roles</a> methods. The attaching admin role name that can be
    * used instead of <b>admin_role_id</b>.
    */
    public MultiArgument<String> getAdminRoleName() {
        return this.adminRoleName;
    }

    public boolean hasAdminRoleName() {
        return this.adminRoleName != null;
    }

    /**
    * The role(s) name(s) created via <a
    * href='//voximplant.com/docs/references/httpapi/adminroles'>Managing
    * Admin Roles</a> methods. The attaching admin role name that can be
    * used instead of <b>admin_role_id</b>.
    */
    public AddAdminUserRequest setAdminRoleName(MultiArgument<String> d) {
        this.adminRoleName = d;
        return this;
    }

}