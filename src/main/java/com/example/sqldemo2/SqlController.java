package com.example.sqldemo2;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:8081")
@RequestMapping("/api/sql")
@RequiredArgsConstructor
public class SqlController {

    private final SqlService service;

    @GetMapping("/test")
    public void test(){
        DbValue dbValue = new DbValue();
        dbValue.setHai("oki2");
        dbValue.setHai2("doki2");

        service.createFirsttable(dbValue);
    }

}
