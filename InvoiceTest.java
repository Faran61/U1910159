package com.company;
import java.util.Scanner;
/*Farangiz Khojimatova U1910159
Lab - 1
2. A program to create Invoice class*/
class Invoice{
    String partNumber, partDescription;
    int itemPurchased;
    double price_perItem;
    Invoice()
    {
        partNumber="";
        partDescription="";
        itemPurchased=0;
        price_perItem=0.0;
    }
    String getPartNumber(){return partNumber;}
    String getPartDescription(){return partDescription;}
    int getItemPurchased(){return itemPurchased;}
    double getPrice_perItem(){return price_perItem;}
    double getInvoiceAmount(){return (itemPurchased*price_perItem);}
    void setPartNumber(String pn){partNumber=pn;}
    void setPartDescription(String pd){partDescription=pd;}
    void setItemPurchased(int ip){itemPurchased=ip;}
    void setPrice_perItem(double pp){price_perItem=pp;}
}
class InvoiceTest {

    public static void main(String[] args) {
Scanner s=new Scanner(System.in);
Invoice in=new Invoice();
System.out.print("Enter part number: ");
in.setPartNumber(s.nextLine());
System.out.print("Enter part description: ");
in.setPartDescription(s.nextLine());
System.out.print("Enter quantity of the item being purchased: ");
in.setItemPurchased(s.nextInt());
System.out.print("Enter a price per item: ");
in.setPrice_perItem(s.nextDouble());
System.out.print("\nDetail of purchased items-> ");
System.out.print("\nPart number:" + in.getPartNumber());
System.out.print("\nPart Description: "+in.getPartDescription());
System.out.print("\nThe invoice amount: "+in.getInvoiceAmount());
    }}