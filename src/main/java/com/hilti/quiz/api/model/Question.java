package com.hilti.quiz.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "question")
public class Question {

	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int qid;
	@Column(name = "type")
	private String type;
	@Column(name = "text")
	private String text;
	@Column(name = "difficulty")
	private int difficulty;
	
	@Column(name = "option_a")
	private String optionA;
	
	@Column(name = "option_b")
	private String optionB;
	
	@Column(name = "option_c")
	private String optionC;
	
	@Column(name = "option_d")
	private String optionD;
	
	@Column(name = "correct_ans")
	private String correctAns;
	@Column(name = "status")
	private String status;
	
	
	public int getQid() {
		return qid;
	}

	public void setQid(int qid) {
		this.qid = qid;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(int difficulty) {
		this.difficulty = difficulty;
	}

	public String getOptionA() {
		return optionA;
	}

	public void setOptionA(String optionA) {
		this.optionA = optionA;
	}

	public String getOptionB() {
		return optionB;
	}

	public void setOptionB(String optionB) {
		this.optionB = optionB;
	}

	public String getOptionC() {
		return optionC;
	}

	public void setOptionC(String optionC) {
		this.optionC = optionC;
	}

	public String getOptionD() {
		return optionD;
	}

	public void setOptionD(String optionD) {
		this.optionD = optionD;
	}

	public String getCorrectAns() {
		return correctAns;
	}

	public void setCorrectAns(String correctAns) {
		this.correctAns = correctAns;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
	public Question(String type, String text, int difficulty, String optionA, String optionB,String optionC,
			String optionD, String correctAns, String status) {
		super();
		this.type = type;
		this.text = text;
		this.difficulty = difficulty;
		this.optionA = optionA;
		this.optionB = optionB;
		this.optionC = optionC;
		this.optionD = optionD;
		this.correctAns = correctAns;
		this.status = status;
	}

	
	public Question(int qid) {
		super();
		this.qid = qid;
	}

	public Question(int qid, String type, String text, int difficulty, String optionA, String optionB, String optionC,
			String optionD, String correctAns, String status) {
		super();
		this.qid = qid;
		this.type = type;
		this.text = text;
		this.difficulty = difficulty;
		this.optionA = optionA;
		this.optionB = optionB;
		this.optionC = optionC;
		this.optionD = optionD;
		this.correctAns = correctAns;
		this.status = status;
	}

	public Question() {
		super();
	}

}
