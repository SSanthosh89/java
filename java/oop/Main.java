
class Sample6 {
    static String name;
    static int age;
    static double avg;

    public static void detail(String n, int a, double av) {
        name = n;
        age = a;
        avg = av;
    }
        public static void display(){
            System.out.println( "*********Student details***********");
            System.out.println(name);
            System.out.println(age);
            System.out.println(avg);


        }
    }

    class Sample_Method{
        public static void main(String args[]) {
            //Sample6 s1 = new Sample6();
            Sample6.detail("Sam",23,95.2);
            Sample6.display();
            Sample6.detail("dik",32,89.3);
            Sample6.display();
        }
    }
