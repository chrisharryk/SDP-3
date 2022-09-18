package com.mrs.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mrs.pojo.Student;

public interface StudentRepo extends JpaRepository<Student, String>
{

}
