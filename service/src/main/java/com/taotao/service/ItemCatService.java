package com.taotao.service;

import com.taotao.pojo.TbItemCat;

import java.util.List;

/**
 * 商品选择
 */
public interface ItemCatService {

    /**
     * 获取商品东西
     * @return
     */
    List<TbItemCat> getItemCatList(Long parentId);


}
