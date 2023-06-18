package hr.kingict.akademija2023.SpringBootAkademija2023.mapper;

import hr.kingict.akademija2023.SpringBootAkademija2023.dto.FlightSearchResultDto;
import hr.kingict.akademija2023.SpringBootAkademija2023.model.FlightSearchResultEntity;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class FlightSearchEntityFlightSearchResultDtoMapper {

    public FlightSearchResultDto map(FlightSearchResultEntity flightSearchResultEntity){

        FlightSearchResultDto flightSearchResultDto= new FlightSearchResultDto();

        ModelMapper modelMapper=new ModelMapper();
        modelMapper.map(flightSearchResultEntity,flightSearchResultDto);

        return flightSearchResultDto;
    }
}
