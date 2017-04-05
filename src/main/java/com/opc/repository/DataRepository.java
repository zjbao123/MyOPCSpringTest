package com.opc.repository;

import com.opc.model.Data;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by zjbao on 2017/4/5.
 */
public interface DataRepository extends JpaRepository<Data, Integer> {

}
