package com.demo.springboot.starter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.springboot.starter.entity.Topic;
import com.demo.springboot.starter.service.DemoSprintBootBusinessService;

@RestController
public class DemoSprintBootController {
	
	@Autowired
	DemoSprintBootBusinessService topicsService;
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		System.out.println("Inside Controller getAllTopics()");
		
		return topicsService.getAlltopic();
	}
	
	/*
	 * Sample URI and body
	 * http://localhost:7002/topics
	 * {
        "topicId": 101,
        "topicName": "Java",
        "topicDesc": "Java is the Most high level OOP Language."
    }
	 */
	
	@RequestMapping("/topics/{id}")
	public Topic getTopicsbyId(@PathVariable String id) {
		System.out.println("Inside Controller getTopicsbyId(): "+id);
		
		return topicsService.getTopicbyId(Long.parseLong(id));
	}
	
	@RequestMapping(method=RequestMethod.POST, value = "/topics")
	public List<Topic> postTopicsbyId(@RequestBody Topic t) {
		System.out.println("Inside Controller postTopics()");
		return topicsService.addTopic(t);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value = "/topics/{id}")
	public List<Topic> updateTopicbyId(@RequestBody Topic t, @PathVariable String id) {
		System.out.println("Inside Controller updateTopicbyId()");
		return topicsService.updateTopic(t, Long.parseLong(id));
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value = "/topics/{id}")
	public List<Topic> deleteTopicbyId(@PathVariable String id) {
		System.out.println("Inside Controller updateTopicbyId()");
		return topicsService.deleteTopic(Long.parseLong(id));
	}

}
