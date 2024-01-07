<%@ page import="java.util.List" %>
<%@ page import="com.example.project.models.Admin" %>
<% 
    List<Admin> d = (List<Admin>) request.getAttribute("data");
%>

<!DOCTYPE html>
<html>
  <head>
    <title>Daftar Produk</title>
    <style>
      table {
        margin-top: 1rem;
        border-collapse: collapse;
        width: 100%;
      }
      th,
      td {
        border: 1px solid black;
        padding: 8px;
      }

      th {
        background-color: #f2f2f2;
        font-weight: bold;
      }

      .button {
        padding: 3px 10px;
        text-decoration: none;
        color: black;
      }

      .button:hover {
        background-color: #b7b7b7;
        text-decoration: none;
      }
    </style>
  </head>
  <body>
    <h1>Produk</h1>
    <a href="/form"><button class="button">Tambah Produk</button></a>
    <a href="/delete-alldata"><button class="button">Hapus Semua</button></a>
    <table id="/delete-alldata">
      <tr>
        <th>No.</th>
        <th>Kode</th>
        <th>Nama</th>
        <th>Harga</th>
        <th></th>
      </tr>
      <tbody>
        <% for (int i = 0; i < d.size(); i++){ %>
            <tr>
                <td><%= i+1 %></td>
                <td><%= d.get(i).getKode() %></td>
                <td><%= d.get(i).getNama() %></td>
                <td><%= d.get(i).getHarga() %></td>
                <td>
                    <button class="button"><a href="/delete?kode=<%= d.get(i).getKode() %>" onclick="return confirm('Apakah anda yakin untuk menghapus data ?')"class="button">Delete</a></button>
                </td>
            </tr>
        <% } %>
    </tbody>
    </table>
  </body>
</html>
