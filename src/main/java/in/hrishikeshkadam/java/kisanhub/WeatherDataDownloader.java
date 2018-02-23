package in.hrishikeshkadam.java.kisanhub;

import in.hrishikeshkadam.java.kisanhub.model.Region;
import in.hrishikeshkadam.java.kisanhub.rest.RetrofitSingleton;
import in.hrishikeshkadam.java.kisanhub.rest.WebServices;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;
import java.util.ArrayList;

public class WeatherDataDownloader {

    public static void downloadByYear(ArrayList<Region> regionArrayList) {

        Retrofit retrofit = RetrofitSingleton.getRetrofit();
        WebServices webServices = retrofit.create(WebServices.class);

        for (Region region : regionArrayList) {

            ArrayList<String> weatherParams = region.getWeatherParams();

            for (String weatherParam : weatherParams) {

                Call<String> call = webServices.getWeatherData(weatherParam, "date", region.getRegionCode());
                Response<String> response = null;

                try {

                    response = call.execute();

                } catch (IOException e) {
                    e.printStackTrace();
                }

                if (response == null || !response.isSuccessful())
                    continue;

                if (response.body() != null)
                    //noinspection ConstantConditions
                    System.out.println(response.body().substring(0, response.body().indexOf("\n")));
            }
        }
    }
}
