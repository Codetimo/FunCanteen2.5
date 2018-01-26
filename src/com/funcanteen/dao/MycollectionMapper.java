package com.funcanteen.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.funcanteen.pojo.MyCollection;

public interface MycollectionMapper {
	List<String> SelCollectionById(Integer id);

	void delCollectionByDid(@Param("content")String did,@Param("userid")Integer uid);
	
	void InsertCollectionById(MyCollection collection);
}
