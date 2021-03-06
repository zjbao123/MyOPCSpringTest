package com.opc.controller;

import com.opc.model.Data;
import com.opc.repository.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by zjbao on 2017/4/4.
 */
@Controller
public class HelloController {
    @Autowired
    private com.opc.repository.DataRepository DataRepository;

    @RequestMapping("/")
    public String index() {

        return "index";
    }

    @RequestMapping("/demo")
    public String demo() {

        return "demo";
    }

    @RequestMapping(value = "/data")
    public String getDataList(ModelMap map) {
        Pageable pageable = new PageRequest(0, 1, Sort.Direction.DESC, "TIME");
        Page<Data> DataPage = DataRepository.findLastData(pageable);
        List<Data> DataList = DataPage.getContent();
        map.addAttribute("time", DataList.get(0).getTIME());
        map.addAttribute("MachineA", DataList.get(0).getMachineA());
        map.addAttribute("MachineB", DataList.get(0).getMachineB());
        map.addAttribute("MachineC", DataList.get(0).getMachineC());
        map.addAttribute("MachineD", DataList.get(0).getMachineD());
        map.addAttribute("MachineE", DataList.get(0).getMachineE());
        map.addAttribute("MachineF", DataList.get(0).getMachineF());
        return "data";
    }

    @RequestMapping(value = "/historyData")
    public String getHistoryData() {
        return "historyData";
    }


}

