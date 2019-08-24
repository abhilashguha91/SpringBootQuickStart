package com.demo.springboot.starter.entity;

public class Topic {
	
	Long topicId;
	String topicName;
	String topicDesc;
	
	public Topic() {
		
	}
	
	public Topic(Long topicId, String topicName, String topicDesc) {
		this.topicId = topicId;
		this.topicName = topicName;
		this.topicDesc = topicDesc;
	}
	
	public Long getTopicId() {
		return topicId;
	}
	public void setTopicId(Long topicId) {
		this.topicId = topicId;
	}
	public String getTopicName() {
		return topicName;
	}
	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}
	public String getTopicDesc() {
		return topicDesc;
	}
	public void setTopicDesc(String topicDesc) {
		this.topicDesc = topicDesc;
	}

}
