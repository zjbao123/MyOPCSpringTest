package com.opc.controller;

import com.opc.model.Data;
import com.opc.repository.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by zjbao on 2017/4/13.
 */
@RestController
public class HistroyDataController {
    @Autowired
    private DataRepository DataRepository;

    @RequestMapping(value = "/historyDataSource")
    public List<Data> getHistoryUserList(){
        Pageable pageable = new PageRequest(0, 100, Sort.Direction.DESC, "TIME");
        Page<Data> DataPage = DataRepository.findLastData(pageable);
        return DataPage.getContent();
    }
}
