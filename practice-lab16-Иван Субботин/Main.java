package ru.mirea.lab16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        new Window();
    }

    public static class Window extends JFrame{
        private OrderManager tableOrders = new TableOrderManager();
        private OrderManager internetOrders = new InternetOrdersManager();
        private ArrayList<MenuItem> itemList  = new ArrayList<>();
        private JPanel workingPanel = new JPanel();
        private int tableOrInternetOrder = 0;
        private Customer customerInf;

        JTextField drinkName = new JTextField(20);
        JTextField drinkType = new JTextField(20);
        JTextArea drinkDescription = new JTextArea(8,20 );
        JTextField drinkCost = new JTextField(20);
        JTextField alcProc = new JTextField(20);

        JTextField dishName = new JTextField(20);
        JTextArea dishDescription = new JTextArea(8,20 );
        JTextField dishCost = new JTextField(20);

        JTextField firstNameBar = new JTextField(20);
        JTextField secondNameBar = new JTextField(20);
        JTextField ageBar = new JTextField(20);
        JTextField cityNameBar = new JTextField(20);
        JTextField zipCodeBar = new JTextField(20);
        JTextField streetNameBar = new JTextField(20);
        JTextField buildingNumberBar = new JTextField(20);
        JTextField buildingLetterBar = new JTextField(20);
        JTextField apartmentNumberBar = new JTextField(20);

        private JPanel orderCreationButtons(){//Переход межну вариантами
            JPanel file = new JPanel();
            file.setLayout(new GridLayout(4,1, 0, 10));
            JButton createTable = new JButton("Оформить заказ в зале");
            createTable.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    tableOrInternetOrder = 0;
                    remove(workingPanel);
                    workingPanel = tableOrdersCreation();
                    add(workingPanel);
                    revalidate();
                    repaint();
                }
            });
            JButton createInternet = new JButton("Оформить заказ доставки");
            createInternet.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    tableOrInternetOrder = 1;
                    remove(workingPanel);
                    workingPanel = tableOrdersCreation();
                    add(workingPanel);
                    revalidate();
                    repaint();
                }
            });
            JButton lookForTable = new JButton("Просмотреть заказы в зале");
            lookForTable.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    remove(workingPanel);
                    workingPanel = tableOrdersList();
                    add(workingPanel);
                    revalidate();
                    repaint();
                }
            });
            JButton lookForInternet = new JButton("Просмотреть заказы доставки");
            lookForInternet.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    remove(workingPanel);
                    workingPanel = internetOrdersList();
                    add(workingPanel);
                    revalidate();
                    repaint();
                }
            });
            file.add(createTable);
            file.add(createInternet);
            file.add(lookForTable);
            file.add(lookForInternet);
            return(file);
        }

        private JPanel tableOrdersCreation(){ //основной блок
            JPanel file = new JPanel();
            file.setLayout(new GridLayout(2, 1));
            file.add(tableOrderCreationDesc());
            file.add(tableOrderCreationShow());
            return(file);
        }

        private JPanel tableOrderCreationDesc(){ //Добавление элементов в заказ
            JPanel file = new JPanel();
            file.setLayout(new GridLayout(6,2, 5,0));
            JLabel headlineText = new JLabel("Состав заказа", SwingConstants.CENTER);
            JLabel headlineText1;
            if (tableOrInternetOrder == 0) {
                int free = ((TableOrderManager) tableOrders).freeTableNumber(0);
                if (free != 0) {
                    String label3 = Integer.toString(free);
                    headlineText1 = new JLabel("Столик " + label3, SwingConstants.CENTER);
                } else {
                    headlineText1 = new JLabel("Нет свободных столиков!", SwingConstants.CENTER);
                }
            } else {
                headlineText1 = new JLabel("Интернет заказ", SwingConstants.CENTER);
            }
            file.add(headlineText);
            file.add(headlineText1);
            file.add(new JLabel("Напиток"));
            file.add(new JLabel("Блюдо"));
            file.add(drinkDesc1());
            file.add(dishDesc());
            file.add(drinkDes2());
            file.add(new JLabel(""));
            JButton addDrink = new JButton("Добавить напиток");
            addDrink.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String name = drinkName.getText();
                    String type = drinkType.getText();
                    String cost = drinkCost.getText();
                    String description = drinkDescription.getText();
                    String alProc = alcProc.getText();
                    int price;
                    try {
                        price = Integer.parseInt(cost);
                    } catch (NumberFormatException a){
                        JOptionPane.showMessageDialog(null, "Неверный формат ввода стоимости:" +
                                " используйте целочисленные значения");
                        return;
                    }
                    double alVol;
                    try{
                        alVol = Double.parseDouble(alProc);
                    } catch (NumberFormatException a){
                        JOptionPane.showMessageDialog(null, "Неверный формат ввода % алкоголя:" +
                                " используйте числа с плавающей запятой");
                        return;
                    }
                    DrinkTypeEnum typeEnum = DrinkTypeEnum.ELSE;
                    typeEnum = typeEnum.DrinkType(type);
                    MenuItem item = new Drink(price, name, description, typeEnum, alVol);
                    itemList.add(item);
                    drinkName.setText("");
                    drinkType.setText("");
                    drinkCost.setText("");
                    drinkDescription.setText("");
                    alcProc.setText("");
                    remove(workingPanel);
                    workingPanel = tableOrdersCreation();
                    add(workingPanel);
                    revalidate();
                    repaint();
                }
            });
            JButton addDish = new JButton("Добавить блюдо");
            addDish.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String name = dishName.getText();
                    String cost = dishCost.getText();
                    String description = dishDescription.getText();
                    int price;
                    try {
                        price = Integer.parseInt(cost);
                    } catch (NumberFormatException a){
                        JOptionPane.showMessageDialog(null, "Неверный формат ввода стоимости:" +
                                " используйте целочисленные значения");
                        return;
                    }
                    MenuItem item = new Dish(price, name, description);
                    itemList.add(item);
                    dishName.setText("");
                    dishCost.setText("");
                    dishDescription.setText("");
                    remove(workingPanel);
                    workingPanel = tableOrdersCreation();
                    add(workingPanel);
                    revalidate();
                    repaint();
                }
            });
            file.add(new JLabel(""));file.add(new JLabel(""));
            file.add(addDrink);
            file.add(addDish);
            return file;
        }

        private JPanel drinkDesc1(){ //Заполнение 1
            JPanel file = new JPanel();
            file.setLayout(new GridLayout(3,2));
            file.add(new JLabel("Наименование"));
            file.add(drinkName);
            file.add(new JLabel("Описание"));
            file.add(drinkDescription);
            file.add(new JLabel("Цена в рублях"));
            file.add(drinkCost);
            return file;
        }

        private JPanel drinkDes2(){ //Заполнение 2
            JPanel file = new JPanel();
            file.setLayout(new GridLayout(3,2));
            file.add(new JLabel("Тип"));
            file.add(drinkType);
            file.add(new JLabel("Процентное содержание\nалкоголя"));
            file.add(alcProc);
            file.add(new JLabel(""));file.add(new JLabel(""));
            return file;
        }

        private JPanel dishDesc(){ //Заполнение 3
            JPanel file = new JPanel();
            file.setLayout(new GridLayout(3,2));
            file.add(new JLabel("Наименование"));
            file.add(dishName);
            file.add(new JLabel("Описание"));
            file.add(dishDescription);
            file.add(new JLabel("Цена в рублях"));
            file.add(dishCost);
            return file;
        }

        private JPanel tableOrderCreationShow(){ //Поле со списком и оформлением заказа
            JPanel file = new JPanel();
            file.setLayout(new GridLayout(2, 1));
            JScrollPane scroll = new JScrollPane(tableOrderItemsList());
            file.add(scroll);
            JButton submitOrder = new JButton("Подтвердить заказ");
            submitOrder.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        if (itemList.size() == 0) throw new ErrorInFormatExce("Пустой заказ");
                        Order order1 = new TableOrder();
                        Order order2 = new InternetOrder();
                        if (tableOrInternetOrder == 0) {
                            for (int i = 0; i < itemList.size(); i++) {
                                order1.add(itemList.get(i));
                            }
                        } else{
                            for (int i = 0; i < itemList.size(); i++) {
                                order2.add(itemList.get(i));
                            }
                        }
                        if (tableOrInternetOrder == 0) {
                            int free = ((TableOrderManager) tableOrders).freeTableNumber(1);
                            if (free != 0) {
                                ((TableOrderManager) tableOrders).add(order1, free);
                            } else {
                                JOptionPane.showMessageDialog(null, "Нет свободных столиков! Нельзя оформить заказ.");
                                return;
                            }
                        } else {
                            if (customerInf==null) {
                                JOptionPane.showMessageDialog(null, "Заполните данные о заказчике");
                                return;
                            }
                            ((InternetOrder)order2).setCustomer(customerInf);
                            ((InternetOrdersManager) internetOrders).add(order2);
                        }
                    }catch (ErrorInFormatExce a){
                        JOptionPane.showMessageDialog(null, "Нельзя оформить пустой заказ");
                        return;
                    }
                        itemList.clear();
                        customerInf = null;
                        remove(workingPanel);
                        workingPanel = tableOrdersCreation();
                        add(workingPanel);
                        revalidate();
                        repaint();
                    }
            });
            JPanel button = new JPanel(new GridLayout(3,1));
            if (tableOrInternetOrder == 0) {
                button.add(new JLabel(""));
            } else {
                JButton customerItemButton = new JButton("Данный о заказчике");
                customerItemButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        remove(workingPanel);
                        workingPanel = customerInfoCreation();
                        add(workingPanel);
                        revalidate();
                        repaint();
                    }
                });
                button.add(customerItemButton);
            }
            button.add(submitOrder);
            button.add(new JLabel(""));
            file.add(button);
            return file;
        }

        private JPanel tableOrderItemsList(){ //Список товаров
             JPanel file = new JPanel();
             file.setLayout(new GridLayout(0, 1, 0, 20));
             JPanel[] panels = new JPanel[itemList.size()];
             for (int i = 0; i < itemList.size(); i++){
                 panels[i] = new JPanel();
                 panels[i] = tableListElement(itemList.get(i));
                 file.add(panels[i]);
             }
             return file;
        }

        private JPanel tableListElement(MenuItem item){
            JPanel file = new JPanel();
            file.setLayout(new GridLayout(1,2));
            JLabel itemDesc = new JLabel(item.toString());
            file.add(itemDesc);
            JButton deleteItem = new JButton("Удалить данный \nэлемент");
            deleteItem.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    itemList.remove(item);
                    remove(file);
                    remove(workingPanel);
                    workingPanel = tableOrdersCreation();
                    add(workingPanel);
                    revalidate();
                    repaint();
                }
            });
            file.add(deleteItem);
            return file;
        }

        private JPanel customerInfoCreation(){
            JPanel file = new JPanel();
            file.setLayout(new GridLayout(20, 2));
            file.add(new JLabel("Имя"));
            file.add(firstNameBar);
            file.add(new JLabel("Фамилия"));
            file.add(secondNameBar);
            file.add(new JLabel("Возраст"));
            file.add(ageBar);
            file.add(new JLabel("Город"));
            file.add(cityNameBar);
            file.add(new JLabel("Улица"));
            file.add(streetNameBar);
            file.add(new JLabel("Номер дома"));
            file.add(buildingNumberBar);
            file.add(new JLabel("Буква дома"));
            file.add(buildingLetterBar);
            file.add(new JLabel("Номер дома"));
            file.add(apartmentNumberBar);
            file.add(new JLabel("Индекс"));
            file.add(zipCodeBar);
            file.add(new JLabel());
            JButton createAndReturn = new JButton("Сохранить данные");
            createAndReturn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String firstName;
                    String secondName;
                    int age;
                    int zipCode;
                    int apartmentNumber;
                    char buildingLetter;
                    String cityName;
                    String streetName;
                    int buildingNumber;
                    try {
                        String Line = ageBar.getText();
                        age = Integer.parseInt(Line);
                    } catch (NumberFormatException a){
                        JOptionPane.showMessageDialog(null, "Неверный формат ввода стоимости:" +
                                " используйте целочисленные значения");
                        return;
                    }
                    try {
                        String Line = zipCodeBar.getText();
                        zipCode = Integer.parseInt(Line);
                    } catch (NumberFormatException a){
                        JOptionPane.showMessageDialog(null, "Неверный формат ввода стоимости:" +
                                " используйте целочисленные значения");
                        return;
                    }
                    try {
                        String Line = apartmentNumberBar.getText();
                        apartmentNumber = Integer.parseInt(Line);
                    } catch (NumberFormatException a){
                        JOptionPane.showMessageDialog(null, "Неверный формат ввода стоимости:" +
                                " используйте целочисленные значения");
                        return;
                    }
                    try {
                        String Line = buildingNumberBar.getText();
                        buildingNumber= Integer.parseInt(Line);
                    } catch (NumberFormatException a){
                        JOptionPane.showMessageDialog(null, "Неверный формат ввода стоимости:" +
                                " используйте целочисленные значения");
                        return;
                    }
                    String Line = buildingLetterBar.getText();
                    buildingLetter = Line.charAt(0);
                    firstName = firstNameBar.getText();
                    secondName = secondNameBar.getText();
                    cityName = cityNameBar.getText();
                    streetName = streetNameBar.getText();
                    Address address = new Address(cityName, zipCode, streetName, buildingNumber, apartmentNumber, buildingLetter);
                    customerInf = new Customer(firstName, secondName, age, address);
                    remove(workingPanel);
                    workingPanel = tableOrdersCreation();
                    add(workingPanel);
                    revalidate();
                    repaint();
                }
            });
            file.add(new JLabel());
            file.add(createAndReturn);
            return file;
        }

        private JPanel tableOrdersList(){
            JPanel file = new JPanel();
            JPanel list = new JPanel();
            JScrollPane scroll = new JScrollPane(list);
            list.setLayout(new GridLayout(0,1));
            Order[] orders;
            orders = tableOrders.getOrders();
            for (int i = 0; i < orders.length; i++){
                list.add(tableOrder(orders[i]));
            }
            file.add(scroll);
            return file;
        }

        private JPanel tableOrder(Order order){
            JPanel file = new JPanel();
            file.add(new JLabel("Номер столика:"));
            file.add(new JLabel(String.valueOf(((TableOrder)order).getTableNumber())));
            file.add(new JLabel("Итоговая стоимость:"));
            file.add(new JLabel(String.valueOf(order.costTotal())));
            file.add(getItemList(order));
            JButton closeOrder = new JButton("Закрыть заказ");
            closeOrder.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int tableNumber = ((TableOrder) order).getTableNumber();
                    ((TableOrderManager)tableOrders).addFreeTable(tableNumber);
                    ((TableOrderManager) tableOrders).remove(order);
                    remove(file);
                    remove(workingPanel);
                    workingPanel = tableOrdersList();
                    add(workingPanel);
                    revalidate();
                    repaint();
                }
            });
            file.add(closeOrder);
            return(file);
        }

        private JPanel internetOrdersList(){
            JPanel file = new JPanel();
            JPanel list = new JPanel();
            JScrollPane scroll = new JScrollPane(list);
            list.setLayout(new GridLayout(0,1));
            Order[] orders;
            orders = internetOrders.getOrders();
            for (int i = 0; i < orders.length; i++){
                list.add(internetOrder(orders[i]));
            }
            file.add(scroll);
            return file;
        }

        private JPanel internetOrder(Order order){
            JPanel file = new JPanel();
            file.add(new JLabel("Информация о заказчике:"));
            file.add(new JLabel(String.valueOf(order.getCustomer().toString())));
            file.add(new JLabel("Адрес:"));
            file.add(new JLabel(String.valueOf((order.getCustomer().getAddress().toString()))));
            file.add(new JLabel("Итоговая стоимость:"));
            file.add(new JLabel(String.valueOf(order.costTotal())));
            file.add(getItemList(order));
            JButton closeOrder = new JButton("Закрыть заказ");
            closeOrder.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    ((InternetOrdersManager) internetOrders).remove(order);
                    remove(file);
                    remove(workingPanel);
                    workingPanel = internetOrdersList();
                    add(workingPanel);
                    revalidate();
                    repaint();
                }
            });
            file.add(closeOrder);
            return(file);
        }

        JPanel getItemList(Order order){
            JPanel file = new JPanel();
            file.setLayout(new GridLayout(0, 1, 0, 10));
            MenuItem[] items = order.getItem();
            JPanel[] panels = new JPanel[items.length];
            for (int i = 0; i < items.length; i++){
                panels[i] = new JPanel();
                panels[i].add(new JLabel(items[i].toString()));
                file.add(panels[i]);
            }
            return(file);
        }

        Window(){
            super("Касса");

            int tables[] = new int[2];
            for (int i = 0; i < 2; i++){
                tables[i]=i+1;
            }
            ((TableOrderManager) tableOrders).setFreeTables(tables);

            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setSize(1400,1000);
            setLayout(new GridLayout(1,2,20,0));


            workingPanel = tableOrdersCreation();
            add(orderCreationButtons());
            add(workingPanel);

            setVisible(true);

        }
    }
}
