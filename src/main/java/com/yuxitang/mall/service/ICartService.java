package com.yuxitang.mall.service;

import com.yuxitang.mall.form.CartAddForm;
import com.yuxitang.mall.form.CartUpdateForm;
import com.yuxitang.mall.pojo.Cart;
import com.yuxitang.mall.vo.CartVo;
import com.yuxitang.mall.vo.ResponseVo;

import java.util.List;

/**
 * Created by 廖师兄
 */
public interface ICartService {

    ResponseVo<CartVo> add(Integer uid, CartAddForm form);

    ResponseVo<CartVo> list(Integer uid);

    ResponseVo<CartVo> update(Integer uid, Integer productId, CartUpdateForm form);

    ResponseVo<CartVo> delete(Integer uid, Integer productId);

    ResponseVo<CartVo> selectAll(Integer uid);

    ResponseVo<CartVo> unSelectAll(Integer uid);

    ResponseVo<Integer> sum(Integer uid);

    List<Cart> listForCart(Integer uid);
}
