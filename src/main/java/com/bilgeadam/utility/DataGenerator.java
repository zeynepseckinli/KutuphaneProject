package com.bilgeadam.utility;

import com.bilgeadam.controller.KitapController;
import com.bilgeadam.controller.KullaniciController;

import com.bilgeadam.controller.YazarController;
import com.bilgeadam.enums.EKitapTur;
import com.bilgeadam.enums.EYayinEvi;
import com.bilgeadam.repository.entity.Kitap;
import com.bilgeadam.repository.entity.Kullanici;
import com.bilgeadam.repository.entity.Yazar;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public class DataGenerator {

    public DataGenerator(){
        this.kitapController = new KitapController();
        this.kullaniciController = new KullaniciController();
        this.yazarController = new YazarController();

    }
    KullaniciController kullaniciController;
    YazarController yazarController;
    KitapController kitapController;
    public List<Kullanici> kullaniciListOlustur(){
        Kullanici kullanici = Kullanici.builder()
                .ad("ayşe")
                .soyad("pembe")
                .paraMiktari(1000.0)
                .tcKimlik("12345478888")
                .telefonNo("1234564789")
                .build();
        Kullanici kullanici1 = Kullanici.builder()
                .ad("selin")
                .soyad("beyaz")
                .paraMiktari(1000.0)
                .tcKimlik("12345478888")
                .telefonNo("1234564789")
                .build();
        Kullanici kullanici2 = Kullanici.builder()
                .ad("hayriye")
                .soyad("kırmızı")
                .paraMiktari(1000.0)
                .tcKimlik("12345478888")
                .telefonNo("1234564789")
                .build();
        Kullanici kullanici3 = Kullanici.builder()
                .ad("Melis")
                .soyad("kara")
                .paraMiktari(1000.0)
                .tcKimlik("12345678911")
                .telefonNo("1234564789")
                .build();

        return (List<Kullanici>) kullaniciController.saveAll(List.of(kullanici,kullanici1,kullanici2,kullanici3));
    }
    public List<Yazar> yazarListOlustur(){
        Yazar yazar = Yazar.builder()
                .ulke("afganistan")
                .biyografi("dadasdasdasd")
                .soyad("mahmutoğlu")
                .ad("mahmut")
                .olumTarihi(LocalDate.of(1995,2,2))
                .dogumTarihi(LocalDate.of(1940,1,1))
                .build();
        Yazar yazar1 = Yazar.builder()
                .ulke("pakistan")
                .biyografi("dadasdasdasd")
                .soyad("kelebek")
                .ad("hasan")
                .olumTarihi(LocalDate.of(1995,2,2))
                .dogumTarihi(LocalDate.of(1940,1,1))
                .build();
        Yazar yazar2 = Yazar.builder()
                .ulke("türkiye")
                .biyografi("dadasdasdasd")
                .soyad("arı")
                .ad("mehmet")
                .olumTarihi(LocalDate.of(1995,2,2))
                .dogumTarihi(LocalDate.of(1940,1,1))
                .build();
        Yazar yazar3 = Yazar.builder()
                .ulke("fransa")
                .biyografi("dadasdasdasd")
                .soyad("böcek")
                .ad("ali")
                .olumTarihi(LocalDate.of(1995,2,2))
                .dogumTarihi(LocalDate.of(1940,1,1))
                .build();
        Yazar yazar4 = Yazar.builder()
                .ulke("katar")
                .biyografi("dadasdasdasd")
                .soyad("mor")
                .ad("ekrem")
                .olumTarihi(LocalDate.of(1995,2,2))
                .dogumTarihi(LocalDate.of(1940,1,1))
                .build();

        return (List<Yazar>) yazarController.saveAll(List.of(yazar,yazar1,yazar2,yazar3,yazar4));
    }

    public List<Kitap> kitapOlustur(List<Yazar> yazarList){
        Kitap kitap = Kitap.builder()
                .satistaMi(true)
                .tur(EKitapTur.GIZEM)
                .yazarAdi(yazarList.get(0).getAd())
                .adet(30L)
                .isbn(UUID.randomUUID().toString())
                .fiyat(300L)
                .yayinEvi(EYayinEvi.KIRMIZI_KEDI)
                .sayfaSayisi(30L)
                .yazarId(yazarList.get(0).getId())
                .ad("güccük prens")
                .build();
        Kitap kitap1 = Kitap.builder()
                .satistaMi(true)
                .tur(EKitapTur.SUC)
                .yazarAdi(yazarList.get(1).getAd())
                .adet(123542L)
                .isbn(UUID.randomUUID().toString())
                .fiyat(95L)
                .yayinEvi(EYayinEvi.YASON_YAYIN_EVI)
                .sayfaSayisi(222L)
                .yazarId(yazarList.get(1).getId())
                .ad("Istanbul Yer6")
                .build();
        Kitap kitap2 = Kitap.builder()
                .satistaMi(true)
                .tur(EKitapTur.BIYOGRAFIK)
                .yazarAdi(yazarList.get(0).getAd())
                .adet(80L)
                .isbn(UUID.randomUUID().toString())
                .fiyat(70L)
                .yayinEvi(EYayinEvi.KIRMIZI_KEDI)
                .sayfaSayisi(370L)
                .yazarId(yazarList.get(0).getId())
                .ad("Antep'in Hamamları")
                .build();
        Kitap kitap3 = Kitap.builder()
                .satistaMi(true)
                .tur(EKitapTur.MACERA)
                .yazarAdi(yazarList.get(1).getAd())
                .adet(2000L)
                .isbn(UUID.randomUUID().toString())
                .fiyat(2000L)
                .yayinEvi(EYayinEvi.KIRMIZI_KEDI)
                .sayfaSayisi(27L)
                .yazarId(yazarList.get(1).getId())
                .ad("Muhammet Hocanın Yolu")
                .build();
        Kitap kitap4 = Kitap.builder()
                .satistaMi(true)
                .tur(EKitapTur.GIZEM)
                .yazarAdi(yazarList.get(2).getAd())
                .adet(700L)
                .isbn(UUID.randomUUID().toString())
                .fiyat(700L)
                .yayinEvi(EYayinEvi.POZITIF_YAYIN)
                .sayfaSayisi(700L)
                .yazarId(yazarList.get(2).getId())
                .ad("Kitapsızın Kitabı")
                .build();
        Kitap kitap5 = Kitap.builder()
                .satistaMi(true)
                .tur(EKitapTur.BIYOGRAFIK)
                .yazarAdi(yazarList.get(4).getAd())
                .adet(300000L)
                .isbn(UUID.randomUUID().toString())
                .fiyat(3L)
                .yayinEvi(EYayinEvi.KARDELEN_YAYIN_EVI)
                .sayfaSayisi(0L)
                .yazarId(yazarList.get(4).getId())
                .ad("Berhan'ın kitabi")
                .build();
        Kitap kitap6 = Kitap.builder()
                .satistaMi(true)
                .tur(EKitapTur.POLISIYE)
                .yazarAdi(yazarList.get(3).getAd())
                .adet(1L)
                .isbn(UUID.randomUUID().toString())
                .fiyat(300000L)
                .yayinEvi(EYayinEvi.YASON_YAYIN_EVI)
                .sayfaSayisi(2L)
                .yazarId(yazarList.get(3).getId())
                .ad("Zeynep'in kitabı")
                .build();
        Kitap kitap7 = Kitap.builder()
                .satistaMi(true)
                .tur(EKitapTur.AKSIYON)
                .yazarAdi(yazarList.get(3).getAd())
                .adet(15L)
                .isbn(UUID.randomUUID().toString())
                .fiyat(30000L)
                .yayinEvi(EYayinEvi.KIRMIZI_KEDI)
                .sayfaSayisi(1L)
                .yazarId(yazarList.get(3).getId())
                .ad("Yeliz'in kitabı")
                .build();
        Kitap kitap8 = Kitap.builder()
                .satistaMi(true)
                .tur(EKitapTur.SUC)
                .yazarAdi(yazarList.get(2).getAd())
                .adet(3000L)
                .isbn(UUID.randomUUID().toString())
                .fiyat(3000L)
                .yayinEvi(EYayinEvi.POZITIF_YAYIN)
                .sayfaSayisi(700L)
                .yazarId(yazarList.get(2).getId())
                .ad("Alperen Hocanın Kitabı")
                .build();
        Kitap kitap9 = Kitap.builder()
                .satistaMi(true)
                .tur(EKitapTur.OTOBIYOGRAFIK)
                .yazarAdi(yazarList.get(1).getAd())
                .adet(3000L)
                .isbn(UUID.randomUUID().toString())
                .fiyat(30L)
                .yayinEvi(EYayinEvi.KARDELEN_YAYIN_EVI)
                .sayfaSayisi(10L)
                .yazarId(yazarList.get(1).getId())
                .ad("cin ali koşuda")
                .build();
        return (List<Kitap>) kitapController.saveAll(List.of(kitap,kitap1,kitap2,kitap3,kitap4,kitap5,kitap6,kitap7,kitap8,kitap9));

    }

    public void dataOlustur(){
        kullaniciListOlustur();
        List<Yazar> yazarList=yazarListOlustur();
       // List<Kitap> kitapList=kitapOlustur(yazarList);
      //  yazarKitaplariniGuncelle(kitapList,yazarList);
    }


}