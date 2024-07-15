package arrayoperations;

import java.util.Scanner;

public class Insertion {
    public static int arr[]=new int[10];
         public static void insertElementsAtBeg()
             {
                    Scanner scanner=new Scanner(System.in);
                 System.out.println("enter the size of array: ");
                   int size=scanner.nextInt();
                 System.out.println("Enter the elements : ");
        
           for (int i = 0; i < size; i++) {
                 arr[i]=scanner.nextInt();
        }
           System.out.println("you have entered these elements : ");
           for (int i = 0; i < size; i++) {
               System.out.println(arr[i]);
        }
    
           System.out.println("enter the element do you want to insert at begining: ");
                int item=scanner.nextInt();
               
           for (int i = size+1; i>0; i--) {
               arr[i]=arr[i-1];
           }  
            
           arr[0]=item;
           System.out.println("you have entered these elements : ");
           for (int i = 0; i <size+1; i++) {
               System.out.println("a["+i+"}"+" ="+arr[i]);
               
           }
             }
         
           public static void insertElementAtLast()
           {
                  int a[]=new int[10];
                    Scanner scanner=new Scanner(System.in);
                  System.out.println("Enter the size of array: ");
                     int size=scanner.nextInt();
                   System.out.println("Please enter your elements of array: ");
                   for (int i = 0; i <size; i++) {
                         a[i]=scanner.nextInt();
               }
                   System.out.println("Enter the element do you want to insert at last: ");
                   int item=scanner.nextInt();
                      a[size]=item;
                    System.out.println("After the  insertion elements are: ");
                    for (int i = 0; i < size+1; i++) {
                         System.out.println("a["+i+"] = "+a[i]) ;
               }
           }
           
           public static void insertElementAtSpecificPosition()
           {
                int a[]=new int[10];
                Scanner scanner=new Scanner(System.in);
                System.out.println("Enter the size of array: ");
                 int size= scanner.nextInt();
                   System.out.println("enter the elements : ");
                     for (int i = 0; i < size; i++) {
                        a[i]=scanner.nextInt();
               }
               System.out.println("Enter the element do yout want to insert at Specific position : ");
               int item=scanner.nextInt();
               System.out.println("enter the position: ");
               int position =scanner.nextInt();
                  
                     for (int i =size; i >position; i--) {
                     a[i]=a[i-1];
                     
               }
                     a[position]=item;
                     
                     System.out.println("After insertion elements are : ");
                     for (int i = 0; i <size+1; i++) {
                         System.out.println("a["+i+"] = "+a[i]);
               }
           }
             }
