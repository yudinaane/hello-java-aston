public class PlateCat {
    public int countFood;
    public PlateCat(int countFood){
        this.countFood=countFood;
    }
    public void decreaseFood(int n) {
        countFood -= n;
    }
    public void increaseFood(int x) {
        countFood += x;
    }
    public void infoPlateCat() {
        System.out.println("Всего еды: " + countFood);
    }

}
