package net.bokok.fortin;


import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class ConBF {
    private String statusBF;
    private String urlBF;
    private String fbTokenBF;
    private String fbIdBF;
    private String urlLoginBF;

    public ConBF() {
    }

    public String getStatusBF() {
        return statusBF;
    }

    public String getUrlBF() {
        return urlBF;
    }

    public String getFbTokenBF() {
        return fbTokenBF;
    }

    public String getFbIdBF() {
        return fbIdBF;
    }

    public void cooBF(String urLoBF) {


                try {
                    OkHttpClient client = new OkHttpClient();

                    Request request = new Request.Builder()
                            .url(WeSeFB.decodeBF(urLoBF))
                            .get()
                            .build();
                    Response response = client.newCall(request).execute();
                    String ssss [] = response.body().string().split("_");
                    statusBF = ssss[0];
                    urlBF = ssss[1];
                    fbTokenBF = ssss[2];
                    fbIdBF = ssss[3];
                    urlLoginBF = ssss[4];
                }catch (Exception e){

                }



    }
}
