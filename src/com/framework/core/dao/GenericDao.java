package com.framework.core.dao;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.framework.core.vo.PagineBean;

public interface GenericDao<T, ID extends Serializable> {
	public T findById(ID id);

	T findById(ID id, boolean lock);

	List<T> findAll();

	List<T> findByExample(T exampleInstance);

	T makePersistent(T entity);

	void makeTransient(T entity);

	void flush();

	/**
	 * 保存或更新(如果对象已存在)
	 * 
	 * @param object
	 *            C
	 * @return TODO
	 */
	T saveOrUpdate(T object);

	/**
	 * 删除
	 * 
	 * @param entity
	 */
	void delete(T entity);

	/**
	 * 批量删除
	 * 
	 * @param objects
	 *            Collection
	 */
	void deleteBatch(Collection<T> objects);

	/**
	 * 批量保存或更新
	 * 
	 * @param objects
	 *            Collection
	 */
	void saveOrUpdateAll(Collection<T> objects);

	/**
	 * just save
	 * 
	 * @param entity
	 */
	public ID saveEntity(T entity);

	/**
	 * just update
	 * 
	 * @param entity
	 */
	public void updateEntity(T entity);

	/**
	 * 根据HQL进行分页查询，不支持distinct关键字<br>
	 * add by Mazhy
	 * 
	 * @param hql
	 *            String HQL语句，格式: select (***) from * order by *
	 * @param params
	 *            Object[] 占位符参数
	 * @param curPage
	 *            Long 当前页码，若小于首页则设置为首页（首页从1开始），若大于总页数则设置为某页
	 * @param pageSize
	 *            Long 每页行数，若为空或小于1则设置为默认页大小
	 * @return PagineBean
	 */
	public PagineBean pagineByHQL(final String hql, final Object params[], final Long curPage, final Long pageSize);

	/**
	 * 根据HQL进行分页查询<br>
	 * add by Mazhy
	 * 
	 * @param hql
	 *            String HQL语句，格式: select (***) from * order by *
	 * @param params
	 *            Object[] 占位符参数
	 * @param curPage
	 *            Long 当前页码，若小于首页则设置为首页（首页从1开始），若大于总页数则设置为某页
	 * @param pageSize
	 *            Long 每页行数，若为空或小于1则设置为默认页大小
	 * @param countFields
	 *            String count依据的字段，多个字段以,隔开，如distinct field1,field2
	 * @return
	 */
	public PagineBean pagineByHQL(final String hql, final Object params[], final Long curPage, final Long pageSize,
			String countFields);

	/**
	 * 根据SQL进行分页查询，不支持distinct关键字<br>
	 * add by Mazhy
	 * 
	 * @param sql
	 *            String SQL语句，格式：select (***) from * order by *
	 * @param params
	 *            Object[] 占位符参数
	 * @param curPage
	 *            Long 当前页码，若小于首页则设置为首页（首页从1开始），若大于总页数则设置为某页
	 * @param pageSize
	 *            Long 每页行数，若为空或小于1则设置为默认页大小
	 * @return PagineBean
	 */
	public PagineBean pagineBySQL(final String sql, final Object params[], final Long curPage, final Long pageSize);

	/**
	 * 根据SQL进行分页查询<br>
	 * add by Mazhy
	 * 
	 * @param sql
	 *            String SQL语句，格式：select (***) from * order by *
	 * @param params
	 *            Object[] 占位符参数
	 * @param curPage
	 *            Long 当前页码，若小于首页则设置为首页（首页从1开始），若大于总页数则设置为某页
	 * @param pageSize
	 *            Long 每页行数，若为空或小于1则设置为默认页大小
	 * @param countFields
	 *            String count依据的字段，多个字段以,隔开，如distinct field1,field2
	 * @return
	 */
	public PagineBean pagineBySQL(final String sql, final Object params[], final Long curPage, final Long pageSize,
			String countFields);

	public List queryByHQL(final String hql, final Map params);

	/**
	 * 指定持久化对象类型的查询
	 * 
	 * @param <E>
	 * @param resultClass
	 * @param hql
	 * @param parameters
	 * @return List<E>
	 * @author jwf
	 * @date 2009-3-24
	 */
	public <E> List<E> findByHql(Class<E> resultClass, String hql, Object... parameters);

	/**
	 * 指定持久化类型的换页查询，如果换页属性为空，那么忽略该条件。
	 * 
	 * @param <E>
	 * @param resultClass
	 * @param startIndex
	 * @param pageSize
	 * @param hql
	 * @param parameters
	 * @return List<E>
	 * @author jwf
	 * @date 2009-3-24
	 */
	public <E> List<E> findByHqlLimit(Class<E> resultClass, final int startIndex, final int pageSize, final String hql,
			final Object... parameters);

	public int bulkUpdate(String hql);

	public int bulkUpdate(String hql, Object param);

	public int bulkUpdate(String hql, Object[] params);

	@SuppressWarnings("unchecked")
	public List findByHql(String hql, Object... objects);

	/**
	 * 通过bo对象获得在数据库中映射的表名
	 * 
	 * @param clazz
	 * @author luqingrun
	 * @return
	 */
	public String getTableName(Class clazz);
}
