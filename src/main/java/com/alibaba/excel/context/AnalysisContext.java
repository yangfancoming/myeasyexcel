package com.alibaba.excel.context;

import com.alibaba.excel.event.AnalysisEventListener;
import com.alibaba.excel.metadata.BaseRowModel;
import com.alibaba.excel.metadata.ExcelHeadProperty;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.support.ExcelTypeEnum;

import java.io.InputStream;
import java.util.List;

/**
 * A context is the main anchorage point of a excel reader.
 */
public interface AnalysisContext {

    /**
     * Custom attribute
     */
    Object getCustom();

    /**
     * get current sheet
     * @return current analysis sheet
     */
    Sheet getCurrentSheet();

    /**
     * set current sheet
     * @param sheet
     */
    void setCurrentSheet(Sheet sheet);

    /**
     * get excel type
     */
    ExcelTypeEnum getExcelType();

    /**
     * get in io
     */
    InputStream getInputStream();

    /**
     * custom listener
     */
    AnalysisEventListener getEventListener();

    /**
     * get current row
     */
    Integer getCurrentRowNum();

    /**
     * set  current row num
     */
    void setCurrentRowNum(Integer row);

    /**
     * get total row ,Data may be inaccurate
     */
    @Deprecated
    Integer getTotalCount();

    /**
     * get total row ,Data may be inaccurate
     */
    void setTotalCount(Integer totalCount);

    /**
     * get excel head
     */
    ExcelHeadProperty getExcelHeadProperty();


    void buildExcelHeadProperty(Class<? extends BaseRowModel> clazz, List<String> headOneRow);

    /**
     *if need to short match the content
     */
    boolean trim();

    /**
     * set current result
     * @param result
     */
    void setCurrentRowAnalysisResult(Object result);


    /**
     * get current result
     * @return  get current result
     */
    Object getCurrentRowAnalysisResult();

    /**
     * Interrupt execution
     */
    void interrupt();

    /**
     *  date use1904WindowDate
     */
    boolean  use1904WindowDate();

    /**
     * date use1904WindowDate
     */
    void setUse1904WindowDate(boolean use1904WindowDate);
}
