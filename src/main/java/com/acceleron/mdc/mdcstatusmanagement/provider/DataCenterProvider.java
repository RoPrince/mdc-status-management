package com.acceleron.mdc.mdcstatusmanagement.provider;

import com.acceleron.mdc.mdcstatusmanagement.model.DataCenterAlert;
import com.acceleron.mdc.mdcstatusmanagement.model.DataCenterStatus;
import com.acceleron.mdc.mdcstatusmanagement.util.ResourceConfigurations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DataCenterProvider {


    private ResourceConfigurations resourceConfigurations;

    private RestTemplate restTemplate;

    @Autowired
    DataCenterProvider(ResourceConfigurations resourceConfigurations, RestTemplate restTemplate) {
        this.resourceConfigurations = resourceConfigurations;
        this.restTemplate = restTemplate;
    }

    public DataCenterStatus getDataCenterStatusFromMDC() {

        String url = resourceConfigurations.getDataCenterUrl();

      // ResponseEntity<DataCenterStatus> response = restTemplate.getForEntity(url, DataCenterStatus.class);

        DataCenterStatus dataCenterStatus = new DataCenterStatus();

        dataCenterStatus.setStatusId(("MDC123"));
        dataCenterStatus.setStatusDescription("Online");

        return dataCenterStatus;

    }

    public DataCenterAlert getDataCenterAlertsFromMDC() {

        String url = resourceConfigurations.getDataCenterUrl();

        // ResponseEntity<DataCenterStatus> response = restTemplate.getForEntity(url, DataCenterStatus.class);

       // DataCenterAlert dataCenterAlertList = new ArrayList<>();
        DataCenterAlert dataCenterAlert = new DataCenterAlert();

        dataCenterAlert.setTemperature(80);
        dataCenterAlert.setCardSlot("Down from 30 mins");
        dataCenterAlert.setWarnings("SLOT down");
        dataCenterAlert.setAlertTimeStamp("2020-03-26 08:30:34.521000");



       return dataCenterAlert;

    }
}
