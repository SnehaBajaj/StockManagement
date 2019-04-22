package demo.qwilr.controller;

import demo.qwilr.model.GlobalQuote;
import demo.qwilr.service.StockSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

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
