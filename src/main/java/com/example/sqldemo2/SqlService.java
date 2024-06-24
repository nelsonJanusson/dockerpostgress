package com.example.sqldemo2;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SqlService {
    private final SqlRepository repository;

    public void createFirsttable(firsttable firsttable) {
         repository.save(firsttable);
    }
}
