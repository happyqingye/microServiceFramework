package com.eureka.client.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.eureka.client.object.MetricRetObject;

@Repository
@Mapper
public interface MetricInfoDao {

	public MetricRetObject queryMetricInfoById(String id);

	public List<MetricRetObject> queryAllOfMetricInfo();
}
