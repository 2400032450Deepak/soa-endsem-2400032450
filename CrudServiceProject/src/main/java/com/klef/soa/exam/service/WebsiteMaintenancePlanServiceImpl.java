package com.klef.soa.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.soa.exam.entity.WebsiteMaintenancePlanEntity;
import com.klef.soa.exam.repository.WebsiteMaintenancePlanRepository;

@Service
public class WebsiteMaintenancePlanServiceImpl implements WebsiteMaintenancePlanService {

    @Autowired
    private WebsiteMaintenancePlanRepository repository;

    @Override
    public WebsiteMaintenancePlanEntity addPlan(WebsiteMaintenancePlanEntity plan) {
        return repository.save(plan);
    }

    @Override
    public List<WebsiteMaintenancePlanEntity> displayAll() {
        return repository.findAll();
    }
}
