package dev.ganto.shop.mapper;

import dev.ganto.shop.entity.Comments;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CommentsMapper {

    // 查询所有订单
    @Select("select id, content, publisher, createtime from t_comments order by id desc")
    List<Comments> query();

    // 新增评论
    @Insert("insert into t_comments (id, content, publisher, createtime) values (#{id}, #{content}, #{publisher}, #{createtime})")
    int addComments(Comments comments); // 这里是接口中的抽象方法，返回添加数据成功的个数
}
