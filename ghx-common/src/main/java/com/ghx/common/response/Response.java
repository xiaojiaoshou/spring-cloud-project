package com.ghx.common.response;

import com.ghx.common.errorcode.CommonErrorCode;
import lombok.Data;

import java.io.Serializable;

@Data
public class Response<T> implements Serializable {

    private static final long serialVersionUID = -8753088964955113861L;

    private Integer code;

    private String message;

    private T data;

    public Response() {
    }

    public Response(T data) {
        this.code = CommonErrorCode.SUCCESS_CODE;
        this.message = CommonErrorCode.SUCCESS_CODE_MESSAGE;
        this.data = data;
    }

    public Response(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Response(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }


    public static <T> Response<T> data(T data) {
        Response<T> response = new Response(data);
        return response;

    }

    public static <T> Response<T> data(T data, Integer code) {
        Response<T> response = new Response(data);
        response.setCode(code);
        return response;
    }

    public static <T> Response<T> data(T data, Integer code, String message) {
        Response<T> response = new Response(data);
        response.setCode(code);
        response.setMessage(message);
        return response;
    }


}
