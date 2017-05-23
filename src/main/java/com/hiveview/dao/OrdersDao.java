package com.hiveview.dao;

import com.hiveview.entity.Orders;
import com.hiveview.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public interface OrdersDao extends IBaseDao<Orders> {

	public int addOrder(Orders Orders);

	public int updateOrder(@Param("userId")int userId,@Param("id")int id,@Param("dataStatus")int dataStatus);

	public int updateOrder(@Param("orderNo")String orderNo,@Param("dataStatus")int dataStatus);

	public int updateOrderById(@Param("orderNo") String orderNo, @Param("id") int id);
	public Orders getOrderByUserIdAndOrderId(@Param("userId") int userId,@Param("orderId")int orderId);

	/**
	 * 通过订单号获得订单信息
	 * @param orderNo
	 * @return
	 */
	public Orders getOrderByOrderNo(@Param("orderNo")String orderNo);

	public Orders getOrderByUserId(@Param("userId")int userId);
}
