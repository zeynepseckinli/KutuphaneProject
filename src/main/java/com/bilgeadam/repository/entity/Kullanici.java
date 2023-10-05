package com.bilgeadam.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "tbl_kullanici")
public class Kullanici {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String ad;
    @Column(nullable = false)
    private String soyad;
    @Column(nullable = false,length = 11)
    private String tcKimlik;
    private String telefonNo;
    @Column(nullable = false)
    private Double paraMiktari;
    private List<String> satinAlinanKitaplar;
    @Embedded
    BaseEntity baseEntity;
}
