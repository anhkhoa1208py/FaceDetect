package com.google.android.gms.samples.vision.face.facetracker.network;
/*
public class ApiUtil {
    private ApiUtil() {}

    //public static final String BASE_URL = "http://192.168.0.114:8080/ROBOTGATEWAY/service/image/";
    public static final String BASE_URL = "http://192.168.2.247:8080/ROBOTGATEWAY/service/image/";
    //public static final String BASE_URL = "http://192.168.2.248:8080/ROBOTGATEWAY/service/image/";
    //public static final String BASE_URL = "http://192.168.2.246/user/batch_face_detection";

    public static APIService getAPIService() {

        return RetrofitClient.getClient(BASE_URL).create(APIService.class);
    }

}*/
public class ApiUtil {
    public ApiUtil() {}
    //public static String listCounterURL="https://uat-api.namabank.com.vn//public/";
    //public static String counterConfirmURL="https://uat-api.namabank.com.vn/public/";
    public static String listCounterURL="https://ops-api.namabank.com.vn//public/";
    public static String counterConfirmURL="https://ops-api.namabank.com.vn/public/";
    //public static String BASE_URL = "http://192.168.2.247:8080/ROBOTGATEWAY/service/image/";
    public static String BASE_URL = "http://192.168.1.7:8080/ROBOTGATEWAY/service/image/";
    public static String LOGIN = "http://vietvision.ai/frsip_api/camera/";
    public static String USER = "http://vietvision.ai/frsip_api/";
//    public static String TTS_URL="https://vtcc.ai/voice/api/tts/v1/rest/";
    private RetrofitClient _client=new RetrofitClient();

    public static String TTS_URL="https://tts.mobifone.ai/api/";

    public static APIService getAPIService(String API_URL) {

        return RetrofitClient.getClient(API_URL).create(APIService.class);
    }

}