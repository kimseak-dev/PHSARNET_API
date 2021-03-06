package com.psarnet.api.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductTemperory {
	
	@JsonProperty("ID")
	private long productid;

	@JsonProperty("TITLE")
	private String title;
	
	@JsonProperty("PRICE")
	private double price;
	
	@JsonProperty("IMAGE")
	private String image;
	
	@JsonProperty("URL")
	private String url;
	
	@JsonProperty("DESCRIPTION")
	private String description;
	
	@JsonProperty("DATE")
	private String datecreate;
	
	@JsonProperty("STATUS")
	private boolean status;
	
	@JsonProperty("CATEGORY")
	private SubTwoCategory subTwoCategory;
	
	@JsonProperty("SOURCE")
	private SourceCategory sourceCategory;
	
	
	

	public SourceCategory getSourceCategory() {
		return sourceCategory;
	}

	public void setSourceCategory(SourceCategory sourceCategory) {
		this.sourceCategory = sourceCategory;
	}

	public long getProductid() {
		return productid;
	}

	public void setProductid(long productid) {
		this.productid = productid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDatecreate() {
		return datecreate;
	}

	public void setDatecreate(String datecreate) {
		this.datecreate = datecreate;
	}
	
	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public SubTwoCategory getSubTwoCategory() {
		return subTwoCategory;
	}

	public void setSubTwoCategory(SubTwoCategory subTwoCategory) {
		this.subTwoCategory = subTwoCategory;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	
	
	
}
