package lab7;
import java.math.BigInteger;
public class Task7 {
    /*
    public BigInteger Task7(int f) {
        BigInteger fact = BigInteger.ONE;//ONE для сравнения BigInteger с 1
        for (int i = 1; i <= f; i++)
            fact = fact.multiply(BigInteger.valueOf(i)); //multiply возвращает произведение двх значений BigInt;
        return fact;                                    //valueOf преобразует в нужный тип данных
    }*/
    public static long getFactorial(int f){
        if(f>=0){
            long factorial = 1;
            int i = 1;
            do {factorial *= i;} while (i++ <= f);
            return factorial;
        }
        else return 0;
    }
}
