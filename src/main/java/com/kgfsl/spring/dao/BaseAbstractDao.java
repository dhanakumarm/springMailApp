package com.kgfsl.spring.dao;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;




import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.metadata.ClassMetadata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.GenericTypeResolver;

@SuppressWarnings("unchecked")
public abstract class BaseAbstractDao<E> {
	 
	private final SessionFactory sessionFactory;
    private final Class<?> entityClass;

    @Autowired
    public BaseAbstractDao(SessionFactory factory) 
	{
        this.sessionFactory = factory;
        this.entityClass = GenericTypeResolver.resolveTypeArgument(getClass(), BaseAbstractDao.class);
    }

	protected E get(Serializable id) {
        return (E) currentSession().get(entityClass, checkNotNull(id));
    }

    private <P>P checkNotNull(P entity) {
		if (entity == null) throw new RuntimeException("Expected not null");
		return entity;
	}
    
	public E findById(Long id)
	{
		return get(id);
	}
	
	
	public E findById(BigInteger id){
		return get(id);
	}
	
	public E findById(String id)
	{
		return get(id);
	}
	
	public E findById(Integer id)
	{
		return get(id);
	}
	
    public E persist(E entity)
    {
        currentSession().saveOrUpdate(checkNotNull(entity));
        return entity;
    }
   
    public void delete(Long id) 
    {
        currentSession().delete(findById(id));
    }

    public void delete(Integer id) 
    {
        currentSession().delete(findById(id));
    }
    
	public E update(E entity)
    {
        return (E) currentSession().merge(entity);
    }

    public List<E> findAll(){
        return list(criteria());
    }

    @SuppressWarnings("rawtypes")
	public List getQuery(String query){
    	return currentSession().getNamedQuery(query).list();
    }

    protected Session currentSession() {
        return this.sessionFactory.getCurrentSession();
    }
    
    public ClassMetadata getMetaData(Class<?> className){
    	return this.sessionFactory.getClassMetadata(className);
    }

    protected Criteria criteria() {
        return currentSession().createCriteria(entityClass);
    }

    protected Query namedQuery(String queryName) throws HibernateException {
        return currentSession().getNamedQuery(checkNotNull(queryName));
    }


	protected E uniqueResult(Criteria criteria) throws HibernateException {
        return (E) checkNotNull(criteria).uniqueResult();
    }

    protected List<E> list(Criteria criteria) throws HibernateException {
        return checkNotNull(criteria).list();
    }

	}