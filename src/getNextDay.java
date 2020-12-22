public class getNextDay {

    public static final int FIRSTOFMONTH = 1;
    public static final int LASTMONTH = 12;

    public static String nextDayCalculator(int dayTest, int monthTest, int yearTest) {
        int LASTOFMONTH = getLastofmonth(monthTest, yearTest);
        if (dayTest == LASTOFMONTH){
            if (monthTest==LASTMONTH){
                monthTest = 1;
                dayTest = 1;
                yearTest++;
            }else{
                dayTest = FIRSTOFMONTH;
                monthTest++;
            }
        }else dayTest++;

        String result = dayTest + "-" + monthTest + "-" + yearTest;
        return result;
    }

    private static int getLastofmonth(int monthTest,int yearTest) {
        int LASTOFMONTH = 0;
        switch (monthTest){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                LASTOFMONTH = 31;
                break;
            case 2:
                LASTOFMONTH = checkLeapYear(yearTest);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                LASTOFMONTH = 30;
                break;
        }
        return LASTOFMONTH;
    }

    private static int checkLeapYear(int yearTest) {
        int LASTOFMONTH;
        if (yearTest % 400 == 0 || yearTest % 4 == 0 && yearTest % 100 != 0){
            LASTOFMONTH = 29;
        }else LASTOFMONTH = 28;
        return LASTOFMONTH;
    }

}
