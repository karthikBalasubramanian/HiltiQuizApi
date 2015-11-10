package com.hilti.quiz.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="answer_history")
public class AnswerHistory {
	@Id
	@NotNull
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int ahid;
	@Column(name="qid")
	private int qid;
	@Column(name="empid")
	private int empid;
	@Lob
	@Column(name="answer")
	private byte[] answer;
	@Column(name="answer_status")
	private String answerStatus;
	@Column(name="time_stamp")
	private String timeStamp;
	@Column(name="points")
	private int points;
	
	public int getAhid() {
		return ahid;
	}
	public void setAhid(int ahid) {
		this.ahid = ahid;
	}
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	
	public byte[] getAnswer() {
		return answer;
	}
	public void setAnswer(byte[] answer) {
		this.answer = answer;
	}
	public String getAnswerStatus() {
		return answerStatus;
	}
	public void setAnswerStatus(String answerStatus) {
		this.answerStatus = answerStatus;
	}
	
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	
	public String getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}
	
	
	

	public AnswerHistory( int qid, int empid, byte[] answer, String answerStatus, String timeStamp,
			int points) {
		super();
		this.qid = qid;
		this.empid = empid;
		this.answer = answer;
		this.answerStatus = answerStatus;
		this.timeStamp = timeStamp;
		this.points = points;
	}
	public AnswerHistory() {
		super();
	}
	public AnswerHistory(int ahid, int qid, int empid, byte[] answer, String answerStatus, String timeStamp,
			int points) {
		super();
		this.ahid = ahid;
		this.qid = qid;
		this.empid = empid;
		this.answer = answer;
		this.answerStatus = answerStatus;
		this.timeStamp = timeStamp;
		this.points = points;
	}
	
	
	
	
}
