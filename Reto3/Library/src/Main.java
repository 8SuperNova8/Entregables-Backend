import model.*;
import services.LoanService;

public class Main {
    public static void main(String[] args) {

        //creo libros
        Book book1 = new Book("El principito", "Antoine de Saint-Exupéry");
        Book book2 = new Book("La melancolia de los feos", "Mario Mendoza");

        //crear Usuario
        User User1 = new Student("Ana de armas", "1234");
        User User2 = new Librarian("Chris Hemsworth", "4321");

        //crear objeto prestamo
        LoanService service = new LoanService();


        // aqui realizo prestamos
        service.processingLoan(User1, book1);
        System.out.println("\n");
        service.processingLoan(User2, book2);
        System.out.println("\n");
        service.processingLoan(User2, book2); // tratando de prestar un libro ya prestado
        System.out.println("\n");
        book2.restore(); //lo devuelve
        System.out.println("\n");
        service.processingLoan(User2, book2);
    }


}