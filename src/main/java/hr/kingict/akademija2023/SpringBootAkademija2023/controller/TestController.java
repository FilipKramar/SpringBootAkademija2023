package hr.kingict.akademija2023.SpringBootAkademija2023.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/test")
public class TestController {
   @GetMapping("/get")
    public String testGet(){
        return "OK";
    }
    @GetMapping("/get/{param}")
    public String testGetWithParam(@PathVariable String param){

       return param;
    }
    @GetMapping("/get/res")
    public ResponseEntity<String> testResponseGet(){
       return ResponseEntity
               .internalServerError()
               .header("testniHeader","blalalalala")
               .body("greska");
    }
}
