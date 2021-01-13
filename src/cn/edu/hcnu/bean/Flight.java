package cn.edu.hcnu.bean;

public class Flight {

    private String Id;//主键，UUID
    private String flightId;//航班编号
    private String planeType;//飞机类型
    private int currentSeatsNum;//剩下的座位数
    private String departureAirPort;//起始目的地
    private String destinationAirPort;//到达目的地
    private String departureTime;//起始时间

    //构造方法
    public Flight(String id, String flightId, String planeType, int currentSeatsNum,
                  String departureAirPort, String destinationAirPort, String departureTime) {
        this.Id = Id;
        this.flightId = flightId;
        this.planeType = planeType;
        this.currentSeatsNum = currentSeatsNum;
        this.departureAirPort = departureAirPort;
        this.destinationAirPort = destinationAirPort;
        this.departureTime = departureTime;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        this.Id = id;
    }

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public String getPlaneType() {
        return planeType;
    }

    public void setPlaneType(String planeType) {
        this.planeType = planeType;
    }

    public int getCurrentSeatsNum() {
        return currentSeatsNum;
    }

    public void setCurrentSeatsNum(int currentSeatsNum) {
        this.currentSeatsNum = currentSeatsNum;
    }

    public String getDepartureAirPort() {
        return departureAirPort;
    }

    public void setDepartureAirPort(String departureAirPort) {
        this.departureAirPort = departureAirPort;
    }

    public String getDestinationAirPort() {
        return destinationAirPort;
    }

    public void setDestinationAirPort(String destinationAirPort) {
        this.destinationAirPort = destinationAirPort;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "Id='" + Id + '\'' +
                ",flightId='" + flightId + '\'' +
                ", planeType='" + planeType + '\'' +
                ", currentSeatsNum=" + currentSeatsNum +
                ", departureAirPort='" + departureAirPort + '\'' +
                ", destinationAirPort='" + destinationAirPort + '\'' +
                ", departureTime='" + departureTime + '\'' +
                '}';
    }
}