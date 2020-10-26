package ru.mirea.lab16;

public enum DrinkTypeEnum {
    BEER,
    WINE,
    VODKA,
    BRANDY,
    CHAMPAGNE,
    WHISKEY,
    TEQUILA,
    RUM,
    VERMUTH,
    LIQUOR,
    JAGERMEISTER,
    JUICE,
    COFEE,
    GREEN_TEA,
    BLACK_TEA,
    MILK,
    WATER,
    SODA,
    ELSE;

    public DrinkTypeEnum DrinkType (String type){
        switch(type){
            case "Пиво":
                return BEER;
            case "Вино":
                return WINE;
            case "Водка":
                return VODKA;
            case "Бренди":
                return BRANDY;
            case "Шампанское":
                return CHAMPAGNE;
            case "Виски":
                return WHISKEY;
            case "Текила":
                return TEQUILA;
            case "Ром":
                return RUM;
            case "Вермут":
                return VERMUTH;
            case "Ликер":
                return LIQUOR;
            case "Егермейстер":
                return JAGERMEISTER;
            case "Сок":
                return JUICE;
            case "Кофе":
                return COFEE;
            case "Зеленый чай":
                return GREEN_TEA;
            case "Черный чай":
                return BLACK_TEA;
            case "Молоко":
                return MILK;
            case "Вода":
                return WATER;
            case "Сода":
                return SODA;
            default:
                return ELSE;
        }
    }
}
