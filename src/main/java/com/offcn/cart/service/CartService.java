package com.offcn.cart.service;

import java.util.List;

import com.offcn.group.Cart;

public interface CartService {
	
	/**
	 * 中购物车中添加商品
	 * @param orderList 购物车集合, 将商品添加的这个集合中, 最终返回这个集合, 存储到cookie中
	 * @param itemId 本次添加sku的 id
	 * @param num 添加的数量
	 * @return
	 */
	public List<Cart> addItemToCartList(List<Cart> orderList, Long itemId, int num );
	
	/**
	 * 从redis中查询购物车列表
	 * @param loginName
	 * @return
	 */
	public List<Cart> findCartFromRedis(String loginName);
	
	/**
	 * 向redis中购物车添加商品
	 * @param loginName
	 * @param orderList
	 * @param itemId
	 * @param num
	 * @return
	 */
	public void addItemToCartListToRedis(String loginName, List<Cart> orderList);
	
	/**
	 * 合并cookie和redis购物车列表,并将最新列表存入redis
	 * @param loginName
	 * @param cookieList
	 * @param redisList
	 * @return
	 */
	public List<Cart> JoinCookieToRedis(String loginName, List<Cart> cookieList, List<Cart> redisList);


	
}
