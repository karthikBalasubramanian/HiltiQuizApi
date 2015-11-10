package com.hilti.quiz.api.utility;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

import javax.imageio.ImageIO;

import org.springframework.stereotype.Component;
@Component
public class ImageToByteArray {

	
	//image to byte Array
	
	public byte[] imageToBytes(File file) throws IOException{
		return Files.readAllBytes(file.toPath());
	}
	
	//byte array to String
	
	public String byteToString(byte[] stringByteArray){
		return new String(stringByteArray, StandardCharsets.UTF_8);
	}
	
	//String to byte array
	
	public byte[] stringToBytes(String string){
		return string.getBytes(StandardCharsets.UTF_8);
	}
	
	//byte array to file.png 
	
	public File byteArrayToFile(byte[] imageByteArray,String filePath) throws IOException{
		BufferedImage img = ImageIO.read(new ByteArrayInputStream(imageByteArray));
		File outputfile = new File(filePath);
		ImageIO.write(img, "png", outputfile);
		return outputfile;
	}
	
	
	/*public static void main(String[] args)  {
		ImageToByteArray imageObj = new ImageToByteArray();
		byte[] byteArray = imageObj.imageToBytes(new File("C:\\Users\\vaishu\\Desktop\\diagram\\colorful-triangles-background.jpg"));
		imageObj.byteArrayToFile(byteArray);
		
		//System.out.println(Question.class.getName().substring(Question.class.getName().lastIndexOf(".")+1));
	}
*/
}
