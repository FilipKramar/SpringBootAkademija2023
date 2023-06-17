package hr.kingict.akademija2023.SpringBootAkademija2023.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DashboardController {
    @GetMapping("")
    public String getDashboard(){

        return "dashboard.html";
    }
}
