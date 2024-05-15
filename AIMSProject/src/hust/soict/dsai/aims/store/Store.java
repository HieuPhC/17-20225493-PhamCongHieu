package hust.soict.dsai.aims.store;
import java.util.ArrayList;

import hust.soict.dsai.aims.media.Media;

public class Store {
    private static  ArrayList<Media> itemInStore = new ArrayList<Media>();
    public static int getLength(){
        return itemInStore.size();
    }
    public static void addMedia(Media media){  
        if(!itemInStore.contains(media)){
            itemInStore.add(media);
        }
    }
    public static void removeMedia(Media media){
        if(itemInStore.contains(media)){
            itemInStore.remove(media);
        }
    }
    public static void print(){
        for(Media i : itemInStore){
            System.out.println(i.getTitle());
        }
    }
}
