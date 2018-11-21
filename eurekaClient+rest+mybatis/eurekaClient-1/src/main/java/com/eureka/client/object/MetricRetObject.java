package com.eureka.client.object;

public class MetricRetObject {

	private String id;
	private String metricId;
	private String reporterIp;
	private String serviceName;
	private String container;
	private String catalogLv1;
	private String catalogLv2;
	private String catalogLv3;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMetricId() {
		return metricId;
	}

	public void setMetricId(String metricId) {
		this.metricId = metricId;
	}

	public String getReporterIp() {
		return reporterIp;
	}

	public void setReporterIp(String reporterIp) {
		this.reporterIp = reporterIp;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getContainer() {
		return container;
	}

	public void setContainer(String container) {
		this.container = container;
	}

	public String getCatalogLv1() {
		return catalogLv1;
	}

	public void setCatalogLv1(String catalogLv1) {
		this.catalogLv1 = catalogLv1;
	}

	public String getCatalogLv2() {
		return catalogLv2;
	}

	public void setCatalogLv2(String catalogLv2) {
		this.catalogLv2 = catalogLv2;
	}

	public String getCatalogLv3() {
		return catalogLv3;
	}

	public void setCatalogLv3(String catalogLv3) {
		this.catalogLv3 = catalogLv3;
	}

	@Override
	public String toString() {
		return "MetricRetObject [id=" + id + ", metricId=" + metricId + ", reporterIp=" + reporterIp + ", serviceName="
				+ serviceName + ", container=" + container + ", catalogLv1=" + catalogLv1 + ", catalogLv2=" + catalogLv2
				+ ", catalogLv3=" + catalogLv3 + "]";
	}

}
