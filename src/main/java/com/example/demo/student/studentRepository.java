package com.example.demo.student;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface studentRepository extends JpaRepository<student, Long>{
    //select * from student where email does

    @Query("SELECT s FROM student s WHERE s.email = ?1")
    Optional<student> findstudentByEmail(String email);
}
