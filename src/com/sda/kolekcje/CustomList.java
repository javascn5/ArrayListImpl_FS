package com.sda.kolekcje;

// implementacja wlasnej arraylist
public class CustomList<E> {

    private int size = 0;
    private final int DEFAULT_CAPACITY = 10;
    private Object elements[]; // poniewaz bedziemy wpisywac rozne rzeczy w stringi, inty


    public CustomList(){
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void add(E e){
        if(size == elements.length){
            resize();
        }
        elements[size++] = e;
    }

    public void resize(){
        int newSize = elements.length * 2;

        Object elementsTemp[] = new Object[newSize];

        for (int i = 0; i < elements.length ; i++) {
            elementsTemp[i] = elements[i];
        }
        elements = elementsTemp;
    }

    public E get(int i){
        if (i>=size || i<0){
            throw new IndexOutOfBoundsException(" Nie ma takiego elementu ");
        }
        return (E) elements[i]; // rzutowanie
    }

    public int size(){
     return size;
    }


    /**
    public void remove(int index){
     // dodać usuwanie elementu
     // przesuwamy elemeny o jdno miejsce w lewo tam gdzie usunelismy
    }
     */
    
}
