package com.tutorial4.corepract;
import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    //passing array to AbstractMethodError
    int arr[] = { 1, 2, 3, 4 };
    int arr2[] = Main.update (arr);
  for (int i:arr2)
      System.out.print (i + "_");	//1_2_3_4
    System.out.println ();
	
	
    //multidimensional array

    int arr4[][] = { {1, 2, 3}, {1, 2, 3} };
    int arr3[][] = new int[3][3];
    int in = 0;
    System.out.println (arr3.length);	//3
    for (int i = 0; i < 3; i++)
      {
	for (int j = 0; j < arr3.length; j++)
	  {
	    arr3[i][j] = in;
	    System.out.println ("arr3[" + i + "][" + j + "]=" + arr3[i][j]);
	    in++;
	  }

      }
    System.out.println("\n");

    //arrayCopy method in System

    char[] src = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h' };
    char[] dst = new char[7];
    System.arraycopy (src, 2, dst, 0, 3);	//public static void arraycopy(Object src, int srcPos,Object dest, int destPos, int length) 
  for (char a:dst)
      {
	System.out.print (a + " ");// c d e
      }
      System.out.println();

    //addition of two matrix
    
    int a[][] = { {0, 0, 0}, {4, 5, 6},{2,8,4}};
    int b[][] = { {1, 1, 1}, {7, 1, 1},{8,4,2}};
    int d[][] = new int[3][3];

    for (int i = 0; i < 3; i++)
      {
	for (int j = 0; j < 3; j++)
	    {
            d[i][j]=a[i][j]+b[i][j];
            System.out.print(d[i][j]+" ");
	    }
System.out.println();
      }
System.out.println();

//multiplication of two matrix

for(int i=0;i<3;i++)
{
    for(int j=0;j<3;j++)
    {
        int j2=i;
        int i2=j;
        d[i][j]=a[i][j]*b[i2][j2];
        System.out.print(d[i][j]+" ");
        
    }
    System.out.println();
}
System.out.println("\n");
System.out.println("\n");

int[] intArray = { 1, 2, 3, 4, 5 };
String intArrayString = Arrays.toString(intArray);
 
// print directly will print reference value
System.out.println(intArray);
// [I@7150bd4d
 
System.out.println(intArrayString);
// [1, 2, 3, 4, 5]


String[] stringArray = { "a", "b", "c", "d", "e" };
boolean bb1 = Arrays.asList(stringArray).contains("a");
System.out.println(bb1);
// true



ArrayList cars = new ArrayList();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    System.out.println(cars);//[volve,BMW,Ford,Mazda]
    System.out.println(cars.get(2));//Ford
    cars.set(2,"TATA");
    System.out.println(cars);//[volve,BMW,TATA,Mazda]
    cars.remove(3);
    System.out.println(cars);
    System.out.println(cars.size());//3
    System.out.println(cars.contains("TATA"));//true
    System.out.println(cars.isEmpty());//false
    cars.clear();
    System.out.println(cars);//[]
    cars.add(100);
    System.out.println(cars);//[100]

    

//COLLECTIONS



  }				//main_close

  public static int[] update (int arr[])
  {
  for (int i:arr)
      {
	System.out.print (i + " ");	//1 2 3 4 
      }
    return arr;
  }

}				//class_close


