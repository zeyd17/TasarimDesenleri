
public class ConcreateHandlerAvi  extends playerHandler{
	
	public void play(String path) {
		
		if (path.lastIndexOf("avi") !=-1) {
			System.out.println("avi �al�yor "+path);
		}else {
			System.out.println(path+" dosya a��lam�yor  ");
		}
	}
}
