package com.driver;


class Product{
  public int product(int x,int y){
    return x*y;
  }
  public int product(int x,int y,int z){
    return x*y*z;
  }
  public double product(double x, double y) {
    return x*y;
  }
}
public class Main {

    
    public static void main(String[] args) {
      Product p=new Product();
      p.product(5, 2);
      p.product(2, 4, 8);
      p.product(3.1, 2.6);
    }
    
  }