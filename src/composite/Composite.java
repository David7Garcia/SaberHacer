package composite;


import java.util.ArrayList;
import java.util.List;

public class Composite extends ClaseAbstracta {

    private List<ClaseAbstracta> esto = new ArrayList<>();

    public Composite(String nombre) {
        super(nombre);
    }
 //metodo Nombre
    public void nombre() {
        System.out.println(this.nombre);
        for (ClaseAbstracta child : esto) {child.nombre();}}  
//metodo Agregar
    public void agregar(ClaseAbstracta a) {
        if (a != null) {this.esto.add(a);}}
//metodo Eiminar
    public void eliminar(ClaseAbstracta a) {
        if (a != null) {this.esto.remove(a);}}
//metodo el mas largo
    public void masLargo() {elMasLargo("");}    
//metodo El Mas Largo    
    public void elMasLargo(String masLargo) {
        for (ClaseAbstracta child : esto) {
            if (masLargo.length() > nombre.length()) {child.elMasLargo(masLargo);} 
            else {child.elMasLargo(nombre);}}}
    

}
