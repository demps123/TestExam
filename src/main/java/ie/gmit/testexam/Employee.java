package ie.gmit.testexam;

public class Employee {

    String title;
    String name;
    String pps;
    String type;
    int age;

    public Employee(String title, String name, String pps, String type, int age) {
        setTitle(title);
        setName(name);
        setPps(pps);
        setType(type);
        setAge(age);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if(title == "Mr" || title == "Mrs" || title == "Miss") {
            this.title = title;
        }
        else {
            throw new IllegalArgumentException("Invalid Title");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() >= 5 && name.length() <= 22) {
            this.name = name;
        }
        else {
            throw new IllegalArgumentException("Name provided is not valid");
        }
    }

    public String getPps() {
        return pps;
    }

    public void setPps(String pps) {
        if(pps.length() == 8) {
            this.pps = pps;
        }
        else {
            throw new IllegalArgumentException("Invalid PPS Number");
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
