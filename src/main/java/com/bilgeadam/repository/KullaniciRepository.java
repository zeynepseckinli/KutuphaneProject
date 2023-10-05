package com.bilgeadam.repository;


import com.bilgeadam.repository.entity.Kullanici;
import com.bilgeadam.utility.MyFactoryRepository;

public class KullaniciRepository extends MyFactoryRepository<Kullanici,Long> {
    public KullaniciRepository() {
        super(new Kullanici());
    }
}
