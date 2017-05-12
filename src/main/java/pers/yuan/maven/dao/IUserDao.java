
package pers.yuan.maven.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import pers.yuan.maven.pojo.User;

/**
 * 
 * @ClassName IUserDao
 * @author Administrator
 * @date 2017年5月12日
 * @version 1.0
 */
@Repository
public interface IUserDao {
	
	List<User> getUserList();
	User getUserByAccount(String account);
}
