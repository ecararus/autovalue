package eca.test.wrappers.transformer;

import com.google.common.base.Function;
import eca.test.wrappers.wrappers.RequestWrapper;
import eca.test.wrappers.wrappers.SriRequestParams;

class RequestWrapperToSriRequestParams implements Function<RequestWrapper, SriRequestParams> {

    public SriRequestParams apply(RequestWrapper requestWrapper) {
        //Some dummy logic.
        StringBuilder builder = new StringBuilder();
        addName(builder, requestWrapper);
        addSurname(builder, requestWrapper);
        addPhone(builder, requestWrapper);
        addGroup(builder, requestWrapper);
        return new SriRequestParams(builder.toString());
    }

    private void addName(StringBuilder builder, RequestWrapper requestWrapper) {
        builder.append("?name=").append(requestWrapper.getName());
    }

    private void addSurname(StringBuilder builder, RequestWrapper requestWrapper) {
        builder.append(";surname=").append(requestWrapper.getSurname());
    }

    private void addPhone(StringBuilder builder, RequestWrapper requestWrapper) {
        builder.append(";phone=").append(requestWrapper.getPhone().or(""));
    }

    private void addGroup(StringBuilder builder, RequestWrapper requestWrapper) {
        builder.append(";group=").append(requestWrapper.getGroup().or(""));
    }
}