package ru.mirea.lab16;

public interface Order {
    public boolean add(MenuItem item);
    public String[] itemNames();
    public int itemsQuantity();
    public int itemQuantity(String itemName);
    public int itemQuantity(MenuItem itemName);
    public MenuItem[] getItem();
    public boolean remove(String itemName);
    public boolean remove(MenuItem item);
    public int removeAll(String itemName);
    public int removeAll(MenuItem item);
    public MenuItem[] sortedItemsByCostDesc();
    public int costTotal();
    public Customer getCustomer();
    public void setCustomer(Customer customer);
}
