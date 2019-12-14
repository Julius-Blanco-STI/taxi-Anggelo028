public class main {
    public static void main(String[] args) {
        taxi x = new taxi("LUV143");
        x.ruuun("I will go to Marikina! in the c-points shops of shoes in conception");
        x.printcurrentlocation();
        x.book(1,1);
        System.out.println(x.reacheddestination());
    }
}
