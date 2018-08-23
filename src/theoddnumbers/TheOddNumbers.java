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
        
        MyHashTable hashTable=new MyHashTable(900000);
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        try {
            int n=Integer.parseInt(reader.readLine());
            int d=Integer.parseInt(reader.readLine());
            for (int i=1;i<n;i++) {
                
                d^=Integer.parseInt(reader.readLine());
                
            }
            System.out.println(d);
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
    }
    
}

class MyHashTable {
    int[] ia;
    int capacity=0;
    int size;
    public MyHashTable(int psize) {
        ia=new int[psize];
        capacity=psize;
    }
    public boolean add(Integer key) {
        if (size==capacity) return false;
        Integer hash=key+1000000000;
        int k=(hash.hashCode())%capacity;
        
        while (ia[k]!=key) {
            if (ia[k]==0) {
                ia[k]=key;
                size++;
                return true;
            } 
            k=(k+1)%capacity;
        } 
        
        ia[k]=0;
        size--;
        return true;
    }
    public int getOdd() {
        System.out.println(size);
        for (int i=0;i<capacity;i++) {
            if (ia[i]!=0) return ia[i];
        }
        return -1;
    }
}
