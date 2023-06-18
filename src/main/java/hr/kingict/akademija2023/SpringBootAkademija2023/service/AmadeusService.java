package hr.kingict.akademija2023.SpringBootAkademija2023.service;

import com.amadeus.Amadeus;
import com.amadeus.Params;
import com.amadeus.referencedata.Locations;
import com.amadeus.resources.Location;
import hr.kingict.akademija2023.SpringBootAkademija2023.dto.LocationDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class AmadeusService {
    @Autowired
    private Amadeus amadeus;

    Logger logger = LoggerFactory.getLogger((AmadeusService.class));

    public List<Location> searchAirports(String keyword) {
        LocationDTO locationDTO = new LocationDTO();
        try {

            Params params = Params.with("subType", Locations.AIRPORT)
                    .and("keyword", keyword);

            return Arrays.asList(amadeus.referenceData.locations.get(params));
        } catch (Exception e) {


            logger.error("search airports error", e);


            return Collections.emptyList();


        }
    }

    }
