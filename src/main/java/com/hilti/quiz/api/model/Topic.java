package com.hilti.quiz.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="topic")
public class Topic {
	@Id
	@NotNull
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int topicid;
	@Column(name="topic_name")
	private String topicName;
	
	/*@ManyToMany(mappedBy="topicsByQuestions")
	ArrayList<Question> questionsByTopic = new ArrayList<Question>(); 
	*/
	public int getTopicid() {
		return topicid;
	}
	public void setTopicid(int topicid) {
		this.topicid = topicid;
	}
	public String getTopicName() {
		return topicName;
	}
	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}
	public Topic(String topicName) {
		super();
		this.topicName = topicName;
	}
	public Topic() {
		super();
	}
	/*public Topic(int topicid, String topicName, ArrayList<Question> questionsByTopic) {
		super();
		this.topicid = topicid;
		this.topicName = topicName;
		this.questionsByTopic = questionsByTopic;
	}*/
	
	public Topic(int topicid, String topicName) {
		super();
		this.topicid = topicid;
		this.topicName = topicName;
	}
}
