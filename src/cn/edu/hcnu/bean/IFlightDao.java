package cn.edu.hcnu.bean;

import java.util.Set;

public interface IFlightDao {
    void insertFlight(Flight flight);
    Set<Flight> getAllfLights();
    Flight getFlightByDepartureTime(String departureTime);
    Flight getFlightByDepartureAirport(String departureAirPort);
    Flight getFlightByDestinationAirport(String destinationAirPort);
    void  updateFlight(Flight flight);
}
