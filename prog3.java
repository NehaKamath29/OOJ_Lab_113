import java.util.*;
class Book{
   String name,author;
   double price;
   int  num_pages;
   Book(){
      name="\0";
      author="\0";
      price=0.0;
      num_pages=0;
   }
   void get() 
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the name of the book:");
      this.name=sc.nextLine();
      System.out.println("Enter the author's name:");
      this.author=sc.nextLine();
      System.out.println("Enter the price of the book:");
      this.price=sc.nextDouble();
      System.out.println("Enter the number of pages:");
      this.num_pages=sc.nextInt();
    }
   public String toString()
   {
     String s="Name of the book: "+this.name+"\nAuthor of the book: "+this.author+"\nPrice: "+this.price+"\nNumber of pages: "+this.num_pages;
     return s;
   }
}
class oojLabProg3
{
   public static void main(String args[])
   {
      int n;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number of books:");
      n=sc.nextInt();
      Book b1[]=new Book[n];
      for(int i=0;i<n;i++)
      {
        b1[i]=new Book();
        System.out.println("Enter book "+(i+1)+" details");
        b1[i].get();
       }
       for(int i=0;i<n;i++)
       {
         System.out.println("Book "+(i+1)+" details");
         System.out.println(b1[i]);
       }
   }
}
