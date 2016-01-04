package com.hhjr.fs.dao;

import com.hhjr.fs.entity.WebSecCode;
import com.hhjr.fs.entity.WebSecCodeCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WebSecCodeMapper {
    int countByExample(WebSecCodeCriteria example);

    int deleteByExample(WebSecCodeCriteria example);

    int deleteByPrimaryKey(Integer seqNo);

    int insert(WebSecCode record);

    int insertSelective(WebSecCode record);

    List<WebSecCode> selectByExample(WebSecCodeCriteria example);

    WebSecCode selectByPrimaryKey(Integer seqNo);

    int updateByExampleSelective(@Param("record") WebSecCode record, @Param("example") WebSecCodeCriteria example);

    int updateByExample(@Param("record") WebSecCode record, @Param("example") WebSecCodeCriteria example);

    int updateByPrimaryKeySelective(WebSecCode record);

    int updateByPrimaryKey(WebSecCode record);
}