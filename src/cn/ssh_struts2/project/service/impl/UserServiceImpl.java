package cn.ssh_struts2.project.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.ssh_struts2.project.dao.UserDao;
import cn.ssh_struts2.project.domain.User;
import cn.ssh_struts2.project.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Resource
	UserDao userDao;

	@Override
	public void save(User user) {
		userDao.save(user);
	}

	@Override
	public void delete(Long id) {
		userDao.delete(id);
	}

	@Override
	public void update(User user) {
		userDao.update(user);
	}

	@Override
	public User getById(Long id) {
		return userDao.getById(id);
	}

	@Override
	public List<User> findAll() {
		return userDao.findAll();
	}

}
