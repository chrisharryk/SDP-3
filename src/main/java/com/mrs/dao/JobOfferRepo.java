package com.mrs.dao;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mrs.pojo.JobOffers;

public interface JobOfferRepo extends JpaRepository<JobOffers, UUID>
{

}
