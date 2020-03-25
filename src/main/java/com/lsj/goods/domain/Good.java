package com.lsj.goods.domain;

import java.io.Serializable;
import java.util.List;

/**
 * 
 * @ClassName: Item 
 * @Description: TODO
 * @author: charles
 * @date: 2020骞�3鏈�20鏃� 涓婂�?11:41:15
 */
public class Good implements Serializable{

	/**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: TODO
	 */
	private static final long serialVersionUID = 1L;
	private Integer  id;
	private String name;
	
	private List<Shop> shops;
	
	
	
	public List<Shop> getShops() {
		return shops;
	}
	public void setShops(List<Shop> shops) {
		this.shops = shops;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
