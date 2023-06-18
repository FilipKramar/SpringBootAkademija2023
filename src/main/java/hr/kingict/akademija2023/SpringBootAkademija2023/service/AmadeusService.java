package hr.kingict.akademija2023.SpringBootAkademija2023.service;

import com.amadeus.Amadeus;
import com.amadeus.Params;
import com.amadeus.referencedata.Locations;
import com.amadeus.resources.FlightOfferSearch;
import com.amadeus.resources.Location;
import hr.kingict.akademija2023.SpringBootAkademija2023.dto.FlightSearchResultDto;
import hr.kingict.akademija2023.SpringBootAkademija2023.dto.LocationDTO;
import hr.kingict.akademija2023.SpringBootAkademija2023.mapper.FlightOffersSearchFlightSearchResultDtoMapper;
import hr.kingict.akademija2023.SpringBootAkademija2023.model.FlightSearch;
import hr.kingict.akademija2023.SpringBootAkademija2023.repository.FlightSearchRepository;
import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class AmadeusService {
    @Autowired
    private Amadeus amadeus;

    @Autowired
    private FlightOffersSearchFlightSearchResultDtoMapper flightSearchResultDtoMapper;

    @Autowired
    private FlightSearchRepository flightSearchRepository;

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

    @Transactional
    public List<FlightSearchResultDto> searchFlights(String originLocationCode, String destinationLocationCode,LocalDate departureDate, LocalDate returnDate, Integer adults) {
        try {

            FlightSearch flightSeach=new FlightSearch();
            flightSeach.setDestinationLocationCode(destinationLocationCode);
            flightSeach.setOriginLocationCode(originLocationCode);
            flightSeach.setDepartureDate(departureDate);
            flightSeach.setReturnDate(returnDate);
            flightSeach.setAdults(adults);

            flightSeach.setDateCreated(LocalDate.now());
            flightSeach.setUserCreated("Ivan");


            flightSearchRepository.save(flightSeach);


            Params params = Params.with("originLocationCode", originLocationCode)
                    .and("destinationLocationCode", destinationLocationCode)
                    .and("departureDate", departureDate.toString())
                    .and("adults", adults)
                    .and("nonStop",true)
                    .and("max",5);
            if(returnDate!=null){
                params.and("returnDate", returnDate.toString());
            }

            List<FlightOfferSearch> flightOfferSearches = Arrays.asList(amadeus.shopping.flightOffersSearch.get(params));

            List<FlightSearchResultDto> flightSearchResultDtos = flightOfferSearches.stream()
                    .map(flightOfferSearch -> flightSearchResultDtoMapper.map(flightOfferSearch))
                    .toList();

            return flightSearchResultDtos;
        } catch (Exception e) {

            logger.error("Searcch flight error", e);

            return Collections.emptyList();
        }
    }


    }
