package com.talent.exception;

import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.WebRequest;

import java.util.Map;

/**
 * @author guobing
 * @Title: MyErrorAttributes
 * @ProjectName spring-boot-06-jdbc
 * @Description: 自定义页面贡献json数据
 * @date 2019/1/16下午2:19
 */
@Component
public class MyErrorAttributes extends DefaultErrorAttributes {

    /**
     * 最终页面上的数据都是通过在getErrorAttributes()方法中获取的
     * @param webRequest
     * @param includeStackTrace
     * @return
     */
    @Override
    public Map<String, Object> getErrorAttributes(WebRequest webRequest, boolean includeStackTrace) {
        Map<String, Object> map = super.getErrorAttributes(webRequest, includeStackTrace);
        map.put("company", "talent");
        // 0 表示request域
        Map<String, Object> ext = (Map<String, Object>) webRequest.getAttribute("ext", 0);
        map.put("ext", ext);
        return map;
    }
}
