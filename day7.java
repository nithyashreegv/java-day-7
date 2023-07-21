// Read second word and change to Uppercase: Write a function (method) that takes as input a string (sentence), and returns its second word in uppercase


import java.io.*;
import  java.util.*;
class UserMainCode{

public String secondWordUpperCase(String input1){

String strArray[] = input1.split(" ");        

String stt="LESS";        

if(strArray.length==1) {            

return stt;        

}        

return strArray[1].toUpperCase();   

 }}




//isPalindrome

import java.io.*;
import  java.util.*;
class UserMainCode
{
public int isPalindrome(String input1){
String str=input1.toLowerCase();
        String str1="";
        for(int i=str.length()-1;i>=0;i--)
        {
            str1+=str.charAt(i);
        }
        if(str.equals(str1))
        return 2;
        else
        return 1;
    }
}




//Weight of String: Write a function that takes a string as input and calculates the weight of the string as per rules mentioned below.


import java.io.*;
import  java.util.*;
class UserMainCode
{
public int weightOfString(String input1,int input2)
{
String str=input1.toUpperCase();
        int sum=0;
        for(int i=0;i<input1.length();i++)
        {
          if(input2==0)
          {
      if(str.charAt(i)=='A' || str.charAt(i)=='E' ||str.charAt(i)=='I' || str.charAt(i)=='O' ||                     str.charAt(i)=='U' || !Character.isLetter(str.charAt(i)))
              {
                  continue;
              }
              else
              {
                  int a=str.charAt(i)-64;
                  sum+=a;
              }
          }
          else
          {
              if(!Character.isLetter(str.charAt(i)))
                  continue;
              else
              {
                  int a=str.charAt(i)-64;
                  sum+=a;
              }
          }
        }
        return sum;
    }
}




//Most Frequent Digit – You need to find which digit occurs most number of times across the four given input numbers.


import java.io.*;
import  java.util.*;
class UserMainCode
{
public int MostFrequentDigit(int input1, int input2, int input3, int input4){
int arr[]={input1,input2,input3,input4};
        int temp[]=new int[10];
        int num;
        for(int i=0;i<arr.length;i++)
        {   num=arr[i];
            while(num!=0)
            {
                int n=num%10;
                temp[n]++;
                num/=10;
            }
        }
        int max=-1;
        int x=0;
        for(int i=0;i<temp.length;i++)
        {
            if(temp[i]>=max)
            {
                max=temp[i];
                x=i;
            }
        }
    return x;
    }
}



