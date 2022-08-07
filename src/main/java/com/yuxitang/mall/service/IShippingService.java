package com.yuxitang.mall.service;

import com.github.pagehelper.PageInfo;
import com.yuxitang.mall.form.ShippingForm;
import com.yuxitang.mall.vo.ResponseVo;

import java.util.Map;

/**
 * Created by yuxitang
 */
public interface IShippingService {

    ResponseVo<Map<String, Integer>> add(Integer uid, ShippingForm form);

    ResponseVo delete(Integer uid, Integer shippingId);

    ResponseVo update(Integer uid, Integer shippingId, ShippingForm form);

    ResponseVo<PageInfo> list(Integer uid, Integer pageNum, Integer pageSize);
}
