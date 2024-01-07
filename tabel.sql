-- Membuat database
CREATE DATABASE index;

-- Menggunakan database
USE index;

-- Membuat tabel Produk
CREATE TABLE Produk (
  id INT PRIMARY KEY AUTO_INCREMENT,
  kode_produk VARCHAR(255) NOT NULL,
  nama_produk VARCHAR(255) NOT NULL,
  harga DECIMAL(10, 2) NOT NULL
);

-- Membuat tabel Admin
CREATE TABLE Admin (
  id INT PRIMARY KEY AUTO_INCREMENT,
  username VARCHAR(255) NOT NULL,
  password VARCHAR(255) NOT NULL
);
