package com.yuxitang.mall.form;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * Created by yuxitang
 */
@Data
public class UserLoginForm {

    @NotBlank
    private String username;

    @NotBlank
    private String password;
}