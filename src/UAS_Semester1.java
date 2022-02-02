import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedOutputStream;

public class UAS_Semester1 extends JFrame{
    private JCheckBox matriksVektorCheckBox;
    private JCheckBox kalkulusCheckBox;
    private JCheckBox agamaCheckBox;
    private JCheckBox alStrukDatCheckBox;
    private JCheckBox pemKomCheckBox;
    private JCheckBox PTICheckBox;
    private JCheckBox pancasilaCheckBox;
    private JCheckBox praktikumCheckBox;
    private JButton selesaiButton;
    private JLabel lblHasil;
    private JPanel MyFrame;

    private final ButtonGroup buttonUAS = new ButtonGroup();

    private UAS_Semester1(){
        buttonUAS.add(agamaCheckBox);
        buttonUAS.add(alStrukDatCheckBox);
        buttonUAS.add(pemKomCheckBox);
        buttonUAS.add(praktikumCheckBox);
        buttonUAS.add(pancasilaCheckBox);
        buttonUAS.add(matriksVektorCheckBox);
        buttonUAS.add(PTICheckBox);;
        buttonUAS.add(kalkulusCheckBox);

        ImageIcon images = new ImageIcon("UNSRI.png");
        setIconImage(images.getImage());

        setTitle("List UAS PARUQ");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setContentPane(MyFrame);

        selesaiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(buttonUAS.getSelection().isSelected()){
                    if(agamaCheckBox.isSelected()){
                        lblHasil.setText("Hallo Abdullah Farauk, anda telah menyelesaikan UAS Agama.");
                    }if(pancasilaCheckBox.isSelected()){
                        lblHasil.setText("Hallo Abdullah Farauk, anda telah menyelesaikan UAS Pancasila.");
                    }if(PTICheckBox.isSelected()){
                        lblHasil.setText("Hallo Abdullah Farauk, anda telah menyelesaikan UAS Kalkulus.");
                    }if(kalkulusCheckBox.isSelected()){
                        lblHasil.setText("Hallo Abdullah Farauk, anda telah menyelesaikan UAS Kalkulus.");
                    }if(pemKomCheckBox.isSelected()){
                        lblHasil.setText("Hallo Abdullah Farauk, anda telah menyelesaikan UAS PemKom.");
                    }if(praktikumCheckBox.isSelected()){
                        lblHasil.setText("Hallo Abdullah Farauk, anda telah menyelesaikan UAS Praktikum.");
                    }if(alStrukDatCheckBox.isSelected()){
                        lblHasil.setText("Hallo Abdullah Farauk, anda telah menyelesaikan UAS AlStrukDat.");
                    }if(matriksVektorCheckBox.isSelected()){
                        lblHasil.setText("Hallo Abdullah Farauk, anda telah menyelesaikan UAS MatVek.");
                    }
               }
            }
        });
    }

    public static void main(String[] args) {
        UAS_Semester1 frameUtama = new UAS_Semester1();

    }
}
