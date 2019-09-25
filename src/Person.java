public class Person {

    private String name;

    public String getName() { return this.name; }

    public void setName(String name) { this.name = name; }

    public void sayHello() { System.out.println("Hello from " + name); }

    public Person() {
        this.name = "Unnamed Person";
        handlePerson();
    }

    public Person(String name) {
        this.name = name;
        handlePerson();
    }

    private void handlePerson(){
        System.out.println("New person was created.");
    }

}
