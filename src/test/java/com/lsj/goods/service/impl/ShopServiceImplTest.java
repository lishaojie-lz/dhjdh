package com.lsj.goods.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lsj.goods.domain.Good;
import com.lsj.goods.domain.Shop;
import com.lsj.goods.service.ShopService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-beans.xml")
public class ShopServiceImplTest {

	@Resource
	private ShopService shopService;
	@Test
	public void testSelects() {  
		List<Shop> list = shopService.selects();
		for (Shop shop : list) {
			System.out.println("商品名称"+shop.getName());
			List<Good> goods = shop.getGoods();

			for (Good good : goods) {
				System.out.println("所卖商品："+good.getName());
			}
		}
	}

}
