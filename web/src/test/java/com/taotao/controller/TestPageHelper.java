package com.taotao.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemExample;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * 测试分页
 */
public class TestPageHelper {

    @Test
    public void testPageHelper(){
        //创建spring容器
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
        TbItemMapper bean = context.getBean(TbItemMapper.class);
        TbItemExample tbItemExample = new TbItemExample();
        //分页
        PageHelper.startPage(1,10);
        List<TbItem> tbItems = bean.selectByExample(tbItemExample);
        for (TbItem item :tbItems) {
            System.out.println(item.getId() );
        }
        //取分页信息
        PageInfo<TbItem>   pageInfo = new PageInfo<>(tbItems);
        long total = pageInfo.getTotal();
        System.out.println(total);


    }

}
