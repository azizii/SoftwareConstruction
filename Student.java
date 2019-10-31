/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school;

/**
 *
 * @author fa16-bse-107
 */
public class Student {
    protected static int NUMBER_OF_TEST;
   public String name="";
   protected int Test[];
   public String courseGrade;
 
   
   public Student(){
       
   }
   
   public Student(String n){
       
  name=n;
  Test[NUMBER_OF_TEST]=3;
  courseGrade="******";
  
       
 }
   public String getCoursegradde(){
       return courseGrade;
   }
   
    public String getName(){
       return name;
   }
   
    public int getTestScore(){
        
        int v;
        return Test[NUMBER_OF_TEST-1];
    }
     public void setname(String nam){
         
        
        
        
    }
     public void setTestScore(int numoftest,int score ){
         
         
     Test[numoftest-1]=score;
        
  }
    
}
