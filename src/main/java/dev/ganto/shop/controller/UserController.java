package dev.ganto.shop.controller;

import dev.ganto.shop.entity.Login;
import dev.ganto.shop.entity.Order;
import dev.ganto.shop.entity.User;
import dev.ganto.shop.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/")
    public String init() {
        return "接口访问正常";
    }

    // 获取全部用户信息
    @GetMapping("/user")
    public List<User> query() {
        return userMapper.query();
    }

    // 登录
    @PostMapping("/login")
    public Map login(String username, String password) {
        List<Login> data = userMapper.login(username, password);
        System.out.println(data.size());
        if(data.size() == 0) {
            Map map = new HashMap();
            map.put("code", 204);
            map.put("msg", "无数据");
            return map;
        }else{
            Map map = new HashMap();
            map.put("id", data.get(0).getId());
            map.put("username", data.get(0).getUsername());
            Map map1 = new HashMap();
            map1.put("code", 200);
            map1.put("msg", "请求数据成功");
            map1.put("data", map);
            return map1;
        }
    }

    // 根据账号信息查订单
    @GetMapping("/user/order")
    public Map order(int id) {
        List<Order> data = userMapper.order(id);
        if(data.size() == 0) {
            Map map = new HashMap();
            map.put("code", 204);
            map.put("msg", "无数据");
            return map;
        }else{
            Map map = new HashMap();
            map.put("code", 200);
            map.put("msg", "请求数据成功");
            map.put("data", data);
            return map;
        }
    }
}
