package cn.ssh_struts2.project.dao;

import java.util.List;

import cn.ssh_struts2.project.base.BaseDao;
import cn.ssh_struts2.project.domain.User;

public interface UserDao extends BaseDao<User> {

	/**
	 * find user by part of name
	 * 
	 * @param namePart
	 * @return
	 */
	List<User> findByNameLike(String namePart);
}
