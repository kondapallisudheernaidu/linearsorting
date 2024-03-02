package InterfaceDemo;

public interface BankLoginService {

    int i = 20;
    boolean login(String username,String password);

    String generateOTP(String accountNumber);

    boolean validateOTP(String otp);

}
