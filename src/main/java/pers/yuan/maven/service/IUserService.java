
package pers.yuan.maven.service;

import java.util.List;

import pers.yuan.maven.pojo.User;

/**
 * @ClassName IUserService
 * @author yuan
 * @version 1.0
 */

public interface IUserService {

	List<User> getUserList();
	User getUserByAccount(String account);
}
