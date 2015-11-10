package com.hilti.quiz.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hilti.quiz.api.model.RelatedTopic;
import com.hilti.quiz.api.model.Success;
import com.hilti.quiz.api.service.RelatedTopicService;

@RestController
public class RelatedTopicController {

	@Autowired
	private RelatedTopicService relatedTopicService;
	
	@RequestMapping("/relatedTopic/viewAllRelatedTopics")
	public @ResponseBody Iterable<RelatedTopic> viewAllRelatedTopic(){
				return relatedTopicService.viewAllRelatedTopicService();
	}

	@RequestMapping("/relatedTopic/createRelatedTopic")
	public @ResponseBody Success onCreate(int questionId,int topicId ){
		RelatedTopic relatedTopic = null;
		try{
			relatedTopic = new RelatedTopic(questionId,topicId);
			relatedTopicService.saveRelatedTopicService(relatedTopic);
		}catch (Exception ex) {
		      return new Success("sorry Try Again");
	    }
	    return new Success("yes "+RelatedTopic.class.getName().substring(RelatedTopic.class.getName().lastIndexOf(".")+1)+" record created");
		
	}
	
	@RequestMapping("/relatedTopic/updateRelatedTopic")
	public @ResponseBody Success onUpdate(int rid,int questionId,int topicId ){
		RelatedTopic relatedTopic = null;
		try{
			relatedTopic = new RelatedTopic(rid,questionId,topicId);
			relatedTopicService.saveRelatedTopicService(relatedTopic);
		}catch (Exception ex) {
		      return new Success("sorry Try Again");
	    }
	    return new Success("yes "+RelatedTopic.class.getName().substring(RelatedTopic.class.getName().lastIndexOf(".")+1)+" record updated");
		
	}
	
	@RequestMapping("/relatedTopic/viewRelatedTopicById")
	public @ResponseBody Iterable<RelatedTopic> viewQuestionById(Integer[] relatedTopicIdList){
		return relatedTopicService.findListOfRelatedTopic(relatedTopicIdList);
	}
	
	@RequestMapping("/relatedTopic/deleteRelatedTopicById")
	public @ResponseBody Success onDelete(int id){
		try{
			relatedTopicService.deleteRelatedTopicByIdService(id);
		}catch (Exception ex) {
		      return new Success("sorry Try Again");
	    }
	    return new Success("yes "+RelatedTopic.class.getName().substring(RelatedTopic.class.getName().lastIndexOf(".")+1)+" record deleted");
		
	}
}
