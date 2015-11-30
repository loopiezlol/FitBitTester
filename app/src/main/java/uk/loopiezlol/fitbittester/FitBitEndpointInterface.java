package uk.loopiezlol.fitbittester;

import java.util.List;
import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Header;
import retrofit.http.Path;
import uk.loopiezlol.fitbittester.models.Alarms;
import uk.loopiezlol.fitbittester.models.Device;

public interface FitBitEndpointInterface {

    @GET("1/user/-/devices.json")
    Call<List<Device>> getDevices(@Header("Authorization")String accessToken);

    @GET("1/user/-/devices/tracker/{trackerId}/alarms.json")
    Call<Alarms> getAlarms(@Header("Authorization")String accessToken,
                                 @Path("trackerId") String trackerID);


}
