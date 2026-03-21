package com.ppp.piaicodemother.ai.model.message;

import dev.langchain4j.agent.tool.ToolExecutionRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 工具调用消息
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class ToolRequestMessage extends StreamMessage {

    private String id;

    private String name;

    private String arguments;

    public ToolRequestMessage(ToolExecutionRequest toolExecutionRequest) {
        super(StreamMessageTypeEnum.TOOL_REQUEST.getValue());
        this.id = toolExecutionRequest.id();
        this.name = toolExecutionRequest.name();
        this.arguments = toolExecutionRequest.arguments();
    }
    /**
     *  tool的请求和响应的jaon格式：
     *    {
     *     "toolExecutionRequests": [
     *       {
     *         "id": "call_00_fkWYiXWWD7SPcon0x0G0AuaS",
     *         "name": "writeFile",
     *         "arguments": "{\"relativeFilePath\": \"index.html\", \"content\": \"<!DOCTYPE html>\\n<html lang=\\\"zh-CN\\\">\\n<head>\\n  <meta charset=\\\"UTF-8\\\">\\n  <meta name=\\\"viewport\\\" content=\\\"width=device-width, initial-scale=1.0\\\">\\n  <title>任务记录管理</title>\\n</head>\\n<body>\\n  <div id=\\\"app\\\"></div>\\n  <script type=\\\"module\\\" src=\\\"/src/main.js\\\"></script>\\n</body>\\n</html>\"}"
     *       }
     *     ],
     *     "type": "AI"
     *   },
     *   {
     *     "id": "call_00_fkWYiXWWD7SPcon0x0G0AuaS",
     *     "toolName": "writeFile",
     *     "text": "文件写入成功: index.html",
     *     "type": "TOOL_EXECUTION_RESULT"
     *   },
     */
}
