package com.example.server.dao.impl;

import org.springframework.stereotype.Repository;

import com.example.server.dao.DummyDAO;
import com.example.server.entity.DummyEntity;

/**
 * Plain DAO which provides only {@link com.example.server.dao.impl.GenericHibernateDAOImpl} methods
 */
@Repository
public class DummyDAOImpl extends GenericHibernateDAOImpl<DummyEntity, Long> implements DummyDAO {
    
}
