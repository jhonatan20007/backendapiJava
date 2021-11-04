package com.example.demo;

import java.util.stream.Stream;

import com.example.demo.student.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;


@SpringBootApplication

public class DemoApplication implements CommandLineRunner {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String sql= "SELECT * from student";
		Stream<student> student =  jdbcTemplate.queryForStream(sql, BeanPropertyRowMapper.newInstance(student.class));
		
		student.forEach(System.out :: println);
	}

}


