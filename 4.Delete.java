public class Program {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/test";
        Connection con = DriverManager.getConnection(url,"root","xogh7149@@");
        String sql = "delete from employee where id = ?";
        PreparedStatement ps = con.prepareStatement(sql);

        ps.setInt(1,8);
        int n = ps.executeUpdate();
        System.out.println(n);

        ps.close();
        con.close();

    }
}
