package com.baomidou.com.yq.mapper.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.yq.entity.Student;

/**
 * <p>
 * 
 * </p>
 *
 * @author jobob
 * @since 2019-12-03
 */
public class TbStudent extends Model<Student> {

private static final long serialVersionUID=1L;

    private String stuName;

    private Integer stuAge;


    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public Integer getStuAge() {
        return stuAge;
    }

    public void setStuAge(Integer stuAge) {
        this.stuAge = stuAge;
    }

    @Override
    public String toString() {
        return "TbStudent{" +
        "stuName=" + stuName +
        ", stuAge=" + stuAge +
        "}";
    }
}
