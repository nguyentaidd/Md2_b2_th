import java.util.Scanner;

public class th2apptienlaichovay {
    public static void main(String[] args) {
        double tien = 1.0;
        int month = 1;
        double tiLeLai = 1.0;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số tiền gửi: ");
        tien = input.nextDouble();
        System.out.println("Nhập số tháng: ");
        month = input.nextInt();
        System.out.println("Nhập tỉ lệ lãi suất: ");
        tiLeLai = input.nextDouble();
        double totalInterest = 0;
        for (int i=0;i<month;i++)
            totalInterest += tien * (tiLeLai/100)/12*month;
        System.out.println("Total of interest: "+totalInterest);

    }
}
