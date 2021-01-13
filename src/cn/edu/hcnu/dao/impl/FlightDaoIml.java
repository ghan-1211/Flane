package cn.edu.hcnu.dao.impl;

import cn.edu.hcnu.bean.Flight;
import cn.edu.hcnu.dao.IFlightDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Set;

public class FlightDaoIml implements IFlightDao {

    @Override
    public void insertFlight(Flight flight) throws SQLException {
        String url = "jdbc:oracle:thin:@localhost:1521:orcl";
        String username = "opts";
        String password = "opts1234";
        Connection conn = DriverManager.getConnection(url,username,password);
        String sql = "INSERT INTO flight VALUS(?,?,?,?,?,?,?)"; //占位符（？）

        PreparedStatement patmt = conn.prepareStatement(sql);
        patmt.setString(1,flight.getId());
        patmt.setString(2,flight.getFlightId());
        patmt.setString(3,flight.getPlaneType());
        patmt.setInt(4,flight.getCurrentSeatsNum());
        patmt.setString(5,flight.getDepartureAirPort());
        patmt.setString(6,flight.getDestinationAirPort());
        patmt.setString(7,flight.getDepartureTime());

        patmt.executeUpdate();
    }
    @Override
    public Set<Flight> getAllFlights() {
        return null;
    }

    @Override
    public Flight getFlightByDepartureTime(String departureTime) {
        return null;
    }

    @Override
    public Flight getFlightByDepartureAirPort(String departureAirPort) {
        return null;
    }

    @Override
    public Flight getFlightByDestinationAirPort(String destinationAirPort) {
        return null;
    }

    @Override
    public void updateFlight(Flight flight) {

    }

}
