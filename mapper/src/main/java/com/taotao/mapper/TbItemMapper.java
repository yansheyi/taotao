package com.taotao.mapper;

import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbItemMapper {
    int countByExample(TbItemExample example);

    int deleteByExample(TbItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbItem record);

    int insertSelective(TbItem record);

    /**
     * 按照条件查询的方法，如果example中的属性为空，则默认查询所有
     * @param example
     * @return
     */
    List<TbItem> selectByExample(TbItemExample example);

    TbItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbItem record, @Param("example") TbItemExample example);

    int updateByExample(@Param("record") TbItem record, @Param("example") TbItemExample example);

    int updateByPrimaryKeySelective(TbItem record);

    int updateByPrimaryKey(TbItem record);
}