package com.ifireye.cloud.common;

/**
 * @Author: JacobDong
 * @Date: 2018/4/22 21:28
 */
public enum ServiceFeedbackEnum {

    SERVICE_INVOKE_SUCCESS("内部服务调用成功");

    private String message;

    ServiceFeedbackEnum(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
