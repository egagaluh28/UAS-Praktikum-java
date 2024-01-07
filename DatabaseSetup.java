import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DatabaseSetup {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/nama_database";
        String username = "nama_pengguna";
        String password = "kata_sandi";

        try (Connection connection = DriverManager.getConnection(url, username, password);
             Statement statement = connection.createStatement()) {

            // Membuat tabel Produk
            String createProdukTable = "CREATE TABLE Produk (" +
                    "id SERIAL PRIMARY KEY," +
                    "kode_produk VARCHAR(255) NOT NULL," +
                    "nama_produk VARCHAR(255) NOT NULL," +
                    "harga DECIMAL(10, 2) NOT NULL" +
                    ")";
            statement.executeUpdate(createProdukTable);

            // Membuat tabel Admin
            String createAdminTable = "CREATE TABLE Admin (" +
                    "id SERIAL PRIMARY KEY," +
                    "username VARCHAR(255) NOT NULL," +
                    "password VARCHAR(255) NOT NULL" +
                    ")";
            statement.executeUpdate(createAdminTable);

            System.out.println("Database dan tabel berhasil dibuat.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
