package com.parking.common.util;


import com.parking.common.Result;

/**
 * Created by wpg on 2017/7/19.
 */
public class ResultUtil {

    public static Result success() {
        return new Result().toSuccess();
    }

    public static Result success(String message) {
        return new Result(message).toSuccess();
    }

    public static Result success(Object data) {
        return new Result(data).toSuccess();
    }

    public static Result success(String message, Object data) {
        return new Result(200, message, data).toSuccess();
    }

    public static Result fail() {
        return new Result().toFail();
    }

    public static Result fail(String message) {
        return new Result(message).toFail();
    }

    public static Result fail(String message, Object data) {
        return new Result(400, message, data).toFail();
    }

    /**
     * @Author create by zoy at 2017/11/24 14:34
     * @Description 返回错误消息（验证信息）
     * @param message 错误提示
     * @param code 错误码；410：表单查重段；420：短信验证码类；430：短信，邮件发送类
     * @return
     */
    public static Result fail(String message, int code) {
        Result result = new Result();
        result.setCode(code);
        result.setMessage(message);
        result.setStatus("fail");
        return result;
    }

}
