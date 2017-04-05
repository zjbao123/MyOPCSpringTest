package com.opc.controller;

import com.opc.model.Data;
import com.opc.repository.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

/**
 * Created by zjbao on 2017/4/5.
 */
@RestController

public class DataController {
    @Autowired
    private DataRepository DataRepository;
    @RequestMapping(value="/data")
        public List<Data> getUserList() {
            return DataRepository.findAll();

        }
}
