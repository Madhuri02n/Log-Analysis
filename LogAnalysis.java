import java.io.*;
import java.util.*;
public class LogAnalysis {
    public static void main(String[] args) throws Exception {
        HashMap<String, Integer> userCount = new HashMap<>();
        HashMap<String, Integer> actionCount = new HashMap<>();
        BufferedReader br = new BufferedReader(new FileReader("logs.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            String[] parts = line.split(",");
            String user = parts[1];
            String action = parts[2];
            userCount.put(user, userCount.getOrDefault(user, 0) + 1);
            actionCount.put(action, actionCount.getOrDefault(action, 0) + 1);
        }
        br.close();
        String mostActiveUser = "";
        int maxUserActions = 0;
        for (String user : userCount.keySet()) {
            if (userCount.get(user) > maxUserActions) {
                maxUserActions = userCount.get(user);
                mostActiveUser = user;
            }
        }
        String mostCommonAction = "";
        int maxActionCount = 0;
        for (String action : actionCount.keySet()) {
            if (actionCount.get(action) > maxActionCount) {
                maxActionCount = actionCount.get(action);
                mostCommonAction = action;
            }
        }

        System.out.println("Most Active User: " + mostActiveUser);
        System.out.println("Most Common Action: " + mostCommonAction);
    }
}
