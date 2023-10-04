package dev.ganto.shop.mapper;

import dev.ganto.shop.entity.Order;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper {

    // 新增订单
    @Insert("insert into t_order (id, ordernumber, ordercontent, orderaddress, orderremarks, orderquantity, createtime, uid) values (#{id}, #{ordernumber}, #{ordercontent}, #{orderaddress}, #{orderremarks}, #{orderquantity}, #{createtime}, #{uid})")
    int addorder(Order order);

}
