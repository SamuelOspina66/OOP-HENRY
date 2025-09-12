
package carros;
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        
        car1.setCompany_name("Chevrolet");
        car1.setModel_name("Todo terreno");
        car1.setYear(2009);
        car1.setMileage(6);
        
    
        car2.setCompany_name("Suzuki");
        car2.setModel_name("190");
        car2.setYear(2009);
        car2.setMileage(22);
 
        
        
        car3.setCompany_name("Mazda");
        car3.setModel_name("Cruze");
        car3.setYear(2009);
        car3.setMileage(4);
        
        
        System.out.println("===============================");
        System.out.println("Primer Carro ");
        System.out.println("Company Name: " + car1.getCompany_name());
        System.out.println("Model Name: " + car1.getModel_name());
        System.out.println("Year: " + car1.getYear());
        System.out.println("Mileage: " + car1.getMileage());
        System.out.println("===============================");
        
        System.out.println("Segundo Carro ");
        System.out.println("Company Name: " + car2.getCompany_name());
        System.out.println("Model Name: " + car2.getModel_name());
        System.out.println("Year: " + car2.getYear());
        System.out.println("Mileage: " + car2.getMileage());
        System.out.println("===============================");
        
        
        System.out.println("Tercer Carro ");
        System.out.println("Company Name: " + car3.getCompany_name());
        System.out.println("Model Name: " + car3.getModel_name());
        System.out.println("Year: " + car3.getYear());
        System.out.println("Mileage: " + car3.getMileage());
        System.out.println("===============================");
        
        
    }
    
}
