package hust.soict.dsai.aims.media;


public abstract class Media {
    private int id;
    private String title;
    private String category;
    private float cost;
    private static int nbmedia = 0;
    
    public void setID(int id){
    this.id = id;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setCost(float cost){
        this.cost = cost;
    }
    public void setCategory(String category){
        this.category = category;
    }

    public int getID(){
        return this.id;
    }
    public String getTitle(){
        return this.title;
    }
    public float getCost(){
        return this.cost;
    }
    public String getCategory(){
        return this.category;
    }

    public boolean isMatch(int id){
        if (this.getID() == id){
            return true;
        }
        return false;
    }

    
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj instanceof DigitalVideoDisc){
            DigitalVideoDisc s = (DigitalVideoDisc) obj;
            return s.getTitle() == getTitle() && s.getCategory() == getCategory() && s.getCost() == getCost() && s.getID() == getID();
        }
        return false;
    }

    public boolean isMatch(String title){
        if (this.getTitle().toLowerCase().equals(title.trim().toLowerCase())){
            return true;
        }
        return false;
    }

    public Media(String title,String category,float cost){
        this.id = nbmedia++;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }
}
