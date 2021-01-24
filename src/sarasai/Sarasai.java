/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sarasai;

/**
 *
 * @author Ana Visnevskaja <ana.visnevskaja.08@gmail.com>
 */
public class Sarasai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyList ml = new MyList();
        ml.printAll();
        System.out.println(ml.size());
        ml.add("Labas");
        ml.printAll();
        System.out.println(ml.size());
        ml.add("Pasauli");
        ml.printAll();
        System.out.println(ml.size());
        ml.add("!");
        ml.printAll();
        System.out.println(ml.size());
        System.out.println(ml.size()); // 3
        System.out.println(ml); // turi isvardinyi objektus is eiles [Labas, Pasauli, !]
        System.out.println(ml.get(1)); // turi grazinti Pasauli
        ml.remove(0);
        System.out.println(ml); // [Pasauli, !]
        System.out.println(ml.get(1)); // turi atspauzdint !
        ml.insert(0, "Vel labas");
        System.out.println(ml.size()); // 3
        System.out.println(ml); // [Vel labas, Pasauli, !];
        ml.set(1, "Aliau");
        System.out.println(ml); // [Vel labas, Aliau, !];
    }
    
}
