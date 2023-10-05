package com.bilgeadam.controller;

import com.bilgeadam.repository.entity.Kitap;
import com.bilgeadam.repository.entity.Kullanici;

import java.util.List;
import java.util.Optional;

public class KitapController {
    KitapController kitapController;


    public KitapController(){
        this.kitapController = new KitapController();
    }

    public Kitap save(Kitap user){
        return kitapController.save(user);
    }

    public List<Kitap> findAll(){
        return kitapController.findAll();
    }

    public Optional<Kitap> findById(Long id){
        return kitapController.findById(id);
    }

    public Iterable<Kitap> saveAll(Iterable<Kitap> entities){
        return kitapController.saveAll(entities);
    }
    public void delete(Kitap entity) {
        kitapController.delete(entity);
    }
    public void deleteById(Long id) {
        kitapController.deleteById(id);
    }
    public boolean existById(Long id) {
        return kitapController.existById(id);
    }
    public List<Kitap> findByEntity(Kitap entity) {
        return kitapController.findByEntity(entity);
    }
    public List<Kitap> findByColumnNameAndValue(String columnName, String value) {
        return kitapController.findByColumnNameAndValue(columnName,value);
    }
}