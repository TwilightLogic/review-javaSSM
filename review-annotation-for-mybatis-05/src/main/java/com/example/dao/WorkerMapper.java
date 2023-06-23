package com.example.dao;

import com.example.pojo.Worker;
import org.apache.ibatis.annotations.Select;

public interface WorkerMapper {
    @Select("SELECT * FROM tb_worker WHERE id = #{id}")
    Worker selectWorker(int id);
}
