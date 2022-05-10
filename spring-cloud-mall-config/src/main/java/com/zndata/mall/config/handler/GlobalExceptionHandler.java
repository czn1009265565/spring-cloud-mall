package com.zndata.mall.config.handler;

import com.zndata.mall.common.exception.BusinessException;
import com.zndata.mall.common.vo.ResponseVO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(BusinessException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public ResponseVO handleUserNotExistsException(BusinessException e) {
        return ResponseVO.error(e.getCode(), e.getMsg());
    }
}