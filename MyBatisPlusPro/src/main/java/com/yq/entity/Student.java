package com.yq.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.extension.activerecord.Model;

@TableName(value = "student",keepGlobalPrefix = true)
public class Student extends Model<Student>{
	@TableId(value="stu_no",type = IdType.AUTO)
	private int stuNo;
	@TableField(fill = FieldFill.INSERT_UPDATE)
	private String stuName;
//	@TableField(value = "stuage")
	private int stuAge;
	@TableField(exist = false)
	private boolean sex;
	
	@Version
	private Integer version;
	@TableLogic(value = "logic_delete")
	private int logicDelete;
	
	public Integer getLogicDelete() {
		return logicDelete;
	}

	public void setLogicDelete(Integer logicDelete) {
		this.logicDelete = logicDelete;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	public Student(int stuNo, String stuName, int stuAge) {
		this.stuNo = stuNo;
		this.stuName = stuName;
		this.stuAge = stuAge;
	}
	
	public Student( String stuName, int stuAge) {		
		this.stuName = stuName;
		this.stuAge = stuAge;
	}
	public Student() {
		
	}
	
	
	public int getStuNo() {
		return stuNo;
	}
	public void setStuNo(int stuNo) {
		this.stuNo = stuNo;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public int getStuAge() {
		return stuAge;
	}
	public void setStuAge(int stuAge) {
		this.stuAge = stuAge;
	}

	@Override
	public String toString() {
		return "Student [stuNo=" + stuNo + ", stuName=" + stuName + ", stuAge=" + stuAge + "]";
	}
	
	

}
