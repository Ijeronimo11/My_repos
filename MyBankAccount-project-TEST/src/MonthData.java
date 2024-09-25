public class MonthData {
    int[]days = new int[30];
    private int goalByMoneyMonth = 100000;

    public void printDaysAndMoneyFromMonth() {
        for (int i = 0; i < days.length; i++) {
            System.out.println((i + 1) + " день: " + days[i]);
        }
    } //Вывод всех сумм за каждый день
    public int sumMoneyFromMonth() {
        int sumMoney = 0;
        for (int i = 0; i < days.length; i++) {
            sumMoney += days[i];
        }
        return sumMoney;
    } //Вывод общей суммы за месяц
    public int maxMoney() {
        int maxMoney = 0;
        for (int i = 0; i < days.length; i++) {
            if (days[i] > maxMoney) {
                maxMoney = days[i];
            }
        }
        return maxMoney;
    } //Вывод максимальной отложенной суммы за месяц
    int bestSeries(int goalByMoneyMonth) {

    }
}
