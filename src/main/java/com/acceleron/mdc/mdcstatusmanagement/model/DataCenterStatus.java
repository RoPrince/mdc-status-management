package com.acceleron.mdc.mdcstatusmanagement.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class DataCenterStatus {

    @JsonProperty("status_id")
    private String statusId;

    @JsonProperty("status_description")
    private String statusDescription;
}
