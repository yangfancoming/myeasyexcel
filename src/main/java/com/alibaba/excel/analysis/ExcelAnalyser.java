package com.alibaba.excel.analysis;

import com.alibaba.excel.metadata.Sheet;

import java.util.List;

/** * excel 文件解析器 */
public interface ExcelAnalyser {

    /** * 解析单页 sheet  */
    void analysis(Sheet sheetParam);

    /** * 解析所有 sheet  */
    void analysis();

    /** * 获取 excel 所有  sheet  */
    List<Sheet> getSheets();
}
