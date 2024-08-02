public class Inheritance {
    public static void main(String[] args) {
        Shashank s1= new Shashank();
        s1.trip();
        Rahul r1 = new Rahul();
        r1.trip();
        r1.property();
        //r1.showPercentage();
        Chaitanya c1 = new Chaitanya();
        c1.trip();
        //c1.property();
        c1.gym();
        //c1.go();
    }
}
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
class Chaitanya extends Rahul{
    void gym(){
        System.out.println("Lets go for gym");
    }

}

// class Shashank{
//     int percentage = 78;
//     public void trip(){
//         System.out.println("Lets go for trip");
//     }
// }
// class Rahul extends Shashank{
//     void property(){
//         System.out.println("lets go for park");
//     }
//     void showPercentage() {
//         // Accessing percentage from the superclass
//         System.out.println("Rahul's percentage is: " + percentage);
//     }

// }
// class Chaitanya extends Shashank{
//     void gym(){
//         System.out.println("Lets go for gym");
//     }
//     void go(){
//         System.out.println("lets go for go");
//     }
//     void showPercentage() {
//         // Accessing percentage from the superclass
//         System.out.println("Chaitnaya's percentage is: " + percentage);
//     }
// }

