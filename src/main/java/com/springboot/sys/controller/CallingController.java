package com.springboot.sys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.sys.service.TxnPostingService;

@RestController
@RequestMapping("books")
public class CallingController {
	
	@Autowired
	TxnPostingService service;
	
	@Value("${data.config}")
	String data;
    
    @GetMapping("/book")
    public String getBook() {
        return "hello world";
    }
    
    @Scheduled(fixedDelayString = "${db.poller.scheduler.time}", initialDelay = 3000)
    public void getResponse() {
    	System.out.println("getResponse method is calling");
    	service.getResponse(data);
    }

    
}
