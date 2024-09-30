package services;
import model.User;
import model.Book;

//aqui tenemos polimorfismo donde recibe un objeto de tipo user que puede ser una subclase de usuario sea estudiante o bibliotecario
public class LoanService {

    public void processingLoan (User user, Book book) {
        user.makeLoan(book);
    }
}
