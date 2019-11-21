package org.mushi.support.filter;

import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.access.ExceptionTranslationFilter;
import org.springframework.security.web.savedrequest.RequestCache;

/**
 * @ClassName: BaseExceptionTranslationFilter
 * @Description: 自定义异常拦截器
 * @Author: mushishi
 * @Date: 2019/11/20 15:22
 * @Version: V1.0
 **/
public class BaseExceptionTranslationFilter extends ExceptionTranslationFilter {


    public BaseExceptionTranslationFilter(AuthenticationEntryPoint authenticationEntryPoint) {
        super(authenticationEntryPoint);
    }

    public BaseExceptionTranslationFilter(AuthenticationEntryPoint authenticationEntryPoint, RequestCache requestCache) {
        super(authenticationEntryPoint, requestCache);
    }
}
