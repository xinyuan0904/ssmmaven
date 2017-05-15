/**  
 * @Project: MySSM
 * @Title: User.java
 * @Package com.myssm.yuan.pojo
 * @author yuan
 * @date 2016��6��23�� ����3:46:22
 * @Copyright: 2016
 * @version V1.0  
*/

package pers.yuan.maven.pojo;

import java.io.Serializable;

/**
 * @ClassName User
 * @author yuan
 * @version 1.0
 */
public class User implements Serializable{
	private static final long serialVersionUID = 1L;
	private String userName;
	private String account;
	private String password;
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	
}
