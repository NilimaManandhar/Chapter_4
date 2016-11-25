/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nilima M
 */
public class TestScore {
    private int math;
    private int science;
    private int eng;
    
    public TestScore(int a, int b, int c)
    {
        math=a;
        science=b;
        eng=c;
    }
    
    //getters
    public int getMath(){return math;}
    public int getScience(){return science;}
    public int getEng(){return eng;}
    
    //method
    public int avg()
    {
        int avg=(math+science+eng)/3;
        return avg;
    }
    public char grade()
    {
        int avg=(math+science+eng)/3;
        char grade;
        if(avg>=90 && avg<=100)
        {
            grade='A';
        }else if(avg>=80 && avg<=89)
        {
            grade='B';
        }else if(avg>=70 && avg<=79)
        {
            grade='C';
        }else if(avg>=60 && avg<=69)
        {
            grade='D';
        }
        else
        {
            grade='F';
        }
        return grade;
    }
    public static void main(String[] args)
    {
        TestScore a=new TestScore(40,100,90);
        System.out.println("The average is "+a.avg());
        System.out.println("You received : "+ a.grade());
    }
}
