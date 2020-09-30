package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

public class GetCountriesResponse {
    private Error error;

    public Error getError() {
        return error;
    }

    public boolean hasError() {
        return this.error != null;
    }

    private RegulationCountry[] result;

        public RegulationCountry[] getResult() {
        return this.result;
    }

    public boolean hasResult() {
        return this.result != null;
    }

    private Long count;

        public long getCount() {
        return this.count.longValue();
    }

    public boolean hasCount() {
        return this.count != null;
    }

}