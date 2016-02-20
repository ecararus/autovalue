package eca.test.wrappers.transformer;

import eca.test.wrappers.wrappers.RequestWrapper;
import eca.test.wrappers.wrappers.SriRequestParams;

public final class ParamTransformerFactory {

    private ParamTransformerFactory() {
    }

    public static SriRequestParams toSriRequestParams(RequestWrapper value) {
        return getRequestWrapperToSriRequestParams().apply(value);
    }

    public static RequestWrapperToSriRequestParams getRequestWrapperToSriRequestParams() {
        return new RequestWrapperToSriRequestParams();
    }

    public static RequestWrapper toRequestWrapper(SriRequestParams value) {
        return getSriRequestParamsToRequestWrapper().apply(value);
    }

    public static SriRequestParamsToRequestWrapper getSriRequestParamsToRequestWrapper() {
        return new SriRequestParamsToRequestWrapper();
    }
}
