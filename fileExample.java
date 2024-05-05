import java.io.File;


class fileExample
{
	int filecount;
	int foldercount;
	
	public static void main(String args[]){
		fileExample fe = new fileExample();
		fe.setNameOfFile("./javaPractical");
		
	}
	
	public void setNameOfFile(String path){
		File fi = new File(path);
		System.out.println(fi.getName());
		System.out.println(fi.getParent());
	}
}
