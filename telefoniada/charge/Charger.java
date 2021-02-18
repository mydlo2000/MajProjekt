package charge;

import data.Telephone;

public class Charger {
    
    public void batteryCharge(Telephone telephone) {
        int currentChargeLevel = telephone.getChargeLevel();
        telephone.setChargeLevel(currentChargeLevel + 5);
        System.out.println("Telefon ladowal sie przez godzine");
    }    
}

