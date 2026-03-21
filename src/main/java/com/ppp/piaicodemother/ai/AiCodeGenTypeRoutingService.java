package com.ppp.piaicodemother.ai;


import com.ppp.piaicodemother.model.enums.CodeGenTypeEnum;
import dev.langchain4j.service.SystemMessage;


/**
 * @author 皮皮皮
 * @date 2026-03-20 16:30
 */
public interface AiCodeGenTypeRoutingService {

    /**
     * 根据用户需求智能选择代码生成类型
     *
     * @param userPrompt 用户输入的需求描述
     * @return 推荐的代码生成类型
     */
    @SystemMessage(fromResource = "prompt/codegen-routing-system-prompt.txt")
    CodeGenTypeEnum routeCodeGenType(String userPrompt);
}
