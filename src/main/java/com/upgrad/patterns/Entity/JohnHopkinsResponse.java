package com.upgrad.patterns.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class JohnHopkinsResponse {

    @JsonProperty("country")
    private String country;

    @JsonProperty("stats")
    private Stat stats;

//    public Stat getStats(){
//        return this.stats;
//    }

//    public String getCountry() {
//        return this.country;
//    }

}
