class Solution {
    private int calDOY(String day , int[] sum){
        int month = Integer.parseInt(day.substring(0,2));
        int date = Integer.parseInt(day.substring(3));
        return sum[month -1] + date;
    }
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int[] dom ={31,28,31,30,31,30,31,31,30,31,30,31};
        int[] Sum = new int[13];
        for(int i = 0;i <12 ;i++){
            Sum[i+1] = Sum[i] + dom[i];
        }
        int arriveADay = calDOY(arriveAlice , Sum);
        int leaveADay = calDOY(leaveAlice ,Sum);
        int arriveBDay = calDOY(arriveBob , Sum);
        int leaveBDay = calDOY(leaveBob,Sum);
        return Math.max(0, Math.min(leaveADay, leaveBDay) - Math.max(arriveADay, arriveBDay) +1);

    }
}