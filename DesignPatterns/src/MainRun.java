import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainRun {
	 public static void main(String[] args) {
	  FactoryMethod planFactory = new FactoryMethod();
      System.out.print("Enter the name of plan for which the bill will be generated: ");  
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
  
      String DepartName;
	try {
		DepartName = br.readLine();
		
	      DepartmentLevel p = planFactory.getdepartment(DepartName);  
	      //call getRate() method and calculateBill()method of DomesticPaln.  
	  
	        String s=   p.getsalarydetails();
	           p.getskills();
	           System.out.println(s);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}  
    
            
}
    
}
