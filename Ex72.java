/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex7.pkg2;

/**
 *
 * @author suha9
 */
public class Ex72 {


    public static void main(String[] args) {
  String str ="pink";
  
  int start=0;
  int end =str.length()-1;
  boolean isEx72=true;
  
  while(start<end){
      
      if(str.charAt(start) !=str.charAt(end)){
        isEx72=false; 
        break;
      }
      start++;
      end--;
  }
  if(isEx72){
      System.out.println("palindrom");
  }else{
    System.out.println("Not a palindrom");
  }
    }
    
}
