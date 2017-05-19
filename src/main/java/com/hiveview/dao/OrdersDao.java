package com.hiveview.dao;

import com.hiveview.entity.Orders;
import com.hiveview.entity.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public interface OrdersDao extends IBaseDao<Orders> {

	public int addOrder(Orders Orders);

	public int updateOrder(int userId,int id,int dataStatus);

	public int updateOrder(String orderNo,int dataStatus);

	public int updateOrderById(String orderNo,int id);
	public Orders getOrderByUserIdAndOrderId(int userId,int orderId);

	/**
	 * 通过订单号获得订单信息
	 * @param orderNo
	 * @return
	 */
	public Orders getOrderByOrderNo(String orderNo);

	public Orders getOrderByUserId(int userId);
}
