public class MyCar {

    private String name = "Volvo";
    private String regNumber = "KAA 001A";
    private String color = "Black";

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegNumber() {
        return this.regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void main(String[] args) {
        MyCar volvo = new MyCar();
        MyCar toyota = new MyCar();
        MyCar bmw = new MyCar();

        System.out.println("----- VOLVO -----");

        System.out.println(volvo.name);
        System.out.println(volvo.regNumber);
        System.out.println(volvo.color);

        System.out.println("----- TOYOTA -----");
        System.out.println(toyota.name);
        System.out.println(toyota.regNumber);
        System.out.println(toyota.color);

        System.out.println("----- BMW -----");
        bmw.name = "BMW";
        bmw.regNumber = "KCX 724B";
        bmw.color = "Black";

        System.out.println(bmw.name);
        System.out.println(bmw.regNumber);
        System.out.println(bmw.color);
        

    }

}