package com.yq.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yq.entity.Student;

public interface StudentMapper extends BaseMapper<Student>{
	
	public void deleteAllStudents();
}
