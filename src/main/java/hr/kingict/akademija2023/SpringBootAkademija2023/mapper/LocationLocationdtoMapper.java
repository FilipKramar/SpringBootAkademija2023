package hr.kingict.akademija2023.SpringBootAkademija2023.mapper;

import com.amadeus.resources.Location;
import hr.kingict.akademija2023.SpringBootAkademija2023.dto.LocationDTO;
import org.springframework.stereotype.Component;

@Component
public class LocationLocationdtoMapper {


    public LocationDTO map(Location location){

        if(location==null)
            return null;

        LocationDTO locationDTO=new LocationDTO();
        locationDTO.setName(location.getName());
        locationDTO.setIataCode(location.getIataCode());

        return locationDTO;
    }
}
