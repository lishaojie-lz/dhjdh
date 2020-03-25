package com.lsj.goods.service;

import java.util.List;

import com.lsj.goods.domain.Good;
import com.lsj.goods.domain.Shop;

public interface ShopService {
	/**
	 * 
	 * @Title: selects 
	 * @Description: �����б�
	 * @return
	 * @return: List<Shop>
	 */
		List<Shop> selects();
		/**
		 * 
		 * @Title: selectsGoods 
		 * @Description: ��ѯ������Ʒ
		 * @return
		 * @return: List<Good>
		 */
		List<Good> selectsGoods();
		/**
		 * 
		 * @Title: insert 
		 * @Description: ��ѯ������Ʒ
		 * @param shop
		 * @param gids
		 * @return
		 * @return: boolean
		 */
		boolean insert(Shop shop, Integer[] gids);
		/**
		 * 
		 * @Title: select 
		 * @Description: ��ѯ��������
		 * @param id
		 * @return
		 * @return: shop
		 */
		Shop select(Integer sid);
}
