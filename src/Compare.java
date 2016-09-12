import java.util.ArrayList;

/**
 * Created by Joanna Parkhurst on 7/17/2015.
 */
public class Compare {
    public ArrayList<Integer> avgArray;

    /**
     * Class takes in an array of black/white values to compare to templates
     * @param a
     */
    public Compare(ArrayList<Integer> a) {
        avgArray = a;
    }

    /**
     * Turns an array of black/white values into a string of length 100
     * O(100) --> O(1)
     * @return the value String "output"
     */
    public String turnIntoString() {
        String output = "";
        for (int i = 0; i < avgArray.size(); i++) {
            //String zeroOrOne = (String) a.get(i);
            output = output + avgArray.get(i);
        }
        return output;
    }

    /**
     * Iterates through each template, then each character in template
     * O(n^2)
     * @param toTest the testing images' black/white value string
     * @return an array of each template's
     */
    public ArrayList<Integer> findMatches (String toTest) {
        char[] testing = toTest.toCharArray();
        Templates template = new Templates();
        ArrayList<Integer> accurate = new ArrayList<>();
        ArrayList<String> templates = template.getTemplateArray();
        for (String i : templates) {
            int accuracyCounter = 0;
            char[] templateChar = i.toCharArray();
            for (int x = 0; x < 100; x++) {
                if (testing[x] == templateChar[x]) {
                    accuracyCounter++;
                }
            }
            accurate.add(accuracyCounter);
        }
        return accurate;
    }

    /**
     * returns the number that best matches the image to templates
     * @param accuracies , an array of accuracies for each template
     * @return the estimated numeric value from the image
     */
    public Integer bestMatch(ArrayList<Integer> accuracies) {
        int maxAccuracy = 0;
        int maxAccuracyIndex = 0;
        for (int n = 0; n < accuracies.size(); n++) {
            if (accuracies.get(n) > maxAccuracy) {
                maxAccuracy = accuracies.get(n);
                maxAccuracyIndex = n;
            }
        }
        int answer = maxAccuracyIndex % 10;
        return answer;
    }
}
