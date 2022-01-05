import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String student[] = {"Sang","Lich","Minh","Viet"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên sinh viên: ");
        String name = scanner.nextLine();
        boolean check = false;
        for (int i = 0; i < student.length; i++){
            if (student[i].equals(name)){
                System.out.println("Vị trí sinh viên đó trong danh sách " + "là:  " + i);
                check = true;
                break;
            }
        }
        if (!check){
            System.out.println("không tìm thấy " + name + " trong danh sách");
        }
    }
}
