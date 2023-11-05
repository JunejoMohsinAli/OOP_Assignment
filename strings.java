public class strings {
    public static void main(String[] args) {
//Uncomment slashes from only one set of string to access.
//Set 1:
        //String studentData = "John:85, Alice:92, Bob:78, Carol:95, David:88, Emma:79, Frank:90";
//Set 2:
        String studentData = "Mohsin:95, Ali:80, Aftab:50, Aleeza:86, Farhat:80, Aamir:75";
//Set 3:
        //String studentData = "Ali Zaib:93, Mohsin Junejo:51, Aamir:63, Abdullah Siddiqui:58, Asad:86";
//Split the string
        String[] studentRecords = studentData.split(", ");
//Create arrays to store student names and marks
        String[] studentNames = new String[studentRecords.length];
        int[] studentScores = new int[studentRecords.length];
//Set the arrays with data from the split records
        for (int i = 0; i < studentRecords.length; i++) {

            String[] parts = studentRecords[i].split(":");
            studentNames[i] = parts[0];
            studentScores[i] = Integer.parseInt(parts[1]);
        }
//Calculate total students
        int totalStudents = studentNames.length;
//Set variables to store the other calculations
        int totalScore = 0;
        int highestScore = Integer.MIN_VALUE;
        int lowestScore = Integer.MAX_VALUE;
        String studentWithHighestScore = "";
        String studentWithLowestScore = "";
//Calculate Highest & Lowest score
        for (int i = 0; i < studentScores.length; i++){

            int score = studentScores[i];
            totalScore += score;
            if (score > highestScore){
                highestScore = score;
                studentWithHighestScore = studentNames[i];
            }
            if (score < lowestScore){
                lowestScore = score;
                studentWithLowestScore = studentNames[i];
            }
        }
//Calculate Average
        float averageScore = (float) totalScore / totalStudents;
//Display all the calculations
        System.out.println("\nThe total number of students: " + totalStudents);
        System.out.println("The average Marks of all students: " + averageScore);
        System.out.println("The highest Marks Student: " + studentWithHighestScore + " with " + highestScore + " Marks");
        System.out.println("The lowest Marks Student: " + studentWithLowestScore + " with " + lowestScore + " Marks ");
    }
}
