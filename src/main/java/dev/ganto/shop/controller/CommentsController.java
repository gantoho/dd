package dev.ganto.shop.controller;

import dev.ganto.shop.entity.Comments;
import dev.ganto.shop.mapper.CommentsMapper;
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
public class CommentsController {

    @Autowired
    public CommentsMapper commentsMapper;

    // 查询所有评论
    @GetMapping("/comments")
    public List<Comments> query() {
        return commentsMapper.query();
    }

    // 新增评论
    @PostMapping("/addcomment")
    public Map insert(Comments comments) {
        System.out.println(comments + "============");
        int data = commentsMapper.addComments(comments);
        if(data == 1) {
            Map map = new HashMap();
            map.put("code", 200);
            map.put("msg", "评论成功");
            return map;
        }else{
            Map map = new HashMap();
            map.put("code", 204);
            map.put("msg", "评论失败");
            return map;
        }
    }
}
