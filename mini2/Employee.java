class Employee {
  public static final int MANAGER = 1;
  public static final int FULLTIMER = 2;
  public static final int PARTTIMER = 3;
  public static final int INTERN = 4;

  public static int lastId = 0;
  private final int id;

  private int employeeType;
  private int monthlySalary;
  private int hourlyRate;
  private int clockedHours;
  private int overtimeHours;

  public Employee(int etype, int monthlySalary,
      int hourlyRate, int clockedHours, int overtimeHours) {
    this.id = Employee.lastId;
    Employee.lastId += 1;
    this.employeeType = etype;
    this.monthlySalary = monthlySalary;
    this.hourlyRate = hourlyRate;
    this.clockedHours = clockedHours;
    this.overtimeHours = overtimeHours;
  }

  public int getEmployeeType() {
    return this.employeeType;
  }

  public int getMonthlySalary() {
    return this.monthlySalary;
  }

  public int getHourlyRate() {
    return this.hourlyRate;
  }

  public int getClockedHours() {
    return this.clockedHours;
  }

  public int getOvertimeHours() {
    return this.overtimeHours;
  }

  @Override
  public String toString() {
    final String INT_ID = String.valueOf(id);
    if (this.employeeType == Employee.MANAGER) {
      return "Manager" + INT_ID;
    } else if (this.employeeType == Employee.FULLTIMER) {
      return "FullTimer" + INT_ID;
    } else if (this.employeeType == Employee.PARTTIMER) {
      return "PartTimer" + INT_ID;
    } else if (this.employeeType == Employee.INTERN) {
      return "Intern" + INT_ID;
    }
    return "INVALID-EMPLOYEE-TYPE";
  }
}