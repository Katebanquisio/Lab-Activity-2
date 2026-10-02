public class Main{
    public static void main(String[] args){

        Vehicles v1 = new Vehicles("BMW", "3 Series", 1666);
        
        Vehicles v2 = new Vehicles("Ford", "Mustang", 1995);

        Vehicles v3 = new Vehicles("Mitshubishi", "Xpander", 2022);

        Vehicles v4 = new Vehicles("Toyota", "Corolla", 2022);

        v1.displayInfo();
        System.out.println("Age: " + v1.calculateAge());
        System.out.println("Is Vinatage: " + v1.isVintage());
        v1.setYear(2023);

        v2.displayInfo();
        System.out.println("Age: " + v2.calculateAge());
        System.out.println("Is Vinatage: " + v2.isVintage());
        v2.setYear(2008);

        
        v3.displayInfo();
        System.out.println("Age: " + v3.calculateAge());
        System.out.println("Is Vinatage: " + v3.isVintage());
        v3.setYear(1813);

        v4.displayInfo();
        System.out.println("Age: " + v4.calculateAge());
        System.out.println("Is Vinatage: " + v4.isVintage());
        v4.getYear();

    }
}