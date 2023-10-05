package com.bilgeadam.controller;

import com.bilgeadam.repository.entity.Yazar;
import com.bilgeadam.service.YazarService;

import java.util.List;
import java.util.Optional;

public class YazarController {
    YazarService yazarService;


    public YazarController(){
        this.yazarService = new YazarService();
    }

    public Yazar save(Yazar user){
        return yazarService.save(user);
    }

    public List<Yazar> findAll(){
        return yazarService.findAll();
    }

    public Optional<Yazar> findById(Long id){
        return yazarService.findById(id);
    }

    public Iterable<Yazar> saveAll(Iterable<Yazar> entities){
        return yazarService.saveAll(entities);
    }
    public void delete(Yazar entity) {
        yazarService.delete(entity);
    }
    public void deleteById(Long id) {
        yazarService.deleteById(id);
    }
    public boolean existById(Long id) {
        return yazarService.existById(id);
    }
    public List<Yazar> findByEntity(Yazar entity) {
        return yazarService.findByEntity(entity);
    }
    public List<Yazar> findByColumnNameAndValue(String columnName, String value) {
        return yazarService.findByColumnNameAndValue(columnName,value);
    }
}
