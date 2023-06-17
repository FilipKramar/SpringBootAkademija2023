package hr.kingict.akademija2023.SpringBootAkademija2023.controller;

import hr.kingict.akademija2023.SpringBootAkademija2023.service.DashboardService;
import hr.kingict.akademija2023.SpringBootAkademija2023.service.PageSuffixService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import util.FilenameUtil;

@Controller
public class DashboardController {

    private final DashboardService dashboardService;
    private final PageSuffixService pageSuffixService;

    private final FilenameUtil filenameUtil;

    public DashboardController(DashboardService dashboardService, @Qualifier("html") PageSuffixService pageSuffixService, FilenameUtil filenameUtil) {
        this.dashboardService = dashboardService;
        this.pageSuffixService = pageSuffixService;
        this.filenameUtil = filenameUtil;
    }

    @GetMapping("/dashboard")
    public String getDashboard() {
        return dashboardService.getDashboard() + filenameUtil.getSuffixSeparator() + pageSuffixService.getSuffix();
    }
}
