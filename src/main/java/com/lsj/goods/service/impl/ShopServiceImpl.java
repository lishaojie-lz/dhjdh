package com.lsj.goods.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lsj.goods.dao.ShopMapper;
import com.lsj.goods.domain.Good;
import com.lsj.goods.domain.Shop;
import com.lsj.goods.service.ShopService;
@Service
public class ShopServiceImpl implements ShopService{

	@Resource
	private ShopMapper ShopMapper;
	@Override
	public List<Shop> selects() {
		// TODO Auto-generated method stub
		return ShopMapper.selects();
	}
	@Override
	public List<Good> selectsGoods() {
		// TODO Auto-generated method stub
		return ShopMapper.selectsGoods();
	}
	@Override
	public boolean insert(Shop shop, Integer[] gids) {
		// TODO Auto-generated method stub
		//1.增加店铺
		ShopMapper.insert(shop);
		//2.增加中间表
		ShopMapper.insertMiddle(shop.getId(), gids);
		return true;
	}
	@Override
	public Shop select(Integer sid) {
		// TODO Auto-generated method stub
		return ShopMapper.select(sid);
	}

}
