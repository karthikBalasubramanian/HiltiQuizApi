package com.hilti.quiz.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="related_topic")
public class RelatedTopic {
	
	@Id
	@NotNull
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int rtopicid;
	@Column(name="topicid")
	//@OneToMany
	private int topicid;
	@Column(name="qid")
	private int qid;
	
	public int getRtopicid() {
		return rtopicid;
	}
	public void setRtopicid(int rtopicid) {
		this.rtopicid = rtopicid;
	}
	public int getTopicid() {
		return topicid;
	}
	public void setTopicid(int topicid) {
		this.topicid = topicid;
	}
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public RelatedTopic(int rtopicid, int topicid, int qid) {
		super();
		this.rtopicid = rtopicid;
		this.topicid = topicid;
		this.qid = qid;
	}
	
	
	public RelatedTopic(int topicid, int qid) {
		super();
		this.topicid = topicid;
		this.qid = qid;
	}
	
	public RelatedTopic(int rtopicid) {
		super();
		this.rtopicid = rtopicid;
	}
	
	
	public RelatedTopic() {
		super();
	}
	

}
