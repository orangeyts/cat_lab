package io.spring2go.dao;

import io.spring2go.model.Ratings;
import io.spring2go.model.RatingsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RatingsMapper {
    long countByExample(RatingsExample example);

    int deleteByExample(RatingsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Ratings record);

    int insertSelective(Ratings record);

    List<Ratings> selectByExampleWithBLOBs(RatingsExample example);

    List<Ratings> selectByExample(RatingsExample example);

    Ratings selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Ratings record, @Param("example") RatingsExample example);

    int updateByExampleWithBLOBs(@Param("record") Ratings record, @Param("example") RatingsExample example);

    int updateByExample(@Param("record") Ratings record, @Param("example") RatingsExample example);

    int updateByPrimaryKeySelective(Ratings record);

    int updateByPrimaryKeyWithBLOBs(Ratings record);

    int updateByPrimaryKey(Ratings record);
}