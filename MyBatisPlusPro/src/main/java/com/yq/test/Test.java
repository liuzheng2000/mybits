package com.yq.test;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yq.entity.Student;
import com.yq.mapper.StudentMapper;

public class Test {

	public static void testInsert() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentMapper studentMapper = context.getBean("studentMapper", StudentMapper.class);
		Student student = new Student();
		student.setStuAge(33);
		studentMapper.insert(student);
	}

	public static void testdelete() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentMapper studentMapper = context.getBean("studentMapper", StudentMapper.class);
		studentMapper.delete(null);
	}

	public static void testDeleteAll() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentMapper studentMapper = context.getBean("studentMapper", StudentMapper.class);
		int deleteById = studentMapper.deleteById(5);
		System.out.println(deleteById);
	}
	
	public static void testBashdelete() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentMapper studentMapper = context.getBean("studentMapper", StudentMapper.class);
		List<Integer> stuNos = new ArrayList<Integer>();
		stuNos.add(2);
		stuNos.add(3);
		stuNos.add(4);
		int deleteById = studentMapper.deleteBatchIds(stuNos);
		System.out.println(deleteById);
	}

	public static void testMapdelete() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentMapper studentMapper = context.getBean("studentMapper", StudentMapper.class);
		Map<String, Object> hashMap = new HashMap<String, Object>();
		hashMap.put("stu_no", 6);
		hashMap.put("stu_name", "ww");
		int deleteById = studentMapper.deleteByMap(hashMap);
		System.out.println(deleteById);
	}

	public static void testUpdate3() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentMapper studentMapper = context.getBean("studentMapper", StudentMapper.class);
		Student student = new Student(7, "lz", 25);

		int deleteById = studentMapper.updateById(student);
		System.out.println(deleteById);
	}

	public static void testQuery() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentMapper studentMapper = context.getBean("studentMapper", StudentMapper.class);
//		List<Integer> stuNos = new ArrayList<Integer>();
//		stuNos.add(1);
//		stuNos.add(3);
//		stuNos.add(7);
//		List<Student> selectBatchIds = studentMapper.selectBatchIds(stuNos);
		Map<String, Object> hashMap = new HashMap<String, Object>();
		hashMap.put("stu_no", 1);
		hashMap.put("stu_name", "zs");
		
		List<Student> selectByMap = studentMapper.selectByMap(hashMap);
		System.out.println(selectByMap);
	}
	
	
	public static void testQuery2() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentMapper studentMapper = context.getBean("studentMapper", StudentMapper.class);
		QueryWrapper<Student> queryWrapper = new QueryWrapper<Student>();
		queryWrapper.between( "stu_no", 4, 7)
		.or(i-> i.ge("stu_age", 35).le( "stu_age", 99)).like("stu_name", "a");
		List<Student> students = studentMapper.selectList(queryWrapper);
		System.out.println(students);
	}
//	
	public static void testUpdate2() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentMapper studentMapper = context.getBean("studentMapper", StudentMapper.class);
		Student student = new Student("刘正", 25);
		UpdateWrapper<Student> updateWrapper = new UpdateWrapper<>();
		updateWrapper.eq("stu_no", 1);
		int update = studentMapper.update(student,updateWrapper);
		System.out.println(update);
		
		
	}
	
	
	public static void testAR() {
		new ClassPathXmlApplicationContext("applicationContext.xml");
//		StudentMapper studentMapper = context.getBean("studentMapper", StudentMapper.class);
		Student student = new Student("张1111三",24);
//		student.insert();
		QueryWrapper<Student> queryWrapper = new QueryWrapper<Student>();
		queryWrapper.lambda().like(Student::getStuName, "w");
		student.selectList(queryWrapper);
	}
	
	public static void testPage() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentMapper studentMapper = context.getBean("studentMapper", StudentMapper.class);
		IPage<Student> Page = studentMapper.selectPage( new Page<>(2,2),null);
		System.out.println("当前页的数据"+Page.getRecords());
		System.out.println("当前页页码"+Page.getCurrent());
		System.out.println("总数据"+Page.getTotal());
		System.out.println("每页的数据量"+Page.getSize());
	}
    public static void testUpdate(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentMapper studentMapper =context.getBean("studentMapper",StudentMapper.class) ;
        Student stu = new Student(7,"赵六",29);
    //  stu.setStuNo(7);
//

//
//
//        Student stu = new Student(100,"zzz",99);
//
//
        stu.setVersion(2);
//
        int count = studentMapper.updateById(stu);
        if(count >0){
            System.out.println("修改成功");
        }else{
        	  System.out.println("Update failed due to modified by others");
        }
////        if(userService.updateById(stu
//        }{
//            System.out.println("修改！并发冲突！已被别人修改了！");
//        }
////            System.out.println("Update successfully");
      
          
//        }
////        int count = studentMapper.updateById(stu);
//        System.out.println(count);

    }
	

	public static void main(String[] args) throws Exception {
    	testInsert();
//		testdelete();
//		testBashdelete();
//		testMapdelete();
//		testUpdate();
//		testQuery();
//		testQuery2();
//		testUpdate2();
//		testAR();
//		testPage();
//		testDeleteAll();
	}

}
