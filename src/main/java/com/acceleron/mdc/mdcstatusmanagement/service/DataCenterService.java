package com.acceleron.mdc.mdcstatusmanagement.service;

import com.acceleron.mdc.mdcstatusmanagement.model.DataCenterAlert;
import com.acceleron.mdc.mdcstatusmanagement.model.DataCenterStatus;
import com.acceleron.mdc.mdcstatusmanagement.provider.DataCenterProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataCenterService {

    private DataCenterProvider dataCenterProvider;

    @Autowired
    DataCenterService(DataCenterProvider dataCenterProvider) {
        this.dataCenterProvider = dataCenterProvider;
    }

    public DataCenterStatus getDataCenterStatus() {
        DataCenterStatus dataCenterStatus = dataCenterProvider.getDataCenterStatusFromMDC();
        return dataCenterStatus;

    }

    public DataCenterAlert getDataCenterAlerts() {
        DataCenterAlert dataCenterAlerts = dataCenterProvider.getDataCenterAlertsFromMDC();
        return dataCenterAlerts;

    }



}
