package ru.mirea.practice06.task03;

import ru.mirea.practice06.task01.Student;

public class Main {
    static Student[] array = new Student[10];
    static Student[] array2 = new Student[10];
    static Student[] array3 = new Student[array.length + array2.length];

    public static void mergeSort(Student[] array, int startIndex, int endIndex){
        if (endIndex <= startIndex) return;
        int mid = (startIndex+endIndex)/2;
        mergeSort(array, startIndex, mid);
        mergeSort(array, mid+1, endIndex);
        merge(array, startIndex, mid, endIndex);
    }

    public static void merge(Student[] array, int startIndex, int mid, int endIndex){
        // вычисляем длину
        int lengthLeft = mid - startIndex + 1;
        int lengthRight = endIndex - mid;

        // создаем временные подмассивы
        Student leftArray[] = new Student[lengthLeft];
        Student rightArray[] = new Student[lengthRight];

        // копируем отсортированные массивы во временные
        for (int i = 0; i < lengthLeft; i++)
            leftArray[i] = array[startIndex+i];
        for (int i = 0; i < lengthRight; i++)
            rightArray[i] = array[mid+i+1];

        // итераторы содержат текущий индекс временного подмассива
        int leftIndex = 0;
        int rightIndex = 0;

        // копируем из leftArray и rightArray обратно в массив
        for (int i = startIndex; i < endIndex + 1; i++) {
            // если остаются нескопированные элементы в R и L, копируем минимальный
            if (leftIndex < lengthLeft && rightIndex < lengthRight) {
                if (leftArray[leftIndex].getIDNumber() < rightArray[rightIndex].getIDNumber()) {
                    array[i] = leftArray[leftIndex];
                    leftIndex++;
                }
                else {
                    array[i] = rightArray[rightIndex];
                    rightIndex++;
                }
            }
            // если все элементы были скопированы из rightArray, скопировать остальные из leftArray
            else if (leftIndex < lengthLeft) {
                array[i] = leftArray[leftIndex];
                leftIndex++;
            }
            // если все элементы были скопированы из leftArray, скопировать остальные из rightArray
            else if (rightIndex < lengthRight) {
                array[i] = rightArray[rightIndex];
                rightIndex++;
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Student element = new Student((int) (Math.random() * 50 + 1), Math.random() * 5);
            array[i] = element;
            System.out.print(" " + element);
        }
        System.out.println();
        System.out.println();
        for (int i = 0; i < 10; i++) {
            Student element = new Student((int) (Math.random() * 50 + 1), Math.random() * 5);
            array2[i] = element;
            System.out.print(" " + element);
        }
        System.out.println();
        System.out.println();
        for(int i = 0; i < 20; i++){
            if(i <10){
                array3[i] = array[i];
            }else{
                int k = i - 10;
                array3[i] = array2[k];
            }
        }
        mergeSort(array3, 0, (array3.length-1));
        for(int i = 0; i < 20; i++){
            System.out.print(" " + array3[i]);
        }
    }
}
