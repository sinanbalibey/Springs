package com.example.demo.repository;

import com.example.demo.entity.Kullanici;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface KullaniciRepository extends MongoRepository<Kullanici, String> {


}
