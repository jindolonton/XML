package weather_fx;

import javafx.scene.text.Text;
import javafx.fxml.FXML;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;


public class Controller  {
    @FXML
    private Text cityName;
    @FXML
    private Text minPress;
    @FXML
    private Text maxPress;
    @FXML
    private Text message;


    public void start() throws  Exception{
        String url="https://samples.openweathermap.org/data/2.5/weather?q=London&appid=b6907d289e10d714a6e88b30761fae22";
        URL objurl=new URL(url);
        HttpURLConnection conn=(HttpURLConnection)objurl.openConnection();
        System.out.println("ResponseCode:"+ conn.getResponseCode());

        BufferedReader bufferedReader=new BufferedReader(
                new InputStreamReader(conn.getInputStream())
        );
        String response=new String();
        String inputLine;
        while((inputLine=bufferedReader.readLine()) !=null){
            response+=inputLine;

        }
        System.out.println(response);

        Object object= JSONValue.parse(response);
        JSONObject jsonObject=(JSONObject)object;
        String cityname= String.valueOf(jsonObject.get("name"));
        JSONArray weatherArray= (JSONArray) jsonObject.get("weather");
        JSONObject weatherObj= (JSONObject) weatherArray.get(0);
        String desc= String.valueOf(weatherObj.get("description"));




        JSONObject mainObject=(JSONObject)jsonObject.get("main");
        Double temp=(Double)mainObject.get("temp");
        Double temp_min=(Double)mainObject.get("temp_min");
        Double temp_max=(Double)mainObject.get("temp_max");
        cityName.setText(cityname+"  Temp: "+temp);
        minPress.setText(String.valueOf(temp_min));
        maxPress.setText(String.valueOf(temp_max));
        message.setText(desc);



    }
}
