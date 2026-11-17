package com.klef.soa.exam.service;

import java.util.List;

import com.klef.soa.exam.entity.WebsiteMaintenancePlanEntity;

public interface WebsiteMaintenancePlanService {

    WebsiteMaintenancePlanEntity addPlan(WebsiteMaintenancePlanEntity plan);

    List<WebsiteMaintenancePlanEntity> displayAll();
}
