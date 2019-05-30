package com.alibaba.excel.event;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class OneRowAnalysisFinishEvent {

    private Object data;

    public OneRowAnalysisFinishEvent(Object content) {
        this.data = content;
    }

    public OneRowAnalysisFinishEvent(String[] content, int length) {
//         content = new String[]{"1","2","3"};
        System.out.println(content.length);
        if (content != null) {
            List<String> ls = new ArrayList<>(length);
            for (int i = 0; i <= length; i++) {
                ls.add(content[i]);
            }
//            Arrays.stream(content).forEach(s->ls.add(s));  doit 123
//            Arrays.stream(content).forEach(s ->System.out.println(s));
            data = ls;
        }
    }


    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
