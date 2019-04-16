import java.util.ArrayList;

public class FindNumber {
    static ArrayList<Long> number = new ArrayList<>();
    public static void find(){
        for (long i = 2; i <= 100000; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                number.add(i);
//                System.out.println("" + i);
            }
        }

        caculate();
    }

    public static void caculate(){
        long result = 7140229933L;
        for (int i = 0;i<number.size();i++){
            long num1 = number.get(i);



            for (int j = 0;j<number.size();j++){
                long num2 = number.get(j);

                if (num1 * num2 == result){
                    System.out.println("number1:"+num1);
                    System.out.println("number2:"+num2);
                    System.out.println("result:"+result);
                }
            }
        }
    }
}
