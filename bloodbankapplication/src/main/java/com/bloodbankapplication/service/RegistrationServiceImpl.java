package com.bloodbankapplication.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bloodbankapplication.dao.RegistrationDao;
import com.bloodbankapplication.dao.RequestorRegistrationDao;

import com.bloodbankapplication.model.DonorDetails;
import com.bloodbankapplication.model.RequestorDetails;

@Service
public class RegistrationServiceImpl implements RegistrationService {
	@Autowired
	private RegistrationDao registrationDao;
	@Autowired
	private RequestorRegistrationDao requestorRegistrationDao;
	private int s = 0;
	private DonorDetails donor = null;
	private RequestorDetails requestor = null;
	

	@Override
	public DonorDetails saveDonor(DonorDetails donorDetails) {
		return registrationDao.save(donorDetails);
	}

	@Override
	public RequestorDetails saveRequestor(RequestorDetails requestorDetails) {
		return requestorRegistrationDao.save(requestorDetails);
	}

@Override
@Transactional
public DonorDetails findByIdAndPasswordIn(int id, String password) {
	DonorDetails donorDetails = registrationDao.findByIdAndPasswordIn(id, password);
	try {
		if (donorDetails.getId() != 0) {

			if (donorDetails.getId() == id && donorDetails.getPassword().equalsIgnoreCase(password)) {
				s = 1;
			} else {
				s = 0;
			}

		} else {
			s = 0;
		}
	} catch (Exception e) {

		e.printStackTrace();
	}
	if (s == 1) {
		return donorDetails;
	} else {
		return donor;
	}
}

@Override
@Transactional
public RequestorDetails readByIdAndPasswordIn(int id, String password) {
	RequestorDetails requestorDetails = requestorRegistrationDao.findByIdAndPasswordIn(id, password);
	try {
		if (requestorDetails.getId() != 0) {

			if (requestorDetails.getId() == id && requestorDetails.getPassword().equalsIgnoreCase(password)) {
				s = 1;
			} else {
				s = 0;
			}

		} else {
			s = 0;
		}
	} catch (Exception e) {

		e.printStackTrace();
	}
	if (s == 1) {
		return requestorDetails;
	} else {
		return requestor;
	}
}
}