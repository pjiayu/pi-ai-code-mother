package com.ppp.piaicodemother.service;

/**
 * @author 皮皮皮
 * @date 2026/3/20 18:07
 */
/**
 * 截图服务
 */
public interface ScreenshotService {


    /**
     * 通用的截图服务，可以得到访问地址
     *
     * @param webUrl 网址
     * @return
     */
    String generateAndUploadScreenshot(String webUrl);

}
