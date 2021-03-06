package com.wcy.dao.dianpu;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.wcy.model.dianpu.Dianpu;

@Mapper
public interface DianpuDao {

	//新增
	public int insert(Dianpu dianpu);

	//修改
	public int update(Dianpu dianpu);

	//删除
	public int delete(String id);

	//根据Id查询单条记录
	public Dianpu getById(String id);

	//分页查询列表
	public List<Dianpu> getList(Dianpu dianpu);
	
	//分页查询数量
	public int getCount(Dianpu dianpu);
	
}