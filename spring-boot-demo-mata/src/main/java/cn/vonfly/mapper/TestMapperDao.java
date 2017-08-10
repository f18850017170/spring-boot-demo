package cn.vonfly.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface TestMapperDao {
    @Select("select MEMBER_NAME from t_template_ms_channel_member where ID=#{id} ")
    public String queryNameById(Long id);
}
