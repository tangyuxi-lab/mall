package com.yuxitang.mall;


import com.yuxitang.mall.dao.CategoryMapper;
import com.yuxitang.mall.pojo.Category;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MallApplicationTests {

    @Autowired
    CategoryMapper categoryMapper;
    @Test
    public void contextLoads() {
    }

}
