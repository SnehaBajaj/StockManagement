package demo.qwilr.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GlobalQuote {

    @JsonProperty("Global Quote")
    private GlobalQuoteParameters parameters;

    public GlobalQuoteParameters getParameters() {
        return parameters;
    }

    public void setParameters(GlobalQuoteParameters parameters) {
        this.parameters = parameters;
    }
}
