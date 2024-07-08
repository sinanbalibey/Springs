package com.SwaggerApiDocs.SwaggerApiDocs;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import jakarta.annotation.PostConstruct;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/pets")
@Api(value = "Benim Pet API docs")
public class PetController {


    private List<Pet> petList=new ArrayList<>();

    @PostConstruct
    public void init(){

        petList.add(new Pet(1,"Test Pet",new Date()));
    }

    @PostMapping
    @ApiOperation(value = "Yeni Pet ekleme Methodu",notes = "Bu methodu dikkatlı kullan")
    public ResponseEntity<Pet> kaydet(@RequestBody @ApiParam(value = "hayvan") Pet pet){
        petList.add(pet);
        return ResponseEntity.ok(pet);
    }

    @GetMapping
    @ApiOperation(value = " Pet Listesi Methodu",notes = "Bu methodu tümünü getirir ")
    public ResponseEntity<List<Pet>> tumunuListele(){
        return ResponseEntity.ok(petList);
    }
}
