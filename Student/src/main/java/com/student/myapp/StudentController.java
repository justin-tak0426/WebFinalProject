package com.student.myapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@RequestMapping(value = "/student/list", method = RequestMethod.GET)
	public String studentlist(Model model) {
		model.addAttribute("list", studentService.getStudentList());
		return "student/list";
	}
	
	@RequestMapping(value = "/student/add", method = RequestMethod.GET)
	public String addStudent() {
		return "student/addstudentform";
	}
	
	@RequestMapping(value = "student/addok", method = RequestMethod.POST)
	public String addPostOK(StudentVO vo) {
		int i = studentService.insertStudent(vo);
		if(i == 0)
			System.out.println("데이터 추가 실패 ");
		else
			System.out.println("데이터 추가 성공!!! ");
		return "redirect:list";
	}
	   
	@RequestMapping(value = "/student/editpost/{id}", method = RequestMethod.GET)
	public String editStudent(@PathVariable("id") int id, Model model) {
		StudentVO studentVO = studentService.getStudent(id);
		model.addAttribute("studentVO", studentVO);
		return "student/editstudentform";
	}
	
	@RequestMapping(value = "student/editok", method = RequestMethod.POST)
	public String editStudentOK(StudentVO vo) {
		int i = studentService.updateStudent(vo);
		if(i == 0)
			System.out.println("데이터 수정 실패 ");
		else
			System.out.println("데이터 수정 성공!!! ");
		return "redirect:list";
	}
	  
	@RequestMapping(value = "/student/delete/{id}", method = RequestMethod.GET)
	public String deleteStudent(@PathVariable("id") int id){
		int i = studentService.deleteStudent(id);
		if(i == 0)
			System.out.println("데이터 삭제 실패 ");
		else
			System.out.println("데이터 삭제 성공!!! ");
    	return "redirect:../list";
      
	}
	
	@RequestMapping(value = "/student/detail/{id}", method = RequestMethod.GET)
	public String detailStudent(@PathVariable("id") int id, Model model) {
		StudentVO studentVO = studentService.getStudent(id);
		model.addAttribute("studentVO", studentVO);
		return "student/studentdetail";
	}


	
	

}
