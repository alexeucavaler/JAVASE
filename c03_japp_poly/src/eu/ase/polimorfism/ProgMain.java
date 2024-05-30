package eu.ase.polimorfism;

public class ProgMain {
    public static void main(String[] args) {
        Vehicul v1 = null;
        Auto au1 = new Auto(1200, 4);
        Avion av1 = new Avion(7000, 50, 1);
        
        //<=>POLIMORFISM "PUR" ca in C++
        v1 = au1; // Vehicul v1 = new Auto(...)
        System.out.println("v1 = " + v1.afis());
        //peste 102 linii cod
        v1 = av1;
        System.out.println("v1 = " + v1.afis());

        Vehicul v0;
        v0 = au1; //Auto -> Vehicul - up-cast (e implicit)
        //peste 27 linii cod
        try {
            av1 = (Avion)v0;
        } catch(ClassCastException cce) {
            cce.printStackTrace();
        }        
        
        IMiscare im0 = new Auto(2900, 4);
        //im0.afis();//eroare la compilare
        im0.pornesteMotor();
    }
}
