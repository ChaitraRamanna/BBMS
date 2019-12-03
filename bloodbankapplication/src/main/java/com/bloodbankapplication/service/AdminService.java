package com.bloodbankapplication.service;

import java.util.List;

import com.bloodbankapplication.model.DonorDetails;
import com.bloodbankapplication.model.RequestorDetails;

public interface AdminService {
	public abstract int adminValidation(int id, String password);

	public abstract List<DonorDetails> updateDonorStatus();
	
	public abstract List<RequestorDetails> updateRequestorStatus();
	
	public abstract void findByIdAndRole(int id, String role);
	
	public abstract void updateByIdAndRole(int id, String role);
	
}
