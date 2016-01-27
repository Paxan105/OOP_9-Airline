package com.company;

import com.company.Planes.*;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число самолетов в Авиакопании:");
        int n=scanner.nextInt();
        boolean fl=true;

        if(n>0) {

            Airlane airlane = new Airlane(n);

            while (fl) {
                System.out.println("Меню авиакомпании:");
                System.out.println("1) Добавить самолет");
                System.out.println("2) Вывести список самолетов");
                System.out.println("3) Отсортировать самолеты по дальности полета и вывести");
                System.out.println("4) Вывести общее  количество пассажирских мест");
                System.out.println("5) Вывести общую грузоподьемность");
                System.out.println("6) Найти самолеты соответствующие заданному диапазону параметров потребления горючего");
                System.out.println("0) Закрыть програму");
                System.out.print("Введите число: ");
                switch (scanner.nextInt()) {
                    case 1:
                        System.out.println();
                        airlane.addPlane();
                        break;
                    case 2:
                        System.out.println();
                        airlane.print_airlane();
                        break;
                    case 3:
                        System.out.println();
                        airlane.sortPlanes();
                        airlane.print_airlane();
                        break;
                    case 4:
                        System.out.println("\nОбщее  количество пассажирских мест: " + airlane.getTotal_number_seats() + "\n");
                        break;
                    case 5:
                        System.out.println("\nОбщую грузоподьемность: " + airlane.getTotal_load_capacity() + "\n");
                        break;
                    case 6:
                        System.out.println();
                        airlane.check_plane_fuel_consumption();
                        break;
                    case 0:
                        fl = false;
                        break;

                    default:
                        System.out.println("Введено не верное число!");
                }

            }
        } else System.out.println("Количество самолетов не может быть отрицательным или нулевым!");
    }

}
