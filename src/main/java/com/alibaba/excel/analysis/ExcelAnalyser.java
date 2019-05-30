package com.alibaba.excel.analysis;

import com.alibaba.excel.metadata.Sheet;

import java.util.List;

/**
 * Excel file analyser
 */
public interface ExcelAnalyser {

    /**
     * parse one sheet
     */
    void analysis(Sheet sheetParam);

    /**
     * parse all sheets
     */
    void analysis();

    /**
     * get all sheet of workbook
     */
    List<Sheet> getSheets();

}
