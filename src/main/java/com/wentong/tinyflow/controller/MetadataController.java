package com.wentong.tinyflow.controller;

import com.wentong.tinyflow.metadata.WorkflowDef;
import com.wentong.tinyflow.service.WorkflowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("metadata")
public class MetadataController {

    @Autowired
    private WorkflowService workflowService;

    @PostMapping("workflow")
    public String addWorkflow(@RequestBody WorkflowDef workflowDef) {
        return workflowService.save(workflowDef);
    }

}
