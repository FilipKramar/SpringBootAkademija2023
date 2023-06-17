package hr.kingict.akademija2023.SpringBootAkademija2023.service.implementation;

import hr.kingict.akademija2023.SpringBootAkademija2023.service.DashboardService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("test")
public class DashboardServiceTest implements DashboardService {
    @Override
    public String getDashboard() {
        return "index";
    }
}
