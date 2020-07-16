class EmpWage {
        public static void main(String[] args) 
  {
     
System.out.println("Welcome to Employee Wage Computation program");

    int IS_FULL_TIME = 1;
    int IS_PART_TIME = 2;
    int EMP_RATE_PER_HOUR = 20;
    int totalWorkingDay = 20;

     int empHrs = 0;
     int empWage = 0;
  
     int  empCheck  = (int) Math.floor(Math.random() * 10) % 2;
     switch(empCheck)
             case IS_PART_TIME:
               empHrs = 4 * totalWorkingDay ;
                 break;
             case IS_FULL_TIME:
               empHrs = 8 * totalWorkingDay ;
                 break;
    default:
         empHrs = 0;
      } 
     empWage = empHrs * EMP_RATE_PER_HOUR;
    System.out.prinltn ("Employee Wage: "+ empWage);
   }
}   
