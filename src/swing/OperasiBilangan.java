package swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.management.PlatformLoggingMXBean;

public class OperasiBilangan extends JFrame{
    private JTextField put1;
    private JTextField put2;
    private JButton btnTambah;
    private JButton btnKurang;
    private JButton btnKali;
    private JButton btnBagi;
    private JButton btnDoAll;
    private JPanel myFrame;
    private JLabel lblInfo;
    private JLabel lblInput1;
    private JLabel lblInput2;
    private JLabel lblHasil1;
    private JLabel lblHasil2;
    private JLabel lblHasil3;
    private JLabel lblHasil4;

    private OperasiBilangan(){
        ImageIcon images = new ImageIcon("UNSRI.png");
        setIconImage(images.getImage());

        setTitle("Kalkulator PARUQ");
        setSize(350,350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        setContentPane(myFrame);

        try {
            btnTambah.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    double input1 = Double.parseDouble(put1.getText());
                    double input2 = Double.parseDouble(put2.getText());

                    lblHasil1.setText("Hasil: " + (input1 + input2));
                }
            });
            btnKurang.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    double input1 = Double.parseDouble(put1.getText());
                    double input2 = Double.parseDouble(put2.getText());

                    lblHasil1.setText("Hasil: " + (input1 - input2));
                }
            });
            btnKali.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    double input1 = Double.parseDouble(put1.getText());
                    double input2 = Double.parseDouble(put2.getText());

                    lblHasil1.setText("Hasil: " + (input1 * input2));
                }
            });
            btnBagi.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    double input1 = Double.parseDouble(put1.getText());
                    double input2 = Double.parseDouble(put2.getText());

                    lblHasil1.setText("Hasil: " + (input1 / input2));
                }
            });
            btnDoAll.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    double input1 = Double.parseDouble(put1.getText());
                    double input2 = Double.parseDouble(put2.getText());

                    lblHasil1.setText("Hasil: " + (input1 + input2));
                    lblHasil2.setText("Hasil: " + (input1 - input2));
                    lblHasil3.setText("Hasil: " + (input1 * input2));
                    lblHasil4.setText("Hasil: " + (input1 / input2));

                }
            });
        }catch (NumberFormatException ex){
            lblHasil1.setText("Hasil: Input anda salah.");
        }
    }

    public static void main(String[] args) {
        OperasiBilangan frameUtama = new OperasiBilangan();
    }
}
