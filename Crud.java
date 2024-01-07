import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Crud {
    private String url = "jdbc:postgresql://localhost:5432/UASPBO";
    private String username = "12345678";
    private String password = "postgres";

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

    public void tambahProduk(String kode, String nama, double harga) {
        try (Connection connection = DriverManager.getConnection(url, username, password);
             Statement statement = connection.createStatement()) {

            String query = "INSERT INTO Produk (kode_produk, nama_produk, harga) VALUES ('" + kode + "', '" + nama + "', " + harga + ")";
            statement.executeUpdate(query);

            System.out.println("Produk berhasil ditambahkan.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void hapusProduk(int id) {
        try (Connection connection = DriverManager.getConnection(url, username, password);
             Statement statement = connection.createStatement()) {

            String query = "DELETE FROM Produk WHERE id = " + id;
            statement.executeUpdate(query);

            System.out.println("Produk berhasil dihapus.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
