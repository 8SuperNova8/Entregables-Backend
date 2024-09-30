package model;

//herencia
public class Student extends User{

    public Student (String name, String id) {
        super(name,id);
    }

    @Override
    public void makeLoan(Book book) {
        if (book.isAvailable()) {
            book.loan();//llama al metodo prestar en la clase Book
            System.out.println("El estudiante ' "+getName()+ " ' ha prestado el libro "+ book.getTitle());
        }else {
            System.out.println("El libro " +book.getTitle()+ "no esta disponible");
        }
    }


}
