package com.PostgreSql.PostgreSql.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "kisi_adres")
public class Adres implements Serializable {

    @Id
    @SequenceGenerator(name = "seq_kisi_adres",allocationSize = 1)
    @GeneratedValue(generator = "seq_kisi_adres",strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(length = 500,name="adres")
    private String adres;

    @Enumerated
    private AdresTip adresTip;

    @Column(name="aktif")
    private Boolean aktif;

    @ManyToOne
    @JoinColumn(name = "kisi_adres_id")
    private Kisi kisi;

    public enum AdresTip{
        EV_ADRESI,
        IS_ADRESI,
        DIGER
    }

    public Adres() {
    }

    public Adres(Long id, String adres, AdresTip adresTip, Boolean aktif, Kisi kisi) {
        this.id = id;
        this.adres = adres;
        this.adresTip = adresTip;
        this.aktif = aktif;
        this.kisi = kisi;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public AdresTip getAdresTip() {
        return adresTip;
    }

    public void setAdresTip(AdresTip adresTip) {
        this.adresTip = adresTip;
    }

    public Boolean getAktif() {
        return aktif;
    }

    public void setAktif(Boolean aktif) {
        this.aktif = aktif;
    }

    public Kisi getKisi() {
        return kisi;
    }

    public void setKisi(Kisi kisi) {
        this.kisi = kisi;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Adres adres1 = (Adres) o;
        return Objects.equals(id, adres1.id) && Objects.equals(adres, adres1.adres) && adresTip == adres1.adresTip && Objects.equals(aktif, adres1.aktif) && Objects.equals(kisi, adres1.kisi);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, adres, adresTip, aktif, kisi);
    }

    @Override
    public String toString() {
        return "Adres{" +
                "id=" + id +
                ", adres='" + adres + '\'' +
                ", adresTip=" + adresTip +
                ", aktif=" + aktif +
                ", kisi=" + kisi +
                '}';
    }
}
