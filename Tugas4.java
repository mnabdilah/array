/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filetugas;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author Sabri_abdillah
 */
public class Tugas4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]=new int [100];
        int max=-999;
        int min=999;
        
        for(int i=0;i <arr.length;i++)
        {
            System.out.print("Masukan nilai [" +(i+1) +"] :");
            arr[i]=sc.nextInt();
                   
            if(arr[i] !=-1)
            {
                if(arr[i]>max)
                    max=arr[i];
                if(arr[i]<min)
                    min=arr[i];
            }
            else
                break;
        }
        
        System.out.println("- - - - - - - - - - - - - - - - ");
        System.out.println("Nilai maksimum :"+max);
        System.out.println("Nilai minimum :" +min);
    }
    
}
