package com.bilgeadam.repository.entity;

import com.bilgeadam.enums.EKitapTur;
import com.bilgeadam.enums.EYayinEvi;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "tbl_kitap")
public class Kitap {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String ad;
    @Column(nullable = false)
    private Long yazarId;
    @Column(nullable = false)
    private String yazarAdi;
    @Enumerated
    private EKitapTur tur;
    @Column(nullable = false)
    private Long sayfaSayisi;
    @Enumerated
    private EYayinEvi yayinEvi;
    @Column(nullable = false)
    @Builder.Default
    private LocalDate yayinTarihi = LocalDate.now();
    @Column(unique = true)
    private String isbn;
    @Column(nullable = false)
    @Builder.Default
    private Long adet = 0L;
    @Column(nullable = false)
    @Builder.Default
    private Long fiyat = 0L;
    @Column(nullable = false)
    @Builder.Default
    private Boolean satistaMi = false;
    @Embedded
    BaseEntity baseEntity;
}