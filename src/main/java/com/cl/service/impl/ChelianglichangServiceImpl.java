package com.cl.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cl.utils.PageUtils;
import com.cl.utils.Query;


import com.cl.dao.ChelianglichangDao;
import com.cl.entity.ChelianglichangEntity;
import com.cl.service.ChelianglichangService;
import com.cl.entity.view.ChelianglichangView;

@Service("chelianglichangService")
public class ChelianglichangServiceImpl extends ServiceImpl<ChelianglichangDao, ChelianglichangEntity> implements ChelianglichangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChelianglichangEntity> page = this.selectPage(
                new Query<ChelianglichangEntity>(params).getPage(),
                new EntityWrapper<ChelianglichangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChelianglichangEntity> wrapper) {
		  Page<ChelianglichangView> page =new Query<ChelianglichangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<ChelianglichangView> selectListView(Wrapper<ChelianglichangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChelianglichangView selectView(Wrapper<ChelianglichangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
