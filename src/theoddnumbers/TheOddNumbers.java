/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theoddnumbers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author zhuan
 */
public class TheOddNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashSet<Integer> set=new HashSet(500000);
        //int[] ia=new int[1000000];
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        try {
            int n=Integer.parseInt(reader.readLine());
            for (int i=0;i<n;i++) {
                int d=Integer.parseInt(reader.readLine());
                if (set.contains(d)) {
                    set.remove(d);
                } else
                    set.add(d);
                //ia[d-1]=(ia[d-1]+1)%2;
            }
            System.out.println(set.toArray()[0]);
            /*for (int i=0;i<1000000;i++) {
                if (ia[i]==1) {
                    System.out.println(i+1);
                }
            }*/
        } catch (Exception e) {
            System.out.println("IO error");
        }
    }
    
}
