package ie.gmit.testexam;

public class Employee {

    String title;
    String name;
    String pps;
    String type;
    int age;

    public Employee(String title, String name, String pps, String type, int age) {
        setTitle(title);
        this.name = name;
        this.pps = pps;
        this.type = type;
        this.age = age;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if(title == "Mr" || title == "Mrs" || title == "Ms") {
            this.title = title;
        }
        else {
            throw new IllegalArgumentException("Invalid Title");
        }
    }

}
