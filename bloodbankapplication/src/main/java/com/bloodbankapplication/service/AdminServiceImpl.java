package com.bloodbankapplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bloodbankapplication.dao.RegistrationDao;
import com.bloodbankapplication.dao.RequestorRegistrationDao;
import com.bloodbankapplication.model.DonorDetails;
import com.bloodbankapplication.model.RequestorDetails;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private RegistrationDao registrationDao;

	@Autowired
	private RequestorRegistrationDao requestorRegistrationDao;

	@Override
	@Transactional
	public int adminValidation(int id, String password) {
		if (id == 12345 && password.equalsIgnoreCase("admin")) {
			return 1;
		} else {
			return 0;
		}
	}

	@Override

	@Transactional
	public List<DonorDetails> updateDonorStatus() {
		List<DonorDetails> list = registrationDao.findByStatus();
		return list;
	}

	@Override

	@Transactional
	public List<RequestorDetails> updateRequestorStatus() {
		List<RequestorDetails> list = requestorRegistrationDao.findByStatus();
		return list;
	}

	@Override

	@Transactional
	public void findByIdAndRole(int id, String role) {
		if (role.equalsIgnoreCase("donor")) {
			registrationDao.searchById(id);
		} else {
			requestorRegistrationDao.searchById(id);
		}

	}

	@Override

	@Transactional
	public void updateByIdAndRole(int id, String role) {
		if (role.equalsIgnoreCase("donor")) {
			registrationDao.updateById(id);
		} else {
			requestorRegistrationDao.updateById(id);
		}

	}
}
