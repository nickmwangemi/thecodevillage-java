public class StudentApp {
    public static void main(String[] args) {
        Student ben = new Student();

        ben.name = "Ben";
        ben.regNo = "XYZ123";
        ben.age = 20;
        ben.address = "123,00100 - Nairobi";
        ben.dateOfBirth = "17/10/1999";

        System.out.println("Name: " + ben.name);
        System.out.println("REG NO: " + ben.regNo);
        System.out.println("AGE: " + ben.age);
        System.out.println("ADDRESS: " + ben.address);
        System.out.println("DOB: " + ben.dateOfBirth);

        Student1 nick = new Student1();

        nick.name = "Nick";
        nick.regNo = "ABC456";
        nick.age = 24;
        nick.address = "56 Mombasa";
        nick.dateOfBirth = "20 JAN 1996";

        System.out.println("\n--- Using constructor ---");
        System.out.println("Name: " + nick.name);
        System.out.println("REG NO: " + nick.regNo);
        System.out.println("AGE: " + nick.age);
        System.out.println("ADDRESS: " + nick.address);
        System.out.println("DOB: " + nick.dateOfBirth);

        Student2 jane = new Student2();

        jane.setName("Jane");
        jane.setRegNo("DEF456");
        jane.setAge(34);
        jane.setAddress("456 Kisumu");
        jane.setDateOfBirth("23 March 1980");

        System.out.println("\n--- Using Setters and Getters ---");
        System.out.println("Name: " + jane.getName());
        System.out.println("REG NO: " + jane.getRegNo());
        System.out.println("AGE: " + jane.getAge());
        System.out.println("ADDRESS: " + jane.getAddress());
        System.out.println("DOB: " + jane.getDateOfBirth());

    }

}