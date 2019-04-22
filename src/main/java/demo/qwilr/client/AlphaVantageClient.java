package demo.qwilr.client;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;

import javax.net.ssl.HttpsURLConnection;
import java.io.IOException;
import java.net.URL;

@Repository
public class AlphaVantageClient {

    public JsonNode getMatchingStocks(String key) throws IOException {
        System.out.println("Inside AlphaVantageClient");
        ObjectMapper mapper = new ObjectMapper();

        URL url = new URL("https://www.alphavantage.co/query?function=GLOBAL_QUOTE&symbol=" + key + "&apikey=WPNRVN1USMINZ35K");
        HttpsURLConnection urlConnection = (HttpsURLConnection) url.openConnection();
        urlConnection.setRequestMethod("GET");

        int status = urlConnection.getResponseCode();
        System.out.println("Response code: " + status);

        JsonNode node = mapper.readTree(urlConnection.getInputStream());
        System.out.println("Response JSON" + node);

        urlConnection.disconnect();

        return node;
    }
}
