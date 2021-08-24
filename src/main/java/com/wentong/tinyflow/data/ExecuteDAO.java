package com.wentong.tinyflow.data;

import com.wentong.tinyflow.metadata.WorkflowDef;

public interface ExecuteDAO {

    WorkflowDef getWorkflowDef(String id);

    void saveWorkflowDef(String id, WorkflowDef workflowDef);

}
