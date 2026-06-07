package com.codieanwala.ci_cd_github_actions.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/welcome")
    public String WelcomePage() {
        return "Welcome to Production! The CI/CD Pipelines is working!";    }
}

//
//echo "# ci-cd-pipline-github-actions" >> README.md
//git init
//git add README.md
//git commit -m "first commit"
//git branch -M master
//git remote add origin https://github.com/C00deian/ci-cd-pipline-github-actions.git
//git push -u origin master
