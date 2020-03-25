package com.lsj.goods.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lsj.goods.domain.Good;
import com.lsj.goods.domain.Shop;

public interface ShopMapper {
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
	 * @Description: TODO
	 * @param shop
	 * @param gids
	 * @return
	 * @return: boolean
	 */
	boolean insert(@Param("shop")Shop shop, @Param("gids")Integer[] gids);
	/**
	 * 
	 * @Title: select 
	 * @Description: TODO
	 * @param sid
	 * @return
	 * @return: Shop
	 */
	Shop select(Integer sid);
	void insert(Shop shop);
	void insertMiddle(Integer id, Integer[] gids);
}
