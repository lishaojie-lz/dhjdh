package com.lsj.goods.service;

import java.util.List;

import com.lsj.goods.domain.Good;
import com.lsj.goods.domain.Shop;

public interface ShopService {
	/**
	 * 
	 * @Title: selects 
	 * @Description: 商铺列表
	 * @return
	 * @return: List<Shop>
	 */
		List<Shop> selects();
		/**
		 * 
		 * @Title: selectsGoods 
		 * @Description: 查询所有商品
		 * @return
		 * @return: List<Good>
		 */
		List<Good> selectsGoods();
		/**
		 * 
		 * @Title: insert 
		 * @Description: 查询所有商品
		 * @param shop
		 * @param gids
		 * @return
		 * @return: boolean
		 */
		boolean insert(Shop shop, Integer[] gids);
		/**
		 * 
		 * @Title: select 
		 * @Description: 查询单个店铺
		 * @param id
		 * @return
		 * @return: shop
		 */
		Shop select(Integer sid);
}
