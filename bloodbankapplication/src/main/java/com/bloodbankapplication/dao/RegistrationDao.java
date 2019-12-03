package com.bloodbankapplication.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.bloodbankapplication.model.DonorDetails;

public interface RegistrationDao extends JpaRepository<DonorDetails, Integer> {
	
	public abstract DonorDetails findByIdAndPasswordIn(int id, String password);
	
	
	@Query(value = "SELECT * FROM donor_details donor WHERE donor.status = 'Accepted'", nativeQuery = true)
	List<DonorDetails> readByStatus();

	@Query(value = "SELECT * FROM donor_details donor WHERE donor.status = 'Submitted'", nativeQuery = true)
	List<DonorDetails> findByStatus();
	@Modifying
	@Query(value ="UPDATE donor_details donor SET donor.status='Accepted' WHERE donor.id = :id ", nativeQuery = true)
	void searchById(@Param("id") Integer id);
	@Modifying
	@Query(value = "UPDATE donor_details donor SET donor.status='Rejected' WHERE donor.id = :id " , nativeQuery = true)
	void updateById(@Param("id") Integer id);
}