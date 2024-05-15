package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media{
    private List<String> authors = new ArrayList<String>();

    public Book(String title,String category,float cost,List<String> authors){
        super(title, category, cost);
        this.authors = authors;
    }

    public void setAuthors(List<String> authors){
        this.authors = authors;
    }

    public List<String> getAuthors(){
        return this.authors;
    }

    public void addAuthor(String author){
        if(!authors.contains(author)){
            authors.add(author);
        }
    }    
    public void removeAuthor(String author){
        if(authors.contains(author)){
            authors.remove(author);
        }
    }
       

}
