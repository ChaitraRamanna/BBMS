package com.bloodbankapplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bloodbankapplication.dao.RegistrationDao;
import com.bloodbankapplication.model.DonorDetails;

@Service
public class RoleServiceImpl implements RoleService {

	private String role = "donor";

	@Autowired
	private RegistrationDao registrationDao;

	@Override

	public int roleFunction(String roleEntered) {
		if (role.equalsIgnoreCase(roleEntered)) {
			return 1;
		} else {
			return 0;
		}

	}

	@Override
	public List<DonorDetails> donorDetailsForRequestorFunction() {
		List<DonorDetails> listOfDonors = registrationDao.readByStatus();
		return listOfDonors;
	}
}
