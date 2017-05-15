
package pers.yuan.maven.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pers.yuan.maven.dao.IUserDao;
import pers.yuan.maven.pojo.User;
import pers.yuan.maven.service.IUserService;

/**
 * 
 * @ClassName UserServiceImpl
 * @author Administrator
 * @date 2017年5月12日
 * @version 1.0
 */
@Service
public class UserServiceImpl implements IUserService{

	@Autowired
	private IUserDao userDao;
	@Override
	public List<User> getUserList() {
		return this.userDao.getUserList();
	}
	
	@Override
	public User getUserByAccount(String account) {
		return this.userDao.getUserByAccount(account);
	}

}
