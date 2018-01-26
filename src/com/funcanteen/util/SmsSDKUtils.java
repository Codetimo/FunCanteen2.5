package com.funcanteen.util;

import java.util.ArrayList;

import com.github.qcloudsms.SmsSingleSender;
import com.github.qcloudsms.SmsSingleSenderResult;

public class SmsSDKUtils {
	public static void sendMessageCode(String phoneNumber, String messageCode) {
		try {
			// 请根据实际 appid 和 appkey 进行开发，以下只作为演示 sdk 使用
			// appid,appkey,templId申请方式可参考接入指南
			// https://www.qcloud.com/document/product/382/3785#5-.E7.9F.AD.E4.BF.A1.E5.86.85.E5.AE.B9.E9.85.8D.E7.BD.AE

			int tmplId = 75081;

			int appid = 1400060566;
			String appkey = "70503a144abdb7106ce0856f7b2ee5a4";
            // 初始化单发
			SmsSingleSender singleSender = new SmsSingleSender(appid, appkey);
			SmsSingleSenderResult singleSenderResult;
			ArrayList<String> params = new ArrayList<>();
			// String phoneNumber1 = "15755337081";
			params.add(messageCode);
			params.add("2");

			singleSenderResult = singleSender.sendWithParam("86", phoneNumber, tmplId, params, "", "", "");
			System.out.println(singleSenderResult);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
