package eca.test.wrappers.transformer;

import com.google.common.base.Function;
import eca.test.wrappers.wrappers.RequestWrapper;
import eca.test.wrappers.wrappers.SriRequestParams;

class SriRequestParamsToRequestWrapper implements Function<SriRequestParams, RequestWrapper> {

    public RequestWrapper apply(SriRequestParams requestParams) {
        return RequestWrapper.builder()
                .setName(requestParams.getQuery())
                .setSurname(requestParams.getQuery())
                .setPhone(requestParams.getQuery())
                .build();
    }
}