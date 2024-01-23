/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex73;

/**
 *
 * @author suha9
 */
public class Ex73 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  String str="Ahmed";
  String reverseStr="";
  char ch;
  for(int i=0;i<str.length();i++){
      ch = str.charAt(i);
      reverseStr = ch + reverseStr;
      
  }
  System.out.println("Reversed string is : "+reverseStr );
    }
    
}
