package com.tutorial4.corepract;

import java.util.Locale;

//substring-subsequence
//equalsIgnoreCase() - equals

public class StringPract {
	public static void main(String[] args) {
		String a= "0123456789";
		String a1 = "987654321";
		String b= "World";
		String c= "World";
		String d="WorlD";
		 
		System.out.println(a.concat(b));            //0123456789World
		System.out.println(a.charAt(4));            //4
		System.out.println(a.length());             //10
		//System.out.println(b.compareTo("Worldd"));  //returns -1 if not same and 0 if same   
		System.out.println(String.format("value in a : %s", a+"\n"));  // Value : 0123456789
		 
		
		System.out.println(a1.substring(3));         //654321
		System.out.println(a1.substring(0, 4));       //9876
		System.out.println(a1.subSequence(0, 4));    //9876
		System.out.println(a1.contains("10")+"\n");       // false
		
		System.out.println(String.join("-","Suk","Pal",a,b));      //Suk-Pal-0123456789-World
		System.out.println(b.equalsIgnoreCase(c));   //true   
		System.out.println(c.equals(b));             //true
		System.out.println(a.isEmpty());             //false
		System.out.println(d.replace("D", "d"));     //world
		System.out.println("She is working in TCS, he is working in TCS".replace("is", "was")+"\n");     // She was working in TCS, he was working in TCS
		
		String e="LoveMoktail Movie is Myfav Movie in Kannada";   //(not understood)
		              String[] f=e.split(" ", 3);
		              for(String f1: f)
		            	  System.out.println(f1);
		          System.out.println("\n");
		
		String g= "dear A,Hi Hello A,Hi A";
		System.out.println(g.indexOf("A"));                //5 index 
		System.out.println(g.indexOf("Hello"));            // 10 (including space and ,)
		System.out.println(g.indexOf("A", 8));             //16(from 6th index 16 are present)  next occurance
		System.out.println(g.indexOf("Hi",15)+"\n");            // 18     // next occurance
		
		System.out.println(e.toLowerCase());
		System.out.println(e.toUpperCase());
		
		String h = "    today is friday  1-2-21     ";
		System.out.println(h.trim());                      // removes spaces in starting and ending
		System.out.println (g.toUpperCase());              //DEAR A,HI HELLO A,HI A
		//System.out.println (g.toUpperCase (Locale.CHINA)+"\n"); 
		
		
		
		int k= 3456;
		String k1= String.valueOf(k);
		System.out.println(k1);
		
		char[] L= {'H','E','L','L','O'};
		 String L11=String.copyValueOf(L);          // Why we need to specify the indices here
		 System.out.println(L11);                   // HELLO
		 System.out.println(L11.startsWith("H"));   //true
		 System.out.println(L11.endsWith("LO"));    //true
		 
		   char[] L1=new char[10];                     // (not understood)
		    String L2="DEAR";
		    try{
		    L2.getChars(0,4,L1,0);//DEAR (srcbeginIndex,srcEndIndex,char[] destinationVariable,dstBeginIndex)
		    System.out.println(L1);
		    }
		    catch(Exception ex){System.out.println(ex);}
		    
		   
		    
		    //Printing reverse of a string
		    
		    String stg="Hi Hello Welcome";
		    char [] chr=new char[10];
		    chr=stg.toCharArray();
		    System.out.println(chr[9]);//0           //w  (not understood)
		    int l =stg.length();
		    System.out.println(l);
		    System.out.println(chr);
		     for(int i=(l-1);i>=0;i--) {
		    	 System.out.print(chr[i]);     //emocleW olleH iH
		     }
		    	 System.out.println("\n");
		    	 
		     //Checking String is polindrome or not
		     
		     String str= "aaabbbaaaS";
		     char [] ch=new char[20];
			    ch=str.toCharArray();
			    int l1 =str.length();
			    System.out.println(l1);
			    System.out.println(ch);
			    StringBuffer sb=new StringBuffer();
			     for(int i=(l1-1);i>=0;i--) {
			    	 System.out.print(ch[i]);		        
					sb.append(ch[i]);}
		              String str2=sb.toString();
		System.out.println("\n");
		              if (str.equals(str2)) {
		            	  System.out.println("Given String is polindrome");
		              }	
		              else {
		            	  System.out.println("Given number is not polindrome");
		              }
		              
		//Program  for Anagram
		              
		             String anagram_1= "listenz" ;
		             String anagram_2= "silentg";
		             
		             char[] an1= anagram_1.toCharArray();
		             char[] an2= anagram_2.toCharArray();
		             
		             int input=an1.length;
		            int count=0;
		            
		            for(int i=0;i<an1.length;i++) {
		            	for(int j=0; j<an2.length;j++) {
		            		if(an1[i]==an2[j]) {
		            			count++;
		            			break;
		            		}
		            	}
		            }		              
		            if(input==count) {
		            	 System.out.println("it's anagram"+"\n");}
		            else {
		            	 System.out.println("it's not anagram"+"\n");
		            }
		            
		            
		          //Split the string using (.) or space           
		  String sp="Hi dear how are you"  ;
		  String dt="Hi.dear.how.are.you";
		  
		   String[]  sp1 =sp.split(" ");
		   System.out.println(sp1[2]);   //how
		   	   
		    String[] dt1=dt.split("\\.");     //(not understood)
		    System.out.println(dt1[3]);   //are   
		    
		  //counting spaces in string	
		            int count2=0;  
		   for(int i=0;i<sp.length();i++) {
			   if(sp.charAt(i)==' ') {
				   count2++;				 				   
			   }			  
		   }
		   System.out.println(count2+"\n");   
		   
		   
		 //vowels in given string         
		   int count3=0;
		          StringBuffer sb1=new StringBuffer();    
		   for(int i=0;i<sp.length();i++) {
			   if(sp.charAt(i)=='A'||sp.charAt(i)=='E'||sp.charAt(i)=='I'||sp.charAt(i)=='O'||sp.charAt(i)=='U'||sp.charAt(i)=='A'||       		              		              
sp.charAt(i)=='a'||sp.charAt(i)=='e'||sp.charAt(i)=='i'||sp.charAt(i)=='o'||sp.charAt(i)=='u')
			   {
	             sb1.append(sp.charAt(i));
	             count3 ++;
			   }
		   }
		   System.out.println(sb1);      //ieaoaeou
		   System.out.println(count3);   //8

		 //Alphabets in given string         
		   int count4=0;
		          StringBuffer sb2=new StringBuffer();    
		   for(int i=0;i<sp.length();i++) {
			   if(sp.charAt(i)!='A' && sp.charAt(i)!='E'&&sp.charAt(i)!='I'&&sp.charAt(i)!='O'&&sp.charAt(i)!='U'&&sp.charAt(i)!='A'&&       		              		              
sp.charAt(i)!='a' && sp.charAt(i)!='e'&&sp.charAt(i)!='i'&&sp.charAt(i)!='o'&&sp.charAt(i)!='u'&&sp.charAt(i)!=' ')
			   {
	             sb2.append(sp.charAt(i));
	             count4 ++;
			   }
		   }
		   System.out.println(sb2);      //Hdrhwry
		   System.out.println(count4+"\n");   //7
		   
		   //find words in string
		   
		   int count5=0;
		   String[] words=sp.split(" ");
		   for(String w: words) {
			   System.out.println(w);
			   count5 ++;
		   }
		   System.out.println("NO of words are: "+count5);      //5
		   
		   int count7=0;
		   int[] ar= {1,2,3,4,5,6};
		   
		   for(int i=0;i<ar.length;i++) {
			   System.out.print(ar[i]+" ");             //1 2 3 4 5 6
			   count7 ++;
		   }	   
		   System.out.println("no of charecters "+count7);
			}}
