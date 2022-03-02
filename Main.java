public class Main {

    public static void main(String[] args){

    }

    public static boolean within10and20 (int x1, int x2){
        if (x1 + x2 >= 10 && x1 +x2 >=20){
            return true;
        }
        return false;
    }

    public static void isPositiveOrNegative (int x){
        if(x >= 0){
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean isNegative (int x){
        if(x < 0){
            return false;
        } else {
            return true;
        }
    }

    public static void printWordNTimes (String word, int times){
        for (int i = 0; i < times; i++){
            System.out.println(word);
        }
    }
}
