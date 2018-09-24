package com.bi.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.bi.command.UploadCommand;

@Controller
public class UploadController {

	@RequestMapping(value = "/form.htm", method = RequestMethod.GET)
	public String displayForm(Map<String, Object> map) {
		return "upload_form";
	}

	@RequestMapping(value = "/form.htm", method = RequestMethod.POST)
	public String uploadFile(Map<String, Object> map, @ModelAttribute("uploadCmd") UploadCommand cmd) {
		MultipartFile file1 = null;
		MultipartFile file2 = null;
		InputStream is1 = null, is2 = null;
		OutputStream os1=null,os2=null;
		//File dir = new File("D:\\SpringWorkSpace\\springuploads\\");
		// get files form cmd
		file1 = cmd.getFile1();
		file2 = cmd.getFile2();
		try {
			// set inputstream pointing to original file
			is1 = file1.getInputStream();
			is2 = file2.getInputStream();
			
			File newFile1=new File("d:/SpringWorkSpace/springuploads/"+file1.getOriginalFilename());
			File newFile2=new File("d:/SpringWorkSpace/springuploads/"+file2.getOriginalFilename());
			
			os1=new FileOutputStream(newFile1);
			os2=new FileOutputStream(newFile2);
			
			StreamUtils.copy(is1, os1);
			StreamUtils.copy(is2, os2);
			
			is1.close();
			is2.close();
			os1.close();
			os2.close();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		map.put("file1", file1.getOriginalFilename());
		map.put("file2", file2.getOriginalFilename());
		return "success";
	}
}
