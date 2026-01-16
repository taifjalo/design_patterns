package composite;


public class Employee extends Component {
    private int salary;


    /* 
    * private String EmployeeName;         
    * No need for the EmployeeName while we inhert it from abstract class Component.    * الاسم موجود بالكلاس الأب، فما نحتاج نعيد تعريفه هنا.
    */
    public Employee(String employeeName, int salary) { // inherted name will be: EmployeeName
        super(employeeName);
        this.salary = salary;
    }

    // Leaf node, do nothing or throw exception:
    @Override
    public void add(Component component) {
        throw new UnsupportedOperationException("Not supported in leaf.");
    };

    @Override
    public void remove(Component component) {
        throw new UnsupportedOperationException("Not supported in leaf.");
    };



    // The method here will return only the employee salary. we use it in the Department class like for (The Recursively)  التكرار ...
    @Override
    public int getSalary() {
        return salary;
    }

    @Override
    public String toXML(String indent) {
        return indent + "<Employee name=\"" + name + "\" salary=\"" + salary + "\"/>\n";
    }
}
