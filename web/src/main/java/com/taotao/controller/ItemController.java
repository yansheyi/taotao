package com.taotao.controller;

import com.taotao.pojo.EUDateGridResult;
import com.taotao.pojo.TbItem;
import com.taotao.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 商品管理Controller
 */
@Controller
public class ItemController {

    @Autowired
    private ItemService itemService;

    /**
     * 根据id获取单个的商品
     * @param itemId
     * @return
     */
    @RequestMapping("/item/{itemId}")
    @ResponseBody
    public TbItem getItemById(@PathVariable Long itemId){
        System.out.println("找到了方法了");
        TbItem tbItem = itemService.getItemById(itemId);
        return tbItem;
    }

    /**
     * 返回商品列表
     * @param page
     * @param rows
     * @return EUDateGridResult
     */
    @RequestMapping("/item/list")
    @ResponseBody
    public EUDateGridResult getItemList(Integer page,Integer rows){
        System.out.println("方法进入了");
        EUDateGridResult list = itemService.getItemList(page, rows);
        return list;
    }


}
