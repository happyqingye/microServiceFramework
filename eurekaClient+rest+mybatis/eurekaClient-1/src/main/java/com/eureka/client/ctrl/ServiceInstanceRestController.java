package com.eureka.client.ctrl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eureka.client.object.MetricRetObject;
import com.eureka.client.service.BizService;

@RestController
public class ServiceInstanceRestController {

	@Autowired
    private DiscoveryClient discoveryClient;
	@Autowired
	private Environment env;
	
	@Autowired
	private BizService bizService; 
 
    @RequestMapping("/service-instances/{applicationName}")
    @LoadBalanced	
    public List<ServiceInstance> serviceInstancesByApplicationName(
            @PathVariable String applicationName) {
    	MetricRetObject metricRetObject = bizService.getMetricInfo(applicationName);
    	if(metricRetObject!= null) {
    		System.out.println("sql query is success!");
    	}
        return this.discoveryClient.getInstances(applicationName);
    }
    
	@RequestMapping("/")
	public String home() {
		
		List<MetricRetObject> metricInfoList = new ArrayList<MetricRetObject>();
		metricInfoList = bizService.getAllOfMetricInfo();
		// This is useful for debugging
		// When having multiple instance of gallery service running at different ports.
		// We load balance among them, and display which instance received the request.
		return "Hello from Gallery Service running at port: " + env.getProperty("local.server.port");
	}
	
	// -------- Admin Area --------
	// This method should only be accessed by users with role of 'admin'
	// We'll add the logic of role based auth later
	@RequestMapping("/admin")
	public String homeAdmin() {
		return "This is the admin area of Gallery service running at port: " + env.getProperty("local.server.port");
	}
}
