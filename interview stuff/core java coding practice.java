import java.util.Locale;
public class Main
{
  public static void main (String[]args)
  {
    String a = "0123456789";
    String b = "world";
    String b1 = "world";
    String c = "worLD";
    String d = a.concat (b);
      System.out.println (a.charAt (1));	//1
      System.out.println (a.length ());	//10
      System.out.println (String.format ("value : %s", a));	//
      System.out.println (a.substring (4));	//456789
      System.out.println (a.substring (1, 4));	//123
      System.out.println(a.subSequence(1,4));//123
      System.out.println (a.contains ("123"));	//true
      System.out.println (String.join ("-", "ram", "dear", "darling", a, b));	//ram-dear-darling-0123456789-world
      System.out.println (b1.equalsIgnoreCase (b));	//true
      System.out.println (b.equals (b1));	//false Content comparison
      System.out.println (b == b1);	//true address comparison
      System.out.println (a.isEmpty ());	//false
      System.out.println (d);	//0123456789world
      System.out.println (c.replace ("D", "d"));	//worLd
      System.out.println ("he is good boy, he is bad boy".replace ("is", "was"));	//he was good boy, he was bad boy
    String e = "Orange is ever green movie in tollywood";
      String[] f = e.split (" ", 4);
    for (String f1:f)
      {
	System.out.println (f1);
      }
    /* limit is 4 means 4-1=3 so from third space it split entire sentance as single string so
       output :Orange
       is
       ever
       green movie in tollywood */
    String g = "dear A,Hi Hello A,Hi A";
    System.out.println (g.indexOf ("A"));	//5
    System.out.println (g.indexOf ("Hello"));	//10
    System.out.println (g.indexOf ("A", 6));	//16 6(fromindex)  
    System.out.println (g.indexOf ("Hi", 10));	//18

    System.out.println (g.toLowerCase ());	//LoweCase
    System.out.println (g.toUpperCase ());	//UpperCase
    String h = "    today is friday  1-2-21     ";
    System.out.println (h.trim ());	//removes the begining and ending spaces
    System.out.println (g.toUpperCase (Locale.CHINA));	//It converts the string into a UpperCase string 
    //using the rules defined by the specified Locale.
    int k = 1234;
    String k1 = String.valueOf(k);
    System.out.println (k1);
    System.out.println(b.compareTo("worldd"));//-1 here b<worldd,b>worldd then 1, 0 when both are equal
    char[] L={'H','E','L','L','O'};
    String sl="";
    sl=String.copyValueOf(L,0,5);//copy Characters in array to string 
    System.out.println(sl);//HELLO
    System.out.println(sl.startsWith("H"));//true
    System.out.println(sl.endsWith("LO"));//true
    char[] L1=new char[10];
    String L2="DEAR";
    try{
    L2.getChars(0,4,L1,0);//DEAR (srcbeginIndex,srcEndIndex,char[] destinationVariable,dstBeginIndex)
    System.out.println(L1);
    }
    catch(Exception ex){System.out.println(ex);}
    
    String Str1 = new String("Welcome to geeksforgeeks"); 
    String Str2 = new String("GEEKS");
    System.out.println(Str1.regionMatches(true, 11, Str2, 0, 5));//true
    L1=Str1.toCharArray();
    System.out.println(L1);
    System.out.println(Math.round(Math.random()*1000));
    
 //Reverse a String
 String stng="Hi darling";
 char[] chr=new char[20];
 chr=stng.toCharArray();
 int o=chr.length;
 System.out.println(o);//10
 System.out.println(chr[9]);//0
 for(int i=chr.length-1;i>=0;i--)
 {
  System.out.print(chr[i]);   
 }

//Polyndrome 
 System.out.println("\nPolyndrome");
 
 String Polyndrome="aaaabbbbaaaa";
 String Polyndrome_2="";
char[] ply=Polyndrome.toCharArray();
System.out.println(ply.length);//3
StringBuffer sb=new StringBuffer();
for(int i1=ply.length-1;i1>=0;i1--)
{
    sb.append(ply[i1]);
    
}
Polyndrome_2=sb.toString();
 if(Polyndrome_2.equals(Polyndrome))
 System.out.println("it's Polyndrome");
 else
 System.out.println("it's not Polyndrome");

//Anagram
 System.out.println("\n Anagram");
 
String anagram_1="listenz";
String anagram_2="silentg";

 char[] an1=anagram_1.toCharArray();
 char[] an2=anagram_2.toCharArray();
 int count=0;
 int input=an1.length;
 for(int i2=0;i2<an1.length;i2++)
 {
     for(int j2=0;j2<an2.length;j2++)
     {
         
        if(an1[i2]==an2[j2])
        {
        count++;
        break;
        }
     }
 }
 if(input==count)
 System.out.println("it's anagram");
 else
 System.out.println("it's not anagram");

 //Split the string using (.) or space
 
 String sp="Hi dear how are you";
 String dot="Hi.dear.how.are.you";
 String[] sp_arr=sp.split(" ");
 System.out.println(sp_arr[2]);//how
 String[] dot_arr=dot.split("\\.");
 System.out.println(dot_arr[1]);//dear
 //spaces in string
 int cnt=0;
 for(int i=0;i<sp.length();i++)
 {
     if(sp.charAt(i)==' ')
     {
      cnt++;   
     }
 }
 System.out.println(cnt);//4
 
 //vowels in given string
 
 int count2=0;
 StringBuffer sb2= new StringBuffer();
 for(int i=0;i<sp.length();i++)
 {
     if(sp.charAt(i)=='A'||sp.charAt(i)=='E'||sp.charAt(i)=='I'||sp.charAt(i)=='O'||sp.charAt(i)=='U'
     ||sp.charAt(i)=='a'||sp.charAt(i)=='e'||sp.charAt(i)=='i'||sp.charAt(i)=='o'||sp.charAt(i)=='u')
     {
         sb2.append(sp.charAt(i));
         count2++;
     }
 }
 System.out.println(sb2);//ieaoaeou
 System.out.println(count2);//8
 //alphabets in the given string
 
  int count3=0;
 StringBuffer sb3= new StringBuffer();
 for(int i=0;i<sp.length();i++)
 {
     if(sp.charAt(i)!='A'&& sp.charAt(i)!='E' && sp.charAt(i)!='I' && sp.charAt(i)!='O' && sp.charAt(i)!='U'
     &&sp.charAt(i)!='a'&&sp.charAt(i)!='e'&&sp.charAt(i)!='i'&&sp.charAt(i)!='o'&&sp.charAt(i)!='u'&&sp.charAt(i)!=' ')
     {
         sb3.append(sp.charAt(i));
         count3++;
     }
 }
 System.out.println(sb3);//Hdrhwry
 System.out.println(count3);//7
 
 //find words in string
 
 int count4=0;
 StringBuffer sb4= new StringBuffer();
 String[] words=sp.split(" ");
 for(String w:words)
 {
     System.out.println(w);
     count4++;
 }
 System.out.println(count4);//5
 
 int[] ar={1,2,3,4};
 for(int i=0;i<ar.length;i++)
 {
 System.out.print(ar[i]+" ");
 }
 
 
 
}}



