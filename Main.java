import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Team team = new Team();
        ArrayList<Player> allPlayer = team.getAllTeam();
//        team.show(team.getAllTeam());

        int df = 4;
        int fw = 2;
        int mf = 4;
        ArrayList<Player> choiceTeam = team.buildTeam(df, fw, mf, allPlayer);
        team.show(choiceTeam);
    }
}