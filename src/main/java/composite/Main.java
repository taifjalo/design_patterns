package composite;

public class Main {
    public static void main(String[] args) {

        Component HRdepartment = new Department("HR Department");
        Component ITdepartment = new Department("IT Department");
        Component DevelopDepartment = new Department("Main Department");

        Component employee1 = new Employee("Martin", 1300);
        Component employee2 = new Employee("Kamal", 1400);
        Component employee3 = new Employee("Noora", 1100);


        // Add first two Employees into the HR-Ddepartment:
        HRdepartment.add(employee1);
        HRdepartment.add(employee2);

        // Remove employee from Department:
        HRdepartment.remove(employee2);

        // Add the one Employee into the IT-Ddepartment:
        ITdepartment.add(employee3);

        // Add the HR-Ddepartment and IT-Ddepartment into the Develop Department(this is what actully Com):
        DevelopDepartment.add(HRdepartment);
        DevelopDepartment.add(ITdepartment);



        // Printing the Total Salary of Department:
        int totalSalary = HRdepartment.getSalary();
        System.out.println("The Total Salary of the Department: " + totalSalary +"\n");


        // Print and convert Data to XML String:
        String departmentDataXML = DevelopDepartment.toXML("");
        System.out.println(departmentDataXML);
    }
}
