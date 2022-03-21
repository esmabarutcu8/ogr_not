package ogr;

public class Course {
    Teacher teacher;   //bir sınıfın niteliğini diğer sınıfta da kullanabilirsin
    String name;
    String code;
    String prefix;  //prefix branch ile uyumlu olmalı
    int note;
    int noteSozlu;

    Course(String name,String code,String prefix,Teacher teacher){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        this.teacher=teacher;
        int note=0;
        int noteSozlu=0;
    }
    void addTeacher(Teacher teacher){

        if(teacher.branch.equals(this.prefix)){
            this.teacher=teacher;

        }
        else{  //tarih dersine fizik hocası girmesin diye
            System.out.println("Öğretmen ve Ders bölümleri uyuşmuyor.");
        }
    }
    void printTeacher(){
        this.teacher.print();
    }




}

