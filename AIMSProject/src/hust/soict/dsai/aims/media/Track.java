package hust.soict.dsai.aims.media;

public class Track implements Playable{
    private String title;
    private int length;
    
    public void setTitle(String title){
        this.title = title;
    }
    public void setLength(int length){
        this.length = length;
    }

    public String getTitle(){
        return this.title;
    }
    public int getLength(){
        return this.length;
    }
    public Track(String title, int length){
        this.title = title;
        this.length = length;
    }
    @Override
    public void play() {
        System.out.println("Playing Track: " + this.getTitle());
        System.out.println("Track length: " + this.getLength());;
    }
}