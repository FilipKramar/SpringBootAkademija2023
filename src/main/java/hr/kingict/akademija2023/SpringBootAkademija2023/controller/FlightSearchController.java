package hr.kingict.akademija2023.SpringBootAkademija2023.controller;
import com.amadeus.resources.Location;
import hr.kingict.akademija2023.SpringBootAkademija2023.dto.LocationDTO;
import hr.kingict.akademija2023.SpringBootAkademija2023.mapper.LocationLocationdtoMapper;
import hr.kingict.akademija2023.SpringBootAkademija2023.service.AmadeusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/flight")
public class FlightSearchController {

    @Autowired
    private AmadeusService amadeusService;
    @Autowired
    private LocationLocationdtoMapper locationLocationdtoMapper;

    @GetMapping("/airports/{keyword}")
    public ResponseEntity<List<LocationDTO>> searchAiprots(@PathVariable String keyword){


         List<Location> locationList= amadeusService.searchAirports(keyword);

         List<LocationDTO> locationDTOS=locationList
                 .stream()
                 .map(location -> locationLocationdtoMapper.map(location))
                 .toList();


         return ResponseEntity.ok(locationDTOS);


    }
}
