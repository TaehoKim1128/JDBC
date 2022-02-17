Transaction: 하나의 단위로 수행되길 바라는 쿼리의 묶음 A set of queries you want to execute as a unit

public class Program {
    public static void main(String[] args) throws SQLException {
        
        String url = "jdbc:mysql://localhost:3306/test";
        Connection con = DriverManager.getConnection(url,"root","xogh7149@@");
        Statement st = con.createStatement();
        String sql = "insert into employee (name,pub,salary) values('Test',1,170)";
        int n = st.executeUpdate(sql);
        System.out.println(n);

        st.close();
        con.close();
        
        // Using prepared statement 
        
        String url = "jdbc:mysql://localhost:3306/test";
        Connection con = DriverManager.getConnection(url,"root","xogh7149@@");
        String sql = "insert into employee (name,pub,salary) values(?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1,"Hi");           //start from 1
        ps.setBoolean(2,true);
        ps.setInt(3,130);
        ps.executeUpdate();
        
        ps.close();
        con.close();

    }
}
