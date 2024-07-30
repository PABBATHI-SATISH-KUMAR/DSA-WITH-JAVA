public class Inheritance {
    public static void main(String[] args) {
        Shashank s1= new Shashank();
        s1.trip();
        Rahul r1 = new Rahul();
        r1.trip();
        r1.property();
        Chaitanya c1 = new Chaitanya();
        c1.trip();
        //c1.property();
        c1.gym();
    }
}
// class Shashank{
//     public void trip(){
//         System.out.println("Lets go for trip");
//     }
// }
// class Rahul extends Shashank{
//     void property(){
//         System.out.println("lets go for park");
//     }
// }
// class Chaitanya extends Rahul{
//     void gym(){
//         System.out.println("Lets go for gym");
//     }

// }

class Shashank{
    public void trip(){
        System.out.println("Lets go for trip");
    }
}
class Rahul extends Shashank{
    void property(){
        System.out.println("lets go for park");
    }
}
class Chaitanya extends Shashank{
    void gym(){
        System.out.println("Lets go for gym");
    }
}
