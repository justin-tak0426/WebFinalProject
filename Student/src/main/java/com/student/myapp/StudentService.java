package com.student.myapp;

import java.util.List;

public interface StudentService {
	public int insertStudent(StudentVO vo);
	public int deleteStudent(int id);
	public int updateStudent(StudentVO vo);
	public StudentVO getStudent(int seq);
	public List<StudentVO> getStudentList();
}
