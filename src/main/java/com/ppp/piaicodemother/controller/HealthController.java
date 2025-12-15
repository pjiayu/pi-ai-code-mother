package com.ppp.piaicodemother.controller;

import com.ppp.piaicodemother.common.BaseResponse;
import com.ppp.piaicodemother.common.ResultUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 皮皮皮
 * @date 2025-12-15 15:39
 */
@RestController
@RequestMapping("/health")
public class HealthController {

    @GetMapping("/")
    public BaseResponse<String> healthCheck() {
        return ResultUtils.success("OK");
    }
}
