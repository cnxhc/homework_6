package com.xhc.service;

import java.util.List;
import com.xhc.bean.Poetries;
import com.xhc.dao.PoetriesDao;

public class PoetriesService {
	PoetriesDao pd=new PoetriesDao();
	
	public List<Poetries> queryAllPoet(){
		return null;
	}
	//通过诗人名查询
	public List<Poetries> queryTitleByName(String name){
		return pd.queryTitleByName(name);	
	}
	//通过诗词名称查询
	public List<Poetries> queryContentByTitle(String title){
		return pd.queryContentByTitle(title);
	}
	//通过诗词名句查询
	public List<Poetries> queryNameTitleByContent(String content){
		return pd.queryNameTitleByContent(content);
	}
}
