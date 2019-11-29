/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;


public class Esto extends ClaseAbstracta {

    public Esto(String name) {
        super(name);}

    public void nombre() {System.out.println(nombre);}

    public void agregar(ClaseAbstracta a) {}

    public void eliminar(ClaseAbstracta a) {}

    public void elMasLargo(String masLargo) {
        if (masLargo.length() > nombre.length()) {System.out.println(masLargo + " mide: " + masLargo.length());} 
        else {System.out.println(nombre + " mide: " + nombre.length());}}
    
    public void masLargo() {elMasLargo("");}

}
