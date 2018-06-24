package ua.org.tours.model;

import ua.org.tours.model.Entity;

public class FlightsToTransfer extends Entity<Integer> {

    private int TranferId;
    private int FlightId;

    public FlightsToTransfer() {
    }

    public FlightsToTransfer(int tranferId, int flightId) {
        TranferId = tranferId;
        FlightId = flightId;
    }

    public int getTranferId() {
        return TranferId;
    }

    public void setTranferId(int tranferId) {
        TranferId = tranferId;
    }

    public int getFlightId() {
        return FlightId;
    }

    public void setFlightId(int flightId) {
        FlightId = flightId;
    }

    @Override
    public String toString() {
        return "FlightsToTransfer{" +
                "TranferId=" + TranferId +
                ", FlightId=" + FlightId +
                '}';
    }
}
