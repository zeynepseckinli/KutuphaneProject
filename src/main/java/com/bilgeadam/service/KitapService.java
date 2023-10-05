package com.bilgeadam.service;

import com.bilgeadam.repository.KitapRepository;
import com.bilgeadam.repository.entity.Kitap;

import java.util.List;
import java.util.Optional;

public class KitapService  {
    KitapRepository kitapRepository;


    public KitapService(){
        this.kitapRepository = new KitapRepository();
    }

    public Kitap save(Kitap user){
        return kitapRepository.save(user);
    }

    public List<Kitap> findAll(){
        return kitapRepository.findAll();
    }

    public Optional<Kitap> findById(Long id){
        return kitapRepository.findById(id);
    }

    public Iterable<Kitap> saveAll(Iterable<Kitap> entities){
        return kitapRepository.saveAll(entities);
    }
    public void delete(Kitap entity) {
        kitapRepository.delete(entity);
    }
    public void deleteById(Long id) {
        kitapRepository.deleteById(id);
    }
    public boolean existById(Long id) {
        return kitapRepository.existById(id);
    }
    public List<Kitap> findByEntity(Kitap entity) {
        return kitapRepository.findByEntity(entity);
    }
    public List<Kitap> findByColumnNameAndValue(String columnName, String value) {
        return kitapRepository.findByColumnNameAndValue(columnName,value);
    }


}
