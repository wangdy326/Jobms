package com.framework.core.querybuilder.hql.model.query.criterion.inparam;


/**
 * 功能:
 * @author yuyang
 * @version 1.0
 * @since Jun 6, 20093:19:52 PM
 */
public class NumberMarshaller implements Marshaller {
    private Number value;
    
    public NumberMarshaller(Object value) {
        this.value = (Number) value;
    }

    public Object getNamedQueryParamValue(Class paramClass) {
        return value;
    }

    public boolean hasValues() {
        return true;
    }

    public String stringValue() {
        return value.toString();
    }
    
    public String toString() {
        return "NumberMarshaller";
    }
    
}

