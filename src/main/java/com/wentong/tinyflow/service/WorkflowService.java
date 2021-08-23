package com.wentong.tinyflow.service;

import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class WorkflowService {

    @Autowired
    private RedisTemplate redisTemplate;

    public String getById(@NonNull String id) {
        return (String) redisTemplate.opsForValue().get(id);
    }
}
