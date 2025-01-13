package SQL_homework_4;

import java.sql.*;
import java.util.Scanner;

public class ConnectionToDB {

    private static final String SELECT_STUDENTS_TABLE =
            "select * from students1";
    private static final String CONNECTION_STRING = "jdbc:postgresql://localhost:5432/employee_info";
    private static final String USER = "postgres";
    private static final String PASSWORD = "0802";

    private static final String PREPARED_INSERT_INTO_STUDENTS_TABLE =
            "insert into students1 (name, age, grade) values (?, ?, ?)";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
            System.out.println("Insert student name : ");
            String name = scanner.nextLine();

            System.out.println("Insert student age : ");
            int age = scanner.nextInt();

           System.out.println("Insert student grade :");
           int grade = scanner.nextInt();

           insertStudent(name, age, grade);

        try {
            Connection conn = ConnectionToDataBase.getInstance(CONNECTION_STRING, USER, PASSWORD);
            Statement stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery(SELECT_STUDENTS_TABLE);
            ResultSetMetaData rsmd = rs.getMetaData();

            String[] columnLabels = new String[rsmd.getColumnCount()];
            for (int i = 0; i != columnLabels.length; i++) {
                columnLabels[i] = rsmd.getColumnName(i + 1);
            }
            while (rs.next()) {
                for (String element : columnLabels) {
                    System.out.println(element + "\t:\t" + rs.getString(element));
                }
                System.out.println("----------------");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void insertStudent(String name, int age, int grade) {


            try {
                PreparedStatement preparedStatement = ConnectionToDataBase.getInstance(CONNECTION_STRING, USER, PASSWORD).prepareStatement(PREPARED_INSERT_INTO_STUDENTS_TABLE);

                preparedStatement.setString(1, name);
                preparedStatement.setInt(2, age);
                preparedStatement.setInt(3, grade);

                System.out.println("UPDATE STUDENT ROWS: " + preparedStatement.executeUpdate());

            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }