package POJO;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class RatesPOJO {
    public RatesPOJO(){

    }
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public List<Rates> getRates() {
        return rates;
    }

    public void setRates(List<Rates> rates) {
        this.rates = rates;
    }

    private  String date;
    private String base;

    public RatesPOJO(String date, String base, List<Rates> rates) {
        this.date = date;
        this.base = base;
        this.rates = rates;
    }

    @JsonProperty("rates")
    @JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
    private List<Rates> rates = new ArrayList<Rates>();
}
