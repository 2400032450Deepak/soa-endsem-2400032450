package com.klef.soa.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klef.soa.exam.entity.WebsiteMaintenancePlanEntity;
import com.klef.soa.exam.service.WebsiteMaintenancePlanService;

@RestController
@RequestMapping("/WebsiteMaintenancePlan")
public class WebsiteMaintenancePlanController {

    @Autowired
    private WebsiteMaintenancePlanService service;

    @PostMapping("/Add")
    public WebsiteMaintenancePlanEntity addPlan(@RequestBody WebsiteMaintenancePlanEntity plan) {
        return service.addPlan(plan);
    }

    @GetMapping("/DisplayAll")
    public List<WebsiteMaintenancePlanEntity> displayAll() {
        return service.displayAll();
    }
}
