package ogr;

public class Main {
    private static Course biyo;

    public static void main(String[]args){
        Teacher t1=new Teacher("Mahmut","TRH","555");
        Teacher t2=new Teacher("Graham Bell","FZK","0000");
        Teacher t3=new Teacher("Külyutmaz Necmi","BIO","1111");
        Course tarih=new Course("Tarih","101","TRH",t1);
        tarih.addTeacher(t1);

        Course fizik=new Course("Fizik","102","FZK",t2);
        fizik.addTeacher(t2);

        Course biyo=new Course("Biyoloji","103","BIO",t3);
        biyo.addTeacher(t3);





       Student s1=new Student("İnek Şaban","123","4",tarih,fizik,biyo);
       s1.addBulExamNote(100,78,50,70);
       s1.isPass();
        Student s2=new Student("Güdük Necmi","444","4",tarih,fizik,biyo);
        s1.addBulExamNote(45,69,55,90);
        s1.isPass();


    }


}

