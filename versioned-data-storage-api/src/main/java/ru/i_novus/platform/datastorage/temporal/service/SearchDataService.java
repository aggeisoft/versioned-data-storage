package ru.i_novus.platform.datastorage.temporal.service;

import net.n2oapp.criteria.api.CollectionPage;
import ru.i_novus.platform.datastorage.temporal.model.criteria.DataCriteria;
import ru.i_novus.platform.datastorage.temporal.model.value.RowValue;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Сервис поиска и получения данных по заданным критериям.
 *
 * @author RMakhmutov
 * @since 22.03.2018
 */
public interface SearchDataService {
    /**
     * Получение данных постранично
     *
     * @param criteria параметры запроса
     * @return Список записей
     */
    CollectionPage<RowValue> getPagedData(DataCriteria criteria);

    /**
     * Получение данных
     *
     * @param criteria параметры запроса
     * @return Список записей
     */
    List<RowValue> getData(DataCriteria criteria);

    /**
     * Получение данных записи по системному идентификатору
     *
     * @param storageCode код хранилища данных
     * @param fields      список полей в ответе
     * @param systemId    системный идентификатор записи
     * @return Запись данных
     */
    RowValue findRow(String storageCode, List<String> fields, Object systemId);

    /**
     * Получение данных списка записей по системным идентификаторам
     *
     * @param storageCode код хранилища данных
     * @param fields      список полей в ответе
     * @param systemIds   системные идентификаторы записей
     * @return Список записей данных
     */
    List<RowValue> findRows(String storageCode, List<String> fields, List<Object> systemIds);

    /**
     * Получение данных записи по системному идентификатору
     *
     * @param storageCode   код хранилища данных
     * @param bdate         дата публикации версии
     * @param edate         дата создания версии
     * @param hashList      список хешей строк
     * @return Список несуществующих хешей
     */
    List<String> getNotExists(String storageCode, LocalDateTime bdate, LocalDateTime edate, List<String> hashList);
}