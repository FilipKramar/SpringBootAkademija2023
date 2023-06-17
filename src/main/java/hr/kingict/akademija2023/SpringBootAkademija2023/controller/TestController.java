package hr.kingict.akademija2023.SpringBootAkademija2023.controller;

import hr.kingict.akademija2023.SpringBootAkademija2023.dto.TestDto;
import hr.kingict.akademija2023.SpringBootAkademija2023.form.TestForm;
import jakarta.validation.Valid;
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
@GetMapping("/get/testdto")
    public ResponseEntity<TestDto> testGetDTO(){
       TestDto testDto=new TestDto();
       testDto.setName("ime");
       testDto.setSurname("prezimice");
       testDto.setDescription("ovo je opisic");

       return ResponseEntity.ok(testDto);
    }

    @PostMapping("/post")
    public ResponseEntity<TestDto> testPostWithParam(@RequestBody  @Valid TestForm testForm){

        TestDto testDto=new TestDto();
        testDto.setName(testForm.getName());
        testDto.setDescription((testForm.getDescription()));

       return ResponseEntity.ok(testDto);
    }
}
