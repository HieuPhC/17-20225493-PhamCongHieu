package hust.soict.dsai.test.cart;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class CartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation",
        "Roger Allers",87,19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars","Science Fiction",
        "George Lucas",87,24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin","Animation",18.99f);

        cart.adMedia(dvd1);
        cart.adMedia(dvd2);
        cart.adMedia(dvd3);

        //Test the print method
        cart.print();
        //Test the search methods
        cart.searchCart(1);
        cart.searchCart("Star Wars");
        System.out.println(dvd2.getID() + " is Star Wars");
    }
}
