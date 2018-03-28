package ru.i_novus.platform.versioned_data_storage.pg_impl.model;

import ru.i_novus.platform.datastorage.temporal.model.Field;

/**
 * @author lgalimova
 * @since 01.02.2018
 */
public class DateField extends Field {
    public DateField(String name) {
        super(name);
    }

    @Override
    public String getType() {
        return "date";
    }
}
