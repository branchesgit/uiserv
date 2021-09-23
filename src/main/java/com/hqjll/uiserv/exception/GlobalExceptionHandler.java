package com.hqjll.uiserv.exception;


import com.hqjll.uiserv.common.ResultContent;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {
    /**
     * 处理自定义异常
     *
     */
    @ExceptionHandler(value = DefinitionException.class)
    @ResponseBody
    public ResultContent bizExceptionHandler(DefinitionException e) {
        return ResultContent.defineError(e);
    }

    /**
     * 处理其他异常
     *
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ResultContent exceptionHandler(Exception e) {
        return ResultContent.otherError(ErrorEnum.INTERNAL_SERVER_ERROR);
    }
}
