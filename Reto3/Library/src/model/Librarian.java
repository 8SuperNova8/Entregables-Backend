package model;

//herencia de User
public class Librarian extends  User {//bibliotecario

    public Librarian (String name, String id){
        super(name, id);
    }

    @Override
    public void makeLoan (Book book) {
        if (book.isAvailable()) {
            book.loan();
            System.out.println("El bibliotecario " +getName()+ " ha registrado el prestamo del libro ' "+ book.getTitle()+" '");
        }else {
            System.out.println("El libro ' "+ book.getTitle()+ " ' no esta disponible para prestamo.");
        }
    }

}
