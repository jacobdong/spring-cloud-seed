package com.ifireye.cloud.common;


import lombok.Data;

/**
 * Created by jacobdong on 15/8/18.
 *
 * @author jacobdong
 */
@Data
public class JsonResponse<T> {

    protected T data;
    protected String code;
    protected String message;


    public JsonResponse() {
        //保留空构造方法
    }


    public JsonResponse(T data) {
        this.code = ServiceFeedbackEnum.SERVICE_INVOKE_SUCCESS.name();
        this.message = ServiceFeedbackEnum.SERVICE_INVOKE_SUCCESS.getMessage();
        this.data = data;
    }
}
