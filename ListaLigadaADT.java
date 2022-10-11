/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ed.tarea5;

/**
 *
 * @author ilike
 *  @param <T>
 */
public class ListaLigadaADT <T>{
     private Nodo<T> head;

    public  ListaLigadaADT() {
        head = null;
    }

    public boolean estaVacia() {  //esta vacía?
        return head == null;
    }

    public int getTamanio() {     //regresa el número de elementos.
        int size = 0;
        Nodo<T> aux = head;

        while(aux != null) {
            aux = aux.getNext();
            size++;
        }
        return size;
    }


    public void agregarAlFinal(T valor) {
        if(estaVacia()) {
            Nodo<T> newNode = new Nodo<>(valor);
            head = newNode;
            return;
        }

        Nodo<T> iteratorNode = head;
        while(iteratorNode.getNext() != null){
            iteratorNode = iteratorNode.getNext();
        }
        Nodo<T> newNode = new Nodo<>(valor);
        iteratorNode.setNext(newNode);
    }

    public void agregarAlInicio(T valor) {
        Nodo<T> newNode = new Nodo<>(valor, head);
        head = newNode;
    }

    public void agregarDespuésDe(T referencia, T valor) {
        if(Buscar(referencia) < 0) return;

        Nodo<T> iteratorNode = head;
        while(iteratorNode.getNext() != null && iteratorNode.getData() != referencia){
            iteratorNode = iteratorNode.getNext();
        }
        Nodo<T> newNode = new Nodo<>(valor, iteratorNode.getNext());
        iteratorNode.setNext(newNode);
    }

    public void Eliminar(int index) {
        if(this.getTamanio() <= index || estaVacia() || index < 0) return;
        if(index == 0) {
            EliminarElPrimero();
            return;
        }

        int indexPosition = 0;
        Nodo<T> prevNode = null;
        Nodo<T> iteratorNode = head;

        while(iteratorNode.getNext() != null && indexPosition < index){
            prevNode = iteratorNode;
            iteratorNode = iteratorNode.getNext();
            indexPosition++;
        }
        prevNode.setNext(iteratorNode.getNext());
    }

    public void EliminarElPrimero() {
        if(estaVacia()) return;
        head = head.getNext();
    }

    public void EliminarElFinal() {
        if(estaVacia()) return;
        if(getTamanio() == 1) {
            EliminarElPrimero();
            return;
        }
        Nodo<T> prevNode = null;
        Nodo<T> iteratorNode = head;
        while(iteratorNode.getNext() != null){
            prevNode = iteratorNode;
            iteratorNode = iteratorNode.getNext();
        }
        prevNode.setNext(null);
    }

    public int Buscar (T valor) {
        int indexPosition = 0;
        Nodo<T> iteratorNodo = head;
        while(iteratorNodo != null){
            if(iteratorNodo.getData() == valor) {
                return indexPosition;
            }
            iteratorNodo = iteratorNodo.getNext();
            indexPosition++;
        }
        return -1;
    }
    
    public void Actualizar(T a_buscar, T valor){
        if(Buscar(a_buscar) < 0) return;

        Nodo<T> iteratorNode = head;
        while(iteratorNode != null && iteratorNode.getData() != a_buscar){
            iteratorNode = iteratorNode.getNext();
        }
        if(iteratorNode.getData() != a_buscar) return;
        iteratorNode.setData(valor);
    }

    @Override
    public String toString() {
        String arrrayListString = "";
        Nodo<T> iteratorNode = head;
        while(iteratorNode != null){
            arrrayListString += iteratorNode;
            iteratorNode = iteratorNode.getNext();
        }
        return arrrayListString;
    }
}
