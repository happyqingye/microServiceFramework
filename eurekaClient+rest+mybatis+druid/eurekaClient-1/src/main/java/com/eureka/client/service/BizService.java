package com.eureka.client.service;

import java.util.List;

import com.eureka.client.object.MetricRetObject;

public interface BizService {

	public MetricRetObject getMetricInfo(String id);
	
	public List<MetricRetObject> getAllOfMetricInfo(); 
}
