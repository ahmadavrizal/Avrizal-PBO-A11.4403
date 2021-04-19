package praktikum7;

import java.util.Scanner;
public class Nim{
    int Nim;
    String Nama,perlu;
    Nim next;
    static Scanner in=new Scanner(System.in);
    static Scanner str=new Scanner(System.in);
    public void input(){
        System.out.print("Masukkan Nim        : ");
        Nim=in.nextInt();
        System.out.print("Masukkan Nama      : ");
        Nama=str.nextLine();
        System.out.print("Masukkan Matkul : ");
        perlu=str.nextLine();
        next=null;
    }
    public void read(){
        System.out.println("|| "+Nim+" \t\t|| "+Nama+" \t\t|| "+perlu+" \t||");
    }
    public static void main(String[] args){
        int menu=0;
        linked que=new linked();
        while(menu!=4){
            System.out.print("1.Enqueue\n2.Dequeue\n3.View\n4.Exit\n : ");
            menu=in.nextInt();
            if(menu==1)que.enque();
            else if(menu==2)que.deque();
            else if(menu==3)que.view();
            else if(menu==4)System.out.println("- keluar -");
            else System.out.println("- Salah -");
            System.out.println("");
        }
    }
}
class linked{
    Nim head,tail;
    public linked(){
        head=null;
        tail=null;
    }
    public void enque(){
        Nim baru=new Nim();
        baru.input();
        if(head==null)head=baru;
        else tail.next=baru;
        tail=baru;
    }
    public void deque(){
        if(head==null)System.out.println("- Kosong -");
        else{
            System.out.println("Keluar Data Dengan Nim : "+head.Nim);
            head=head.next;
        }
    }
    public void view(){
        if(head==null)System.out.println("- Kosong -");
        else{
            System.out.println("|| Nim \t\t|| Nama \t\t|| Keperluan \t||");
            for(Nim a=head; a!=null; a=a.next) a.read();
        }
    }
}

