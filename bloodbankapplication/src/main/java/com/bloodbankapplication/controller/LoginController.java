package com.bloodbankapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bloodbankapplication.model.DonorDetails;
import com.bloodbankapplication.model.RequestorDetails;
import com.bloodbankapplication.service.AdminService;
import com.bloodbankapplication.service.RegistrationService;
import com.bloodbankapplication.service.RoleService;

@Controller
public class LoginController {
	@Autowired
	private RegistrationService registrationService;
	@Autowired
	private RoleService roleService;
	@Autowired
	private AdminService adminService;

	@RequestMapping(value = "/register")
	public String registerFunction() {
		return "register";
	}

	@RequestMapping(value = "/registrationsubmit")
	public ModelAndView registrationSubmitFunction(@ModelAttribute DonorDetails donorDetails,
			@ModelAttribute RequestorDetails requestorDetails) {
		ModelAndView modelAndView = new ModelAndView("succesfull");
		
		if (donorDetails.getRole().equalsIgnoreCase("donor")) {
			modelAndView.addObject("key", donorDetails);
			registrationService.saveDonor(donorDetails);

		} else {
			modelAndView.addObject("key", requestorDetails);
			registrationService.saveRequestor(requestorDetails);
		}

		return modelAndView;
	}

	@RequestMapping(value = "/role")
	public String signInFunction() {
		return "role";
	}

	@RequestMapping(value = "/roleSubmit")
	public String roleFunction(@RequestParam("role") String role, Model model) {
		int roleValidationResult = roleService.roleFunction(role);
		if (roleValidationResult == 1) {
			return "donor_Login";

		} else {
			return "requester_Login";
		}
	}

	@RequestMapping(value = "/signIn")
	public String donorSignInFunction(@RequestParam("id") int id, @RequestParam("password") String pwd, Model model) {
		DonorDetails donorDetails = new DonorDetails();
		donorDetails.setId(id);
		donorDetails.setPassword(pwd);

		DonorDetails donor = registrationService.findByIdAndPasswordIn(donorDetails.getId(),
				donorDetails.getPassword());

		if (donor != null) {
			model.addAttribute("key", donor);
			return "donor_Information";
		} else {
			return "invalid";
		}
	}

	@RequestMapping(value = "/requestsignIn")
	public String requestorSignInFunction(@RequestParam("id") int id, @RequestParam("password") String password,
			Model model) {

		RequestorDetails requestorDetails = new RequestorDetails();

		requestorDetails.setId(id);
		requestorDetails.setPassword(password);

		RequestorDetails requestor = registrationService.readByIdAndPasswordIn(requestorDetails.getId(),
				requestorDetails.getPassword());

		if (requestor != null) {
			model.addAttribute("key", requestor);
			return "requestor_Information";
		} else {
			return "invalid";
		}
	}

	@RequestMapping(value = "/details")
	public ModelAndView donorDetailsForRequestorFunction() {
		ModelAndView modelAndView = new ModelAndView("donor_Check_Requestor");
		List<DonorDetails> listOfDonors = roleService.donorDetailsForRequestorFunction();
		modelAndView.addObject("donorDetails", listOfDonors);
		return modelAndView;
	}

	@RequestMapping(value = "/admin")
	public String adminLoginFunction() {
		return "admin_Login";
	}

	@RequestMapping(value = "/adminLogin")
	public String adminHomeFunction(@RequestParam("id") int id, @RequestParam("password") String password) {
		int result = adminService.adminValidation(id, password);
		if (result == 1) {
			return "admin_UpdateStatus";
		} else {
			return "invalid";
		}

	}

	@RequestMapping(value = "/UpdateStatus")
	public ModelAndView updateDonorStatusFunction() {
		List<DonorDetails> list = adminService.updateDonorStatus();
		List<RequestorDetails> list1 = adminService.updateRequestorStatus();
		ModelAndView modelAndView = new ModelAndView("donor_DetailsForAdmin");
		modelAndView.addObject("details", list);
		modelAndView.addObject("key", list1);
		return modelAndView;
	}
	
	 @RequestMapping(value = "/accept") 
	 public String acceptRequestFunction(@RequestParam("id") int id, @RequestParam("role") String role) {
	  adminService.findByIdAndRole(id, role); 
	  return "admin_UpdateStatus"; 
	  }
	 
	  @RequestMapping(value = "/reject") 
	  public String rejectRequestFunction(@RequestParam("id") int id, @RequestParam("role") String role) {
	  adminService.updateByIdAndRole(id, role); 
	  return "admin_UpdateStatus"; 
	  }
	
}
