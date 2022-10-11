/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ed.tarea5;

/**
 *
 * @author ilike
 */
public class ClaseMain {

    public static void main(String[] args) {
       ListaLigadaADT<Integer> listaLigada = new ListaLigadaADT<>();
        System.out.println(listaLigada);

       
        // Agregar al inicio
        System.out.println("\nAgrega 10 al inicio");
        listaLigada.agregarAlInicio(10);
        System.out.println(listaLigada);
        

        // Agregar al final
        System.out.println("\nAgrega 15 al final");
        listaLigada.agregarAlFinal(15);
        System.out.println(listaLigada);

        // Agregar despues de
        System.out.println("\nAgregar 5 despues de 10");
        listaLigada.agregarDespuésDe(10, 5);
        System.out.println(listaLigada);
        System.out.println("\nAgregar 20 despues de 5");
        listaLigada.agregarDespuésDe(5, 20);
        System.out.println(listaLigada);
        System.out.println("\nAgregar 40 despues de 20");
        listaLigada.agregarDespuésDe(20, 40);
        System.out.println(listaLigada);
        System.out.println("\nAgregar 73 despues de 40");
        listaLigada.agregarDespuésDe(40, 73);
        System.out.println(listaLigada);
        
         // Actualizar
        System.out.println("\nActualiza el 5 a 88");
        listaLigada.Actualizar(5, 88);
        System.out.println(listaLigada);
        System.out.println("\nActualiza el 20 a 99");
        listaLigada.Actualizar(20, 99);
        System.out.println(listaLigada);

        // Elimina en la posicion
        System.out.println("\nElimina en la posicion 2");
        listaLigada.Eliminar(2);
        System.out.println(listaLigada);

        // Elimina al inicio
        System.out.println("\nElimina al inicio");
        listaLigada.EliminarElPrimero();
        System.out.println(listaLigada);

        // Elimina al final
        System.out.println("\nElimina al final");
        listaLigada.EliminarElFinal();
        System.out.println(listaLigada);

        // Busca el valor
        System.out.println("\nBusca el 40");
        System.out.println("Resultado: " + listaLigada.Buscar(40));

         // Esta vacia
        System.out.println("\nCompureba que la lista este vacia");
        System.out.println(listaLigada.estaVacia());
        
         // Tamaño
        System.out.println("\nTamaño");
        System.out.println(listaLigada.getTamanio());
        
    }
}
