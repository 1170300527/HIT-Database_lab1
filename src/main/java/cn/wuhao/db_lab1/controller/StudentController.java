package cn.wuhao.db_lab1.controller;

import cn.wuhao.db_lab1.entities.Class;
import cn.wuhao.db_lab1.entities.Student;
import cn.wuhao.db_lab1.serve.ClassServe;
import cn.wuhao.db_lab1.serve.StudentServe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

@Controller
public class StudentController {

    @Autowired
    StudentServe studentServe;

    @Autowired
    ClassServe classServe;

    @GetMapping("/stus")
    public String stuList(Map<String, List<Student>> map) {
        List<Student> students = studentServe.getAll();
        map.put("students", students);
        return "stu/list";
    }

    @GetMapping("/stu")
    public String toAddPage(Map<String, List<Class>> map) {
        List<Class> classes = classServe.getAll();
        map.put("classes", classes);
        return "stu/add";
    }

    @PostMapping("/stu")
    public String addStu(Student student) {
        studentServe.add(student);
        return "redirect:stus";
    }

    @GetMapping("/stu/{id}")
    public String editPage(@PathVariable("id") Integer id) {
        Student student = studentServe.findById(id);
        return "stu/edit";
    }
}
