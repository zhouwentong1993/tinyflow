package com.wentong.tinyflow.data;

import cn.hutool.core.text.CharSequenceUtil;
import com.wentong.tinyflow.metadata.WorkflowDef;
import org.springframework.stereotype.Component;

@Component
public class RedisExecuteDAO implements ExecuteDAO {

    private final RedissonSupport<WorkflowDef> redissonSupport;

    public RedisExecuteDAO(RedissonSupport<WorkflowDef> redissonSupport) {
        this.redissonSupport = redissonSupport;
    }

    @Override
    public WorkflowDef getWorkflowDef(String id) {
        return redissonSupport.get(id);
    }

    @Override
    public void saveWorkflowDef(String id, WorkflowDef workflowDef) {
        if (CharSequenceUtil.isBlank(id)) {
            id = workflowDef.getId();
        }
        redissonSupport.save(id, workflowDef);
    }
}
