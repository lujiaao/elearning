package cn.uc.ele.utils;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

public class CopyObjectPropertyUtil {
	/**
	 * 将对象集合的属性转换成与它具有相同属性类的集合中。
	 * @param originList 对象集合
	 * @param targetType 类
	 * @return
	 */
	public static List copyProperties(List originList,Class targetType){
		
		List targetList =  new ArrayList();
		try {
			for(Object fromObj:originList){
				Object targetObj = targetType.newInstance();
				
				BeanUtils.copyProperties(fromObj, targetObj);
				
				targetList.add(targetObj);
			}			
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
		return targetList;
	}

	/**
	 * 将一个对象属性拷贝到与它相似的类中
	 * @param obj 属性有值对象
	 * @param targetType 待拷贝类
	 * @return
	 */
	public static Object copyProperty(Object obj, Class targetType){
		Object targetObj = null;
		try {
			targetObj = targetType.newInstance();
			BeanUtils.copyProperties(obj, targetObj);
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return targetObj;
	}
}
