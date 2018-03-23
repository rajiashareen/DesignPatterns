package AbstractFactoryDesignPattern;

public class FactoryMethod {
	
	public DepartmentLevel getdepartment(String departmentbelongto){  
        if(departmentbelongto == null){  
         return null;  
        }  
      if(departmentbelongto.equalsIgnoreCase("HR")) {  
             return new HR();
           }   
       else if(departmentbelongto.equalsIgnoreCase("SoftwareEngineer")){  
            return new SoftwareEngineer(); 
        }   
      else if(departmentbelongto.equalsIgnoreCase("Technicalmanager")) {  
            return new TechnicalManager(); 
      }  
  return null;  
}
}
