package com.taotao.service.imp;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.EUDateGridResult;
import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemExample;
import com.taotao.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 商品管理
 */
@Service
public class ItemServiceImp implements ItemService {

    @Autowired
    private TbItemMapper itemMapper;

    @Override
    public TbItem getItemById(Long itemId) {

        /*按照条件查询的方法，如果tbItemExample中的属性为空，则默认查询所有
            TbItemExample tbItemExample = new TbItemExample();
            //创建查询条件
        TbItemExample.Criteria criteria = tbItemExample.createCriteria();
        criteria.andIdEqualTo(itemId);
        List<TbItem> tbItems = itemMapper.selectByExample(tbItemExample);
        */
        System.out.println(itemId);
        TbItem tbItem = this.itemMapper.selectByPrimaryKey(itemId);

        return tbItem;
    }

    @Override
    public EUDateGridResult getItemList(Integer page, Integer rows) {
        TbItemExample example = new TbItemExample();
        PageHelper.startPage(page,rows);
        List<TbItem> tbItems = itemMapper.selectByExample(example);
        EUDateGridResult euDateGridResult = new EUDateGridResult(new PageInfo<>(tbItems).getTotal(), tbItems);
        return euDateGridResult;
    }
}
