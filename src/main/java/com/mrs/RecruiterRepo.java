package com.mrs;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RecruiterRepo extends JpaRepository<Recruiter, String>{

//	List<Recruiter> findByUsername(String username);
}
