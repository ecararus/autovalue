package eca.test.wrappers.transformer;


import com.google.common.base.Converter;
import eca.test.wrappers.wrappers.RequestWrapper;
import eca.test.wrappers.wrappers.SriRequestParams;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class ParamTransformerFactoryTest {

    @Test
    public void transform() {
        SriRequestParams sriRequestParams = new SriRequestParams("test");
        Converter<SriRequestParams, RequestWrapper> bidirectionalTransformer = Converter.from(ParamTransformerFactory.getSriRequestParamsToRequestWrapper(), ParamTransformerFactory.getRequestWrapperToSriRequestParams());

        RequestWrapper actualRequestWrapper = bidirectionalTransformer.convert(sriRequestParams);
        assertEquals("test", actualRequestWrapper.getName());
        assertEquals("test", actualRequestWrapper.getSurname());
        assertEquals("test", actualRequestWrapper.getPhone().get());
        assertFalse(actualRequestWrapper.getGroup   ().isPresent());

        SriRequestParams actualSriRequestParams1 = bidirectionalTransformer.reverse().convert(actualRequestWrapper);
        assertEquals("?name=test;surname=test;phone=test;group=", actualSriRequestParams1.getQuery());
    }

}
