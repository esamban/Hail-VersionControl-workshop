/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.util.Scanner;

/**
 *
 * @author esam bn
 */
public class Student {

    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter number students:");
        int n=in.nextInt();
        String[] name=new String[n];
        int[] mark=new int[n];
        for (int i = 0; i < name.length; i++) {
            System.out.println("Enter name student:");
            name[i]=in.next();
            System.out.println("Enter degree Student:");
            mark[i]=in.nextInt();
            if(mark[i]>100||mark[i]<0){
                System.out.println("error");
            }
        }
        for (int j = 0; j < mark.length; j++) {
            if(mark[j]>=60)
                System.out.println("p:"+name[j]+" "+mark[j]);
            else if((mark[j]<60)&&(mark[j]>=0))
                System.out.println("F "+name[j]+" "+mark[j]);
            
        }        
                   
    }
}
    

