package com.studentdetails;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;








@Service
public class StudentService {
@Autowired
StudentDAO sd;
public String getall(List<Student> a) {
	return sd.getall(a);
}
public Optional<Student> get(int id) {
	return sd.get(id);
}
public String update(int i,Student e) {
	return sd.update(i,e);
}
public String delete(int b) {
	return sd.delete(b);
}
public String getage(Student age)throws AgeException{
	try {
	if(age.getAge()>=18) {
	return sd.getage(age);
}
		else {
			throw new AgeException("not eligible");
		}
	}
	catch(AgeException ce) {
		return "Exception handled";
	}
}
}