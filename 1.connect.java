public class Program {
    public static void main(String[] args) throws SQLException {
      
        Class.forName("com.mysql.jdbc.Driver"); //can be omitted
      
        String url = "jdbc:mysql://localhost:3306/test";
        Connection con = DriverManager.getConnection(url,"root","xogh7149@@");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from employee");
        while(rs.next()){
            System.out.println(rs.getString("name"));

        }
        rs.close();
        st.close();
        con.close();
    }
}
