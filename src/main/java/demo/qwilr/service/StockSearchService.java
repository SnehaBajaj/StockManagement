package demo.qwilr.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import demo.qwilr.client.AlphaVantageClient;
import demo.qwilr.model.GlobalQuote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class StockSearchService {

    @Autowired
    private AlphaVantageClient client;

    public GlobalQuote getMatchingStocks(String key) throws IOException {
        System.out.println("Inside StockSearchService");
        JsonNode resultJson = client.getMatchingStocks(key);
        ObjectMapper mapper = new ObjectMapper();
        GlobalQuote quote = mapper.treeToValue(resultJson, GlobalQuote.class);
        System.out.println("Global Quote value from JsonNode is: "+ quote.toString());
        return quote;
    }
}
