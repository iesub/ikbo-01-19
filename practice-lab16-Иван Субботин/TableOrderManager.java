package ru.mirea.lab16;

public class TableOrderManager implements OrderManager {
    private Order[] orders;
    private int orderNumber;
    private int[] freeTables;
    private int idCounter = 1;

    public void setFreeTables(int[] freeTables) {
        this.freeTables = freeTables;
    }

    public Order[] reSize(Order[] items, String type){
        if (type.equals("inc")) {
            Order buffer[] = new Order[orderNumber - 1];
            for (int i = 0; i < items.length; i++) buffer[i] = items[i];
            items = new Order[orderNumber];
            for (int i = 0; i < buffer.length; i++) items[i] = buffer[i];
        } else if(type.equals("decNull")){
            Order buffer[] = new Order[orderNumber-1];
            int control = -1;
            for (int i = 0; i < items.length; i++) {
                control += 1;
                if (items[i] == null){
                    control-=1;
                    continue;
                }
                buffer[control] = items[i];
            }
            orderNumber--;
            items = new Order[orderNumber];
            for (int i = 0; i < buffer.length; i++) items[i] = buffer[i];
        }
        return items;
    }

    public boolean checkFreeTable(int tableNumber){
        for (int i = 0; i < freeTables.length; i ++) if (freeTables[i] == tableNumber) return true;
        return false;
    }

    public boolean add(Order order, int tableNumber){
        orderNumber++;
        if (orderNumber-1 == 0){
            orders = new Order[1];
            ((TableOrder)order).setTableNumber(tableNumber);
            ((TableOrder) order).setId(idCounter);
            idCounter++;
            orders[0] = order;
        } else {
            orders = reSize(orders, "inc");
            ((TableOrder)order).setTableNumber(tableNumber);
            ((TableOrder) order).setId(idCounter);
            idCounter++;
            orders[orderNumber-1] = order;
        }
        return true;
    }

    public int freeTableNumber(int check){// 1 забрать число, остальные посмотреть
        if (freeTables.length!=0) {
            if (check == 1) {
                int[] buff = new int[freeTables.length - 1];
                for (int i = 0; i < buff.length; i++) {
                    buff[i] = freeTables[i + 1];
                }
                int buffer = freeTables[0];
                freeTables = buff;
                return buffer;
            } else return freeTables[0];
        }
        else return 0;
    }

    public void addFreeTable(int tableNumber){
        if (freeTables.length!=0) {
            int[] buff = new int[freeTables.length];
            for (int i = 0; i < buff.length; i++) {
                buff[i] = freeTables[i];
            }
            freeTables = new int[freeTables.length+1];
            for (int i = 0; i < buff.length; i++) {
                freeTables[i] = buff[i];
            }
            freeTables[freeTables.length-1] = tableNumber;
        } else {
            freeTables = new int[freeTables.length+1];
            freeTables[0] = tableNumber;
        }
    }

    public int[] freeTableNumbers(){
        if (freeTables.length!=0) return freeTables;
        else return null;
    }

    public Order getOrder(int tableNumber){
        for (int i = 0; i < orders.length; i ++)
            if (tableNumber == ((TableOrder)orders[i]).getTableNumber()) return orders[i];
        return null;
    }

    public void remove(int tableNumber){
        for (int i = 0; i < orders.length; i ++){
            if(((TableOrder)orders[i]).getTableNumber() == tableNumber) {
                orders[i] = null;
                orders = reSize(orders, "decNull");
                break;
            }
        }
    }

    public void remove(Order order){
        for (int i = 0; i < orders.length; i ++){
            if(orders[i] == order) {
                orders[i] = null;
                orders = reSize(orders, "decNull");
                break;
            }
        }
    }

    public int removeAll(Order order){
        int quantity = 0;
        for (int i = 0; i < orders.length; i ++){
            if(orders[i] == order) {
                orders[i] = null;
                orders = reSize(orders, "decNull");
                quantity++;
            }
        }
        return quantity;
    }

    @Override
    public int itemsQuantity(String itemName) {
        int quantity = 0;
        for (int i = 0; i < orders.length; i ++){
            String[] buff = orders[i].itemNames();
            for (int j = 0; j < buff.length; j ++) if (buff[j].equals(itemName)) quantity++;
        }
        return quantity;
    }

    @Override
    public int itemsQuantity(MenuItem item) {
        int quantity = 0;
        for (int i = 0; i < orders.length; i ++){
            MenuItem[] buff = orders[i].getItem();
            for (int j = 0; j < buff.length; j ++) if (buff[j] == item) quantity++;
        }
        return quantity;
    }

    public Order[] getOrders(){
        return orders;
    }

    public int ordersCostSummary(){
        int cost = 0;
        for (int i = 0; i < orders.length; i ++){
            MenuItem[] buff = orders[i].getItem();
            for (int j = 0; j < buff.length; j ++) cost+=buff[j].getCost();
        }
        return cost;
    }

    @Override
    public int orderQuantity() {
        return orderNumber;
    }
}
