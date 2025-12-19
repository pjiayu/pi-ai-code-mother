package com.ppp.piaicodemother.model.dto.user;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 皮皮皮
 * @date 2025-12-17 21:10
 */
@Data
public class UserRegisterRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 账号
     */
    private String userAccount;

    /**
     * 密码
     */
    private String userPassword;

    /**
     * 确认密码
     */
    private String checkPassword;
}

