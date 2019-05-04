package com.example.Redis;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "spring.redis.clusters.master")
@NoArgsConstructor
public class RedisConfigMaster extends RedisConfigBase{

}
