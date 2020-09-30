package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

public class GetSkillsResponse {
    private Error error;

    public Error getError() {
        return error;
    }

    public boolean hasError() {
        return this.error != null;
    }

    private SkillInfoType[] result;

        public SkillInfoType[] getResult() {
        return this.result;
    }

    public boolean hasResult() {
        return this.result != null;
    }

    private Long totalCount;

    /**
    * The total found skill count.
    */
    public long getTotalCount() {
        return this.totalCount.longValue();
    }

    public boolean hasTotalCount() {
        return this.totalCount != null;
    }

    private Long count;

    /**
    * The returned skill count.
    */
    public long getCount() {
        return this.count.longValue();
    }

    public boolean hasCount() {
        return this.count != null;
    }

}