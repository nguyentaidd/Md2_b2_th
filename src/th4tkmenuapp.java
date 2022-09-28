import java.util.Scanner;

public class th4tkmenuapp {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while(choice!=0){
            System.out.println("=====Menu=====");
            System.out.println("1.Vẽ hình tam giác");
            System.out.println("2.Vẽ hình vuông");
            System.out.println("3.Vẽ hình chữ nhật");
            System.out.println("Exit");
            System.out.println("Nhập lựa chọn: ");
            choice = input.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Vẽ Hình tam giác");
                    System.out.println("********");
                    System.out.println("*******");
                    System.out.println("*****");
                    System.out.println("***");
                    System.out.println("**");
                    System.out.println("*");
                    break;
                case 2:
                    System.out.println("Vẽ hình vuông");
                    System.out.println("***********");
                    System.out.println("***********");
                    System.out.println("***********");
                    System.out.println("***********");
                    break;
                case 3:
                    System.out.println("Vẽ hình chữ nhật");
                    System.out.println("********************");
                    System.out.println("********************");
                    System.out.println("********************");
                    System.out.println("********************");
                    System.out.println("********************");
                    break;

            }
        }
    }
}
