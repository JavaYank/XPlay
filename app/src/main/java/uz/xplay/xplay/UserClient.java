package uz.xplay.xplay;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface UserClient {
    @POST("api")
    Call<User> checkUser(@Body User user);

}
