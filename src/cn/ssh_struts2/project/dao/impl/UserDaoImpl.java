package cn.ssh_struts2.project.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.ssh_struts2.project.base.BaseDaoImpl;
import cn.ssh_struts2.project.dao.UserDao;
import cn.ssh_struts2.project.domain.User;

@Repository
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {

	@Override
	public List<User> findByNameLike(String namePart) {
		return null;
	}

}
