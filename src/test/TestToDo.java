package test;

import todo.Entry;
import todo.ToDoList;

import java.util.Scanner;

public class TestToDo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ToDoList list = new ToDoList();
        int i = 0;
        while (i == 0) {
            System.out.println("Main Menu");
            System.out.println("1. tạo một lưu ý mới");
            System.out.println("2. xoá một lưu ý");
            System.out.println("3. xem danh xách");
            System.out.println("4. xắp xếp danh sách");
            System.out.println("5. thoát");
            System.out.print("Nhập lựa chọn");
            int choie = input.nextInt();
            switch (choie) {
                case 1:
                    System.out.println("nhập thời gian lưu ý");
                    System.out.print("giờ: ");
                    int h = input.nextInt();
                    System.out.print("phút: ");
                    int m = input.nextInt();
                    System.out.println("nhập ghi chú");
                    String s = input.next();
                    System.out.println("bạn có muốn thêm vào danh sách chứ");
                    System.out.println("1. có!");
                    System.out.println("2. không và xoá");
                    int choie1 = input.nextInt();
                    switch (choie1) {
                        case 1:
                            list.addEntry(new Entry(h, m, s));
                            break;
                        case 2:
                            break;
                    }
                    break;
                case 2:
                    System.out.println("nhập id (stt) của lưu ý");
                    int id = input.nextInt();
                    if (list.removeEntry(id)){
                        System.out.println("đã xoá");
                    }else {
                        System.out.println("k có");
                    }
                    break;
                case 3:
                    list.showtodolist();
                    break;
                case 4:
                    list.sort();
                    break;
                case 5:
                    i = 1;
                    break;

            }
        }
    }
}
