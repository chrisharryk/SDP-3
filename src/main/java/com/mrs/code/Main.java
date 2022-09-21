package com.mrs.code;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mrs.dao.StudentRepo;
import com.mrs.pojo.Student;

public class Main {
	@Autowired
	StudentRepo repo;
	public List<Student> getAllstudents()
	{
		
		List<Student> l=repo.findAll();
		return l;
	}

}
