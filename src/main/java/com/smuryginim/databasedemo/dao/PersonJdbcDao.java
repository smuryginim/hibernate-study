package com.smuryginim.databasedemo.dao;

import com.smuryginim.databasedemo.model.DbPerson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonJdbcDao {

    @Autowired
    public JdbcTemplate jdbcTemplate;

    public List<DbPerson> findAll() {
        return jdbcTemplate.query("select * from person", new BeanPropertyRowMapper<>(DbPerson.class));
    }

}
