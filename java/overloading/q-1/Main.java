class bank {
    public void bankdisplay(String Name, String branch ,String accno ) {
        System.out.println(Name);
    }

    public void bankdisplay(String Name, String branch ) {
        System.out.println(branch);
    }

    public void bankdisplay(String Name, String branch ,int accno ) {
        System.out.println(accno);
    }
}

public class Main{
    public static void main(String[] args) {
        bank b = new bank();

        b.bankdisplay("Santhosh","mint","Sbi30001");
    }
}
