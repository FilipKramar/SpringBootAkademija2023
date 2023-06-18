package hr.kingict.akademija2023.SpringBootAkademija2023.repository;

import hr.kingict.akademija2023.SpringBootAkademija2023.model.FlightSearch;
import hr.kingict.akademija2023.SpringBootAkademija2023.model.FlightSearchResultEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface FlightSearchResultEntityRepository extends JpaRepository<FlightSearchResultEntity,Integer> {


   }
