import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Menghapus_data {
    private String url = "jdbc:postgresql://localhost:5432/nama_database";
    private String username = "nama_pengguna";
    private String password = "kata_sandi";

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
