package com.ricardo.nova.core;

import com.ricardo.nova.exception.DBProcException;
import com.ricardo.nova.exception.ServiceException;

public class JsonData {


    private boolean success;
    private String message;
    private Object data;
    private int total;

    /**
     * 创建正常结果.
     */
    public <T extends JsonData> T buildSuccessResult() {
        return this.buildSuccessResult(null);
    }

    /**
     * 创建正常结果.
     */
    @SuppressWarnings("unchecked")
    public <T extends JsonData> T buildSuccessResult(Object resultData) {
        success = true;
        message = "";
        data = resultData;
        return (T) this;
    }

    /**
     * 创建查询结果为list的正常结果(分页)
     */
    @SuppressWarnings("unchecked")
    public <T extends JsonData> T buildSuccessResult(Object resultData, int totalCount) {
        success = true;
        message = "";
        data = resultData;
        total = totalCount;
        return (T) this;
    }

    /**
     * 创建查询结果为list的正常结果(分页)
     */
    @SuppressWarnings("unchecked")
    public <T extends JsonData> T buildSuccessResult(Object resultData, long totalCount) {
        success = true;
        message = "";
        data = resultData;
        total = Long.valueOf(totalCount).intValue();
        return (T) this;
    }

    /**
     * 创建异常结果
     * @param e
     * @return
     */
    @SuppressWarnings("unchecked")
    public <T extends JsonData> T buildErrorResult(String message) {
        success = false;
        this.message = message;
        return (T)this;
    }

    /**
     * 创建异常结果
     * @param e
     * @return
     */
    @SuppressWarnings("unchecked")
    public <T extends JsonData> T buildErrorResult(Throwable e) {
        success = false;
        if (e instanceof ServiceException ||
                e instanceof DBProcException) {
            message = e.getMessage();
        } else {
            message = e.getMessage();
        }
        return (T)this;
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
