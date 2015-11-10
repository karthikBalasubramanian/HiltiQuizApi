package com.hilti.quiz.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="answered_correct")
public class AnsweredCorrect {
	@Id
	@NotNull
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int accid;
	@Column(name="empid")
	private int empid;
	@Column(name="qid")
	private int qid;
	
	public int getAccid() {
		return accid;
	}
	public void setAccid(int accid) {
		this.accid = accid;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public AnsweredCorrect(int accid, int empid, int qid) {
		super();
		this.accid = accid;
		this.empid = empid;
		this.qid = qid;
	}
	
	public AnsweredCorrect(int empid, int qid) {
		super();
		this.empid = empid;
		this.qid = qid;
	}
	
	public AnsweredCorrect(int accid) {
		super();
		this.accid = accid;
	}
	public AnsweredCorrect() {
		super();
	}
	
	

}
