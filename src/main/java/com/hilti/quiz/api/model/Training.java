package com.hilti.quiz.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="training")
public class Training {
	@Id
	@NotNull
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int toolId;
	@Column(name="tool_title")
    private String toolTitle;
	@Column(name="tool_img_res")
    private String toolImageRes;
	@Column(name="tool_feature")
    private String toolFeature;
	@Column(name="tool_application")
    private String toolApplication;
	public int getToolId() {
		return toolId;
	}
	public void setToolId(int toolId) {
		this.toolId = toolId;
	}
	public String getToolTitle() {
		return toolTitle;
	}
	public void setToolTitle(String toolTitle) {
		this.toolTitle = toolTitle;
	}
	public String getToolImageRes() {
		return toolImageRes;
	}
	public void setToolImageRes(String toolImageRes) {
		this.toolImageRes = toolImageRes;
	}
	public String getToolFeature() {
		return toolFeature;
	}
	public void setToolFeature(String toolFeature) {
		this.toolFeature = toolFeature;
	}
	public String getToolApplication() {
		return toolApplication;
	}
	public void setToolApplication(String toolApplication) {
		this.toolApplication = toolApplication;
	}
	public Training(int toolId, String toolTitle, String toolImageRes, String toolFeature, String toolApplication) {
		super();
		this.toolId = toolId;
		this.toolTitle = toolTitle;
		this.toolImageRes = toolImageRes;
		this.toolFeature = toolFeature;
		this.toolApplication = toolApplication;
	}
	public Training() {
		super();
	}
	public Training(String toolTitle, String toolImageRes, String toolFeature, String toolApplication) {
		super();
		this.toolTitle = toolTitle;
		this.toolImageRes = toolImageRes;
		this.toolFeature = toolFeature;
		this.toolApplication = toolApplication;
	}

    
}
