package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.NumberFormat;
import java.util.Locale;

public class KuponTransfer extends JFrame{
    private JPanel myFrame;
    private JTextField txNama;
    private JRadioButton rad3Bulan;
    private JRadioButton rad1Bulan;
    private JRadioButton rad12Bulan;
    private JCheckBox boxKetentuan;
    private JButton btnMulai;
    private JLabel lblInfo;
    private JLabel lblHasil1;
    private JLabel lblHasil2;
    private JLabel lblHasil3;

    private final ButtonGroup buttonLangganan = new ButtonGroup();

    private KuponTransfer(){
        buttonLangganan.add(rad1Bulan);
        buttonLangganan.add(rad3Bulan);
        buttonLangganan.add(rad12Bulan);

        ImageIcon images = new ImageIcon("UNSRI.png");
        setIconImage(images.getImage());

        setTitle("Kupon Berlangganan PARUQ");
        setSize(500,500);
        setVisible(true);
        setResizable(false);

        setContentPane(myFrame);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /*myFrame.setBackground(Color.darkGray);
        btnMulai.setBackground(new Color(59, 128, 125));
        rad1Bulan.setBackground(new Color(59, 128, 125));
        rad3Bulan.setBackground(new Color(59, 128, 125));
        rad12Bulan.setBackground(new Color(59, 128, 125));
        txNama.setBackground(new Color(59, 128, 125));
        boxKetentuan.setBackground(new Color(59, 128, 125));
        */

        txNama.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
        boxKetentuan.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
        btnMulai.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
        lblHasil1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
        lblHasil2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
        lblHasil3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
        lblInfo.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));

        rad1Bulan.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
        rad3Bulan.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
        rad12Bulan.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));

        btnMulai.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = "";
                double harga = 0;
                if(!txNama.getText().isEmpty() && boxKetentuan.isSelected() && buttonLangganan.getSelection() != null){
                    if(rad1Bulan.isSelected()){
                        nama = "1 Bulan";
                        harga = 150000;
                    }if(rad3Bulan.isSelected()){
                        nama = "3 Bulan";
                        harga = 400000;
                    }if(rad12Bulan.isSelected()){
                        nama = "12 Bulan";
                        harga = 1500000;
                    }

                    NumberFormat hargaGanti = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
                    String currency = hargaGanti.format(harga);

                    String namaPelanggan = txNama.getText();
                    lblHasil1.setText("Selamat " + namaPelanggan + ", Anda berhasil berlangganan " + nama);
                    lblHasil2.setText("Total tagihan anda sebesar " + currency);

                    String nota = lblHasil1.getText() + "\n" + lblHasil2.getText();
                    File outputNota = new File("Nota_Langganan");

                    try{
                        PrintWriter cetak = new PrintWriter(outputNota);
                        cetak.println(nota + "\n");
                        cetak.println("Mohon segera melunasi tagihan.");
                        cetak.close();

                        lblHasil3.setText("Nota berhasil dicetak.");
                    }catch (FileNotFoundException ex){
                        ex.printStackTrace();
                    }
                }else{
                    lblHasil1.setText("Data yang anda input belum lengkap.");
                    lblHasil2.setText("Anda harus menyetujui ketentuan dan syarat yang berlaku.");
                    lblHasil3.setText("Nota gagal untuk di cetak");
                }
            }
        });
    }

    public static void main(String[] args) {
        KuponTransfer myframe = new KuponTransfer();
    }
}
