package com.model;

/** @decription:新闻
 *  @author MyEclipse Persistence Tools
 */

public class News implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8553180217488109681L;
	private Integer newsId;
	private String newsType;
	private String newsTitle;
	private String newsAuthor;
	private String newsContent;
	private String editorTime;
	private String createTime;
	private String updateTime;
	
	
	public Integer getNewsId() {
		return newsId;
	}
	public void setNewsId(Integer newsId) {
		this.newsId = newsId;
	}
	public String getNewsType() {
		return newsType;
	}
	public void setNewsType(String newsType) {
		this.newsType = newsType;
	}
	public String getNewsTitle() {
		return newsTitle;
	}
	public void setNewsTitle(String newsTitle) {
		this.newsTitle = newsTitle;
	}
	public String getNewsAuthor() {
		return newsAuthor;
	}
	public void setNewsAuthor(String newsAuthor) {
		this.newsAuthor = newsAuthor;
	}
	public String getNewsContent() {
		return newsContent;
	}
	public void setNewsContent(String newsContent) {
		this.newsContent = newsContent;
	}
	public String getEditorTime() {
		return editorTime;
	}
	public void setEditorTime(String editorTime) {
		this.editorTime = editorTime;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	
}