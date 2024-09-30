package model;

//contiene modificadores de acceso

public class Book {
    private String title;
    private  String author;
    private boolean available;

    //creamos el constructor
    public  Book (String title, String author){
        this.title = title;
        this.author = author;
        this.available = true;

    }

    //getter y setters
    public String getTitle() {
        return title;
    }
    public void  setTitle (String title){
        this.title = title;
    }

    public String getAuthor() {
        return title;
    }
    public void  setAuthor (String author){
        this.author = author;
    }

    public boolean isAvailable(){
        return available;
    }
    public void setAvailable(boolean available){
        this.available = available;
    }

    //este es el metodo para marcar el libro como prestado o no prestado
    public void loan (){
        if (available){
            available = false;
            System.out.println("El libro ' "+ title+" ' ha sido prestado. ");
        }else {
            System.out.println("El libro ' " +title+ " ' no esta disponible.");
        }
    }

    //este metodo devuelve el libro
    public void restore (){
        available = true;
        System.out.println("El libro  ' "+ title+ " ' ha sido devuelto");
    }
}
