import javax.swing.SortOrder;

public class Singleton {
	
	 public static void main(String[] args) {
		 
		 SingletoDemo sg=SingletoDemo.INSTANCE;
		 sg.num=5;
		 sg.show();
		 
		 SingletoDemo sg2=SingletoDemo.INSTANCE;
		 sg.num=6;
		 sg2.show();
		 
		 
	 }
	 
	 enum SingletoDemo{
		INSTANCE;
		 int num;
		 public void show()
		 {
			 System.out.println(num);
		 }
		 
	 }

}
