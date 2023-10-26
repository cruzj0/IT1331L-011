package com.uap.it311l.registrationapi.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.uap.it311l.registrationapi.model.Attendee;
import com.uap.it311l.registrationapi.repository.RegistrationMybatisRepository;

@RestController
public class RegistrationController {
	
	@Autowired
	RegistrationMybatisRepository registrationRepo;

	@PostMapping("/event/register")
	public Attendee register(@RequestBody Attendee student) {
		registrationRepo.insert(student);
		return student;
	}
	
	@GetMapping("/attendees")
	public Attendee[] getAttendees() {
		return registrationRepo.findAll();
	}
	
	@PutMapping("/event/survey/eligibility")
	public Attendee[] markAsEligible() {
		registrationRepo.markEligible();
		return getAttendees();
	}
	
	@DeleteMapping("/event/registration/{id}")
	public String removeAttendee(@RequestBody String attendeeId) {
		registrationRepo.delete(attendeeId);
		return "record deleted.";
	}
}
