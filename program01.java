// Получение данных из терминала

import java.util.Scanner;
public class program01 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("name: ");
        String name = iScanner.nextLine();
        System.out.printf("Hi, %s!\n", name);
        iScanner.close();
        } 
        
    }

 //public static void main(String[] args) {
 //Scanner iScanner = new Scanner(System.in);
 //System.out.printf("int a: ");
 //boolean flag = iScanner.hasNextInt(); - проверка на ожидаем тип данных 
 //System.out.println(flag);
 //int i = iScanner.nextInt();
 //System.out.println(i);
 //iScanner.close();
 //} }

