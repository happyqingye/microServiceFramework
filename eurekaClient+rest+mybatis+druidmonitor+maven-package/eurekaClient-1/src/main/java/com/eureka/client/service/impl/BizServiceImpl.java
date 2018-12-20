package com.eureka.client.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eureka.client.dao.MetricInfoDao;
import com.eureka.client.object.MetricRetObject;
import com.eureka.client.service.BizService;

@Service
public class BizServiceImpl implements BizService {
	
	@Autowired
	private MetricInfoDao metricInfoDao;

	@Override
	public MetricRetObject getMetricInfo(String id) {
		return metricInfoDao.queryMetricInfoById(id);
	}

	@Override
	public List<MetricRetObject> getAllOfMetricInfo() {
		return metricInfoDao.queryAllOfMetricInfo();
	}

}
