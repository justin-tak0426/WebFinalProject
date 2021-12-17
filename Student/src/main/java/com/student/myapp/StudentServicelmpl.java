package com.student.myapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServicelmpl implements StudentService {
	
	@Autowired
	StudentDAO studentDAO;
	
	@Override
	public int insertStudent(StudentVO vo) {
		return studentDAO.insertStudent(vo);
	}
	
	@Override
	public int updateStudent(StudentVO vo) {
		return studentDAO.updateStudent(vo);
	}
	
	@Override
	public int deleteStudent(int seq) {
		return studentDAO.deleteStudent(seq);
	}
	
	@Override
	public StudentVO getStudent(int seq) {
		return studentDAO.getStudent(seq);
	}
	@Override
	public List<StudentVO> getStudentList() {
		return studentDAO.getStudentList();
	}
	
	
}
