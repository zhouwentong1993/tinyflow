package com.wentong.tinyflow.controller;

import com.alibaba.fastjson.JSON;
import com.wentong.tinyflow.service.WorkflowService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("workflow")
public class WorkflowController {

    private final WorkflowService workflowService;

    public WorkflowController(WorkflowService workflowService) {
        this.workflowService = workflowService;
    }

    @GetMapping("/{id}")
    public String getWorkflow(@PathVariable String id) {
        return JSON.toJSONString(workflowService.getById(id));
    }
}
