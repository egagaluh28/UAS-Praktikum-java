import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Produk {
    private int id;
    private String kodeProduk;
    private String nama;
    private double harga;

    public Produk(int id, String kodeProduk, String nama, double harga) {
        this.id = id;
        this.kodeProduk = kodeProduk;
        this.nama = nama;
        this.harga = harga;
    }

    // Getters and setters

    public static void main(String[] args) {
        // Koneksi ke database
        String url = "jdbc:postgresql://localhost:5432/UASPBO";
        String username = "12345678";
        String password = "postgres";

        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Koneksi sukses!");

            // Ambil data produk dari database
            String sql = "SELECT * FROM Produk";
            PreparedStatement statement = conn.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            // Tampilkan data produk
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String kodeProduk = resultSet.getString("kode_produk");
                String nama = resultSet.getString("nama_produk");
                double harga = resultSet.getDouble("harga");

                Produk produk = new Produk(id, kodeProduk, nama, harga);
                System.out.println(produk);
            }

            // Tutup koneksi
            resultSet.close();
            statement.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println("Koneksi gagal: " + e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "Produk [id=" + id + ", kodeProduk=" + kodeProduk + ", nama=" + nama + ", harga=" + harga + "]";
    }
}
