package ru.mirea.lab16;

public class InternetOrder implements Order{
    private int size = 0;
    private Customer customer;
    private ListNode head;
    private ListNode tail;
    private int id;

    public String getCustomerInf(){
        return customer.toString();
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
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
    public boolean add(MenuItem item) {
        if (head == null){
            head = tail = new ListNode();
            head.setValue(item);
            head.setNext(head);
            head.setPrev(head);
            size++;
        } else{
            ListNode buffer = new ListNode();
            buffer.setValue(item);
            tail.setNext(buffer);
            buffer.setPrev(tail);
            buffer.setNext(head);
            tail = buffer;
            head.setPrev(tail);
            size++;
        }
        return true;
    }

    @Override
    public String[] itemNames() {
        String names[] = new String[size];
        ListNode buffer = head;
        for (int i = 0; i < size; i++){
            names[i] = buffer.getValue().getName();
            buffer = buffer.getNext();
            if (buffer == head) break;
        }
        return names;
    }

    @Override
    public int itemsQuantity() {
        return size;
    }

    @Override
    public int itemQuantity(String itemName) {
        int quantity = 0;
        ListNode buffer = head;
        for (int i = 0; i < size; i++){
            if (buffer.getValue().getName().equals(itemName)) quantity++;
            buffer = buffer.getNext();
        }
        return quantity;
    }

    @Override
    public int itemQuantity(MenuItem itemName) {
        int quantity = 0;
        ListNode buffer = head;
        for (int i = 0; i < size; i++){
            if (buffer.getValue() == itemName) quantity++;
            buffer = buffer.getNext();
        }
        return quantity;
    }

    @Override
    public MenuItem[] getItem() {
        MenuItem[] items = new MenuItem[size];
        ListNode buffer = head;
        for (int i = 0; i < size; i++){
            items[i] = buffer.getValue();
            buffer = buffer.getNext();
        }
        return items;
    }

    @Override
    public boolean remove(String itemName) {
        ListNode buffer = head;
        for (int i = 0; i < size; i++){
            if (buffer.getValue().getName().equals(itemName)){
                buffer.getPrev().setNext(buffer.getNext());
                buffer.getNext().setPrev(buffer.getPrev());
                buffer = null;
                size--;
                break;
            }
            buffer = buffer.getNext();
        }
        return true;
    }

    @Override
    public boolean remove(MenuItem item) {
        ListNode buffer = head;
        for (int i = 0; i < size; i++){
            if (buffer.getValue() == item){
                buffer.getPrev().setNext(buffer.getNext());
                buffer.getNext().setPrev(buffer.getPrev());
                buffer = null;
                size--;
                break;
            }
            buffer = buffer.getNext();
        }
        return true;
    }

    @Override
    public int removeAll(String itemName) {
        int quantity = 0;
        ListNode buffer = head;
        for (int i = 0; i < size; i++){
            if (buffer.getValue().getName().equals(itemName)){
                buffer.getPrev().setNext(buffer.getNext());
                buffer.getNext().setPrev(buffer.getPrev());
                quantity++;
            }
            ListNode buf = buffer;
            buffer = buffer.getNext();
            buf = null;
        }
        return quantity;
    }

    @Override
    public int removeAll(MenuItem item) {
        int quantity = 0;
        ListNode buffer = head;
        for (int i = 0; i < size; i++){
            if (buffer.getValue() == item){
                buffer.getPrev().setNext(buffer.getNext());
                buffer.getNext().setPrev(buffer.getPrev());
                quantity++;
            }
            ListNode buf = buffer;
            buffer = buffer.getNext();
            buf = null;
        }
        return quantity;
    }

    @Override
    public MenuItem[] sortedItemsByCostDesc() {
        boolean isSorted = false;
        MenuItem[] items = new MenuItem[size];
        ListNode buff = head;
        for (int i = 0; i < size; i++){
            items[i] = buff.getValue();
            buff = buff.getNext();
        }
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
        ListNode buffer = head;
        for (int i = 0; i < size; i++){
            totalCost += buffer.getValue().getCost();
            buffer = buffer.getNext();
        }
        return  totalCost;
    }

    @Override
    public String toString() {
        return "InternetOrder{" +
                "size=" + size +
                ", items=" + getItem() +
                ", customer=" + customer +
                '}';
    }
}
