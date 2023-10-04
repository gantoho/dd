package dev.ganto.shop.controller;

import dev.ganto.shop.entity.Order;
import dev.ganto.shop.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*")
public class OrderController {

    @Autowired
    public OrderMapper orderMapper;


    // 新增订单
    @PostMapping("/addorder")
    public Map insert(Order order) {
        int data = orderMapper.addorder(order);
        if(data == 1) {
            Map map = new HashMap();
            map.put("code", 200);
            map.put("msg", "订单提交成功");
            return map;
        }else{
            Map map = new HashMap();
            map.put("code", 204);
            map.put("msg", "订单提交失败");
            return map;
        }
    }
}
