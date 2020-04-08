package com.acceleron.mdc.mdcstatusmanagement.controller;

import com.acceleron.mdc.mdcstatusmanagement.model.DataCenterAlert;
import com.acceleron.mdc.mdcstatusmanagement.model.DataCenterStatus;
import com.acceleron.mdc.mdcstatusmanagement.service.DataCenterService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mdc/")
public class DataCenterController {

    private DataCenterService dataCenterService;

    private Logger logger  = LoggerFactory.getLogger(DataCenterController.class);

    @Autowired
    DataCenterController(DataCenterService dataCenterService) {
        this.dataCenterService = dataCenterService;
    }

    @GetMapping("status")
    public ResponseEntity<DataCenterStatus> getMdcStatus() {

        DataCenterStatus dataCenterStatus = dataCenterService.getDataCenterStatus();

        return new ResponseEntity<>(dataCenterStatus, HttpStatus.OK);

    }

    @GetMapping("alerts")

    public ResponseEntity<DataCenterAlert> getMDCAlerts() {

        logger.info("getMDCAlerts called from device");

        DataCenterAlert dataCenterAlertList = dataCenterService.getDataCenterAlerts();

        return new ResponseEntity<>(dataCenterAlertList,HttpStatus.OK);

    }
}
