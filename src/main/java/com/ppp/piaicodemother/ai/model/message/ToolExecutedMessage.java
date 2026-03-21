package com.ppp.piaicodemother.ai.model.message;

import dev.langchain4j.service.tool.ToolExecution;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 工具执行结果消息
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class ToolExecutedMessage extends StreamMessage {

    private String id;

    private String name;

    private String arguments;

    private String result;

    /**
     *
     *
     */
    public ToolExecutedMessage(ToolExecution toolExecution) {
        super(StreamMessageTypeEnum.TOOL_EXECUTED.getValue());
        this.id = toolExecution.request().id();
        this.name = toolExecution.request().name();
        this.arguments = toolExecution.request().arguments();
        this.result = toolExecution.result();
    }
    /**
     * 参数是从tool-request里面拿的，尤其是请求参数，便于从tool结果集中拿到请求参数
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
