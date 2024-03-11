package com.studentdetails;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class StudentController {
@Autowired
StudentService ss;
@PostMapping("/getall")
public String getall(@RequestBody List<Student> a) {
	return  ss.getall(a); 
}
@GetMapping("/get/{id}")
public Optional<Student> get(@PathVariable int id) {
	return ss.get(id);
}
@PutMapping("/update/{i}")
public String update(@PathVariable int i, @RequestBody Student e) {
	return ss.update(i,e);
}
@DeleteMapping("/delete/{b}")
public String delete(@PathVariable int b) {
	return ss.delete(b);
}
@PostMapping("/getage")
public String getage(@RequestBody Student age) throws AgeException {
	return ss.getage(age);
}
}
