package com.PostgreSql.PostgreSql.Controller;


import com.PostgreSql.PostgreSql.Dto.KisiDto;
import com.PostgreSql.PostgreSql.service.KisiService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/kullanici")
public class KisiController {

    private final KisiService kisiService;

    public KisiController(KisiService kisiService) {
        this.kisiService = kisiService;
    }


    @PostMapping
    public ResponseEntity<KisiDto> kaydet(@RequestBody KisiDto kisiDto){
        return ResponseEntity.ok(kisiService.save(kisiDto));
    }

    @GetMapping
    public ResponseEntity<List<KisiDto>> tumunuListele(){
        return ResponseEntity.ok(kisiService.getAll());
    }
}
