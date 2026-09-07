package Maps;

public class employee {
    int id,salary;
    String name,dept;


    public employee(int id,int salary, String name, String dept) {

        this.id= id;
        this.salary = salary;
        this.name = name;
        this.dept = dept;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String getDept() {
        return dept;
    }
}
