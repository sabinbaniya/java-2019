class CompanyDemo{
    
    public static void main(String[] args){
        Company c1 = new Company();
        Company c2 = new Company();
        Company c3 = new Company();

        c1.founders[0].name = "Ram";
        c1.founders[0].dob = "5/01/1990";
        c1.founders[0].email = "ram@email.com";
        c1.founders[0].contactNo = "98023643712";
        
        c1.founders[1].name = "Hari";
        c1.founders[1].dob = "5/01/1987";
        c1.founders[1].email = "hari@email.com";
        c1.founders[1].contactNo = "98327423013";

        c1.employees[0].empName = "emp1";
        c1.employees[0].empDob = "empDOB";
        c1.employees[0].empEmail = "empEmail";
        c1.employees[0].empContactNo = "empContactNo";

        System.out.println("The no of founders of company 1 are " + c1.founders.length + 1);
        System.out.println("The no of employees of company 1 are " + c1.employees.length + 1);
    }
}