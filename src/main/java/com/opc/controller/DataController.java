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
@Controller

public class DataController {
    @Autowired
    private DataRepository DataRepository;


    @RequestMapping(value = "/data")
    public String getUserList(ModelMap map) {
        Pageable pageable = new PageRequest(0, 1, Sort.Direction.DESC, "TIME");
        Page<Data> DataPage = DataRepository.findLastData(pageable);
        List<Data> DataList = DataPage.getContent();
        map.addAttribute("time", "最近更新时间："+DataList.get(0).getTIME());
        map.addAttribute("MachineA", "MachineA："+DataList.get(0).getMachineA());
        map.addAttribute("MachineB", "MachineB："+DataList.get(0).getMachineB());
        map.addAttribute("MachineC", "MachineC："+DataList.get(0).getMachineC());
        map.addAttribute("MachineD", "MachineD："+DataList.get(0).getMachineD());
        map.addAttribute("MachineE", "MachineE："+DataList.get(0).getMachineE());
        map.addAttribute("MachineF", "MachineF："+DataList.get(0).getMachineF());
        return "data";

    }
}
