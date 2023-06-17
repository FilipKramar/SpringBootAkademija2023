package hr.kingict.akademija2023.SpringBootAkademija2023.service.implementation;

import hr.kingict.akademija2023.SpringBootAkademija2023.service.PageSuffixService;
import org.springframework.stereotype.Service;

@Service("html")
public class PageSuffixServiceHtml implements PageSuffixService {
    @Override
    public String getSuffix() {
        return "html";
    }
}
