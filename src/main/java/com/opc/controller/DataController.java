package com.opc.controller;

import com.opc.model.Data;
import com.opc.repository.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by zjbao on 2017/4/5.
 */
@RestController

public class DataController {
    @Autowired
    private DataRepository DataRepository;


    @RequestMapping(value = "/demosource")
    public List<Data> getUserList() {
        Pageable pageable = new PageRequest(0, 1, Sort.Direction.DESC, "TIME");
        Page<Data> DataPage = DataRepository.findLastData(pageable);
        List<Data> DataList = DataPage.getContent();
        return DataList;
    }
}
