package InterfaceDemo;

public interface BankOTPvalidationService extends BankLoginService {

    String generateOTP(String accountNumber);

    boolean validateOTP(String otp);


}
