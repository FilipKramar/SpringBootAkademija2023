package hr.kingict.akademija2023.SpringBootAkademija2023.service.implementation;

import hr.kingict.akademija2023.SpringBootAkademija2023.service.DashboardService;

public class DashboardServiceProd implements DashboardService {
    @Override
    public String getDashboard() {
        return "dashboardProd.html";
    }
}
