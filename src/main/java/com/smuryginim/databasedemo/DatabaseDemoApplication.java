package com.smuryginim.databasedemo;

import com.smuryginim.databasedemo.dao.PersonJdbcDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DatabaseDemoApplication implements CommandLineRunner {

    private final Logger logger = LoggerFactory.getLogger(this.getClass().getName());

    @Autowired
    PersonJdbcDao personDao;

    public static void main(String[] args) {
        SpringApplication.run(DatabaseDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("Persons were found -> {}", personDao.findAll());
    }
}
