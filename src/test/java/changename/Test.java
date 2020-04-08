package changename;

import java.io.File;

class Test {

	public static void main(String[] args) {
		 File file=new File("E:\\MyEcplise\\2014\\XbankT1_Trans_Pro\\src\\com\\hiaward\\xbank\\adapter\\config\\"); 
		 String [] fileName = file.list();  //用于存放文件底下所有子文件名的数组
		 //先提取原文件名中有效的信息
		 for (int i = 0; i < fileName.length; i++) {
			 String[] name=fileName[i].split("_");  //根据原先的命名格式匹配出想要的信息（具体根据你们自己的情况咯！）
			 if(name[0].equals("trans")){
				 String NewName = name[0]+"_1001_"+name[2];
				 File Oldfile = new File("E:\\MyEcplise\\2014\\XbankT1_Trans_Pro\\src\\com\\hiaward\\xbank\\adapter\\config\\"+fileName[i]);
				 File toBeRenamed = new File("E:\\MyEcplise\\2014\\XbankT1_Trans_Pro\\src\\com\\hiaward\\xbank\\adapter\\config\\"+NewName);
				 System.out.println("NewName");
				 if(Oldfile.renameTo(toBeRenamed)){
					 System.out.println("YES");
				 }else{
					 System.out.println("NO");
				 };
			 }
			
		}
	}

}
