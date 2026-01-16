# Organization Structure Assignment - What have I learned or learnt?

This assignment demonstrates the **Composite Pattern** by modeling an organizational structure with **Departments** and **Employees**.

## What this project includes

- Practice using the **Composite Pattern**:

  - `Department` acts as a **composite** (can contain multiple items).
  - `Employee` acts as a **leaf** (single item).

- An **abstract `Component` class** to hold common properties and methods for all items.

- **Inheritance strategy**:

  - `Component` constructor (`super(name)`) initializes a shared name for all subclasses.

- **Recursive `getSalary()` method** with two purposes:
  1. **Departments:** calculate the total salary of all employees, including sub-departments.
  2. **Employees:** return their own salary, which departments use to calculate totals.

This design allows **uniform handling** of departments and employees, dynamic addition/removal of items, and makes it easy to compute total salaries or print the structure.
