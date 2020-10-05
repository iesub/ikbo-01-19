package ru.mirea.lab09;

public class Task5 {

    public void printMessage(String key) {
        try {
            String message = getDetails(key);
            System.out.println( message );
        } catch(NullPointerException e){
            System.out.println("Неверные данные строки"); //обрабатывать исключение стоит там, где вызывается метод
        }                                                 //выбрасывающий данное исключение
    }

    public String getDetails(String key) {
        if(key == null) {
            throw new NullPointerException( "null key in getDetails" );
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        Task5 obj = new Task5();
        String line = null;
        obj.printMessage(line);
    }
}
