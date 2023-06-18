package hr.kingict.akademija2023.SpringBootAkademija2023.repository;

import hr.kingict.akademija2023.SpringBootAkademija2023.model.FlightSearch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface FlightSearchRepository extends JpaRepository<FlightSearch,Integer> {

    FlightSearch findOneByOriginLocationCodeAndDestinationLocationCodeAndDepartureDateAndReturnDateAndAdults(String originLocationCode, String destinationLocationCode, LocalDate departureDate, LocalDate returnDate, Integer adults);

}
