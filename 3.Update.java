public class Program {
    public static void main(String[] args) throws SQLException {
        
        String url = "jdbc:mysql://localhost:3306/test";
        Connection con = DriverManager.getConnection(url,"root","xogh7149@@");
        String sql = "update employee set name = ?,pub=?,salary=? where id = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1,"Test");
        ps.setBoolean(2,false);
        ps.setInt(3,70);
        ps.setInt(4,8);
        ps.executeUpdate();
        
        ps.close();
        con.close();

    }
}
