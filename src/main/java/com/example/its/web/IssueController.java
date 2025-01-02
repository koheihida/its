package com.example.its.web;

import com.example.its.domain.issue.IssueEntity;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class IssueController {
    @GetMapping("/issues")
    public String showList(Model model) {
        var issueList = List.of(
            new IssueEntity(1L, "概要1", "説明1"),
            new IssueEntity(2L, "概要2", "説明2"),
            new IssueEntity(3L, "概要3", "説明3")
        );
        model.addAttribute("issueList", issueList);
        return "issues/list";
    }
}
