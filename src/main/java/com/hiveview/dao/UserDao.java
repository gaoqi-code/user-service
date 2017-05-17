package com.hiveview.dao;

import com.hiveview.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Map;

@Repository
public interface UserDao extends IBaseDao<User> {

	public int addUser(User user);
		//return this.addInfo("UserDao.addUser",user);

	public User getUserByUnionid(@Param("unionid")String unionid);
		//return this.getInfoById("UserDao.getUserByUnionid",unionid);

	public User getUserByParentId(@Param("parentId")int parentId);
		//return this.getInfoById("UserDao.getUserByParentId",parentId);

	public int updateUserJianBalance(@Param("userId")int userId, @Param("totalFee")BigDecimal totalFee);
//		Map<String,Object> map = new HashMap<String,Object>();
//		map.put("id",userId);
//		map.put("totalFee",totalFee);
//		return this.updateByIf("UserDao.updateUserJianBalance",map);
//	}

	public int updateUserJiaBalance(@Param("userId")int userId, @Param("totalFee")BigDecimal totalFee);
//		Map<String,Object> map = new HashMap<String,Object>();
//		map.put("id",userId);
//		map.put("totalFee",totalFee);
//		return this.updateByIf("UserDao.updateUserJiaBalance",map);
//	}

	public int addUserBalanceLog(Map<String,Object> map);
//		return this.delByIf("UserDao.addUserBalanceLog",map);
//	}
}
