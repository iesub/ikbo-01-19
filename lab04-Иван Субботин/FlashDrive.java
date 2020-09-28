package ru.mirea.lab04;

public class FlashDrive implements Priceable {
    private String manufacturer;
    public FlashDrive(String manufacturer){
        this.manufacturer = manufacturer;
    }
    public void getPrice(){
        System.out.println("Price: 2$");
    }
    @Override
    public String toString() {
        return "FlashDrive{" +
                "manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
