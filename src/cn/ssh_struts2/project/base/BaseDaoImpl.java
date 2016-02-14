package cn.ssh_struts2.project.base;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

@SuppressWarnings("unchecked")
public abstract class BaseDaoImpl<T> implements BaseDao<T> {

	@Resource
	private SessionFactory sessionFactory;
	private Class<T> clazz = null;

	public BaseDaoImpl() {
		// use reflection get T's class
		ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass();
		this.clazz = (Class<T>) (pt.getActualTypeArguments())[0];
	}

	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void save(T entity) {
		getSession().save(entity);

	}

	@Override
	public void update(T entity) {
		getSession().update(entity);

	}

	@Override
	public void delete(long id) {
		Object object = getById(id);
		if (object != null)
			getSession().delete(object);
	}

	@Override
	public T getById(Long id) {
		return (T) getSession().get(clazz, id);
	}

	@Override
	public List<T> findByIds(Long[] ids) {
		return getSession() //
				.createQuery("FROM User WHERE id IN :ids") //
				.setParameterList("ids", ids) //
				.list();
	}

	@Override
	public List<T> findAll() {
		return getSession() //
				.createQuery("FROM " + clazz.getSimpleName()) //
				.list();
	}

}
