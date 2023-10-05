package com.bilgeadam.controller;

import com.bilgeadam.repository.entity.Kullanici;
import com.bilgeadam.service.KullaniciService;

import java.util.List;
import java.util.Optional;

public class KullaniciController {
    KullaniciService kullaniciService;


    public KullaniciController(){
        this.kullaniciService = new KullaniciService();
    }

    public Kullanici save(Kullanici user){
        return kullaniciService.save(user);
    }

    public List<Kullanici> findAll(){
        return kullaniciService.findAll();
    }

    public Optional<Kullanici> findById(Long id){
        return kullaniciService.findById(id);
    }

    public Iterable<Kullanici> saveAll(Iterable<Kullanici> entities){
        return kullaniciService.saveAll(entities);
    }
    public void delete(Kullanici entity) {
        kullaniciService.delete(entity);
    }
    public void deleteById(Long id) {
        kullaniciService.deleteById(id);
    }
    public boolean existById(Long id) {
        return kullaniciService.existById(id);
    }
    public List<Kullanici> findByEntity(Kullanici entity) {
        return kullaniciService.findByEntity(entity);
    }
    public List<Kullanici> findByColumnNameAndValue(String columnName, String value) {
        return kullaniciService.findByColumnNameAndValue(columnName,value);
    }
}