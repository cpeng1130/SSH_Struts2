package cn.ssh_struts2.project.service;

import java.util.List;

import cn.ssh_struts2.project.domain.User;

public interface UserService {

	void save(User user);

	void delete(Long id);

	void update(User user);

	User getById(Long id);

	List<User> findAll();

}
