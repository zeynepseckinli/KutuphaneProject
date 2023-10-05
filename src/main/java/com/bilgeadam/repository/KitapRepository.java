package com.bilgeadam.repository;


import com.bilgeadam.repository.entity.Kitap;
import com.bilgeadam.utility.MyFactoryRepository;

public class KitapRepository extends MyFactoryRepository<Kitap,Long> {
    public KitapRepository() {
        super(new Kitap());
    }
}

