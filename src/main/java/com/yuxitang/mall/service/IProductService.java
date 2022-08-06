package com.yuxitang.mall.service;

import com.github.pagehelper.PageInfo;
import com.yuxitang.mall.vo.ProductDetailVo;
import com.yuxitang.mall.vo.ResponseVo;

/**
 * Created by 廖师兄
 */
public interface IProductService {

    ResponseVo<PageInfo> list(Integer categoryId, Integer pageNum, Integer pageSize);

    ResponseVo<ProductDetailVo> detail(Integer productId);
}

