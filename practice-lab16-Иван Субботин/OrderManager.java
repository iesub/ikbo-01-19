package ru.mirea.lab16;

public interface OrderManager {
    public int itemsQuantity(String itemName);
    public int itemsQuantity(MenuItem item);
    public Order[] getOrders();
    public int ordersCostSummary();
    public int orderQuantity();
}
