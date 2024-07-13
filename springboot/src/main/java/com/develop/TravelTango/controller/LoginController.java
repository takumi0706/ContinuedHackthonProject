package com.develop.TravelTango.controller;

import com.develop.TravelTango.form.LoginForm;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/*
* ログイン画面　Controller
*/
@Controller
@RequiredArgsConstructor
public class LoginController {

    /*
    * ログイン画面を表示
    * @param model Model
    * @return ログイン画面表示
    */
    @GetMapping("/login")
    public String showLoginPage(Model model) {
        model.addAttribute("loginForm", new LoginForm());
        return "login";
    }

    /*
    * ログイン承認
    * @param model Model
    * @param loginForm LoginForm
    * @return ログイン画面表示|ホーム画面表示
    */
}
