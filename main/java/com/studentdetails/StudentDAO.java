package com.studentdetails;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;





@Repository
public class StudentDAO {
@Autowired
StudentRepo sr;
public String getall(List<Student> a) {
	sr.saveAll(a);
	return "added";
}
public Optional<Student> get(int id) {
	return sr.findById(id);
}
public String update(int i, Student e) {
	Student s = sr.findById(i).get();
s.setName(e.getName());
	 sr.save(s);
	 return "updated";
}
public String delete(int b) {
	sr.deleteById(b);
	return "deleted";
}

public String getage(Student age){
	sr.save(age);
	return "finded";
}
}
