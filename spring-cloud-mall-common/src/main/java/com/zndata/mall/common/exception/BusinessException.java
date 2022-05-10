package com.zndata.mall.common.exception;

import com.zndata.mall.common.enums.ResultEnum;
import lombok.Getter;

@Getter
public class BusinessException extends RuntimeException {

    private Integer code;
    private String msg;

    public BusinessException(Integer code, String msg) {
        super(msg);
        this.code = code;
        this.msg = msg;
    }

    public BusinessException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
        this.msg = resultEnum.getMsg();
    }
}
