package util;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
 @Service
public class FilenameUtil {

    public String getSuffixSeparator(){

        return ".";
    }
}
