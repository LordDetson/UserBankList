package by.babanin.controller;

import by.babanin.service.MainService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    private final MainService mainService;

    public MainController(MainService mainService) {
        this.mainService = mainService;
    }

    @GetMapping("/richestUser")
    private String getRichestUser(Model model) {
        model.addAttribute("richest_user", mainService.defineRichestUser());
        return "index";
    }

    @GetMapping("/accountsSum")
    private String getAccountsSum(Model model) {
        model.addAttribute("accounts_sum", mainService.accountsSum());
        return "index";
    }
}
