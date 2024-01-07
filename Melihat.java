import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Melihat {
    private String url = "jdbc:postgresql://localhost:5432/nama_database";
    private String username = "nama_pengguna";
    private String password = "kata_sandi";

    public void displayProduk() {
        try (Connection connection = DriverManager.getConnection(url, username, password);
             Statement statement = connection.createStatement()) {

            String query = "SELECT * FROM Produk";
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String kodeProduk = resultSet.getString("kode_produk");
                String namaProduk = resultSet.getString("nama_produk");
                double harga = resultSet.getDouble("harga");

                System.out.println("ID: " + id);
                System.out.println("Kode Produk: " + kodeProduk);
                System.out.println("Nama Produk: " + namaProduk);
                System.out.println("Harga: " + harga);
                System.out.println("---------------------------");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
