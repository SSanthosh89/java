class bank {
    public void bank(String Name, String branch ,String accno ) {
        System.out.println(Name);
    }

    public void bank(String Name, String branch ) {
        System.out.println(branch);
    }

    public void bank(String Name, String branch ,int accno ) {
        System.out.println(accno);
    }
}

public class Main{
    public static void main(String arg[]) {
        bank b = new bank();

        b.bank("Santhosh","mint","Sbi30001");
    }
}
