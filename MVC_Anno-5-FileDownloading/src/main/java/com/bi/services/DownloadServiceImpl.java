package com.bi.services;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service("downloadService")
public class DownloadServiceImpl implements DownloadService{
	@Override
	public List<String> getFileList() {
		File targetFolder = null;
		List<String> fileNames = null;

		// target foler from where contents to be downloaded
		targetFolder = new File("E:\\photo\\photo\\bishwajit");
		//create list object
		fileNames=new ArrayList<>();
		
		if (targetFolder.exists() && targetFolder.isDirectory()) {
			File[] files = targetFolder.listFiles();
			for (File file : files) {
				if(!file.isDirectory())
					fileNames.add(file.getName());
			}
		}
		return fileNames;
	}
	
}
