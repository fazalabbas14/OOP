public class Person1 {

    String name;

    public Person1(String name) {
        this.name = name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getname() {
        return name;
    }

    public String display() {
        return String.format("Name: ", name);
    }

}
