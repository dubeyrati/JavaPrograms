class Bank {
    public double calculateInterest(double principal) {
        return 0;
    }
}

class SBI extends Bank {
    @Override
    public double calculateInterest(double principal) {
        return principal * 0.08;
    }
}

class ICICI extends Bank {
    @Override
    public double calculateInterest(double principal) {
        return principal * 0.07;
    }
}

class HDFC extends Bank {
    @Override
    public double calculateInterest(double principal) {
        return principal * 0.09;
    }
}

public class BankInterestCalculation {
    public static void main(String[] args) {
        double principal = 10000.0;
        Bank sbi = new SBI();
        Bank icici = new ICICI();
        Bank hdfc = new HDFC();

        System.out.println("Interest from SBI: " + sbi.calculateInterest(principal));
        System.out.println("Interest from ICICI: " + icici.calculateInterest(principal));
        System.out.println("Interest from HDFC: " + hdfc.calculateInterest(principal));
    }
}
