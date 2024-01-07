//Muhammad Galuh Gumelar
//J0403221017
//TPLB1

package com.example.project.controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.project.models.Admin;

@Controller
public class AdminController {
    private String url = "jdbc:postgresql://localhost:5432/tbl_produk";
    private String user = "12345678";
    private String password = "postgres";

    private String connStatus = "Disconnected";
    private String connMessage = "";

    Connection conn;
    java.sql.Statement stmnt;
    String sql;
 
    @RequestMapping("/")
    public String index(org.springframework.ui.Model model) {
        try {
            Class.forName("org.postgresql.Driver");

            conn = DriverManager.getConnection(url, user, password);

            connStatus = "Connected";

            stmnt = conn.createStatement();

            sql = "SELECT * FROM public.tblproduk";

            ResultSet rs = stmnt.executeQuery(sql);

            List<Admin> data = new LinkedList<>();

            while (rs.next()) {
                Admin adm = new Admin();

                adm.setKode(rs.getString("kode"));
                adm.setNama(rs.getString("nama"));
                adm.setHarga(rs.getInt("harga"));

                data.add(adm);
            }

            model.addAttribute("data", data);
        } catch (Exception e) {
            // TODO: handle exception
            connMessage = e.getMessage();
        }

        model.addAttribute("connStatus", connStatus);
        model.addAttribute("connMessage", connMessage);

        return "index";
    }

    @RequestMapping("/form")
    public String add() {
        return "form";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(Admin adm, Model model) {
        try {
            Class.forName("org.postgresql.Driver");

            conn = DriverManager.getConnection(url, user, password);
            
            connStatus = "Connected";
            stmnt = conn.createStatement();
            sql = "INSERT INTO public.tblproduk (kode, nama, harga) VALUES ('"
                    + adm.getKode() + "', '" + adm.getNama() + "', '"
                    + adm.getHarga() + "')";
            stmnt.execute(sql);

        } catch (Exception e) {
            connMessage = e.getMessage();
        }

        model.addAttribute("connStatus", connStatus);
        model.addAttribute("connMessage", connMessage);

        return "redirect:/";
    }

    @RequestMapping("/delete")
    public String delete(Model model, @RequestParam String kode) {
        try {
            Class.forName("org.postgresql.Driver");

            conn = DriverManager.getConnection(url, user, password);

            connStatus = "Connected";

            stmnt = conn.createStatement();

            sql = "DELETE FROM public.tblproduk WHERE kode='"+kode+"'";

            stmnt.execute(sql);
        } catch (Exception e) {
            // TODO: handle exception
            connMessage = e.getMessage();
        }

        model.addAttribute("connStatus", connStatus);
        model.addAttribute("connMessage", connMessage);
        
        return "redirect:/";
    }

    @RequestMapping("/delete-alldata")
    public String deletealldata(Model model) {
        try {
            Class.forName("org.postgresql.Driver");

            conn = DriverManager.getConnection(url, user, password);

            connStatus = "Connected";

            stmnt = conn.createStatement();

            sql = "DELETE FROM public.tblproduk";

            stmnt.execute(sql);
        } catch (Exception e) {
            // TODO: handle exception
            connMessage = e.getMessage();
        }

        model.addAttribute("connStatus", connStatus);
        model.addAttribute("connMessage", connMessage);
        
        return "redirect:/";
    }
    


}
