package com.example.server.dao;

import com.example.server.entity.DummyEntity;

/**
 * Plain DAO which provides only {@link com.example.server.dao.impl.GenericHibernateDAOImpl} methods
 */
public interface DummyDAO extends GenericDAO<DummyEntity, Long> {
}
