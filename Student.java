class Student{
      int id;
      String name;

      int age;
      Student(int i,String n)
   {
      id =i;
     name =n ;
  }
     Student(int i,String n,int a)
 {
     id = i;
    name = n;
    age=a;
  }
    void display(){
    System.out.println("ID Of Student : "+id+" ,"+"Name Of Student :"+name+" , "+"Age Of Student:"+age);
    }
      public static void main(String args[])
  {
      Student s1 = new Student(20,"Ram",23);
     Student s2 = new Student(21,"Ratan",24);
      s1.display();
      s2.display();
     }
}