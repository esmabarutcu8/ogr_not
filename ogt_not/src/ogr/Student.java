package ogr;

public class Student {

    Course c1;
    Course c2;
    Course c3;
    //Course c4;

    String name;
    String stuNo;
    String classes;
    double avarage1;
    boolean isPass;
    double avarage2;
    double sozlu;

    Student(String name,String stuNo,String classes,Course c1,Course c2,Course c3){
        this.name=name;
        this.stuNo=stuNo;
        this.classes=classes;
        this.c1=c1;
        this.c2=c2;
        this.c3=c3;

        this.avarage1=0.0;
        this.avarage2=0.0;
        this.isPass=false;

    }
    void addBulExamNote(int note1,int note2,int note3,int note4){
        if(note1>=0&&note1<=100){
            this.c1.note=note1;
        }
        if(note2>=0&&note2<=100){
            this.c2.note=note2;
        }
        if(note3>=0&&note3<=100){
            this.c3.note=note3;
        }
        if(note4>=0&&note4<=100){
            this.sozlu=note4;
        }


    }
    void isPass(){
        this.avarage1=(this.c1.note+this.c2.note+this.c3.note)/3.0;
        this.avarage2=(0.20*this.sozlu+0.80*this.avarage1);
        if(this.avarage2>55){
            System.out.println("Hababam sınıfı uyanıyor");
            this.isPass=true;
        }
        else{
            System.out.println("Hababam sınıfı sınıfta kaldı");
            this.isPass=false;
        }
        printNote();
    }

    void printNote(){
        System.out.println(this.c1.name+" Notu\t:"+c1.note);
        System.out.println(this.c2.name+" Notu\t:"+c2.note);
        System.out.println(this.c3.name+" Notu\t:"+c3.note);
        System.out.println("Sözlü Notu\t:"+sozlu);

        System.out.println("ortalamanız:"+this.avarage2);

    }





}
