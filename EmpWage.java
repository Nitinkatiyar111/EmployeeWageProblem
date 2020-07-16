class EmpWage 
   {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    
   public static void main(String[] args) 
  
   {
    
   
    System.out.println("Welcome to Employee Wage Computation program");
    
    int numOfWorkingDays = 20;
    int maxHrsInMonth = 100;    
    int empHrs = 0;
    int empWage = 0;
    int totalEmpHrs=0;
    int totalWorkingDays=0;
    
while (totalEmpHrs <= maxHrsInMonth && totalWorkingDays <= numOfWorkingDays)
  {
     totalWorkingDays++;
     int  empCheck  = (int) Math.floor(Math.random() * 10) % 2;
     switch(empCheck)
        {
             case IS_PART_TIME:
               empHrs = 4 ;
                 break;
             case IS_FULL_TIME:
               empHrs = 8;
                 break;
    default:
         empHrs = 0;
      } 
     totalEmpHrs+=empHrs;

}
     empWage = totalEmpHrs * EMP_RATE_PER_HOUR;

    System.out.println ("Employee Wage: "+ empWage);
   }
}   


