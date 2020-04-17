package cn.wuhao.db_lab1.controller;

import cn.wuhao.db_lab1.entities.Course;
import cn.wuhao.db_lab1.entities.Elective;
import cn.wuhao.db_lab1.serve.CourseServe;
import cn.wuhao.db_lab1.serve.ElectiveServe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CourseController {

    @Autowired
    CourseServe courseServe;

    @Autowired
    ElectiveServe electiveServe;

    @GetMapping("/course")
    public String getCourseList(Integer courseId, Model model) {
        if (courseId == null)
            courseId = 1;
        model.addAttribute("nowId", courseId);
        List<Course> courses = courseServe.getAll();
        model.addAttribute("courses", courses);
        List<Elective> electives = electiveServe.getElective(courseId);
        model.addAttribute("electives", electives);
        return "/course/list";
    }
}
