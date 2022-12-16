package com.springboot.sys.service;

import org.springframework.stereotype.Service;

@Service
public class TxnPostingService {
	
	public void getResponse(String data) {
		
		System.out.println("this message from Scheduled = "+data);
	}
	

}
