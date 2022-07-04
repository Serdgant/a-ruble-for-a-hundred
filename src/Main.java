public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int enrollment = 1100;
        int bonuss = 0;
        if (enrollment > 100)
            bonuss = enrollment / 100;

        int result = balance + enrollment + bonuss;
        System.out.println("Счет пополненн на" + result + "Начисленно бонусов" + bonuss);
    }
}
