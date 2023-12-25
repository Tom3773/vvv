public class Main {
    public static void main(String[] args) {
        String [] total = {"3:1", "1:2", "3:3", "1:0"};
        int team1 =0;
        int team2=0;
        for (String s : total) {
            char a = s.charAt(0);
            char b = s.charAt(2);
            if (a>b){
                team1 += 3;
            } else if (a<b){
                team2 += 3;
            } else if (a == b){
                team1 +=1;
                team2 +=1;
            }
        }
        System.out.println(team1);
        System.out.println(team2);
    }
}
