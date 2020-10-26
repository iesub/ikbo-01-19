package ru.mirea.lab16;

public final class Address {
    private String cityName;
    private int zipCode;
    private String streetName;
    private int buildingNumber;
    private char buildingLetter;
    private int apartmentNumber;
    private Address EMPTY_ADDRESS;        //??????

    public Address(String cityName, int zipCode, String streetName, int buildingNumber, int apartmentNumber, char buildingLetter){
        this.apartmentNumber = apartmentNumber;
        this.cityName = cityName;
        this.zipCode = zipCode;
        this.streetName = streetName;
        this.buildingNumber = buildingNumber;
        this.buildingLetter = buildingLetter;
    }

    public String getCityName() {
        return cityName;
    }

    public int getZipCode() {
        return zipCode;
    }

    public String getStreetName() {
        return streetName;
    }

    public char getBuildingLetter() {
        return buildingLetter;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public int getBuildingNumber() {
        return buildingNumber;
    }

    @Override
    public String toString() {
        return "<html>" +
                "Город: " + cityName +
                "<br>Индекс: " + zipCode +
                "<br>Улица: " + streetName +
                "<br>Номер дома: " + buildingNumber +
                "<br>Буква дома: " + buildingLetter +
                "<br>Квартира: " + apartmentNumber +
                "</html>";
    }
}
