package com.example.sqldemo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class SqlRepository  {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int save(firsttable firsttable) {
        return jdbcTemplate.update("INSERT INTO firsttable (hai, hai2, id) VALUES(?,?,?)",
                new Object[] { firsttable.getHai(), firsttable.getHai2(), firsttable.getId() });
    }


}
