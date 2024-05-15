package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.media.Media;

import java.util.ArrayList;

public class Cart {
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();

    public void adMedia(Media media){
        if(!itemsOrdered.contains(media)){
            itemsOrdered.add(media);
        }
    }

    public void removeMedia(Media media){
        if(itemsOrdered.contains(media)){
            itemsOrdered.remove(media);
        }
    }
    public float totalCost(){
        float c = 0;
        for(Media i : itemsOrdered){
            if(i != null){
                c = c + i.getCost();
            }
        }
        return c;
    }
    public void print(){
        System.out.println("*********************CART********************");
        for(int i = 0; i < itemsOrdered.size(); i++){
            if(itemsOrdered.get(i) != null){

                System.out.println(i+1+". "+itemsOrdered.get(i));
            }
        }
        System.out.println("Total cost: "+ totalCost()+"$");
        System.out.println("*********************************************");
    }

    public boolean searchCart(String title){
        for(Media i : itemsOrdered){
            if(i.isMatch(title)){
                System.out.println(i.getTitle() + " is in the cart.");
                return true;
            }
        }
        System.out.println(title + " is not in the cart.");
        return false;
    }

    public boolean searchCart(int id){
        for(Media i : itemsOrdered){
            if(i.isMatch(id)){
                System.out.println("id " + i.getID() + " is in the cart.");
                return true;
            }
        }
        System.out.println("id "+id + " is not in the cart.");
        return false;
    }
}
