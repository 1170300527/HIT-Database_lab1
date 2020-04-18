package cn.wuhao.db_lab1.controller;

import cn.wuhao.db_lab1.entities.Class;
import cn.wuhao.db_lab1.entities.Student;
import cn.wuhao.db_lab1.exception.EmptyException;
import cn.wuhao.db_lab1.exception.SameException;
import cn.wuhao.db_lab1.serve.ClassServe;
import cn.wuhao.db_lab1.serve.StudentServe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
        return "/stu/list";
    }

    @GetMapping("/stu")
    public String toAddPage(Map<String, List<Class>> map) {
        List<Class> classes = classServe.getAll();
        map.put("classes", classes);
        return "/stu/add";
    }

    @PostMapping("/stu")
    public String addStu(Student student) {
        List<Student> students = studentServe.getAll();
        if (student.getStuName().isEmpty())
            throw new EmptyException("请填写学生姓名");
        else if (student.getGender() == null)
            throw new EmptyException("请勾选学生性别");
        else if (students.contains(student))
            throw new SameException("学生已存在");
        studentServe.add(student);
        return "redirect:stus";
    }

    @GetMapping("/stu/{id}")
    public String editPage(@PathVariable("id") Integer id, Model model) {
        Student student = studentServe.findById(id);
        model.addAttribute("student", student);
        List<Class> classes = classServe.getAll();
        model.addAttribute("classes", classes);
        return "/stu/edit";
    }

    @PutMapping("/stu")
    public String updateStu(Student student) {
        studentServe.update(student);
        return "redirect:/stus";
    }

    @DeleteMapping("/stu/{id}")
    public String deleteStu(@PathVariable("id") Integer id) {
        studentServe.delete(id);
        return "redirect:/stus";
    }
}
