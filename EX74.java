/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex74;

/**
 *
 * @author suha9
 */
public class EX74 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int n =15,firstNum=0,secondNum=1;
      int nexNum;
      
      for(int i=1;i<=n;i++){
          System.out.print(firstNum+ ",");
        nexNum = firstNum+secondNum;
      firstNum = secondNum;
      secondNum=nexNum;
      
      
      }
    }
    
}
