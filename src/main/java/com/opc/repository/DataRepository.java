package com.opc.repository;

import com.opc.model.Data;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.sql.Timestamp;
import java.util.List;

/**
 * Created by zjbao on 2017/4/5.
 */
public interface DataRepository extends JpaRepository<Data, Integer> {
    @Query("select d from Data d ")
    Page<Data> findLastData(Pageable pageable);


}
