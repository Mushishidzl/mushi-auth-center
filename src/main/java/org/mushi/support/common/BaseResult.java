package org.mushi.support.common;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.mushi.support.common.constant.CommonConstants;

import java.io.Serializable;

/**
 * @ClassName: BaseResult
 * @Description: 响应的基础实体
 * @Author: mushishi
 * @Date: 2019/11/14 17:31
 * @Version: V1.0
 **/
@Data
@ToString
@Accessors(chain = true)
public class BaseResult<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 返回的状态码
     */
    @Getter
    @Setter
    private int code;

    /**
     * 返回的消息描述
     */
    @Getter
    @Setter
    private String msg;

    /**
     * 返回的实体
     */
    @Getter
    @Setter
    private T data;


    public static <T> BaseResult<T> ok() {
        return restResult(null, CommonConstants.SUCCESS, null);
    }

    public static <T> BaseResult<T> ok(T data) {
        return restResult(data, CommonConstants.SUCCESS, null);
    }

    public static <T> BaseResult<T> ok(T data, String msg) {
        return restResult(data, CommonConstants.SUCCESS, msg);
    }

    public static <T> BaseResult<T> failed() {
        return restResult(null, CommonConstants.FAIL, null);
    }

    public static <T> BaseResult<T> failed(String msg) {
        return restResult(null, CommonConstants.FAIL, msg);
    }

    public static <T> BaseResult<T> failed(T data) {
        return restResult(data, CommonConstants.FAIL, null);
    }

    public static <T> BaseResult<T> failed(T data, String msg) {
        return restResult(data, CommonConstants.FAIL, msg);
    }

    private static <T> BaseResult<T> restResult(T data, int code, String msg) {
        BaseResult<T> apiResult = new BaseResult<>();
        apiResult.setCode(code);
        apiResult.setData(data);
        apiResult.setMsg(msg);
        return apiResult;
    }


}
