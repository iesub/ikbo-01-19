package ru.mirea.lab16;

import java.util.Arrays;

public class TableOrder implements Order{
    private int size = 0;
    private MenuItem items[];
    private Customer customer;
    private int tableNumber;
    private int id;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public MenuItem[] reSize(MenuItem[] items, String type){
        if (type.equals("inc")) {
            MenuItem buffer[] = new MenuItem[size - 1];
            for (int i = 0; i < items.length; i++) buffer[i] = items[i];
            items = new MenuItem[size];
            for (int i = 0; i < buffer.length; i++) items[i] = buffer[i];
        } else if(type.equals("decNull")){
            MenuItem buffer[] = new MenuItem[size-1];
            int control = -1;
            for (int i = 0; i < items.length; i++) {
                control += 1;
                if (items[i] == null){
                    control-=1;
                    continue;
                }
                buffer[control] = items[i];
            }
            size--;
            items = new MenuItem[size];
            for (int i = 0; i < buffer.length; i++) items[i] = buffer[i];
        }
        return items;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    @Override
    public boolean add(MenuItem item) {
        size++;
        if (size-1 == 0){
            items = new MenuItem[1];
            items[0] = item;
        } else {
            items = reSize(items, "inc");
            items[size-1] = item;
        }
        return true;
    }

    @Override
    public String[] itemNames() {
        String names[] = new String[size];
        for (int i = 0; i < items.length; i ++) names[i] = items[i].getName();
        return names;
    }

    @Override
    public int itemsQuantity() {
        return size;
    }

    @Override
    public int itemQuantity(String itemName) {
        int quantity = 0;
        for (int i = 0; i < items.length; i ++) {
            if (items[i].getName().equals(itemName)) quantity++;
        }
        return  quantity;
    }

    @Override
    public int itemQuantity(MenuItem itemName) {
        int quantity = 0;
        for (int i = 0; i < items.length; i ++) if(items[i] == itemName) quantity++;
        return quantity;
    }

    @Override
    public MenuItem[] getItem() {
        return items;
    }

    @Override
    public boolean remove(MenuItem item) {
        for (int i = 0; i < items.length; i ++){
            if(items[i] == item) {
                items[i] = null;
                items = reSize(items, "decNull");
                break;
            }
        }
        return true;
    }

    @Override
    public boolean remove(String itemName) {
        for (int i = 0; i < items.length; i ++){
            if(items[i].getName().equals(itemName)) {
                items[i] = null;
                items = reSize(items, "decNull");
                break;
            }
        }
        return true;
    }

    @Override
    public int removeAll(MenuItem item) {
        int quantity = 0;
        for (int i = 0; i < items.length; i ++){
            if(items[i] == item) {
                items[i] = null;
                items = reSize(items, "decNull");
                quantity++;
            }
        }
        return quantity;
    }

    @Override
    public int removeAll(String itemName) {
        int quantity = 0;
        for (int i = 0; i < items.length; i ++){
            if(items[i].getName().equals(itemName)) {
                items[i] = null;
                items = reSize(items, "decNull");
                quantity++;
            }
        }
        return quantity;
    }

    @Override
    public MenuItem[] sortedItemsByCostDesc() {
        boolean isSorted = false;
        MenuItem buffer;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < items.length-1; i++) {
                if(items[i].getCost() > items[i+1].getCost()){
                    isSorted = false;
                    buffer = items[i];
                    items[i] = items[i+1];
                    items[i+1] = buffer;
                }
            }
        }
        return items;
    }

    @Override
    public int costTotal() {
        int totalCost = 0;
        for(int i = 0; i < items.length; i ++){
            totalCost+=items[i].getCost();
        }
        return totalCost;
    }

    @Override
    public Customer getCustomer() {
        return customer;
    }

    @Override
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "TableOrder{" +
                "size=" + size +
                ", items=" + Arrays.toString(items) +
                ", customer=" + customer +
                '}';
    }
}
