package com.alibaba.excel;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;

import java.util.List;

/**
 * Created by 64274 on 2019/5/30.
 *
 * @ Description: new AnalysisEventListener()
 * @ author  山羊来了
 * @ date 2019/5/30---13:03
 */
public class MyAnalysisEventListener extends AnalysisEventListener {

    private List<Object> rows;

    public MyAnalysisEventListener(List<Object> rows) {
        this.rows = rows;
    }

    @Override
    public void invoke(Object object, AnalysisContext context) {
        System.out.println("invoke..........");
        rows.add(object);
    }


    @Override
    public void doAfterAllAnalysed(AnalysisContext context) {
        System.out.println("doAfterAllAnalysed..........");
    }
}
