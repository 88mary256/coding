package org.fundacionjala.coding;

/**
 * @author Carlos Richter.
 */
public class Movie {

    public String title;
    public int priceCode;
    public MovieType movieType;

    public Movie(final String title, final int priceCode) {
        this.title = title;
        this.priceCode = priceCode;
    }

    public static MovieType createtype(final int priceCode) {
        switch (priceCode) {
            case 0:
                return new Regular();
            case 1:
                return new NewRelease();
            case 2:
                return new Childrens();
            default:
                break;
        }
        return null;
    }

    public int getPriceCode() {
        return this.priceCode;
    }

    public String getTitle() {
        return this.title;
    }

}