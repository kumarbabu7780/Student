calss Student{

String name;
int rollnum;
String course;
String email;
long mobile;
String address;
char gender;
int yearofjoining;

public void printStudent()
{
System.out.println("Student Name:"+name);
System.out.println("Student rollnum:"+rollnum);
System.out.println("Student course:"+course);
System.out.println("Student email:"+email);
System.out.println("Student address:"+address;);
System.out.println("Student gender:"+gender);
System.out.println("Student yearofjoining:"+yearofjoining);
}
}
class StudentManager{
 public static void main(String[]args){
    Student s1=new Student();
    s1.name="prakash"
    s1.rollnum=101;
    s1.course="Java";
    s1.email="prakesh@gmail.com";
    s1.mobile=455454564;
    s1.address="hyd";
    s1.gender="male";
    s1.yearofjoining=2022;
    }
    }




