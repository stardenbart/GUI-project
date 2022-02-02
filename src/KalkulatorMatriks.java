import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class KalkulatorMatriks extends JFrame{
    private JLabel lblInfo;
    private JLabel lblInput;
    private JTextField input1;
    private JTextField input4;
    private JTextField input2;
    private JTextField input5;
    private JTextField input7;
    private JTextField input8;
    private JTextField input3;
    private JTextField input6;
    private JTextField input9;
    private JLabel lblHasil;
    private JButton PLUSButton;
    private JButton MINUSButton;
    private JButton TIMESButton;
    private JButton DEVButton;
    private JTextField input10;
    private JTextField input11;
    private JTextField input12;
    private JLabel lblHasil1;
    private JLabel lblHasil2;
    private JLabel lblHasil3;
    private JLabel lblHasil4;
    private JLabel lblHasil5;
    private JLabel lblHasil6;
    private JLabel lblHasil7;
    private JLabel lblHasil8;
    private JLabel lblHasil9;
    private JLabel lblHasil10;
    private JLabel lblHasil11;
    private JLabel lblHasil12;
    private JPanel myFrame;
    private JTextField Input1;
    private JTextField Input2;
    private JTextField Input3;
    private JTextField Input4;
    private JTextField Input5;
    private JTextField Input6;
    private JTextField Input10;
    private JTextField Input11;
    private JTextField Input7;
    private JTextField Input8;
    private JTextField Input9;
    private JTextField Input12;
    private JLabel lblInfo1;

    private final ButtonGroup grupTombol = new ButtonGroup();

    private KalkulatorMatriks(){
        ImageIcon images = new ImageIcon("UNSRI.png");
        setIconImage(images.getImage());

        setTitle("Kalkulator Matriks PARUQ");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setContentPane(myFrame);
        setVisible(true);
        setResizable(false);

        setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
        lblInfo.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
        lblInput.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
        lblInfo1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
        lblHasil.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));

        PLUSButton.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
        MINUSButton.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
        TIMESButton.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
        DEVButton.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));


        PLUSButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double input1 = Double.parseDouble(KalkulatorMatriks.this.input1.getText());
                    double input2 = Double.parseDouble(KalkulatorMatriks.this.input2.getText());
                    double input3 = Double.parseDouble(KalkulatorMatriks.this.input3.getText());
                    double input4 = Double.parseDouble(KalkulatorMatriks.this.input4.getText());
                    double input5 = Double.parseDouble(KalkulatorMatriks.this.input5.getText());
                    double input6 = Double.parseDouble(KalkulatorMatriks.this.input6.getText());
                    double input7 = Double.parseDouble(KalkulatorMatriks.this.input7.getText());
                    double input8 = Double.parseDouble(KalkulatorMatriks.this.input8.getText());
                    double input9 = Double.parseDouble(KalkulatorMatriks.this.input9.getText());
                    double input10 = Double.parseDouble(KalkulatorMatriks.this.input10.getText());
                    double input11 = Double.parseDouble(KalkulatorMatriks.this.input11.getText());
                    double input12 = Double.parseDouble(KalkulatorMatriks.this.input12.getText());

                    double Input1 = Double.parseDouble(KalkulatorMatriks.this.Input1.getText());
                    double Input2 = Double.parseDouble(KalkulatorMatriks.this.Input2.getText());
                    double Input3 = Double.parseDouble(KalkulatorMatriks.this.Input3.getText());
                    double Input4 = Double.parseDouble(KalkulatorMatriks.this.Input4.getText());
                    double Input5 = Double.parseDouble(KalkulatorMatriks.this.Input5.getText());
                    double Input6 = Double.parseDouble(KalkulatorMatriks.this.Input6.getText());
                    double Input7 = Double.parseDouble(KalkulatorMatriks.this.Input7.getText());
                    double Input8 = Double.parseDouble(KalkulatorMatriks.this.Input8.getText());
                    double Input9 = Double.parseDouble(KalkulatorMatriks.this.Input9.getText());
                    double Input10 = Double.parseDouble(KalkulatorMatriks.this.Input10.getText());
                    double Input11 = Double.parseDouble(KalkulatorMatriks.this.Input11.getText());
                    double Input12 = Double.parseDouble(KalkulatorMatriks.this.Input12.getText());

                    lblHasil1.setText("" + (input1 + Input1));
                    lblHasil2.setText("" + (input2 + Input2));
                    lblHasil3.setText("" + (input3 + Input3));
                    lblHasil4.setText("" + (input4 + Input4));
                    lblHasil5.setText("" + (input5 + Input5));
                    lblHasil6.setText("" + (input6 + Input6));
                    lblHasil7.setText("" + (input7 + Input7));
                    lblHasil8.setText("" + (input8 + Input8));
                    lblHasil9.setText("" + (input9 + Input9));
                    lblHasil10.setText("" + (input10 + Input10));
                    lblHasil11.setText("" + (input11 + Input11));
                    lblHasil12.setText("" + (input12 + Input12));
                }catch (NumberFormatException ex){
                    lblHasil.setText("Hasil: Harap periksa kembali Input Anda");
                }
            }
        });
        MINUSButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double input1 = Double.parseDouble(KalkulatorMatriks.this.input1.getText());
                    double input2 = Double.parseDouble(KalkulatorMatriks.this.input2.getText());
                    double input3 = Double.parseDouble(KalkulatorMatriks.this.input3.getText());
                    double input4 = Double.parseDouble(KalkulatorMatriks.this.input4.getText());
                    double input5 = Double.parseDouble(KalkulatorMatriks.this.input5.getText());
                    double input6 = Double.parseDouble(KalkulatorMatriks.this.input6.getText());
                    double input7 = Double.parseDouble(KalkulatorMatriks.this.input7.getText());
                    double input8 = Double.parseDouble(KalkulatorMatriks.this.input8.getText());
                    double input9 = Double.parseDouble(KalkulatorMatriks.this.input9.getText());
                    double input10 = Double.parseDouble(KalkulatorMatriks.this.input10.getText());
                    double input11 = Double.parseDouble(KalkulatorMatriks.this.input11.getText());
                    double input12 = Double.parseDouble(KalkulatorMatriks.this.input12.getText());

                    double Input1 = Double.parseDouble(KalkulatorMatriks.this.Input1.getText());
                    double Input2 = Double.parseDouble(KalkulatorMatriks.this.Input2.getText());
                    double Input3 = Double.parseDouble(KalkulatorMatriks.this.Input3.getText());
                    double Input4 = Double.parseDouble(KalkulatorMatriks.this.Input4.getText());
                    double Input5 = Double.parseDouble(KalkulatorMatriks.this.Input5.getText());
                    double Input6 = Double.parseDouble(KalkulatorMatriks.this.Input6.getText());
                    double Input7 = Double.parseDouble(KalkulatorMatriks.this.Input7.getText());
                    double Input8 = Double.parseDouble(KalkulatorMatriks.this.Input8.getText());
                    double Input9 = Double.parseDouble(KalkulatorMatriks.this.Input9.getText());
                    double Input10 = Double.parseDouble(KalkulatorMatriks.this.Input10.getText());
                    double Input11 = Double.parseDouble(KalkulatorMatriks.this.Input11.getText());
                    double Input12 = Double.parseDouble(KalkulatorMatriks.this.Input12.getText());

                    lblHasil1.setText("" + (input1 - Input1));
                    lblHasil2.setText("" + (input2 - Input2));
                    lblHasil3.setText("" + (input3 - Input3));
                    lblHasil4.setText("" + (input4 - Input4));
                    lblHasil5.setText("" + (input5 - Input5));
                    lblHasil6.setText("" + (input6 - Input6));
                    lblHasil7.setText("" + (input7 - Input7));
                    lblHasil8.setText("" + (input8 - Input8));
                    lblHasil9.setText("" + (input9 - Input9));
                    lblHasil10.setText("" + (input10 - Input10));
                    lblHasil11.setText("" + (input11 - Input11));
                    lblHasil12.setText("" + (input12 - Input12));
                }catch (NumberFormatException ex){
                    lblHasil.setText("Hasil: Harap periksa kembali Input Anda");
                }
            }
        });
        TIMESButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double input1 = Double.parseDouble(KalkulatorMatriks.this.input1.getText());
                    double input2 = Double.parseDouble(KalkulatorMatriks.this.input2.getText());
                    double input3 = Double.parseDouble(KalkulatorMatriks.this.input3.getText());
                    double input4 = Double.parseDouble(KalkulatorMatriks.this.input4.getText());
                    double input5 = Double.parseDouble(KalkulatorMatriks.this.input5.getText());
                    double input6 = Double.parseDouble(KalkulatorMatriks.this.input6.getText());
                    double input7 = Double.parseDouble(KalkulatorMatriks.this.input7.getText());
                    double input8 = Double.parseDouble(KalkulatorMatriks.this.input8.getText());
                    double input9 = Double.parseDouble(KalkulatorMatriks.this.input9.getText());
                    double input10 = Double.parseDouble(KalkulatorMatriks.this.input10.getText());
                    double input11 = Double.parseDouble(KalkulatorMatriks.this.input11.getText());
                    double input12 = Double.parseDouble(KalkulatorMatriks.this.input12.getText());

                    double Input1 = Double.parseDouble(KalkulatorMatriks.this.Input1.getText());
                    double Input2 = Double.parseDouble(KalkulatorMatriks.this.Input2.getText());
                    double Input3 = Double.parseDouble(KalkulatorMatriks.this.Input3.getText());
                    double Input4 = Double.parseDouble(KalkulatorMatriks.this.Input4.getText());
                    double Input5 = Double.parseDouble(KalkulatorMatriks.this.Input5.getText());
                    double Input6 = Double.parseDouble(KalkulatorMatriks.this.Input6.getText());
                    double Input7 = Double.parseDouble(KalkulatorMatriks.this.Input7.getText());
                    double Input8 = Double.parseDouble(KalkulatorMatriks.this.Input8.getText());
                    double Input9 = Double.parseDouble(KalkulatorMatriks.this.Input9.getText());
                    double Input10 = Double.parseDouble(KalkulatorMatriks.this.Input10.getText());
                    double Input11 = Double.parseDouble(KalkulatorMatriks.this.Input11.getText());
                    double Input12 = Double.parseDouble(KalkulatorMatriks.this.Input12.getText());

                    lblHasil1.setText("" + (input1 * Input1));
                    lblHasil2.setText("" + (input2 * Input2));
                    lblHasil3.setText("" + (input3 * Input3));
                    lblHasil4.setText("" + (input4 * Input4));
                    lblHasil5.setText("" + (input5 * Input5));
                    lblHasil6.setText("" + (input6 * Input6));
                    lblHasil7.setText("" + (input7 * Input7));
                    lblHasil8.setText("" + (input8 * Input8));
                    lblHasil9.setText("" + (input9 * Input9));
                    lblHasil10.setText("" + (input10 * Input10));
                    lblHasil11.setText("" + (input11 * Input11));
                    lblHasil12.setText("" + (input12 * Input12));
                }catch (NumberFormatException ex){
                    lblHasil.setText("Hasil: Harap periksa kembali Input Anda");
                }
            }
        });
        DEVButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double input1 = Double.parseDouble(KalkulatorMatriks.this.input1.getText());
                    double input2 = Double.parseDouble(KalkulatorMatriks.this.input2.getText());
                    double input3 = Double.parseDouble(KalkulatorMatriks.this.input3.getText());
                    double input4 = Double.parseDouble(KalkulatorMatriks.this.input4.getText());
                    double input5 = Double.parseDouble(KalkulatorMatriks.this.input5.getText());
                    double input6 = Double.parseDouble(KalkulatorMatriks.this.input6.getText());
                    double input7 = Double.parseDouble(KalkulatorMatriks.this.input7.getText());
                    double input8 = Double.parseDouble(KalkulatorMatriks.this.input8.getText());
                    double input9 = Double.parseDouble(KalkulatorMatriks.this.input9.getText());
                    double input10 = Double.parseDouble(KalkulatorMatriks.this.input10.getText());
                    double input11 = Double.parseDouble(KalkulatorMatriks.this.input11.getText());
                    double input12 = Double.parseDouble(KalkulatorMatriks.this.input12.getText());

                    double Input1 = Double.parseDouble(KalkulatorMatriks.this.Input1.getText());
                    double Input2 = Double.parseDouble(KalkulatorMatriks.this.Input2.getText());
                    double Input3 = Double.parseDouble(KalkulatorMatriks.this.Input3.getText());
                    double Input4 = Double.parseDouble(KalkulatorMatriks.this.Input4.getText());
                    double Input5 = Double.parseDouble(KalkulatorMatriks.this.Input5.getText());
                    double Input6 = Double.parseDouble(KalkulatorMatriks.this.Input6.getText());
                    double Input7 = Double.parseDouble(KalkulatorMatriks.this.Input7.getText());
                    double Input8 = Double.parseDouble(KalkulatorMatriks.this.Input8.getText());
                    double Input9 = Double.parseDouble(KalkulatorMatriks.this.Input9.getText());
                    double Input10 = Double.parseDouble(KalkulatorMatriks.this.Input10.getText());
                    double Input11 = Double.parseDouble(KalkulatorMatriks.this.Input11.getText());
                    double Input12 = Double.parseDouble(KalkulatorMatriks.this.Input12.getText());

                    lblHasil1.setText("" + (input1 / Input1));
                    lblHasil2.setText("" + (input2 / Input2));
                    lblHasil3.setText("" + (input3 / Input3));
                    lblHasil4.setText("" + (input4 / Input4));
                    lblHasil5.setText("" + (input5 / Input5));
                    lblHasil6.setText("" + (input6 / Input6));
                    lblHasil7.setText("" + (input7 / Input7));
                    lblHasil8.setText("" + (input8 / Input8));
                    lblHasil9.setText("" + (input9 / Input9));
                    lblHasil10.setText("" + (input10 / Input10));
                    lblHasil11.setText("" + (input11 / Input11));
                    lblHasil12.setText("" + (input12 / Input12));
                }catch (NumberFormatException ex){
                    lblHasil.setText("Hasil: Harap periksa kembali Input Anda");
                }
            }
        });
    }

    public static void main(String[] args) {
        KalkulatorMatriks frameUtama = new KalkulatorMatriks();
    }
}
