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
	@Lob
	@Column(name = "option_a")
	private byte[] optionA;
	@Lob
	@Column(name = "option_b")
	private byte[] optionB;
	@Lob
	@Column(name = "option_c")
	private byte[] optionC;
	@Lob
	@Column(name = "option_d")
	private byte[] optionD;
	@Lob
	@Column(name = "correct_ans")
	private byte[] correctAns;
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

	public byte[] getOptionA() {
		return optionA;
	}

	public void setOptionA(byte[] optionA) {
		this.optionA = optionA;
	}

	public byte[] getOptionB() {
		return optionB;
	}

	public void setOptionB(byte[] optionB) {
		this.optionB = optionB;
	}

	public byte[] getOptionC() {
		return optionC;
	}

	public void setOptionC(byte[] optionC) {
		this.optionC = optionC;
	}

	public byte[] getOptionD() {
		return optionD;
	}

	public void setOptionD(byte[] optionD) {
		this.optionD = optionD;
	}

	public byte[] getCorrectAns() {
		return correctAns;
	}

	public void setCorrectAns(byte[] correctAns) {
		this.correctAns = correctAns;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
	public Question(String type, String text, int difficulty, byte[] optionA, byte[] optionB, byte[] optionC,
			byte[] optionD, byte[] correctAns, String status) {
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

	public Question(int qid, String type, String text, int difficulty, byte[] optionA, byte[] optionB, byte[] optionC,
			byte[] optionD, byte[] correctAns, String status) {
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
