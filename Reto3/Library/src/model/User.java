package model;

//clase abstracta

public abstract class User {
    private String name;
    private String id;

    //constructor
    public  User(String name, String id) {
        this.name = name;
        this.id = id;
    }

    //getter
    public String getName(){
        return  name;
    }
    public String getId (){
        return id;
    }
    //setters
    public void setName(String name){
        this.name = name;
    }
    public void setId(String id) {
        this.id = id;
    }

    // Método Abstracto
    public abstract void makeLoan (Book book);

}
