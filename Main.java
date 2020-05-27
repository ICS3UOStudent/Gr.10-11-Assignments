package com.company;

public class Main{
    public String bookName;
    public int millionsSold;

    public Main next;

    public Main(String bookName, int millionsSold){
        this.bookName = bookName;
        this.millionsSold = millionsSold;
    }

    public void display(){
        System.out.println(bookName + ":" + millionsSold + ",000,000");
    }

    public String toString(){
        return bookName;
    }

    public static void main(String[] args){


    }
}


    class LinkedList{
        public Main firstLink;

        LinkedList(){
            firstLink = null;
        }

        public boolean isEmpty(){
            return(firstLink == null);
        }


    }
