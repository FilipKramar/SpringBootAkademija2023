package hr.kingict.akademija2023.SpringBootAkademija2023.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import util.FilenameUtil;
@Configuration
public class FilenameUtilsConfig {
    @Bean
    public FilenameUtil getFilenameUtils(){
        return new FilenameUtil();
    }
}
