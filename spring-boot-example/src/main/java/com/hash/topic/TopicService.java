package com.hash.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topics> topics = Arrays.asList(
			new Topics("111", "DotNet", "DotNet Desription"),
			new Topics("222", "Java", "Java Desription"),
			new Topics("333", "C++", "C++ Desription ")
	);
	
	public List<Topics> getAllTopics(){
		return topics;
	}
	
	public Topics getTopic(String id){
		return topics.stream().filter(i->i.getId().equals(id)).findFirst().get();
	}
	
	public void addTopic(Topics topic) {
		topics.add(topic);
	}

	public void updateTopic(String id, Topics topic) {
		for(int i = 0; i<=topics.size(); i++ ) {
			Topics t = topics.get(i);
			if(t.getId().equals(id)) {
				topics.set(i, topic);
				return;
			}
		}
		
	}

	public void deleteTopic(String id) {
		topics.removeIf(i->i.getId().equals(id));
		
	}
}
