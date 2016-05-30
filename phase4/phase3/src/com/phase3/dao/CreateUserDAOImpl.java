package com.phase3.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
 
import com.phase3.models.User;

@Repository("CreateUserDAO")
public class CreateUserDAOImpl extends AbstractDAO<Integer, User> implements CreateUserDAO {
	
	public User findById(int id) {
        return getByKey(id);
    }
 
    public void saveUser(User user) {
        persist(user);
    }
 
    public void deleteUser(int id) {
        Query query = getSession().createSQLQuery("delete from Users where id = :id");
        query.setLong("id", id);
        query.executeUpdate();
    }
 
    @SuppressWarnings("unchecked")
    public List<User> findAllUsers() {
        Criteria criteria = createEntityCriteria();
        return (List<User>) criteria.list();
    }
 
    public User findUser(int id) {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("id", id));
        return (User) criteria.uniqueResult();
    }

}
