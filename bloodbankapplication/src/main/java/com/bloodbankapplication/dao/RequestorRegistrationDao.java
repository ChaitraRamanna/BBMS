package com.bloodbankapplication.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.bloodbankapplication.model.RequestorDetails;

public interface RequestorRegistrationDao extends JpaRepository<RequestorDetails, Integer> {

	public abstract RequestorDetails findByIdAndPasswordIn(int id, String password);
	
	@Query(value = "SELECT * FROM requestor_details requestor WHERE requestor.status = 'Submitted'", nativeQuery = true)
	List<RequestorDetails> findByStatus();
	@Modifying
	@Query(value ="UPDATE requestor_details requestor SET requestor.status='Accepted' WHERE requestor.id = :id ", nativeQuery = true)
	void searchById(@Param("id") Integer id);
	@Modifying
	@Query(value = "UPDATE requestor_details requestor SET requestor.status='Rejected' WHERE requestor.id = :id " , nativeQuery = true)
	void updateById(@Param("id") Integer id);

}
