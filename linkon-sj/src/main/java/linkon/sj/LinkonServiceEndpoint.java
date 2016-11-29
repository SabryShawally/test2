package linkon.sj;

import lombok.Getter;

public enum LinkonServiceEndpoint {

    LOCATION("location/1_5/LocationService"),
    TIME_TABLE("timetable/2_7/TimetableService"),
    GTS_SALES("gtssales/1_17/GtsSalesService"),
    ORDER_STORAGE("orderstorage/1_10/OrderStorageService");

    @Getter
    private String endpoint;

    LinkonServiceEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public String getServiceUrl(LinkonApiEnvironment environment) {
        return environment.getUrl() + endpoint;
    }
}
