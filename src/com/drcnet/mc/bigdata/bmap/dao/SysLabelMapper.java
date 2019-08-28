package com.drcnet.mc.bigdata.bmap.dao;

import com.drcnet.mc.bigdata.bmap.entity.SysLabel;

public interface SysLabelMapper {
    int deleteByPrimaryKey(Integer labelId);

    int insert(SysLabel record);

    int insertSelective(SysLabel record);

    SysLabel selectByPrimaryKey(Integer labelId);

    int updateByPrimaryKeySelective(SysLabel record);

    int updateByPrimaryKey(SysLabel record);
}