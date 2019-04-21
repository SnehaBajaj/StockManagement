package demo.qwilr.service;

import demo.qwilr.client.AlphaVantageClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;

@Service
public class StockSearchService {

    @Autowired
    private AlphaVantageClient client;

    public String getMatchingStocks(String key) throws IOException, CertificateException, NoSuchAlgorithmException, KeyStoreException, KeyManagementException {
        System.out.println("Inside StockSearchService");
        String result = client.getMatchingStocks(key);
        return result;
    }
}
