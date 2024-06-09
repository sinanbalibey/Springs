package com.PostgreSql.PostgreSql.entity;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "kisi")
public class Kisi {

    @Id
    @SequenceGenerator(name = "seq_kisi",allocationSize = 1)
    @GeneratedValue(generator = "seq_kisi",strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(length = 100,name="adi")
    private String adi;

    @Column(length = 100,name="soyadi")
    private String soyadi;

    @OneToMany
    @JoinColumn(name = "kisi_adres_id")
    private List<Adres> adresleri;

    public Kisi(){

    }

    public Kisi(Long id, String adi, String soyadi, List<Adres> adresleri) {
        this.id = id;
        this.adi = adi;
        this.soyadi = soyadi;
        this.adresleri = adresleri;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public List<Adres> getAdresleri() {
        return adresleri;
    }

    public void setAdresleri(List<Adres> adresleri) {
        this.adresleri = adresleri;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kisi kisi = (Kisi) o;
        return Objects.equals(id, kisi.id) && Objects.equals(adi, kisi.adi) && Objects.equals(soyadi, kisi.soyadi) && Objects.equals(adresleri, kisi.adresleri);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, adi, soyadi, adresleri);
    }

    @Override
    public String toString() {
        return "Kisi{" +
                "id=" + id +
                ", adi='" + adi + '\'' +
                ", soyadi='" + soyadi + '\'' +
                ", adresleri=" + adresleri +
                '}';
    }
}
