import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    String Path="D:\\MODUL 2\\tHI\\src\\file";
    Scanner scanner=new Scanner(System.in);
    List<DanhBa> tList = new ArrayList<>();

    public List<DanhBa> readFromFile(String path) {
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            tList = (List<DanhBa>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        } catch (Exception e) {
//            System.out.println("");
        }
        return tList;
    }
    public void writeIntoFile(String path, List<DanhBa> tList){
        try{
            FileOutputStream fileOutputStream=new FileOutputStream(path);
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(tList);
            objectOutputStream.close();
            fileOutputStream.close();
        }
        catch (IOException e){
//            System.out.println("");
        }
    }
public void them(){
    System.out.println("ID: ");
    int id=scanner.nextInt();
    scanner.nextLine();
    System.out.println("TEN:");
    String ten=scanner.nextLine();
    System.out.println("TUOI:");
    int tuoi=scanner.nextInt();
    scanner.nextLine();
    System.out.println("GIOI TINH:");
    String gioiTinh=scanner.nextLine();
    System.out.println("EMAIL:");
    String email=scanner.nextLine();
    System.out.println("DIA CHI:");
    String diaChi=scanner.nextLine();
    DanhBa danhBa=new DanhBa();
    danhBa.setId(id);
    danhBa.setTen(ten);
    danhBa.setTuoi(tuoi);
    danhBa.setGioitinh(gioiTinh);
    danhBa.setDiachi(diaChi);
    danhBa.setEmail(email);
    tList=readFromFile(Path);
        tList.add(danhBa);

        writeIntoFile(Path,tList);
    System.out.println("----------sau khi them---------");
    System.out.println(tList);
}
public void xoa(){
    readFromFile(Path);
    System.out.println("danh ba: ");
    System.out.println(tList);
    System.out.println("enter Id to delete");
    int id=scanner.nextInt();
    for (int i = 0; i <tList.size(); i++) {
        if (id==tList.get(i).getId()){
            tList.remove(tList.get(i));
            writeIntoFile(Path,tList);
        }
    }
}
    public void timKiem(){
        readFromFile(Path);
//        tList=readFromFile(Path);
        System.out.println("danh ba: ");
        System.out.println(tList);
        System.out.println("enter Id to find");
        int id=scanner.nextInt();
        for (int i = 0; i <tList.size(); i++) {
            if (id==tList.get(i).getId()){
                System.out.println("---------person-------------");
                System.out.println(tList.get(i));
            }
        }
    }
    public void sua(){
        readFromFile(Path);
        System.out.println("danh ba: ");
        System.out.println(tList);
        System.out.println("enter Id to delete");
        int id=scanner.nextInt();
        for (int i = 0; i < tList.size(); i++) {
            if (id==tList.get(i).getId()){
                System.out.println("newID: ");
                int newid=scanner.nextInt();
                scanner.nextLine();
                System.out.println("newTEN:");
                String newten=scanner.nextLine();
                System.out.println("newTUOI:");
                int newtuoi=scanner.nextInt();
                scanner.nextLine();
                System.out.println(" new GIOI TINH:");
                String newgioiTinh=scanner.nextLine();
                System.out.println("new EMAIL:");
                String newemail=scanner.nextLine();
                System.out.println("new DIA CHI:");
                String newdiaChi=scanner.nextLine();
                DanhBa danhBa=tList.get(i);
                danhBa.setId(newid);
                danhBa.setTen(newten);
                danhBa.setTuoi(newtuoi);
                danhBa.setGioitinh(newgioiTinh);
                danhBa.setDiachi(newdiaChi);
                danhBa.setEmail(newemail);
//                readFromFile(Path);
//                tList=readFromFile(Path);
                writeIntoFile(Path,tList);
                System.out.println("---------sau khi sua -----------");
                System.out.println(tList.get(i));
//                tList=readFromFile(Path);
//                writeIntoFile(Path,tList);
            }
        }
    }
    public void hienthi(){
        System.out.println("--------danh ba---------");
        readFromFile(Path);
        System.out.println(tList);
    }
    public static void main(String[] args) {
        Main main=new Main();
        Scanner scanner=new Scanner(System.in);
        System.out.println("1:them danh ba");
        System.out.println("2:xoa danh ba theo id");
        System.out.println("3:tim kiem danh ba theo id");
        System.out.println("4:sua danh ba theo id");
        System.out.println("5:hien thi danh ba");
        System.out.print("chon so:");
        int so=scanner.nextInt();
        switch (so){
            case 1:
                main.them();
                new Main();
                break;
            case 2:
                main.xoa();
                break;
            case 3:
                main.timKiem();
                break;
            case 4:
                main.sua();
                break;
            case 5:
                main.hienthi();
                break;
        }

    }
}
