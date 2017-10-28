package exercise.company_rooster;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Department> departments = new HashMap<>();

        int n = Integer.valueOf(reader.readLine());

        for (int i = 0; i < n; i++) {
            String[] employeesInfo = reader.readLine().split("\\s+");
            String name = employeesInfo[0];
            double salary = Double.valueOf(employeesInfo[1]);
            String position = employeesInfo[2];
            String dep = employeesInfo[3];
            int age = -1;
            String email = "n/a";

            if (employeesInfo.length == 5) {
                try {
                    age = Integer.parseInt(employeesInfo[4]);
                }
                catch (Exception e) {
                    email = employeesInfo[4];
                }
            }
            else if (employeesInfo.length == 6) {
                email = employeesInfo[4];
                age = Integer.valueOf(employeesInfo[5]);
            }

            Employee employee = new Employee(name, salary, position, dep, email, age);
            Department department = new Department(dep);
            if (!departments.containsKey(dep)) {
                department.getEmployees().add(employee);
                departments.put(dep, department);
            }
            else {
                departments.get(dep).getEmployees().add(employee);
            }
        }

        print(departments);


    }

    private static void print(HashMap<String, Department> departments) {
        System.out.print("Highest Average Salary: ");

        Map<String, Department> sorted = departments.entrySet().stream()
                .sorted((x, y) ->
                            Double.compare(y.getValue().getAverageSalary(), x.getValue().getAverageSalary()))
                .limit(1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (v1, v2) -> v1, HashMap::new));

        for (Map.Entry<String, Department> departmentEntry : departments.entrySet()) {
            System.out.print(departmentEntry.getKey());
            System.out.println();
            departmentEntry.getValue().getEmployees().stream()
                    .sorted((x, y) ->
                                Double.compare(y.getSalary(), x.getSalary()))
                    .forEach(System.out::println);
            return;
        }
    }

//    private static HashMap<String, Department> sortDepartments(HashMap<String, Department> departments) {
//        HashMap<String, Department> sortedDepartments = departments.entrySet().stream()
//                .sorted((x, y) ->
//                        Double.compare(y.getValue().getAverageSalary(),
//                                x.getValue().getAverageSalary()))
//                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (v1, v2) -> v1, HashMap::new));
//        return sortedDepartments;
//    }
}
