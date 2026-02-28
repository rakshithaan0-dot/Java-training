package arrays;
class Student {
    String name;
    int USN;
}
class Intern {
    String name;
    int id;
    Intern(String name,int id) {
        this.name = name;
        this.id = id;
    }
    }
public class E7 {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0]=new Student();
        students[0].name="Rahul";
        students[0].USN=101;
        System.out.println(students[0].name+" "+students[0].USN);
        Intern[] interns=new Intern[]{
                new Intern("sahana", 101),
                new Intern("bhuana", 102),
                new Intern("aradhana", 103)
        };
for(Intern i: interns){
    System.out.println(i.name+""+i.id);
}


        }

}





