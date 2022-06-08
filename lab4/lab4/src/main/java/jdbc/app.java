package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import servlet.CRUDInterface;
import sneakers.Sneakers;

public class app {
	
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		CRUDInterface crud = new SqlCRUD();
		Connection connection = new Connect().getCon();


		List<Sneakers> list = new ArrayList<>();

		try (Statement st = connection.createStatement(); ResultSet rs = st.executeQuery("SELECT * FROM Sneakers;");) {
			while (rs.next()) {
				list.add(new Sneakers(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(list);

	}

}
