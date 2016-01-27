package com.company;

import com.company.Planes.*;

import java.util.Scanner;

public class Airlane {

    private Plane[] airlane;

    private int index =0;

    private int total_load_capacity=0;
    private int total_number_seats=0;
    Scanner scanner = new Scanner(System.in);

    public Airlane(int n) {
        this.airlane = new Plane[n];
    }

    public void sortPlanes(){
        for (int i=0; i<index-1;i++){
            for(int j=i+1; j<index;j++){
                if(airlane[i].getRange_flight()<airlane[j].getRange_flight()){
                    Plane a = airlane[j];
                    airlane[j]=airlane[i];
                    airlane[i]=a;
                }
            }
        }
    }

    public void addPlane(){
        if(index<airlane.length){
        System.out.println("Выберите самолет \n");
        System.out.println("1)Малий пассажирский самолет ");
        System.out.println("2)Большой пассажирский самолет ");
        System.out.println("3)Грузовой самолет \n");
        System.out.print("Введите номер самолета: ");
        int number = scanner.nextInt();

          switch (number){
              case 1:
                  airlane[index] = new Small_passenger_aircraft(10,4500,10);
                  total_load_capacity += airlane[index].getLoad_capacity();
                  total_number_seats += airlane[index].getPassenger_seats();
                  index++;
                  break;
              case 2:
                  airlane[index] = new Large_passenger_plane(25,7500,250,100);
                  total_load_capacity += airlane[index].getLoad_capacity();
                  total_number_seats += airlane[index].getPassenger_seats();
                  index++;
                  break;
              case 3:
                  airlane[index] = new Cargo_plane(35,7000,500);
                  total_load_capacity += airlane[index].getLoad_capacity();
                  total_number_seats += airlane[index].getPassenger_seats();
                  index++;
                  break;
              default:
                  System.out.println("Введено не верное число!!");
          }
        } else System.out.println("У авиакомпании уже максимальное количество самолетов!");

        System.out.println();

    }

    public int getTotal_load_capacity() {
        return total_load_capacity;
    }

    public int getTotal_number_seats() {
        return total_number_seats;
    }

    public void print_airlane() {
        for (int i=0; i<index;i++) {
            System.out.println(airlane[i].toString());
        }
        System.out.println();


    }

    public void check_plane_fuel_consumption(){
        int min, max;
        System.out.print("Введите минимальное потребление горючого: ");
        min=scanner.nextInt();
        System.out.print("Введите максимальное потребление горючого: ");
        max=scanner.nextInt();
        for (int i=0; i<index;i++) {
            if(airlane[i].getFuel_consumption()>=min && airlane[i].getFuel_consumption()<=max){
                System.out.println(airlane[i].toString());
            }
        }

        System.out.println();

    }


}
