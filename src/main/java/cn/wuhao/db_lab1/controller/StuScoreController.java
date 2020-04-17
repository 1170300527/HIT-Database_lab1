package cn.wuhao.db_lab1.controller;

import cn.wuhao.db_lab1.entities.StuScore;
import cn.wuhao.db_lab1.serve.StuScoreServe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class StuScoreController {

    @Autowired
    StuScoreServe stuScoreServe;

    @GetMapping("/avgScore")
    public String getStuScore(Model model) {
        List<StuScore> stuScores = stuScoreServe.getAll();
        model.addAttribute("avgScores", stuScores);
        return "avgScore/list";
    }

}
