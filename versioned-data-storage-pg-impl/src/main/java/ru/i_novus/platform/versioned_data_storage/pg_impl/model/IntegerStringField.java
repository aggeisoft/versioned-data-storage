package ru.i_novus.platform.versioned_data_storage.pg_impl.model;

import ru.i_novus.platform.datastorage.temporal.model.Field;
import ru.i_novus.platform.datastorage.temporal.model.FieldValue;
import ru.i_novus.platform.datastorage.temporal.model.value.StringFieldValue;

/**
 * @author lgalimova
 * @since 21.05.2018
 */
public class IntegerStringField extends Field {
    public static final String TYPE = "varchar";

    public IntegerStringField(String name) {
        super(name);
    }

    @Override
    public String getType() {
        return TYPE;
    }

    @Override
    public FieldValue valueOf(Object value) {
        assert value instanceof String;
        return new StringFieldValue(getName(), (String)value);
    }
}