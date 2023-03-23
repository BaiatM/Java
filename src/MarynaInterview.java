import java.util.*;

public class MarynaInterview {
    /**
     * // A => B => C => ERROR
     * // A => C => B => no error
     * // C => B => A => no error
     * // A => B => B => C => no error
     * // Create a function that outputs all the users who experienced the error.
     * // Logs are in chronological order from when they occurred
     */
    public static void main(String[] args) {
        //Format: {"Action:UserID", "Action:UserID", …}
        String[] logs = {"A:1",
                "A:1",
                "A:2",
                "A:3",
                "A:1",
                "B:1",
                "B:1",
                "B:2",
                "B:3",
                "A:3",
                "C:3",
                "C:2",
                "C:1",
                "B:1",
                "C:1"
        };
        List<Integer> result = checkError(logs);

        System.out.println(result);
    }
    public static List<Integer> checkError(String[] logs) {
        Map<Integer, List<Character>> userActions = new HashMap<>();
        Set<Integer> errorUsers = new HashSet<>();
        for (String log : logs) {
            char action = log.charAt(0);
            int userId = Integer.parseInt(log.substring(2));
            List<Character> actions = userActions.getOrDefault(userId, new ArrayList<>());
            actions.add(action);
            userActions.put(userId, actions);
            if (actions.size() >= 3 && actions.get(actions.size() - 3) == 'A' && actions.get(actions.size() - 2) == 'B' && actions.get(actions.size() - 1) == 'C') {
                errorUsers.add(userId);
            }
        }
        return new ArrayList<>(errorUsers);
    }
}
