import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Menambah_data {
    private String url = "jdbc:postgresql://localhost:5432/nama_database";
    private String username = "nama_pengguna";
    private String password = "kata_sandi";

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
}
