package com.cl.dao;

import com.cl.entity.ChelianglichangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ChelianglichangView;


/**
 * 车辆离场
 * 
 * @author 
 * @email 
 * @date 2024-03-06 19:52:48
 */
public interface ChelianglichangDao extends BaseMapper<ChelianglichangEntity> {
	
	List<ChelianglichangView> selectListView(@Param("ew") Wrapper<ChelianglichangEntity> wrapper);

	List<ChelianglichangView> selectListView(Pagination page,@Param("ew") Wrapper<ChelianglichangEntity> wrapper);
	
	ChelianglichangView selectView(@Param("ew") Wrapper<ChelianglichangEntity> wrapper);
	

}
