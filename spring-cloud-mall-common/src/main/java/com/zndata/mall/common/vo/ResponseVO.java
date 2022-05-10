package com.zndata.mall.common.vo;


import com.zndata.mall.common.enums.ResultEnum;
import lombok.Data;

@Data
public class ResponseVO<T> {
    private Integer code;
    private String msg;
    private T data;

    public ResponseVO() {
    }

    public ResponseVO(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }


    public static <T> ResponseVO<T> success(T data) {
        return new ResponseVO<>(ResultEnum.SUCCESS.getCode(), ResultEnum.SUCCESS.getMsg(), data);
    }

    public static <T> ResponseVO<T> error(Integer code, String msg) {
        return new ResponseVO<>(code, msg, null);
    }
}
