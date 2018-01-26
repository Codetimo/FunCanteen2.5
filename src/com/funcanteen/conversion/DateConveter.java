package com.funcanteen.conversion;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

/**
 * 转换日期类型的数据
 * S : 页面传递过来的类型
 * T ： 转换后的类型
 * @author Stark
 *
 */
public class DateConveter implements Converter<String, Date>{

	public Date convert(String time) {
		// TODO Auto-generated method stub
		try {
			if(null != time){//2016:11-05 11_43-50 yyyy-MM-dd HH_mm-ss
				DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
				return df.parse(time);
			}
		} catch (Exception e) {
            System.out.println("日期转化错误");
		}
		return null;
	}

}
