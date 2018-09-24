package com.bi.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bi.services.DownloadService;

@Controller("downloadController")
public class DownloadController	 {
	
	@Autowired
	private DownloadService service;
	
	@RequestMapping("/files.htm")
	public String showFiles(Map<String,List> map) {
		List<String> fileNameList=null;
		
		//use service
		fileNameList=service.getFileList();
		//put in model attribute 
		map.put("fileNameList", fileNameList);
		return "showFiles";
	}
	
	
	@RequestMapping("/download.htm")
	public void download(@RequestParam("file") String fName,HttpServletResponse res) throws Exception {
		InputStream is=null;
		OutputStream os=null;
		
		//locate file and point InputStream to that
		is=new FileInputStream("E:\\photo\\photo\\bishwajit\\"+fName);
		
		//set OutputStream pointing to response object
		os=res.getOutputStream();
		//set content-disposition attachment
		res.addHeader("Content-Disposition","attachment;fileName="+fName);
		
		IOUtils.copy(is, os);
		res.flushBuffer();
		
	}
}
