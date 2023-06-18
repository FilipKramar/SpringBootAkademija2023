package hr.kingict.akademija2023.SpringBootAkademija2023.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "rezultati_pretrage_letova")
public class FlightSearchResultEntity extends BasicEntitiy {


@Column(name="polazak_sifra_aerodroma_polazak")
    private String outboundDepartureAirport;
    @Column(name="polazak_sifra_aerodroma_odrediste")
    private String outboundArrivalAirport;
    @Column(name="polazak_datum_polaska")
    private String outboundDepartureDate;

    @Column(name="polazak_datum_dolaska")
    private String outboundArrivalDate;
    @Column(name="povratak_sifra_aerodroma_polazak")
    private  String inboundDepartureAirport;
    @Column(name="povratak_sifra_aerodroma_odrediste")
    private String inboundArrivalAirport;
    @Column(name="povratak_datum_polaska")
    private String inboundDepartureDate;
    @Column(name="povratak_datum_dolaska")
    private String inboundArrivalDate;
    @Column(name="prijevoznik")
    private String carrier;
    @Column(name="cijena")
    private String price;



    @ManyToOne
    @JoinColumn(name="id_pretrage")
    private FlightSearch flightSearch;

    public FlightSearch getFlightSearch() {
        return flightSearch;
    }

    public void setFlightSearch(FlightSearch flightSearch) {
        this.flightSearch = flightSearch;
    }



    public String getOutboundDepartureAirport() {
        return outboundDepartureAirport;
    }

    public void setOutboundDepartureAirport(String outboundDepartureAirport) {
        this.outboundDepartureAirport = outboundDepartureAirport;
    }

    public String getOutboundArrivalAirport() {
        return outboundArrivalAirport;
    }

    public void setOutboundArrivalAirport(String outboundArrivalAirport) {
        this.outboundArrivalAirport = outboundArrivalAirport;
    }

    public String getOutboundDepartureDate() {
        return outboundDepartureDate;
    }

    public void setOutboundDepartureDate(String outboundDepartureDate) {
        this.outboundDepartureDate = outboundDepartureDate;
    }

    public String getOutboundArrivalDate() {
        return outboundArrivalDate;
    }

    public void setOutboundArrivalDate(String outboundArrivalDate) {
        this.outboundArrivalDate = outboundArrivalDate;
    }

    public String getInboundDepartureAirport() {
        return inboundDepartureAirport;
    }

    public void setInboundDepartureAirport(String inboundDepartureAirport) {
        this.inboundDepartureAirport = inboundDepartureAirport;
    }

    public String getInboundArrivalAirport() {
        return inboundArrivalAirport;
    }

    public void setInboundArrivalAirport(String inboundArrivalAirport) {
        this.inboundArrivalAirport = inboundArrivalAirport;
    }

    public String getInboundDepartureDate() {
        return inboundDepartureDate;
    }

    public void setInboundDepartureDate(String inboundDepartureDate) {
        this.inboundDepartureDate = inboundDepartureDate;
    }

    public String getInboundArrivalDate() {
        return inboundArrivalDate;
    }

    public void setInboundArrivalDate(String inboundArrivalDate) {
        this.inboundArrivalDate = inboundArrivalDate;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }


}
