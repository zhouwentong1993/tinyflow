package com.wentong.tinyflow.metadata;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class WorkflowDef {
    private String id;
    private String name;
    private String desc;
    private List<TaskDef> tasks;
    private Date createTime;
    private Date updateTime;
}
