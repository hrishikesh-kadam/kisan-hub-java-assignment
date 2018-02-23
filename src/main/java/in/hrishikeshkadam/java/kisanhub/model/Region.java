package in.hrishikeshkadam.java.kisanhub.model;

import java.util.ArrayList;

public class Region {

    private String regionCode;
    private ArrayList<String> weatherParams;

    public Region(String regionCode, ArrayList<String> weatherParams) {
        this.regionCode = regionCode;
        this.weatherParams = weatherParams;
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public ArrayList<String> getWeatherParams() {
        return weatherParams;
    }

    public void setWeatherParams(ArrayList<String> weatherParams) {
        this.weatherParams = weatherParams;
    }
}
