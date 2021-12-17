package com.student.myapp;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDAO {
	
	@Autowired
	SqlSession sqlSession;
	
	public int insertStudent(StudentVO vo) {
		int result = sqlSession.insert("Student.insertStudent", vo);
		return result;
	}
	
	public int updateStudent(StudentVO vo) {
		//System.out.println(vo.getSeq() + vo.getStdid() + vo.getStdname() + vo.getGrade() + vo.getGender() + vo.getPhonenum() + vo.getMajor() + vo.getRc() + vo.getTeam() + vo.getCommunity());
		int result = sqlSession.update("Student.updateStudent", vo);
		return result;
	}
	
	public int deleteStudent(int seq) {
		int result = sqlSession.insert("Student.deleteStudent", seq);
		return result;
	}
	
	public StudentVO getStudent(int seq) {
		StudentVO one = sqlSession.selectOne("Student.getStudent", seq);
		return one;
	}
	
	public List<StudentVO> getStudentList() {
		List<StudentVO> list = sqlSession.selectList("Student.getStudentList");
		return list;
	}
	
	
}
