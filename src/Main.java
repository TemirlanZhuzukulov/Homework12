import java.lang.reflect.Array;

public class
Main {
     public static void main(String[] args){
      Car car1 = new Car();
      car1.setName("Accord");
      car1.setMadeIn("Japan");
      car1.setYear(2002);
      car1.setCompany("Honda");

     Car car2=new Car();
     car2.setName("Camry");
      car2.setMadeIn("Japan");
      car2.setYear(2004);
      car2.setCompany("Toyata");

     Car car3= new Car();
     car3.setName("Step");
     car3.setMadeIn("Japan");
      car3.setYear(2003);
      car3.setCompany("Honda");

    Car [] CarArray={car1,car2,car3};
         for (Car car:CarArray) {
             System.out.println(" Car  ");
             System.out.println("Name : "+car.getName()+"\n"+"MadeIn:"+car.getMadeIn()+"\n"+"Year:"+car.getYear()+"\n"+"company:"+car.getCompany());
         }
      getSchool();
         getPerson();
         getUniversity();
     }
     public static void getSchool(){
         School school1=new School();
         school1.setName("№1");
         school1.setFounded("1995 year");
         school1.setLocation("Talas");

         School school2=new School();
         school2.setName("№2");
         school2.setFounded("2000 year");
         school2.setLocation("Chuy");

         School school3=new School();
         school3.setName("№3");
         school3.setFounded("2004 Year");
         school3.setLocation("Bishkek");
         School [] schools={school1,school2,school3};
         for (School school:schools) {
             System.out.println(" School   ");
             System.out.println("Name:"+school.getName()+"\n"+"Founded:"+school.getFounded()+"\n"+"Location:"+ school.getLocation());
         }
     }
       public  static  void  getPerson(){
         Person person1=new Person();
         person1.setName("Aman");
         person1.setAge((byte) 20);
         person1.setStatus("Student");

         Person person2=new Person();
         person2.setName("Aktan");
         person2.setAge((byte) 25);
         person2.setStatus("Programmer");

         Person person3=new Person();
         person3.setName("Asan");
         person3.setAge((byte) 30);
         person3.setStatus("Cooker");

         Person [] persons={person1,person2,person3};
           for (Person person:persons) {
               System.out.println("  Person  ");
               System.out.println("name:"+person.getName()+"\n"+"age:"+person.getAge()+"\n"+"Status:"+person.getStatus());

           }





       }
       public  static  void getUniversity(){
         University university1=new University();
         university1.setLocation("AUCA");
         university1.setYear(20);
         university1.setLocation("Bishkek");

         University university2=new University();
         university2.setName("UCA");
         university2.setYear(15);
         university2.setLocation("Naryn");

         University university3=new University();
         university3.setName("KNU");
         university3.setYear(30);
         university3.setLocation("Bishkek");

         University[] universities={university1,university2,university3};
           for (University university:universities) {
               System.out.println(" University ");
               System.out.println("name"+university.getName()+"\n"+"year"+university.getYear()+"\n"+"location:"+university.getLocation());

           }

       }


     }