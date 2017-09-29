package com.wangcj.pojo;

public class Item{

	private Integer iid ; 
	private String iname ;
	private Integer iage ;
	public Item() {
		// TODO Auto-generated constructor stub
	}
	public Item(Integer iid, String iname, Integer iage) {
		super();
		this.iid = iid;
		this.iname = iname;
		this.iage = iage;
	}
	public Integer getIid() {
		return iid;
	}
	public void setIid(Integer iid) {
		this.iid = iid;
	}
	public String getIname() {
		return iname;
	}
	public void setIname(String iname) {
		this.iname = iname;
	}
	public Integer getIage() {
		return iage;
	}
	public void setIage(Integer iage) {
		this.iage = iage;
	}
	@Override
	public String toString() {
		return "Item [iid=" + iid + ", iname=" + iname + ", iage=" + iage + "]";
	}
	
}
