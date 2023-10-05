package com.bilgeadam.utility;

import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;
import java.util.Optional;

public class MyFactoryService<T,ID> implements ICrud<T,ID> {

    MyFactoryRepository<T, ID> myFactoryRepository;

    public MyFactoryService(T entity) {
        this.myFactoryRepository = new MyFactoryRepository<>(entity);
    }

    @Override
    public T save(T entity) {
        return (T) myFactoryRepository.save(entity);
    }

    @Override
    public Iterable<T> saveAll(Iterable<T> entities) {
        return (List<T>)myFactoryRepository.saveAll(entities);
    }

    @Override
    public void delete(T entity) {
        myFactoryRepository.delete(entity);

    }

    @Override
    public void deleteById(ID id) {
        myFactoryRepository.deleteById(id);
    }

    @Override
    public Optional<T> findById(ID id) {
        return myFactoryRepository.findById(id);
    }

    @Override
    public boolean existById(ID id) {
        return myFactoryRepository.existById(id);
    }

    @Override
    public List<T> findAll() {
        return myFactoryRepository.findAll();
    }

    @Override
    public List<T> findByEntity(T entity) {
        return myFactoryRepository.findByEntity(entity);
    }

    @Override
    public List<T> findByColumnNameAndValue(String columnName, String columnvalue) {
        return myFactoryRepository.findByColumnNameAndValue(columnName,columnvalue);
    }
}
