
package company;

public class Company {
    public static void main(String[] args) {
        CompanyData company1=new CompanyData("RP",1725613002);
        System.out.println("Nombre de la compañia: "+company1.getName()
        +"\nID: "+company1.getId());
        Transaction transaction1=new Transaction(4.99,5,8.45);
    }
}
