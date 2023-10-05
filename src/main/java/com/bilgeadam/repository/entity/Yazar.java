package com.bilgeadam.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "tbl_yazar")
public class Yazar {

    Long id;

    @Column(nullable = false)
    private String ad;
    @Column(nullable = false)
    private String soyad;
    private LocalDate dogumTarihi;
    private LocalDate olumTarihi;
    private String ulke;
    private String biyografi;
    private List<Kitap> kitaplari;//select from kiitap tbl_
    @Embedded
    BaseEntity baseEntity;
}