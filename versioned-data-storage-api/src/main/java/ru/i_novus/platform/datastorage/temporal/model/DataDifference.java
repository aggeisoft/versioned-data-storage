package ru.i_novus.platform.datastorage.temporal.model;

import net.n2oapp.criteria.api.CollectionPage;

/**
 * @author lgalimova
 * @since 20.03.2018
 */
public class DataDifference {
    private CollectionPage<DiffRowValue> rows;

    public DataDifference(CollectionPage<DiffRowValue> rows) {
        this.rows = rows;
    }

    public CollectionPage<DiffRowValue> getRows() {
        return rows;
    }
}
