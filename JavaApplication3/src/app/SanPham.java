/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 *
 * @author thanh
 */
public class SanPham {
    private String name;
    private double gia;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public SanPham(String name, double gia) {
        this.name = name;
        this.gia = gia;
    }

    public SanPham() {
        gia = 0;
        name ="";
    }
    public double Thue(){
    return gia * 0.1;
    }
    
}
