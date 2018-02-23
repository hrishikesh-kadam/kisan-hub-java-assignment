package in.hrishikeshkadam.java.kisanhub;

import in.hrishikeshkadam.java.kisanhub.model.Region;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        ArrayList<Region> regionArrayList = new ArrayList<>();
        regionArrayList.add(new Region("UK",
                new ArrayList<>(Arrays.asList("Tmax", "Tmin", "Tmean", "Sunshine", "Rainfall"))));
        regionArrayList.add(new Region("England",
                new ArrayList<>(Arrays.asList("Tmax", "Tmin", "Tmean", "Sunshine", "Rainfall"))));
        regionArrayList.add(new Region("Wales",
                new ArrayList<>(Arrays.asList("Tmax", "Tmin", "Tmean", "Sunshine", "Rainfall"))));
        regionArrayList.add(new Region("Scotland",
                new ArrayList<>(Arrays.asList("Tmax", "Tmin", "Tmean", "Sunshine", "Rainfall"))));

        WeatherDataDownloader.downloadByYear(regionArrayList);
    }
}
