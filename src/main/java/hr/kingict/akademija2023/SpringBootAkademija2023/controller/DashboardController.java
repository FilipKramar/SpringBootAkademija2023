package hr.kingict.akademija2023.SpringBootAkademija2023.controller;

import hr.kingict.akademija2023.SpringBootAkademija2023.service.DashboardService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class DashboardController {

    private final DashboardService dashboardService;


    @GetMapping("/dashboard")
    public String getDashboard(){
        return dashboardService.getDashboard();
    }
}
