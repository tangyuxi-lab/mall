package com.yuxitang.mall.form;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * Created by yuxitang
 */
@Data
public class OrderCreateForm {

    @NotNull
    private Integer shippingId;
}