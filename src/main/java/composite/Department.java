package composite;

import java.util.ArrayList;
import java.util.List;

public class Department extends Component { 
    private List<Component> children = new ArrayList<>(); //  هاي ليست تخزن العناصر اللي داخل القسم،  ممكن تكون موظفين أو أقسام ثانية،  لأن الكل يرث من كمبونينتComponent .


    /* 
    * private String DepartmentName;        
    * No need for the departmentName while we inhert it from abstract class Component 
    */ 

    // inherted name will be: DepartmentName
    public Department (String departmentName) { 
        super(departmentName);
    }

    // add new Department or Employee inside the Department.
    @Override
    public void add(Component component) {
        this.children.add(component);
    };

    @Override
    public void remove(Component component) {
        this.children.remove(component);
    };


    // The method here will be for TWO prurpse: (recursively) تكرار استخدام نفس الميثود
    // First: we Override it to Calculate the Total of Department employees salaries
    // Second: Will return Each employee salary from his department. to count all them in total.
    @Override
    public int getSalary() {
        int totalSalary = 0;
        for (Component component : children) { 
            totalSalary += component.getSalary(); // here we use the method for Second porpuse which pring the employee salary.
      } 
      return totalSalary;
    }



    // The method here will be for TWO prurpse: (recursively) تكرار استخدام نفس الميثود
    // Loop through each child, call child.toXML(indent + " ") recursively
    @Override
    public String toXML(String indent) {
        StringBuilder xmlString = new StringBuilder();
        xmlString.append(indent + "<Department name=\"" + name + "\">\n");

        for (Component child : children) {
            xmlString.append(child.toXML(indent + "  "));
        }

        xmlString.append(indent + "</Department>\n");
        return xmlString.toString();
    }

}
