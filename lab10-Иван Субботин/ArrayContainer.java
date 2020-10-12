package ru.mirea.lab10;

public class ArrayContainer<E> {
        private E [] arr;
        public E getArrIndex(int i){
            return  arr[i] ;
        }
        public void setArr( E [] arr) {
            this.arr = arr;
        }
        public void showArr(){
            for (int i = 0 ; i < arr.length; i ++) System.out.print(arr[i] + " ");
            System.out.println();
        }
}
