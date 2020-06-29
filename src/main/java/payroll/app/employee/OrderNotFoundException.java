package payroll.app.employee;

public class OrderNotFoundException extends RuntimeException {

    OrderNotFoundException(Long id) {
      super("Could not find employee " + id);
    }
}