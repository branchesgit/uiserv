package com.hqjll.uiserv.common;

import com.hqjll.uiserv.exception.DefinitionException;
import com.hqjll.uiserv.exception.ErrorEnum;

public class ResultContent<T> {
    private int code;

    private String status;

    private T result;

    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public static <T> ResultContent<T> createSuccess(T result) {
        ResultContent<T> resultContent = new ResultContent<>();
        resultContent.setCode(0);
        resultContent.setStatus("success");
        resultContent.setResult(result);
        return resultContent;
    }


    public static <T> ResultContent<T> defineError(DefinitionException de) {
        ResultContent<T> result = new ResultContent<T>();
        result.setResult(null);
        result.setCode(de.getErrorCode());
        result.setMsg(de.getErrorMsg());
        return result;
    }

    //其他异常处理方法返回的结果
    public static ResultContent otherError(ErrorEnum errorEnum){
        ResultContent result = new ResultContent();
        result.setMsg(errorEnum.getErrorMsg());
        result.setCode(errorEnum.getErrorCode());
        result.setResult(null);
        return result;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}
