package demo.qwilr.controller;

import com.fasterxml.jackson.databind.JsonNode;
import demo.qwilr.model.GlobalQuote;
import demo.qwilr.service.StockSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;

@RestController
public class PortfolioController {

    @Autowired
    private StockSearchService service;

    @GetMapping(value = "/search/{key}")
    public GlobalQuote instantSearch(@PathVariable String key) throws IOException {
        System.out.println("Inside PortfolioController");
        return service.getMatchingStocks(key);
    }
}
