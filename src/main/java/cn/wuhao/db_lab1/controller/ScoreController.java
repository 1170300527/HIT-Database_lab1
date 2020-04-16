package cn.wuhao.db_lab1.controller;

import cn.wuhao.db_lab1.entities.Score;
import cn.wuhao.db_lab1.serve.ScoreServe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ScoreController {

    @Autowired
    ScoreServe scoreServe;

    @GetMapping("/score")
    public String getScore(Model model) {
        List<Score> scores = scoreServe.getAll();
        model.addAttribute("scores", scores);
        return "/score/list";
    }

    @ResponseBody
    @PostMapping("/score")
    public Integer test(Integer id) {
        System.out.println(id);
        return id;
    }
}
