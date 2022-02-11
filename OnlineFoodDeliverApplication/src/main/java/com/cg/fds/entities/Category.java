package com.cg.fds.entities;

public class Category {

	private int catId;
	private String categoryName;
	
	public int getCatId() {
		return catId;
	}
	public void setCatId(int catId) {
		this.catId = catId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public Category(int catId, String categoryName) {
		super();
		this.catId = catId;
		this.categoryName = categoryName;
	}
	public Category() {
		super();
	}
	@Override
	public String toString() {
		return "Category [catId=" + catId + ", categoryName=" + categoryName + "]";
	}
	
	
}
