package InterfaceDemo;

public class HDFCBankLoginService implements BankLoginService {

    String accountNumber = "2222";

    String password = "1234";

    @Override
    public boolean login(String username, String password) {
        return false;
    }

    @Override
    public String generateOTP(String accountNumber) {
        return null;
    }

    @Override
    public boolean validateOTP(String otp) {
        return false;
    }
}


