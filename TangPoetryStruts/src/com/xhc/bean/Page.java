package com.xhc.bean;

public class Page {
	private int curPage;
	private int pageSize=20;
	private int pageCount;
	public int previous(){
		return (this.curPage>1)?this.curPage-1:1;
	}
	public int next(){
		return (this.curPage<this.pageCount)?this.curPage+1:this.pageCount;
	}
	public int getCurPage() {
		return curPage;
	}
	public void setCurPage(int curPage) {
		this.curPage = curPage;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	
}
