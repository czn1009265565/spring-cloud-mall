package com.zndata.mall.common.vo;


import lombok.Data;

@Data
public class ResponseVO<T> {
    private Integer code;

    private String message;

    private T data;

    public ResponseVO(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
