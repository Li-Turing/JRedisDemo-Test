package com.example.demo;

import com.example.Redis.RedisConfigBak;
import com.example.Redis.RedisConfigMaster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("Home")
public class HomeController {
    @Resource(name = "clusters-master")
    private RedisTemplate<String, Object> template;

    @Autowired
    private RedisConfigMaster redisConfigMaster;

    @Autowired
    private RedisConfigBak redisConfigBak;

    @GetMapping("Index")
    public String Index() {

        template.opsForValue().set("aaaa","123");
        Object s=template.opsForValue().get("aaaa");
        //return this.redisConfigBak.getCommandTimeout()+"";
        if(s!=null)
        {
            return s.toString();
        }
        else
        {
            return "error";
        }
    }
}
