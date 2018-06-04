package ru.i_novus.platform.versioned_data_storage.pg_impl.service;

import ru.i_novus.platform.datastorage.temporal.model.DataDifference;
import ru.i_novus.platform.datastorage.temporal.model.criteria.CompareDataCriteria;
import ru.i_novus.platform.datastorage.temporal.service.CompareDataService;

/**
 * @author lgalimova
 * @since 10.05.2018
 */
public class CompareDataServiceImpl implements CompareDataService {

    private DataDao dataDao;

    public CompareDataServiceImpl(DataDao dataDao) {
        this.dataDao = dataDao;
    }

    @Override
    public DataDifference getDataDifference(CompareDataCriteria criteria) {
        return dataDao.getDataDifference(criteria);
    }

    public void setDataDao(DataDao dataDao) {
        this.dataDao = dataDao;
    }
}
