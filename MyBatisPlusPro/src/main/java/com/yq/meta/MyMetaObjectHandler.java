package com.yq.meta;

import org.apache.ibatis.reflection.MetaObject;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;

public class MyMetaObjectHandler implements MetaObjectHandler {

	@Override
	public void insertFill(MetaObject metaObject) {
		System.out.println(("start insert fill ...."));
		// column
		this.setInsertFieldValByName("stuName", "ZHang", metaObject);// @since 快照：3.0.7.2-SNAPSHOT， @since 正式版暂未发布3.0.7

	}

	@Override
	public void updateFill(MetaObject metaObject) {
		System.out.println(("start update fill ...."));
		this.setUpdateFieldValByName("stuName", "LISI", metaObject);// @since 快照：3.0.7.2-SNAPSHOT， @since 正式版暂未发布3.0.7

	}

}
