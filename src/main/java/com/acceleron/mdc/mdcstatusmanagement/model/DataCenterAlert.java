package com.acceleron.mdc.mdcstatusmanagement.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class DataCenterAlert {

    @JsonProperty("temperature")
    private Integer temperature;

    @JsonProperty("card_slot")
    private String cardSlot;

    @JsonProperty("warnings")
    private String warnings;

    @JsonProperty("alert_timestamp")
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    private String alertTimeStamp;

}
