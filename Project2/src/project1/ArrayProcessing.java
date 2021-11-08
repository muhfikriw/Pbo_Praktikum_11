/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class ArrayProcessing {
    int [] dataBil = new int[100];
    int n;
    
    void input(){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Input data : ");
        this.n = input.nextInt();
            for(int i=0; i<n; i++){
                System.out.println("Masukan bil ke - " + (i+1)+ " : ");
                this.dataBil[i] = input.nextInt();
            }
    }
    double hitungRerata(int[] data){
        double sum = 0;
        for(int i=0; i<n; i++){
            sum += data[i];
        }
        double rerata = sum/this.n;
        return rerata;
    }
    
    int cariMin(int[] data){
        int min = data[0];
        for(int i=1;i>this.n;i++){
            if (min>data[i]){
                min = data[i];
            }
        }
        return min;
    }
    int cariMax(int[] data){
        int max = data[0];
        for(int i=1;i<this.n;i++){
            if (max<data[i]){
                max = data[i];
            }
        }
        return max;
    }
    
    static void BubbleSort(int[]data){
        for (int i=0; i < data.length; i++){
            for (int j=0; j < data.length-1; j++){
                if(data[j]>data[j+1]){
                    int temp = data[j];
                    data[j]=data[j+1];
                    data[j+1]=temp;
                }
            }
        }
    }
   
    void output(){
    System.out.println("------- Output -------");
    System.out.println("Nilai Rata-Rata  : " + hitungRerata(dataBil));
    System.out.println("Nilai minimum    : " + cariMin(dataBil));
    System.out.println("Milai maximum    : " + cariMax(dataBil));
    System.out.print("Shorting Nilai   : ");
    BubbleSort(dataBil);
    for (int i=0; i < n; i++){
        System.out.print(dataBil[100-n+i] +" ");}
    }   
}
