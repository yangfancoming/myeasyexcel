package com.alibaba.excel.event;

/***  事件中心 */
public interface AnalysisEventRegisterCenter {

    /**
     *  添加监听器
     * @param name    监听器名称
     * @param listener Callback method after each row is parsed.
     */
    void appendLister(String name, AnalysisEventListener listener);

    /**
     * Parse one row to notify all event listeners
     * @param event parse event
     */
    void notifyListeners(OneRowAnalysisFinishEvent event);

    /***  清空所有监听者 */
    void cleanAllListeners();
}