import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    //passing array to AbstractMethodError
    int arr[] = { 1, 2, 3, 4 };
    int arr2[] = Main.min (arr);
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

  public static int[] min (int arr[])
  {
  for (int i:arr)
      {
	System.out.print (i + " ");	//1 2 3 4 
      }
    return arr;
  }

}				//class_close


public class Main
{
	public static void main(String[] args) 
	{
	    /*Question Input: samples[] = {345, 604, 321, 433, 704, 470, 808, 718, 517, 811}, 
	    ranges[] = {{300, 380}, {400, 700}}
        Output: 2 4*/
	    int[] samples = {345,604,321,433,704,470,808,718,517,811};
	    int[][] ranges = {{300,380},{400,700}};
	    int a=0,b=0;
	    for(int i=0;i<samples.length;i++)
	    {
	        if(ranges[0][0]<=samples[i] && samples[i]<=ranges[0][1])
	        {
	            a++;
	        }
	        if(ranges[1][0]<=samples[i] && samples[i]<=ranges[1][1])
	        {
	            b++;
	        }
	        
	    }
		System.out.println(a+" "+b);
		/*Question: Print the first N terms of the series 6, 28, 66, 120, 190, 276, …
		formula : k*(2*k-1)*/
		
		int k=2,n=10;
		for(int i=0;i<=n;i++)
		{
		    System.out.print(k*(2*k-1)+" ");
		    k+=2;
		}
		System.out.println();
		//Question: Amstrong number or not ext:153
		
		int Amstrong=153;
		int t=0,c=0;
		while(Amstrong>0)
		{
		    t=Amstrong%10;
		    c=c+(t*t*t);
		    Amstrong=Amstrong/10;
		    
		}
		System.out.println(c);//153
		
		
	}//main close
}//class close

