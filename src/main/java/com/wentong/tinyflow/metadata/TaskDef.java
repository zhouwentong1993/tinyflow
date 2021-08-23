package com.wentong.tinyflow.metadata;

import lombok.Data;

@Data
public class TaskDef {
    private String id;
    private String name;
    private String desc;
    private boolean enableRetry;
    private int retryCount;
    private int retryInterval;
}
