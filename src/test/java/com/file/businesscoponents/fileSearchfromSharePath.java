package com.file.businesscoponents;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class fileSearchfromSharePath {

	public static void main(String[] args) throws IOException {
		
		String folderObj = null;
		Boolean flag = true;
		int count=1;
		
		while(flag){
			Path start = Paths.get("PATH INFO");
			try{
			Stream<Path> stream = Files.walk(start, Integer.MAX_VALUE);
			List<String> collect =stream.map(String::valueOf).sorted().collect(Collectors.toList());
			for (String f : collect){
				if(f.contains("FILE NAME")){
					 folderObj = f;
					flag= false;
					break;
				}
			}
			
		}catch(Exception e){
			count++;
			if(count == 20){
				break;
			}
			}
		}
		
		System.out.println(folderObj);

	}

}
