package com.yuxitang.mall.service;

import com.yuxitang.mall.vo.CategoryVo;
import com.yuxitang.mall.vo.ResponseVo;

import java.util.List;

/**
 * Created by yuxitang
 */
public interface ICategoryService {

    ResponseVo<List<CategoryVo>> selectAll();
}
