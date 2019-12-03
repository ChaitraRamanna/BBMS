package com.bloodbankapplication.service;

import com.bloodbankapplication.model.DonorDetails;
import com.bloodbankapplication.model.RequestorDetails;

public interface RegistrationService {

	public abstract DonorDetails saveDonor(DonorDetails donorDetails);

	public abstract RequestorDetails saveRequestor(RequestorDetails requestorDetails);

	public abstract DonorDetails findByIdAndPasswordIn(int id, String password);
	
	public abstract RequestorDetails readByIdAndPasswordIn(int id, String password);
}
