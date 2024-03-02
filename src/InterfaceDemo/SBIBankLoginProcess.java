package InterfaceDemo;

public class SBIBankLoginProcess implements BankLoginService {


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
