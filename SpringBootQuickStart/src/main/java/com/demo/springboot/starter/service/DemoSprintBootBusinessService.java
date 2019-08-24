package com.demo.springboot.starter.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.springboot.starter.entity.Topic;

@Service
public class DemoSprintBootBusinessService {
	
	private List<Topic> listOfTopics = new ArrayList(Arrays.asList(new Topic(101L, "Java", "Java is the Most high level OOP Language."),
			new Topic(102L, "Javascript", "Javascript is the Most versatile scripting Language."),
			new Topic(103L, "YAML", "YAML ain't a markup language."),
			new Topic(104L, "JPA", "Java Persistance API")
			));
	
	public List<Topic> getAlltopic(){
		return listOfTopics;
	}
	
	public Topic getTopicbyId(Long id){
		
		Topic topic = listOfTopics.stream().filter(t -> t.getTopicId().equals(id)).findFirst().get();
		return topic;
	}
	
	public List<Topic> addTopic(Topic t){
		listOfTopics.add(t);
		return listOfTopics;
	}
	
	public List<Topic> updateTopic(Topic t, Long id){
		for(Topic topic : listOfTopics) {
			if(topic.getTopicId().equals(id)) {
				topic.setTopicDesc(t.getTopicDesc());
				topic.setTopicName(t.getTopicName());
				
			}
		}
		return listOfTopics;
	}
	
	public List<Topic> deleteTopic(Long id){
		for(Topic topic : listOfTopics) {
			if(topic.getTopicId().equals(id)) {
				listOfTopics.remove(topic);
				break;
			}
		}
		return listOfTopics;
	}

}
