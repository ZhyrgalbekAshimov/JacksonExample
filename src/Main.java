import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {

        HttpURLConnectionExample obj = new HttpURLConnectionExample();

        // Sending HTTP GET request
        // and getting JSON from URL
        String jsonFromUrl = obj.sendGet();

        // JSON to class

        ObjectMapper objectMapper = new ObjectMapper();
        List<MyClass> myClasses = objectMapper.readValue(jsonFromUrl, new TypeReference<List<MyClass>>() {});

        // Printing

        System.out.println("\nNumber of objects: " + myClasses.size() + "\n");

        for (MyClass list: myClasses) {
            System.out.println("===============================================" + list);

        }

    }
}

class HttpURLConnectionExample {

    String sendGet() throws Exception {

        String url = "https://cat-fact.herokuapp.com/facts";

        HttpURLConnection httpClient = (HttpURLConnection) new URL(url).openConnection();

        // optional default is GET
        httpClient.setRequestMethod("GET");

        //add request header
        httpClient.setRequestProperty("User-Agent", "Mozilla/5.0");

        int responseCode = httpClient.getResponseCode();
        System.out.println("\nSending 'GET' request to URL : " + url);
        System.out.println("Response Code : " + responseCode);

        try (BufferedReader in = new BufferedReader(
                new InputStreamReader(httpClient.getInputStream()))) {

            StringBuilder response = new StringBuilder();
            String line;

            while ((line = in.readLine()) != null) {
                response.append(line);
            }

            return response + "";
        }

    }
}