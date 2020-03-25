package com.lsj.goods.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lsj.goods.domain.Good;
import com.lsj.goods.domain.Shop;
import com.lsj.goods.service.ShopService;

@Controller
public class ShopController {
	
	@Resource
	private ShopService shopService;
	/**
	 * 
	 * @Title: shops 
	 * @Description: 商铺列表
	 * @param model
	 * @return
	 * @return: String
	 */
	@RequestMapping("shops")
	public String shops(Model model){
		System.out.println("23e2");
		List<Shop> shops = shopService.selects();
		model.addAttribute("shops", shops);
		return "shops";
	}
	/**
	 * 
	 * @Title: add 
	 * @Description: 去添加，  只支持get请求
	 * @return
	 * @return: String
	 */
	@GetMapping("add")
	public String add(){
		return "add";
		
	}
	
	/**
	 * 
	 * @Title: selectGoods 
	 * @Description: 查询返回所有商品
	 * @return
	 * @return: List<Good>
	 */
	@GetMapping("selectGoods")
	@ResponseBody
	public List<Good> selectGoods(){
		
		return shopService.selectsGoods();
	}
	/**
	 * 
	 * @Title: add 
	 * @Description:执行添加 ， 只支持post请求
	 * @param shop
	 * @param gids
	 * @return
	 * @return: boolean
	 */
	@PostMapping("add")
	public boolean add(Shop shop,Integer[] gids){
		return shopService.insert(shop,gids);
		
	}
	/**
	 * 
	 * @Title: detail 
	 * @Description: 店铺详情
	 * @param id
	 * @param model
	 * @return
	 * @return: String
	 */
	@GetMapping("/detail")
	public String detail(Integer id,Model model){
		model.addAttribute("shop", shopService.select(id));
		return "shop";
		
	}
}
