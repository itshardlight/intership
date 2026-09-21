package Dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ListExample {

    public static void main(String[] args) {

        List<Object[]> dataList = Arrays.asList(

                // Student 1 - Unish
                new Object[] { 1, "Unish", "Computer", 1 },
                new Object[] { 1, "Unish", "Math", 1 },
                // Unish absent in Science -> no row

                // Student 2 - Ramesh
                new Object[] { 2, "Ramesh", "Math", 1 },
                new Object[] { 2, "Ramesh", "Science", 1 },
                new Object[] { 2, "Ramesh", "Computer", 1 },

                // Student 3 - Sita
                new Object[] { 1, "Ramesh", "Science", 1 },
                new Object[] { 1, "Ramesh", "Computer", 1 },
                // Sita absent in Math -> no row

                // Student 4 - Anish
                new Object[] { 2, "Unish", "English", 1 },
                new Object[] { 2, "Unish", "Computer", 1 },
                new Object[] { 2, "Unish", "Math", 1 },

                // Student 5 - Puja
                new Object[] { 1, "Puja", "Computer", 1 },
                new Object[] { 1, "Puja", "English", 1 });

        List<String> nameList = new ArrayList<>();
        List<String> subList = new ArrayList<>();
        List<String> stuList = new ArrayList<>();
        List<Integer> clasList = new ArrayList<>();
        HashMap<String, List<String>> studentSub = new HashMap<>();
        HashMap<String, List<Object[]>> finalMap = new HashMap<>();
        HashMap<Integer, Integer> totalMarks = new HashMap<>();

        // distint subject
        subList = dataList.stream().map(a -> (String) a[2]).distinct().collect(Collectors.toList());
        // distinct student
        stuList = dataList.stream().map(a -> (String) a[1]).distinct().collect(Collectors.toList());
        // distinct class
        clasList = dataList.stream().map(a -> (Integer) a[0]).distinct().collect(Collectors.toList());

        // here we sorted the sub for each student
        for (String student : stuList) {
            List<String> subjectList = new ArrayList<>();
            subjectList = dataList.stream().filter(a -> ((String) a[1]).equals(student)).map(a -> String.valueOf(a[2]))
                    .distinct()
                    .collect(Collectors.toList());
            studentSub.put(student, subjectList);

        }

        for (Integer classNo : clasList) {
            for (String studentName : stuList) {
                List<String> SubjectList = studentSub.get(studentName);
                for (String subName : subList) {
                    String key = classNo.toString() + studentName + subName;
                    List<Object[]> test = dataList.stream()
                            .filter(a -> ((Integer) a[0]) == classNo && ((String) a[1]).equalsIgnoreCase(studentName)
                                    && ((String) a[2]).equalsIgnoreCase(subName))
                            .collect(Collectors.toList());
                    if (test.isEmpty()) {
                        test.add(new Object[] { classNo, studentName, subName, 0 });
                    }

                    Integer totalmarks = 0;
                    for (Object[] row : test) {
                        Integer marks = (Integer) row[3];
                        totalmarks += marks;
                    }
                    System.out.println(totalmarks);
                    finalMap.put(key, test);

                }
            }

        }


        // clasList.forEach(System.out::println);
        // stuList.forEach(System.out::println);
        // subList.forEach(System.out::println);

        // System.out.println("This is hash map");
        // studentSub.forEach((student, subjects) -> {
        // System.out.println(student + " : " + subjects);
        // });

        // for (Map.Entry<String, List<Object[]>> entry : finalMap.entrySet()) {
        // System.out.println("Key: " + entry.getKey());

        // for (Object[] arr : entry.getValue()) {
        // System.out.println(Arrays.toString(arr));
        // }
        // }

    }
  

}