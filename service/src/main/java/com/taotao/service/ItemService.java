package com.taotao.service;

import com.taotao.pojo.EUDateGridResult;
import com.taotao.pojo.TbItem;

/**
 * 商品管理
 */
public interface ItemService {
    /**
     * 根据id查询商品
     * @param itemId
     * @return TbItem
     */
    TbItem getItemById(Long itemId);

    /**
     * 获取商品列表
     * @param page
     * @param rows
     * @return
     */
    EUDateGridResult getItemList(Integer page,Integer rows);

}
