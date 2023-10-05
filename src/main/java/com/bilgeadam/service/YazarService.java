package com.bilgeadam.service;


import com.bilgeadam.repository.KitapRepository;
import com.bilgeadam.repository.YazarRepository;
import com.bilgeadam.repository.entity.Kitap;
import com.bilgeadam.repository.entity.Yazar;

import java.util.List;
import java.util.Optional;

public class YazarService {
    YazarRepository yazarRepository;


    public YazarService(){
        this.yazarRepository = new YazarRepository();
    }

    public Yazar save(Yazar user){
        return yazarRepository.save(user);
    }

    public List<Yazar> findAll(){
        return yazarRepository.findAll();
    }

    public Optional<Yazar> findById(Long id){
        return yazarRepository.findById(id);
    }

    public Iterable<Yazar> saveAll(Iterable<Yazar> entities){
        return yazarRepository.saveAll(entities);
    }
    public void delete(Yazar entity) {
        yazarRepository.delete(entity);
    }
    public void deleteById(Long id) {
        yazarRepository.deleteById(id);
    }
    public boolean existById(Long id) {
        return yazarRepository.existById(id);
    }
    public List<Yazar> findByEntity(Yazar entity) {
        return yazarRepository.findByEntity(entity);
    }
    public List<Yazar> findByColumnNameAndValue(String columnName, String value) {
        return yazarRepository.findByColumnNameAndValue(columnName,value);
    }
}
