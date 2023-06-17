package hr.kingict.akademija2023.SpringBootAkademija2023.service;

import com.amadeus.Amadeus;

import com.amadeus.Params;
import com.amadeus.exceptions.ResponseException;

import com.amadeus.referencedata.Locations;
import com.amadeus.resources.Location;
import hr.kingict.akademija2023.SpringBootAkademija2023.dto.LocationDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class AmadeusService {
    @Autowired
    private Amadeus amadeus;

    public List<Location> getlocation(String keyword) throws ResponseException {



        LocationDTO locationDTO= new LocationDTO();

       return Arrays.asList( amadeus.referenceData.locations.
               get(Params.with("subType", Locations.AIRPORT)
                       .and("keyword",keyword)));
    }
}
