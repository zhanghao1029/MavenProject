package formatpostcode;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {

	public static void main(String[] args) throws IOException {
	
		 String str = readTxt("C:/Test.txt").trim().replaceAll("\\s*","");
//	     System.out.println(str);
	     String[] strArray = null;
	     String[] shengArray = null;
	     String[] shiArray = null;
	     String[] quArray = null;
	     strArray = str.split(";");
//	     System.out.println(strArray.length);
	     int len = strArray.length;
	     String Str = "";
	     for(int i=0;i<len;i++){
	    	 String sheng = strArray[i].substring(2, 6);
	    	 String shi = strArray[i].substring(4, 6);
	    	 if(sheng.equals("0000")){
	    		 Str =Str + "{ name:"+strArray[i].substring(6)+","
	    			         +"code :"+ strArray[i].substring(0,6)+",child :[";
	    	 }else if(!sheng.equals("0000")&&shi.equals("00")){
	    		 Str =Str + "{ name :"+strArray[i].substring(6)+","
	    				  + " code :"+ strArray[i].substring(0,6)+",child :[";
	    	 }else{
	    		 try{
	    			 if(strArray[i+1].substring(0,2).equals(strArray[i].substring(0,2))){
		    			 Str =Str + " {name :"+strArray[i].substring(6)+","
			    				  + "code :"+ strArray[i].substring(0,6)+"},";
		    		 }else{
		    			 Str = Str+ " {name :"+strArray[i].substring(6)+","
			    				  + "code :"+ strArray[i].substring(0,6)+"}]]";
		    		 }
	    		 }catch(Exception e){
	    			 Str = Str+ " {name :"+strArray[i].substring(6)+","
		    				  + "code :"+ strArray[i].substring(0,6)+"}]]";
	    		 }
	    		 
	    	 }
	    	 if(sheng.equals("0000")){
	    		 Str =Str + "{ name:"+strArray[i].substring(6)+","
	    			         +"code :"+ strArray[i].substring(0,6)+",child :[";
	    	 }else if(!sheng.equals("0000")&&shi.equals("00")){
	    		 Str =Str + "{ name :"+strArray[i].substring(6)+","
	    				  + " code :"+ strArray[i].substring(0,6)+",child :[";
	    	 }else{
	    		 try{
	    			 if(strArray[i+1].substring(0,2).equals(strArray[i].substring(0,2))){
		    			 Str =Str + " {name :"+strArray[i].substring(6)+","
			    				  + "code :"+ strArray[i].substring(0,6)+"},";
		    		 }else{
		    			 Str = Str+ " {name :"+strArray[i].substring(6)+","
			    				  + "code :"+ strArray[i].substring(0,6)+"}]]";
		    		 }
	    		 }catch(Exception e){
	    			 Str = Str+ " {name :"+strArray[i].substring(6)+","
		    				  + "code :"+ strArray[i].substring(0,6)+"}]]";
	    		 }
	    		 
	    	 }
	     }
	     System.out.println(Str);
	}
	
	 public static String readTxt(String txtPath) {
	        File file = new File(txtPath);
	        if(file.isFile() && file.exists()){
	            try {
	                FileInputStream fileInputStream = new FileInputStream(file);
	                InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
	                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
	                 
	                StringBuffer sb = new StringBuffer();
	                String text = null;
	                while((text = bufferedReader.readLine()) != null){
	                    sb.append(text+";");
	                }
	                return sb.toString();
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        }
	        return null;
	    }

}
