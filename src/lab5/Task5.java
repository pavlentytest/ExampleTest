package lab5;
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        //Вывод аргументов командной строки For (Зачем?) Параметры указываются непосредстенно после вызоваемой команды.
        //В среде разработки в редактировании конфигуратора запуска. Run/Debug Configurations -> Program arguments
            for (int i = 0; i< args.length; i++)
                System.out.println(args[i]);
    }

}