package com.framework.core.querybuilder.hql.model.query.criterion.inparam;

import java.util.Collection;

import com.framework.core.querybuilder.hql.model.query.converter.ConversionException;


/**
 * 功能:
 * @author yuyang
 * @version 1.0
 * @since Jun 6, 20093:19:36 PM
 */
public class MarshallerFactory {
    private static final Marshaller NULL_VALUE_MARSHALLER = new NullValueMarshaller();
    
    public static Marshaller createMarshaller(Object value) {
        if (value == null) {
            return NULL_VALUE_MARSHALLER;
        } else if (value instanceof String) {
            return new StringMarshaller((String) value);
        } else if (value instanceof Object[]) {
            return new ArrayMarshaller(value);
        } else if (value instanceof Collection) {
            return new CollectionMarshaller(value);
        } else if (value instanceof Number) {
            return new NumberMarshaller(value);
        } else {
            // null array will go here, handle this?
            throw new ConversionException("Marshaller doesn't support " + value);
        }
    }
    
}

