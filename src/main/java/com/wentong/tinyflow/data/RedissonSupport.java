package com.wentong.tinyflow.data;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import lombok.NonNull;
import org.redisson.api.RBucket;
import org.redisson.api.RedissonClient;
import org.redisson.client.codec.Codec;
import org.redisson.client.codec.StringCodec;
import org.springframework.stereotype.Component;

@Component
public class RedissonSupport<T> {

    private static final Codec DEFAULT_CODEC = new StringCodec();

    private final RedissonClient redissonClient;

    public RedissonSupport(RedissonClient redissonClient) {
        this.redissonClient = redissonClient;
    }

    public String getString(@NonNull String id) {
        RBucket<String> bucket = redissonClient.getBucket(id, DEFAULT_CODEC);
        return bucket.get();
    }

    public T get(@NonNull String id) {
        RBucket<String> bucket = redissonClient.getBucket(id, DEFAULT_CODEC);
        return JSON.parseObject(bucket.get(), new TypeReference<T>() {
        });
    }

    public void save(String id, T t) {
        redissonClient.getBucket(id, DEFAULT_CODEC).set(t);
    }
}
