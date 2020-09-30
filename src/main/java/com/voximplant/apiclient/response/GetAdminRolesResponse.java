package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

public class GetAdminRolesResponse {
    private Error error;

    public Error getError() {
        return error;
    }

    public boolean hasError() {
        return this.error != null;
    }

    private AdminRoleType[] result;

        public AdminRoleType[] getResult() {
        return this.result;
    }

    public boolean hasResult() {
        return this.result != null;
    }

    private Long totalCount;

    /**
    * The total found admin role count.
    */
    public long getTotalCount() {
        return this.totalCount.longValue();
    }

    public boolean hasTotalCount() {
        return this.totalCount != null;
    }

    private Long count;

    /**
    * The returned admin role count.
    */
    public long getCount() {
        return this.count.longValue();
    }

    public boolean hasCount() {
        return this.count != null;
    }

}