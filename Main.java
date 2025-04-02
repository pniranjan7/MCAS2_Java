public class Main {  
    public static void main(String[] args) {
        Teacher teacObj[] = new Teacher[2];
        teacObj[0] = new Teacher("1", "A", "AA", 11, "AAA", "AAAA");
        teacObj[1] = new Teacher("1", "B", "BB", 11, "BBB", "BBBB");
        teacObj[0].display();
        teacObj[1].display();
    }
}

class Employees {
    String EmpId;
    String Name;
    String Address;
    int Salary;

    Employees(String EmpId, String Name, String Address, int Salary) {
        this.EmpId = EmpId;
        this.Name = Name;
        this.Address = Address;
        this.Salary = Salary;
    }

    void display() {
        System.out.println("Employee Id: " + this.EmpId + " Name: " + this.Name + " Address: " + this.Address
                + " Salary: " + this.Salary);
    }
}

class Teacher extends Employees {
    String Department;
    String Subject;

    Teacher(String EmpId, String Name, String Address, int Salary, String Department, String Subject) {
        super(EmpId, Name, Address, Salary);
        this.Department = Department;
        this.Subject = Subject;
    }

    void display() {
        System.out.println("......................");
        super.display();
        System.out.println("Dept name: " + this.Department);
        System.out.println("Subject name: " + this.Subject);
        System.out.println("..............................");
    }
}
