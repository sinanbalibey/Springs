package com.Elasticsearch.Elasticsearch.api;

import com.Elasticsearch.Elasticsearch.entity.Kisi;
import com.Elasticsearch.Elasticsearch.repository.KisiRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;
import java.util.List;


@RestController
@RequestMapping("/kisi")
public class KisiController {

    private final KisiRepository kisiRepository;

    @PostConstruct
    public void init(){
        Kisi kisi=new Kisi();
        kisi.setAd("Sinan");
        kisi.setSoyad("Balibey");
        kisi.setAdres("eLAZIĞ");
        kisi.setDogumTarihi(Calendar.getInstance().getTime());
        kisiRepository.save(kisi);
    }

    public KisiController(KisiRepository kisiRepository) {
        this.kisiRepository = kisiRepository;
    }

    /*@GetMapping("/{search}")
    public ResponseEntity<List<Kisi>> getKisi(@PathVariable String search){
        List<Kisi> kisiler = kisiRepository.getByCustomQuery(search);
        return ResponseEntity.ok(kisiler);
    }*/

    @GetMapping("/{search}")
    public ResponseEntity<List<Kisi>> getKisi(@PathVariable String search){
        List<Kisi> kisiler = kisiRepository.findByAdLikeOrSoyadLike(search,search);
        return ResponseEntity.ok(kisiler);
    }

}
