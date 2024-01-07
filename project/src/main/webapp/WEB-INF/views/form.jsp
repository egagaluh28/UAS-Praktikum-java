<!DOCTYPE html>
<html>
  <head>
    <title>Admin</title>
    <style>
      body {
        margin: 0;
        padding: 20px;
      }

      .form-container {
        border: 1px solid black;
        padding: 20px;
      }

      h2 {
        position: absolute;
        margin-top: -35px;
        background-color: white;
        padding: 0 10px;
      }

      label {
        display: block;
        font-weight: bold;
      }

      input[type="text"],
      textarea {
        width: 30%;
        padding: 10px;
        border: 1px solid #949494;
        border-radius: 4px;
      }

      input[type="file"] {
        padding: 5px;
      }

      input[type="submit"] {
        background-color: #4caf50;
        color: #fff;
        padding: 10px 20px;
        border: none;
        border-radius: 4px;
        cursor: pointer;
      }

      input[type="submit"]:hover {
        background-color: #45a049;
      }

      .button {
        text-decoration: none;
        color: black;
      }
      
    </style>
  </head>
  <body>
    <h1>Produk</h1>
    <div class="form-container">
      <h2>Form Produk</h2>
      <form action="/save" method="POST">
        <label for="Kode">Kode:</label>
        <input type="text" id="kode" name="kode" required/><br /><br />

        <label for="name">Nama:</label>
        <input type="text" id="nama" name="nama" required/><br /><br />

        <label for="harga">Harga:</label>
        <input type="number" id="harga" name="harga" required/><br /><br />

        <button type="submit">Tambah</button>
        <button class="button"><a href="/" class="button">Batal</a></button>

      </form>
    </div>
  </body>
</html>
