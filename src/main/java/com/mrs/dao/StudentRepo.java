package com.mrs.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.mrs.pojo.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, String>
{
	@Query("select s from Student s where s.userID=?1 and s.password=?2 ")
	public Student checkLogin(String id,String password);
}
