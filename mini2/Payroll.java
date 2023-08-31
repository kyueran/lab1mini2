import java.util.ArrayList;

class Payroll {
  private ArrayList<Employee> employees = new ArrayList<Employee>();

  public void register(Employee e) {
    employees.add(e);
  }

  public int getTotalSalary() {
    int totalSalary = 0;
    for (Employee e: employees) {
      if (e.getEmployeeType() == Employee.MANAGER) {
        int monthlySalary = e.getMonthlySalary();
        int overtimeHours = e.getOvertimeHours();
        totalSalary += monthlySalary + overtimeHours * monthlySalary / 160;
      } else if (e.getEmployeeType() == Employee.FULLTIMER) {
        int monthlySalary = e.getMonthlySalary();
        totalSalary += monthlySalary;
      } else if (e.getEmployeeType() == Employee.PARTTIMER) {
        int hourlyRate = e.getHourlyRate();
        int clockedHours = e.getClockedHours();
        int overtimeHours = e.getOvertimeHours();
        totalSalary += hourlyRate * (clockedHours + overtimeHours);
      } else if (e.getEmployeeType() == Employee.INTERN) {
        int hourlyRate = e.getHourlyRate();
        int clockedHours = e.getClockedHours();
        totalSalary += hourlyRate * clockedHours;
      }
    }
    return totalSalary;
  }

  @Override
  public String toString() {
    StringBuilder str = new StringBuilder();
    for (int i = 0; i < employees.size(); i++) {
      str.append(employees.get(i).toString());
      if (i < employees.size() - 1) {
        str.append(" ");
      }
    }
    return str.toString();
  }
}