package me.afua.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Stuff> handbag = new ArrayList<>();
        Stuff myStuff;
        String answer = "";
        boolean stop=false;




        do{
                //Asks users
                System.out.println("What would you like to put into the handbag?");
                myStuff = new Stuff(sc.nextLine());
                handbag.add(myStuff);
                System.out.println("Do you want to add anything else?");
                answer = sc.nextLine();
                if(answer.equalsIgnoreCase("n")||answer.equalsIgnoreCase("no"))
                    stop = true;
        }while(!stop);


        System.out.println("This handbag contains");
        //This displays all the items in the handbag using an enhanced for loop
        for(Stuff eachItem : handbag)
        {
            System.out.println(eachItem.getDescription());
        }



    }

}
