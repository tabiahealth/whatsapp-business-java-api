package com.whatsapp.api.service;


import com.whatsapp.api.domain.media.Media;
import com.whatsapp.api.domain.media.UploadResponse;
import com.whatsapp.api.domain.messages.Message;
import com.whatsapp.api.domain.messages.response.MessageResponse;
import okhttp3.MultipartBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.Streaming;
import retrofit2.http.Url;

import java.util.Map;

import static com.whatsapp.api.configuration.WhatsappApiConfig.API_VERSION;


/**
 * The interface Whatsapp business cloud api service.
 */
public interface WhatsappBusinessCloudApiService {


    /**
     * Send message call.
     *
     * @param phoneNumberId the phone number id
     * @param message       the message
     * @return the call
     */
    @POST("/" + API_VERSION + "/{Phone-Number-ID}/messages")
    Call<MessageResponse> sendMessage(@Path("Phone-Number-ID") String phoneNumberId, @Body Message message);

    @Multipart
    @POST("/" + API_VERSION + "/{Phone-Number-ID}/media")
    Call<UploadResponse> uploadMedia(@Path("Phone-Number-ID") String phoneNumberId, @Part MultipartBody.Part file, @Part MultipartBody.Part messageProduct);

    @GET("/" + API_VERSION + "/{media-id}")
    Call<Media> retrieveMediaUrl(@Path("media-id") String mediaId);


    @GET
    @Streaming
   Call<ResponseBody> downloadFile(@Url String url, @QueryMap Map<String, String> query);

    @GET
    @Streaming
    Call<ResponseBody> downloadFile(@Url String url, @Query("mid") String mid, @Query("ext") String ext, @Query("hash") String hash);

}
