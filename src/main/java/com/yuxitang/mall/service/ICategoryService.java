package com.yuxitang.mall.service;

import com.yuxitang.mall.vo.CategoryVo;
import com.yuxitang.mall.vo.ResponseVo;

import java.util.List;
import java.util.Set;

/**
 * Created by yuxitang
 */
public interface ICategoryService {

    ResponseVo<List<CategoryVo>> selectAll();

    void findSubCategoryId(Integer id, Set<Integer> resultSet);
}
