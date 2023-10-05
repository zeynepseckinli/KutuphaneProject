package com.bilgeadam.service;


import com.bilgeadam.repository.KitapRepository;
import com.bilgeadam.repository.KullaniciRepository;
import com.bilgeadam.repository.entity.Kitap;
import com.bilgeadam.repository.entity.Kullanici;

import java.util.List;
import java.util.Optional;

public class KullaniciService {
    KullaniciRepository kullaniciRepository;


    public KullaniciService(){
        this.kullaniciRepository = new KullaniciRepository();
    }

    public Kullanici save(Kullanici user){
        return kullaniciRepository.save(user);
    }

    public List<Kullanici> findAll(){
        return kullaniciRepository.findAll();
    }

    public Optional<Kullanici> findById(Long id){
        return kullaniciRepository.findById(id);
    }

    public Iterable<Kullanici> saveAll(Iterable<Kullanici> entities){
        return kullaniciRepository.saveAll(entities);
    }
    public void delete(Kullanici entity) {
        kullaniciRepository.delete(entity);
    }
    public void deleteById(Long id) {
        kullaniciRepository.deleteById(id);
    }
    public boolean existById(Long id) {
        return kullaniciRepository.existById(id);
    }
    public List<Kullanici> findByEntity(Kullanici entity) {
        return kullaniciRepository.findByEntity(entity);
    }
    public List<Kullanici> findByColumnNameAndValue(String columnName, String value) {
        return kullaniciRepository.findByColumnNameAndValue(columnName,value);
    }
}