package org.example.jdbc.DAO;


public class ConnectionDAO {
    public void addConnection(int studentID, int courseId, int grade) {

        PersonDAO personDAO = new PersonDAO();
        CourseDAO groupDAO = new CourseDAO();
        String updateQuery = "INSERT INTO `jdbc-v`.`connection` (`studentID`, `studentName`, `courseId`, `courseName`, `grade`, `conId`) VALUES ('" + studentID
                + "', '" + personDAO.getPersonNameById(studentID)
                + "', '" + courseId
                + "', '" + groupDAO.getCourseNameById(courseId)
                + "', '" + grade
                + "', '" + (getNextId()) + "');";

        CommonDAO.execute(updateQuery);
    }

    public static int getNextId() {
        String query = "SELECT COUNT(*) as count_connections from `jdbc-v`.`connection`;";
        return CommonDAO.getInt(query);
    }

}
