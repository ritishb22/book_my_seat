package Projects;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class book_my_seat
{
    static int day;
    static int month;
    static int year;
    static int minute;
    static int hour;
    static GregorianCalendar date = new GregorianCalendar();
    public static void main (String args[])
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        day = date.get(Calendar.DAY_OF_MONTH);
        month = date.get(Calendar.MONTH);
        year = date.get(Calendar.YEAR);
        minute = date.get(Calendar.MINUTE);
        hour = date.get(Calendar.HOUR);
        System.out.println("Current date is "+day+"/"+(month+1)+"/"+year);
        System.out.println("Current time is "+hour+" hr: "+minute+" min");
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("");
        System.out.println("                            BBBBBB      OOOO      OOOO    KK  KK            MMM      MMM  YY    YY             SSSSSSS  EEEEEEEE      AA      TTTTTTTTTT   ");
        System.out.println("                            BB   BB   OO    OO  OO    OO  KK KK             MM MM  MM MM   YY  YY             SS        EE           AA AA        TT       ");
        System.out.println("                            BBBBBB    OO    OO  OO    OO  KKKK              MM  MM MM MM    YYYY               SSSSSSS  EEEEEEE     AA   AA       TT       ");
        System.out.println("                            BB   BB   OO    OO  OO    OO  KK KK             MM    M   MM     YY                      SS EE         AAAAAAAAA      TT       ");
        System.out.println("                            BBBBBB      OOOO      OOOO    KK  KK            MM        MM     YY                SSSSSSS  EEEEEEEE  AA       AA     TT       ");
        System.out.println("                                                                                THINK IT SEE IT");
        System.out.println("                                                                        FIND BEST PRICES ON MOVIE TICKETS");
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
    }
}