package hr.kingict.akademija2023.SpringBootAkademija2023.service.implementation;

import hr.kingict.akademija2023.SpringBootAkademija2023.service.DashboardService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("prod")
public class DashboardServiceProd implements DashboardService {
    @Override
    public String getDashboard() {
        return "dashboardProd";
    }
}
