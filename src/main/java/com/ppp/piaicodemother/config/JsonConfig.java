package com.ppp.piaicodemother.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import org.springframework.boot.jackson.JsonComponent;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

/**
 * Spring MVC Json 配置
 */
@JsonComponent
public class JsonConfig {

    /**
     * 添加 Long 转 json 精度丢失的配置,id超过16位在浏览器预览里面会精度丢失
     */
    /**
     *
     * 在测试中，如果打开F12开发者工具，利用预览来查看响应数据，就会发现一个问题: id的最后两位好像都变成0了!
     * 但是在响应中、以及Swagger 中查看，却是正常的:
     * 这是由于前端JS的精度范围有限，后端返回的id范围过大，导致前端解析JSON时出现精度丢失，会影响前端页面获取到的数据结果。
     */
    @Bean
    public ObjectMapper jacksonObjectMapper(Jackson2ObjectMapperBuilder builder) {
        ObjectMapper objectMapper = builder.createXmlMapper(false).build();
        SimpleModule module = new SimpleModule();
        module.addSerializer(Long.class, ToStringSerializer.instance);
        module.addSerializer(Long.TYPE, ToStringSerializer.instance);
        objectMapper.registerModule(module);
        return objectMapper;
    }
}
