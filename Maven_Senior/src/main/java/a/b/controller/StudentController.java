package a.b.controller;


import a.b.domain.Student;
import a.b.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService service;

    @RequestMapping("/findStudent")
    public String findStudent(Model model){
        Student student = service.findStudentById(1);
        model.addAttribute("item",student);
        return "list";
    }

}
