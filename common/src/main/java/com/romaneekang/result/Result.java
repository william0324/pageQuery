package com.romaneekang.result;


import com.romaneekang.constant.CodeConstant;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 后端返回统一结果
 * @param <T>   返回数据类型
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result<T> implements Serializable {
    private Integer code;   //编码
    private String message; //返回消息
    private T data; //返回给前端的数据

    /**
     * 返回的Result中只封装了成功状态码
     * @return result
     * @param <T> data类型
     */
    public static <T> Result<T> ok() {
        return new Result<T>(CodeConstant.CODE_OK,null,null);
    }

    /**
     * 返回的Result中封装了成功状态码和响应信息
     * @param message 信息
     * @return result
     * @param <T> data类型
     */
    public static <T> Result<T> ok(String message) {
        return new Result<T>(CodeConstant.CODE_OK,message,null);
    }

    /**
     *返回的Result中封装了成功状态码和响应数据
     * @param data 数据
     * @return result
     * @param <T> data类型
     */
    public static <T> Result<T> ok(T data) {
        return new Result<T>(CodeConstant.CODE_OK,null,data);
    }
    /**
     *返回的Result中封装了成功状态码和响应信息和响应数据
     * @param message 信息
     * @param data 数据
     * @return result
     * @param <T> data类型
     */
    public static <T> Result<T> ok(String message,T data) {
        return new Result<T>(CodeConstant.CODE_OK,message,data);
    }

    /**
     * 返回的Result中封装了失败状态码和响应信息
     * @param errCode 状态码
     * @param message 消息
     * @return result
     * @param <T> data类型
     */
    public static <T> Result<T> err(int errCode,String message) {
        return new Result<>(errCode,message,null);
    }
    /**
     * 返回的Result中封装了失败状态码和响应信息和响应数据
     * @param errCode 状态码
     * @param message 消息
     * @param data 数据
     * @return result
     * @param <T> data类型
     */
    public static <T> Result<T> err(int errCode,String message,T data) {
        return new Result<>(errCode,message,data);
    }
}
