package com.model;

/**
 * News entity. @author MyEclipse Persistence Tools
 */

public class News implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer newsId;
	private String newsType;
	private String newsTitle;
	private String newsContent;
	private String editorTime;

	// Constructors

	/** default constructor */
	public News() {
	}

	/** minimal constructor */
	public News(Integer newsId) {
		this.newsId = newsId;
	}

	/** full constructor */
	public News(Integer newsId, String newsType, String newsTitle,
			String newsContent, String editorTime) {
		this.newsId = newsId;
		this.newsType = newsType;
		this.newsTitle = newsTitle;
		this.newsContent = newsContent;
		this.editorTime = editorTime;
	}

	// Property accessors

	public Integer getNewsId() {
		return this.newsId;
	}

	public void setNewsId(Integer newsId) {
		this.newsId = newsId;
	}

	public String getNewsType() {
		return this.newsType;
	}

	public void setNewsType(String newsType) {
		this.newsType = newsType;
	}

	public String getNewsTitle() {
		return this.newsTitle;
	}

	public void setNewsTitle(String newsTitle) {
		this.newsTitle = newsTitle;
	}

	public String getNewsContent() {
		return this.newsContent;
	}

	public void setNewsContent(String newsContent) {
		this.newsContent = newsContent;
	}

	public String getEditorTime() {
		return this.editorTime;
	}

	public void setEditorTime(String editorTime) {
		this.editorTime = editorTime;
	}

}