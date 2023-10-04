package dev.ganto.shop.mapper;

import dev.ganto.shop.entity.Login;
import dev.ganto.shop.entity.Order;
import dev.ganto.shop.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
    // 获取全部用户信息
    @Select("select id, username from t_user")
    List<User> query();

    // 登录
    @Select("select id, username from t_user where username=#{username} and password=#{password}")
    List<Login> login(String username, String password);

    // 根据账号信息查询订单
    @Select("select * from t_order where uid=#{id} order by id desc")
    List<Order> order(int id);
}
