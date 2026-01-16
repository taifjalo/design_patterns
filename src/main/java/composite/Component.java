package composite;

public abstract class Component {
    protected String name;


    /* First:
     * This constructor initializes the shared "name" attribute for all components.                  هذا الـكونستركتر وظيفته بس يخزن الاسم.
     * The Component class does not know whether it represents a Department or an Employee.          كلاس الكمبونينت ما يعرف إذا هذا موظف لو قسم،
     * It only defines common data and behavior that all subclasses share.                          هو بس يعرف إن أي عنصر لازم يكون عنده اسم.
     *
     * When a subclass (such as Department or Employee) is created, it passes the name              الكلاسات اللي ترث من الكمبونينت 
     * to this constructor using super(name), and the name is stored in the Component.              تبعث الاسم عن طريق super(name)،
     *                                                                                               والاسم ينخزن هنا حتى كل الورثة يستخدموه. 
     */
    public Component(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Add/remove children (default: not supported for leaf nodes)
    public abstract void add(Component component);
    public abstract void remove(Component component);


    // The method will be implemented for TWO prurpse: (The Recursively)  التكرار read more in Department class
    // Method to print the Total Salary of a Department with thier Employees:
    public abstract int getSalary();

    // Method to print data in XML style data
    public abstract String toXML(String indent);

}


