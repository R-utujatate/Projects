package com.restapi.demo.repository;

import com.restapi.demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface studentrepo extends JpaRepository<Student,Integer> {

}
