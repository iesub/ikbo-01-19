package ru.mirea.practice06.task01;

public class Test {
    static Student[] array = new Student[10];

    public static void sortArray(){
        for (int left = 0; left < array.length; left++) {
            // Вытаскиваем значение элемента
            Student value = array[left];
            // Перемещаемся по элементам, которые перед вытащенным элементом
            int i = left - 1;
            for (; i >= 0; i--) {
                // Если вытащили значение меньшее — передвигаем больший элемент дальше
                if (value.getIDNumber() < array[i].getIDNumber()) {
                    array[i + 1] = array[i];
                } else {
                    // Если вытащенный элемент больше — останавливаемся
                    break;
                }
            }
            // В освободившееся место вставляем вытащенное значение
            array[i + 1] = value;
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Student element = new Student((int) (Math.random() * 50 + 1));
            array[i] = element;
            System.out.print(" " + element);
        }
        sortArray();
        System.out.println();
        for(int i = 0; i < 10; i++){
            System.out.print(" " + array[i]);
        }
    }
}
