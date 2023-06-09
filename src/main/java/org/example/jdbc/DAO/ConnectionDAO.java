package org.example.jdbc.DAO;


public class ConnectionDAO {
    public void addConnection(int studentID, int courseId, int grade) {

        PersonDAO personDAO = new PersonDAO();
        CourseDAO groupDAO = new CourseDAO();
        if (!isConnectionPresent(studentID, courseId)) {
            String updateQuery = "INSERT INTO `jdbc-v`.`connection` (`studentID`, `studentName`, `courseId`, `courseName`, `grade`, `conId`) VALUES ('" + studentID
                    + "', '" + personDAO.getPersonNameById(studentID)
                    + "', '" + courseId
                    + "', '" + groupDAO.getCourseNameById(courseId)
                    + "', '" + grade
                    + "', '" + (getNextId()) + "');";

            CommonDAO.execute(updateQuery);
        }
    }

    public static int getNextId() {
        String query = "SELECT COUNT(*) as count_connections from `jdbc-v`.`connection`;";
        return CommonDAO.getNext(query);
    }

    public static boolean isConnectionPresent(int studentID, int courseID) {
        String query = "SELECT count(*) from `jdbc-v`.`connection` where studentID=" + studentID + " and courseID=" + courseID + ";";
        return CommonDAO.getInt(query) > 0;
    }

}
