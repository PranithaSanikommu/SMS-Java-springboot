package com.example.studentmanagement.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import com.example.studentmanagement.Domain.Course;
import com.example.studentmanagement.Service.CourseService;

@Controller

public class CourseController {
	
	 @Autowired
	  private CourseService service;
	 @GetMapping("/")
	    public String viewHomePage(Model model) {
	       List<Course> listcourse = service.listAll();
	        model.addAttribute("listcourse", listcourse);
	        System.out.print("Get /");
	        return "Course";
	        
	 }
	 
	 
	    @GetMapping("/addcourse")
	    public String add(Model model) {
	    	List<Course> listcourse = service.listAll();
	        model.addAttribute("listcourse", listcourse);
	        model.addAttribute("course", new Course());
	        return "addcourse";
	    }

	    @PostMapping("/save")
	    public String saveCourse(@ModelAttribute("course") Course course) {
	        service.save(course);
	        return "redirect:/";
	    }

	    @GetMapping("/edit/{id}")
	    public ModelAndView showEditCoursePage(@PathVariable(name = "id") Long id) {
	        ModelAndView mav = new ModelAndView("addcourse");
	        Course course = service.get(id);
	        mav.addObject("course", course);
	        return mav;
	        }
	    @GetMapping("/delete/{id}")
	    public String deleteCoursePage(@PathVariable(name = "id") Long id) {
	        service.delete(id);
	        return "redirect:/";
	    }
}	    