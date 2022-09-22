/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import app.SanPham;
import app.SanPham;
import java.util.Scanner;

/**
 *
 * @author thanh
 */
public class Main {
   
    public static void main(String[] args) {
        SanPham a[] = new SanPham[5];
        
        for (int i = 0; i < 2; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.printf("Nhập tên sản phẩm %d: " ,i+1);
            String name = sc.nextLine();
            System.out.printf("Nhập tên sản phẩm %d: " ,i+1);
            double gia = sc.nextDouble();
            
            a[i] = new SanPham(name,gia);  
        }
        for (int i = 0; i < 2; i++){
            System.out.printf("Tên SP: %s - Giá SP: %.2f - Thuế: %.2f \n", a[i].getName(),a[i].getGia(),a[i].Thue());
        }
    }
}
