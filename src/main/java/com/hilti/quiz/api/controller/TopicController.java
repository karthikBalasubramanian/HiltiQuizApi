package com.hilti.quiz.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hilti.quiz.api.model.Success;
import com.hilti.quiz.api.model.Topic;
import com.hilti.quiz.api.service.TopicService;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/topic/viewAllTopics")
	public @ResponseBody Iterable<Topic> viewAllTopic(){
				return topicService.viewAllTopicService();
	}

	@RequestMapping("/topic/createTopic")
	public @ResponseBody Success onCreate(String topicName){
		Topic topic = null;
		try{
			topic = new Topic(topicName);
			topicService.saveTopicService(topic);
		}catch (Exception ex) {
		      return new Success("sorry Try Again");
	    }
	    return new Success("yes "+Topic.class.getName().substring(Topic.class.getName().lastIndexOf(".")+1)+" record created");
		
	}
	
	@RequestMapping("/topic/updateTopic")
	public @ResponseBody Success onUpdate(int topicid,String topicName){
		Topic topic = null;
		try{
			topic = new Topic(topicid,topicName);
			topicService.saveTopicService(topic);
		}catch (Exception ex) {
		      return new Success("sorry Try Again");
	    }
	    return new Success("yes "+Topic.class.getName().substring(Topic.class.getName().lastIndexOf(".")+1)+" record updated");
		
	}
	
	@RequestMapping("/topic/viewTopicById")
	public @ResponseBody Iterable<Topic> viewQuestionById(Integer[] topicIdList){
		return topicService.findListOfTopic(topicIdList);
	}
	
	@RequestMapping("/topic/deleteTopicById")
	public @ResponseBody Success onDelete(int topicid){
		//Topic topic = null;
		try{
			//topic = new Topic(topicid,topicName);
			topicService.deleteTopicByIdService(topicid);
		}catch (Exception ex) {
		      return new Success("sorry Try Again");
	    }
	    return new Success("yes "+Topic.class.getName().substring(Topic.class.getName().lastIndexOf(".")+1)+" record deleted");
		
	}
	
	
	
	
	

}
