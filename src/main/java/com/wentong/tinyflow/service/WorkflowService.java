package com.wentong.tinyflow.service;

import com.wentong.tinyflow.data.ExecuteDAO;
import com.wentong.tinyflow.metadata.WorkflowDef;
import lombok.NonNull;
import org.springframework.stereotype.Service;

@Service
public class WorkflowService {

    private final ExecuteDAO executeDAO;

    public WorkflowService(ExecuteDAO executeDAO) {
        this.executeDAO = executeDAO;
    }

    public WorkflowDef getById(@NonNull String id) {
        return executeDAO.getWorkflowDef(id);
    }


    public String save(WorkflowDef workflowDef) {
        executeDAO.saveWorkflowDef(workflowDef.getId(), workflowDef);
        return workflowDef.getId();
    }
}
