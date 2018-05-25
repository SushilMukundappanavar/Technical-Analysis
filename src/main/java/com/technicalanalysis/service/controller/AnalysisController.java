package com.technicalanalysis.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.technicalanalysis.service.service.AnalysisService;

@RestController
public class AnalysisController {
	
	@Autowired
	private AnalysisService analysisService;
	
	@RequestMapping(value="/getAnalysisData", method=RequestMethod.GET)
	public AnalysisService getAnalysisData() {
		analysisService.setId("1");
		analysisService.setName("Sushil");
		analysisService.setAge("41");
		analysisService.setHeight("5.6");
		
		return analysisService;
	}

}
