package com.via.springbootweb;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
@CrossOrigin("*")
@RequestMapping(path="/api")
public class signupcontroller {
	@RequestMapping(path="/courses" , method=RequestMethod.POST)
	public ResponseEntity<Void> addCourse(@RequestBody Course course){
		System.out.println(course);
		courseRepo.save(course);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
}
