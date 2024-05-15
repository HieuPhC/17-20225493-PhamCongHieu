package hust.soict.dsai.aims.media;
public class DigitalVideoDisc extends Media implements Playable{
    private String director;
    private int length;

    public String getDirector(){
        return this.director;
    }
    public int getLength(){
        return this.length;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public void setLength(int length) {
        this.length = length;
    }

    public DigitalVideoDisc(String title, String category,String director,int length,float cost){
        super(title, category, cost);
        this.director = director;
        this.length = length;
    }
    public DigitalVideoDisc(){
        this(null,null,null,0,0);
    }
    public DigitalVideoDisc(String title){
        this(title,null,null,0,0);
    }
    public DigitalVideoDisc(String title,String category,float cost){
        this(title,category,null,0,cost);
    }
    public DigitalVideoDisc(String director,String category,String title,float cost){
        this(title,category,director,0,cost);
    }
    @Override
    public String toString() {
        return "DVD - "+this.getTitle()+" - "+this.getCategory()+" - "+this.director+" - "+this.length+" - "+this.getCost()+"$";
    }

    @Override
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }
}
