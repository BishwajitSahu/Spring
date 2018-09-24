package com.bi.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.bi.command.FileUploadCommand;

@Controller("fileUploadController")
public class FileUploadController {
	
	@RequestMapping(value="/upload.htm",method=RequestMethod.GET)
	public String showForm(@ModelAttribute("fileCmd") FileUploadCommand cmd) {
		return "upload";
	}
	
	@RequestMapping(value="/upload.htm",method=RequestMethod.POST)
	public String upload(Map<String,String> map, @ModelAttribute("fileCmd") FileUploadCommand cmd) throws Exception {
		final String DOWNLOAD_PATH="f:/serveruploaded/";
		
		MultipartFile file1=null,file2=null;
		InputStream is1=null,is2=null;
		FileOutputStream os1=null,os2=null;
		File dir=null,newFile1=null,newFile2=null;
		byte[] buffer=new byte[4096];
		int read=0;
		//get files from command object
		file1=cmd.getFile1();
		file2=cmd.getFile2();
		System.out.println(file1.getOriginalFilename());
		System.out.println(file2.getOriginalFilename());
		//Set InputStream pointing to the files
		is1=file1.getInputStream();
		is2=file2.getInputStream();
		
		dir=new File(DOWNLOAD_PATH);//set the path as uploading path
		newFile1=new File(""+DOWNLOAD_PATH+""+file1.getOriginalFilename());
		newFile2=new File(""+DOWNLOAD_PATH+""+file2.getOriginalFilename());
		
		//set OutPutStream pointing to the upload file
		os1=new FileOutputStream(newFile1);
		os2=new FileOutputStream(newFile2);
		
		if(dir.exists() && dir.isDirectory()) {
			System.out.println("if block directory check: exist");
			while((read=is1.read(buffer))!=-1) {
				os1.write(buffer,0,read);
				System.out.println("is1 is copying to os1");
			}
			//close first input stream and output stream
			is1.close();
			os1.close();
			while((read=is2.read(buffer))!=-1) {
				os2.write(buffer,0,read);
				System.out.println("is2 is copying to os2");
			}
			//close streams 
			is2.close();
			os2.close();
		}
		
		if(newFile1.exists()) {
			map.put("file1status",newFile1.getName()+" uploaded successfully.");
			System.out.println("file1 uploaded successfully");
		}
		if(newFile2.exists()) {
			map.put("file2status",newFile2.getName()+" uploaded successfully.");
			System.out.println("file2 uploaded successfully");
		}
		return "result";
	}
}
