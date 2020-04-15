package cn.wuhao.db_lab1.controller;

import cn.wuhao.db_lab1.entities.Class;
import cn.wuhao.db_lab1.entities.Department;
import cn.wuhao.db_lab1.entities.Student;
import cn.wuhao.db_lab1.entities.Teacher;
import cn.wuhao.db_lab1.serve.DepartmentServe;
import cn.wuhao.db_lab1.serve.TeacherServe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
public class TeacherController {

    @Autowired
    TeacherServe teacherServe;

    @Autowired
    DepartmentServe departmentServe;

    @GetMapping("/teachers")
    public String teacherList(Model model) {
        List<Teacher> teachers = teacherServe.getAll();
        model.addAttribute("teachers", teachers);
        return "/teacher/list";
    }

    @GetMapping("/teacher")
    public String toAddPage(Map<String, List<Department>> map) {
        List<Department> departments = departmentServe.getAll();
        map.put("departments", departments);
        return "/teacher/add";
    }

    @PostMapping("/teacher")
    public String addTeacher(Teacher teacher) {
        teacherServe.add(teacher);
        return "redirect:/teachers";
    }

    @GetMapping("/teacher/{id}")
    public String editPage(@PathVariable("id") Integer id, Model model) {
        Teacher teacher = teacherServe.findById(id);
        model.addAttribute("teacher", teacher);
        List<Department> departments = departmentServe.getAll();
        model.addAttribute("departments", departments);
        return "/teacher/edit";
    }

    @PutMapping("/teacher")
    public String updateStu(Teacher teacher) {
        teacherServe.update(teacher);
        return "redirect:/teachers";
    }

    @DeleteMapping("/teacher/{id}")
    public String deleteTeacher(@PathVariable("id") Integer id) {
        teacherServe.delete(id);
        System.out.println(id);
        return "redirect:/teachers";
    }
}
