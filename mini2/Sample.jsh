/open Employee.java
/open Payroll.java

Employee m = new Employee(1, 10000, 0, 0, 10);
Employee ft = new Employee(2, 5000, 0, 0, 0);
Employee pt = new Employee(3, 0, 40, 100, 20);
Employee i = new Employee(4, 0, 30, 50, 0);
Payroll pr = new Payroll();

pr.register(m);
pr.register(ft);
pr.register(pt);
pr.register(i);

// pr
// pr.getTotalSalary()