package logic;
import charge.Charger;
import data.Telephone;

class PhoneTest {
    public static void main(String[] args) {
        Telephone telephone = new Telephone("Samsung", "Galaxy S10", 3400, 75);
        Charger charge = new Charger();
        System.out.println("");
        telephone.getInfo();        
        charge.batteryCharge(telephone);
        telephone.getInfo();
    }
}