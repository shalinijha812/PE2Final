package myexercise;

public class Member {
    String name;
    int age;
    double salary;

}
  class MemberVariable {
    Member member=new Member();
//    public String initialiseDefault()
//        {
//            member.name="Null";
//            member.age=0;
//            member.salary=0;
//            return member.name+" "+member.age+" "+member.salary;
//
//        }
    public String display()
        {
            member.name="Puja";
            member.age=22;
            member.salary=20000.00;
            return member.name+" "+member.age+" "+member.salary;
        }
}
