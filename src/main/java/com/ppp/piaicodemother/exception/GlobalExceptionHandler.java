package com.ppp.piaicodemother.exception;

import com.ppp.piaicodemother.common.BaseResponse;
import com.ppp.piaicodemother.common.ResultUtils;
import io.swagger.v3.oas.annotations.Hidden;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


/**
 * 全局异常处理器
 * 用于统一处理系统中抛出的各种异常，返回统一的错误响应格式
 */
@Hidden
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    /**
     * 处理业务异常
     * @param e 业务异常对象
     * @return 包含错误码和错误信息的BaseResponse
     */
    @ExceptionHandler(BusinessException.class)
    public BaseResponse<?> businessExceptionHandler(BusinessException e) {
        log.error("BusinessException", e);  // 记录业务异常日志
        return ResultUtils.error(e.getCode(), e.getMessage());  // 返回业务异常的错误信息
    }

    /**
     * 处理运行时异常
     * @param e 运行时异常对象
     * @return 包含系统错误码和错误信息的BaseResponse
     */
    @ExceptionHandler(RuntimeException.class)
    public BaseResponse<?> runtimeExceptionHandler(RuntimeException e) {
        log.error("RuntimeException", e);  // 记录运行时异常日志
        return ResultUtils.error(ErrorCode.SYSTEM_ERROR, "系统错误");  // 返回系统错误信息
    }
}
