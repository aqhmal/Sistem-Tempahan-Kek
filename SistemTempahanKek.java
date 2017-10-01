/**
 * KPD 6043 Project
 * - Sistem Tempahan Kek
 * - Coded by Aqhmal
 **/

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.*;

public class SistemTempahanKek {
    // Variables for receipt frame (Frame 6)
    public static String cake_partition, cake_type, cake_selected, cake_weight, nama, nokp, notel, alamat, tarikh;
    public static double cake_price;
    // JFrame declarations
    public static JFrame frame1, frame2, frame3, frame4, frame5, frame6;

    public static void main(String[] args) {
        // Open Frame 1 when program starts
        frame1();
    }

    /* FRAME 1 */
    public static void frame1() {
        // Frame initialization
        frame1 = new JFrame();

        // Variables declaration and initialization
        JLabel ImageFullCake, ImageSlice;
        JLabel Frame1Title = new JLabel();
        JButton SliceBtn = new JButton();
        JButton FullCakeBtn = new JButton();

        // Import images
        Image FullCake = null, SliceCake = null;
        try {
            SliceCake = ImageIO.read(new File("res/slice.png"));
            FullCake = ImageIO.read(new File("res/whole.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Resize images then insert to JLabel
        FullCake = resize(FullCake, 200, 150);
        ImageFullCake = new JLabel(new ImageIcon(FullCake));
        SliceCake = resize(SliceCake, 200, 150);
        ImageSlice = new JLabel(new ImageIcon(SliceCake));

        // Slice Button
        SliceBtn.setText("SLICE");
        SliceBtn.setFont(new Font("Arial", 1, 14));
        SliceBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Change cake type to slice
                cake_partition = "Slice";
                frame1.setVisible(false);
                frame2();
            }
        });

        // Full Cake Button
        FullCakeBtn.setText("WHOLE CAKE");
        FullCakeBtn.setFont(new Font("Arial", 1, 14));
        FullCakeBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Change cake type to slice
                cake_partition = "Full";
                frame1.setVisible(false);
                frame2();
            }
        });

        // Title Text
        Frame1Title.setFont(new Font("Arial", 1, 18));
        Frame1Title.setText("SELECT YOUR CAKE");

        // Frame Layout
        GroupLayout layout = new GroupLayout(frame1.getContentPane());
        frame1.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(Frame1Title, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(SliceBtn, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
                        .addGap(168, 168, 168)
                        .addComponent(FullCakeBtn, GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                        .addGap(36, 36, 36))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ImageSlice, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(ImageFullCake, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)))
                .addGap(171, 171, 171))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(Frame1Title, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(ImageFullCake, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                    .addComponent(ImageSlice, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(SliceBtn, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                    .addComponent(FullCakeBtn, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(173, Short.MAX_VALUE))
        );

        // Set frame properties
        frame1.pack();
        frame1.setTitle("Sistem Tempahan Kek");
        frame1.setResizable(false);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setSize(800, 500);
        frame1.setLocationRelativeTo(null); // Set JFrame location to center on application startup
        // Make frame visible
        frame1.setVisible(true);
    }

    /* Frame 2 */
    public static void frame2() {
        // Variables declaration and initialization
        JLabel ImageCreameCake, ImageCheeseCake, ImageFoundantCake;
        JLabel Frame2Title = new JLabel();
        JButton cheeseCakeBtn = new JButton();
        JButton creameCakeBtn = new JButton();
        JButton foundantCakeBtn = new JButton();

        // Frame initialization
        frame2 = new JFrame();
        // Import images
        Image CheeseCake = null, CreameCake = null, FoundantCake = null;
        try {
            CheeseCake = ImageIO.read(new File("res/type_cheesecake.jpg"));
            CreameCake = ImageIO.read(new File("res/type_creamcake.jpg"));
            FoundantCake = ImageIO.read(new File("res/type_foundantcake.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Resize images then insert to JLabel
        CheeseCake = resize(CheeseCake, 200, 150);
        ImageCheeseCake = new JLabel(new ImageIcon(CheeseCake));
        CreameCake = resize(CreameCake, 200, 150);
        ImageCreameCake = new JLabel(new ImageIcon(CreameCake));
        FoundantCake = resize(FoundantCake, 200, 150);
        ImageFoundantCake = new JLabel(new ImageIcon(FoundantCake));

        // Cheese Cake Button
        cheeseCakeBtn.setFont(new Font("Arial", 1, 14));
        cheeseCakeBtn.setText("CHEESE CAKE");
        cheeseCakeBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame2.setVisible(false);
                cake_type = "cheese_cake";
                frame3();
            }
        });

        // Creame Cake Button
        creameCakeBtn.setFont(new Font("Arial", 1, 14));
        creameCakeBtn.setText("CREAM CAKE");
        creameCakeBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame2.setVisible(false);
                cake_type = "creame_cake";
                frame3();
            }
        });

        // Foundant Cake Button
        foundantCakeBtn.setFont(new Font("Arial", 1, 14));
        foundantCakeBtn.setText("FOUNDANT CAKE");
        foundantCakeBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame2.setVisible(false);
                cake_type = "foundant_cake";
                frame3();
            }
        });

        // Title Text
        Frame2Title.setFont(new Font("Arial", 0, 24));
        Frame2Title.setText("SELECT CAKE TYPE");

        // Frame Layout
        GroupLayout layout = new GroupLayout(frame2.getContentPane());
        frame2.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(Frame2Title)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ImageCheeseCake, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ImageCreameCake, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(cheeseCakeBtn)
                        .addGap(89, 89, 89)
                        .addComponent(creameCakeBtn)))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(ImageFoundantCake, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(foundantCakeBtn)))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(Frame2Title)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(ImageCreameCake, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                        .addComponent(ImageFoundantCake, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
                    .addComponent(ImageCheeseCake, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(cheeseCakeBtn, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                    .addComponent(creameCakeBtn, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                    .addComponent(foundantCakeBtn, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(140, Short.MAX_VALUE))
        );
        // Set frame properties
        frame2.pack();
        frame2.setTitle("Sistem Tempahan Kek");
        frame2.setResizable(false);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setSize(800, 500);
        frame2.setLocationRelativeTo(null); // Set JFrame location to center on application startup
        // Make frame visible
        frame2.setVisible(true);
    }

    /* Frame 3 */
    public static void frame3() {
        // Variables declaration and initialization
        JButton cakeBtn1 = new JButton();
        JButton cakeBtn2 = new JButton();
        JButton cakeBtn3 = new JButton();
        JLabel Frame3Title = new JLabel();
        JLabel Image1, Image2, Image3;
        // Frame initialization
        frame3 = new JFrame();
        // Set flavor name according to cake type
        cakeBtn1.setFont(new Font("Arial", 1, 14));
        cakeBtn2.setFont(new Font("Arial", 1, 14));
        cakeBtn3.setFont(new Font("Arial", 1, 14));
        switch (cake_type) {
            case "cheese_cake":
                cakeBtn1.setText("New York Cheese Cake");
                cakeBtn2.setText("Chocolate Cheese Cake");
                cakeBtn3.setText("Durian Cheese Cake");
                break;
            case "creame_cake":
                cakeBtn1.setText("Chocolate Chip");
                cakeBtn2.setText("Chocolate Fudge");
                cakeBtn3.setText("Red Velvet");
                break;
            case "foundant_cake":
                cakeBtn1.setText("Kek Merdeka");
                cakeBtn2.setText("Football Cake");
                cakeBtn3.setText("Royal Cake");
                break;
            default:
                // Select cheese cake by default
                cakeBtn1.setText("New York Cheese Cake");
                cakeBtn2.setText("Chocolate Cheese Cake");
                cakeBtn3.setText("Durian Cheese Cake");
        }
        // Import images according to cake type
        Image img1 = null, img2 = null, img3 = null;
        try {
            if (cake_type == "cheese_cake") {
                img1 = ImageIO.read(new File("res/cheesecake0.jpg"));
                img2 = ImageIO.read(new File("res/cheesecake1.jpg"));
                img3 = ImageIO.read(new File("res/cheesecake2.jpg"));
            } else if (cake_type == "creame_cake") {
                img1 = ImageIO.read(new File("res/creamecake0.jpg"));
                img2 = ImageIO.read(new File("res/creamecake1.jpg"));
                img3 = ImageIO.read(new File("res/creamecake2.jpg"));
            } else {
                img1 = ImageIO.read(new File("res/foundantcake0.jpg"));
                img2 = ImageIO.read(new File("res/foundantcake1.png"));
                img3 = ImageIO.read(new File("res/foundantcake2.png"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Resize images then insert to JLabel
        img1 = resize(img1, 180, 140);
        Image1 = new JLabel(new ImageIcon(img1));
        img2 = resize(img2, 180, 140);
        Image2 = new JLabel(new ImageIcon(img2));
        img3 = resize(img3, 180, 140);
        Image3 = new JLabel(new ImageIcon(img3));

        // Cake 1 Button
        cakeBtn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame3.setVisible(false);
                cake_selected = cakeBtn1.getText();
                frame4();
            }
        });

        // Cake 2 Button
        cakeBtn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame3.setVisible(false);
                cake_selected = cakeBtn2.getText();
                frame4();
            }
        });

        // Cake 3 Button
        cakeBtn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame3.setVisible(false);
                cake_selected = cakeBtn3.getText();
                frame4();
            }
        });

        // Title Text
        Frame3Title.setFont(new Font("Arial", 0, 24));
        Frame3Title.setText("SELECT CAKE FLAVOUR");

        // Frame Layout
        GroupLayout layout = new GroupLayout(frame3.getContentPane());
        frame3.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(Image1, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                            .addComponent(cakeBtn1))
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(Image2, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                            .addComponent(cakeBtn2))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(cakeBtn3)
                            .addComponent(Image3, GroupLayout.PREFERRED_SIZE, 201, GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(285, 285, 285)
                        .addComponent(Frame3Title)))
                .addContainerGap(162, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(Frame3Title)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(Image2, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                    .addComponent(Image3, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                    .addComponent(Image1, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(cakeBtn1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                    .addComponent(cakeBtn2, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                    .addComponent(cakeBtn3, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(140, Short.MAX_VALUE))
        );


        // Set JFrame properties
        frame3.pack();
        frame3.setTitle("Sistem Tempahan Kek");
        frame3.setResizable(false);
        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame3.setSize(800, 500);
        frame3.setLocationRelativeTo(null); // Set JFrame location to center on application startup
        // Make frame visible
        frame3.setVisible(true);
    }

    /* Frame 4 */
    public static void frame4() {
        // Frame initialization
        frame4 = new JFrame();

        // Variables declaration and initialization
        JLabel Frame4Title = new JLabel();
        JLabel TitleBerat = new JLabel();
        JLabel Berat2KG = new JLabel();
        JLabel Berat1KG = new JLabel();
        JLabel Berat500G = new JLabel();
        JLabel Berat300G = new JLabel();
        JLabel TitleHarga = new JLabel();
        JLabel Harga2KG = new JLabel();
        JLabel Harga1KG = new JLabel();
        JLabel Harga500G = new JLabel();
        JLabel Harga300G = new JLabel();
        JRadioButton Radio2KG = new JRadioButton();
        JRadioButton Radio1KG = new JRadioButton();
        JRadioButton Radio500G = new JRadioButton();
        JRadioButton Radio300G = new JRadioButton();
        JButton nextBtn = new JButton();

        Font title = new Font("Arial", 0, 24);
        Font text = new Font("Arial", 0, 18);

        // Set text to JLabel
        Frame4Title.setFont(title);
        Frame4Title.setText("Sila pilih berat dan harga kek");
        TitleBerat.setFont(title);
        TitleBerat.setText("BERAT");
        TitleHarga.setFont(title);
        TitleHarga.setText("HARGA");
        Berat2KG.setFont(text);
        Berat2KG.setText("2 KG");
        Berat1KG.setFont(text);
        Berat1KG.setText("1 KG");
        Berat500G.setFont(text);
        Berat500G.setText("500 G");
        Berat300G.setFont(text);
        Berat300G.setText("300 G");
        Harga2KG.setFont(text);
        Harga2KG.setText("RM 80.00");
        Harga1KG.setFont(text);
        Harga1KG.setText("RM 50.00");
        Harga500G.setFont(text);
        Harga500G.setText("RM 30.00");
        Harga300G.setFont(text);
        Harga300G.setText("RM 19.00");
        nextBtn.setText("Next");

        // Functions for JRadioButton
        Radio2KG.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Radio2KG.setSelected(true);
                Radio1KG.setSelected(false);
                Radio500G.setSelected(false);
                Radio300G.setSelected(false);
                cake_price = 80;
                cake_weight = "2 KG";
            }
        });

        Radio1KG.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Radio2KG.setSelected(false);
                Radio1KG.setSelected(true);
                Radio500G.setSelected(false);
                Radio300G.setSelected(false);
                cake_price = 50;
                cake_weight = "1 KG";
            }
        });

        Radio500G.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Radio2KG.setSelected(false);
                Radio1KG.setSelected(false);
                Radio500G.setSelected(true);
                Radio300G.setSelected(false);
                cake_price = 30;
                cake_weight = "500 G";
            }
        });

        Radio300G.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Radio2KG.setSelected(false);
                Radio1KG.setSelected(false);
                Radio500G.setSelected(false);
                Radio300G.setSelected(true);
                cake_price = 19;
                cake_weight = "300";
            }
        });

        // JButton
        nextBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame4.setVisible(false);
                frame5();
            }
        });

        // Frame Layout
        GroupLayout layout = new GroupLayout(frame4.getContentPane());
        frame4.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Frame4Title)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TitleBerat)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TitleHarga)
                        .addGap(92, 92, 92))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Berat2KG)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Harga2KG)
                        .addGap(18, 18, 18)
                        .addComponent(Radio2KG)
                        .addGap(40, 40, 40))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(nextBtn)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(Berat300G)
                                    .addComponent(Berat500G)
                                    .addComponent(Berat1KG))
                                .addGap(264, 264, 264)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Harga500G)
                                        .addGap(18, 18, 18)
                                        .addComponent(Radio500G))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Harga1KG)
                                        .addGap(18, 18, 18)
                                        .addComponent(Radio1KG))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Harga300G)
                                        .addGap(18, 18, 18)
                                        .addComponent(Radio300G)))))
                        .addContainerGap(40, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(Frame4Title)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(TitleBerat)
                            .addComponent(TitleHarga))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(Berat2KG)
                                    .addComponent(Harga2KG)
                                    .addComponent(Radio2KG))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(Berat1KG)
                                    .addComponent(Harga1KG)
                                    .addComponent(Radio1KG))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(Berat500G)
                                    .addComponent(Harga500G)))
                            .addComponent(Radio500G))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(Berat300G)
                            .addComponent(Harga300G)))
                    .addComponent(Radio300G))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(nextBtn)
                .addGap(23, 23, 23))
        );

        // Set JFrame properties
        frame4.setTitle("Sistem Tempahan Kek");
        frame4.setResizable(false);
        frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame4.setSize(800, 500);
        frame4.setLocationRelativeTo(null);
        // Make JFrame visible
        frame4.setVisible(true);
    }

    /* Frame 5 */
    public static void frame5() {
        // JFrame Initialization
        frame5 = new JFrame();

        // Font initialization and size
        Font title = new Font("Arial", 0, 24);
        Font text = new Font("Arial", 0, 18);
        Font button = new Font("Arial", 1, 14);

        // Variables declarations, initializations and set font
        JLabel Frame5Title = new JLabel();
        Frame5Title.setFont(title);
        JLabel NamaTitle = new JLabel();
        NamaTitle.setFont(text);
        JLabel NoKPTitle = new JLabel();
        NoKPTitle.setFont(text);
        JLabel NoTelTitle = new JLabel();
        NoTelTitle.setFont(text);
        JLabel AlamatTitle = new JLabel();
        AlamatTitle.setFont(text);
        JLabel TarikhTitle = new JLabel();
        TarikhTitle.setFont(text);
        JTextField FieldNama = new JTextField();
        FieldNama.setFont(text);
        JTextField FieldNoKP = new JTextField();
        FieldNoKP.setFont(text);
        JTextField FieldNoTel = new JTextField();
        FieldNoTel.setFont(text);
        JTextField FieldAlamat = new JTextField();
        FieldAlamat.setFont(text);
        JTextField FieldTarikh = new JTextField();
        FieldTarikh.setFont(text);
        JButton tempahBtn = new JButton();
        tempahBtn.setFont(button);
        JButton cancelBtn = new JButton();
        cancelBtn.setFont(button);

        // Set text to JLabel and JButton
        Frame5Title.setText("Sila isi borang di bawah");
        NamaTitle.setText("Nama                             :");
        NoKPTitle.setText("No. Kad Pengenalan     :");
        NoTelTitle.setText("No. Telefon                    :");
        AlamatTitle.setText("Alamat                            :");
        TarikhTitle.setText("Tarikh Ambil                   :");
        tempahBtn.setText("TEMPAH");
        cancelBtn.setText("BATAL");

        // Tempah Button
        tempahBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                nama = FieldNama.getText();
                nokp = FieldNoKP.getText();
                notel = FieldNoTel.getText();
                alamat = FieldAlamat.getText();
                tarikh = FieldTarikh.getText();
                frame5.setVisible(false);
                frame6();
            }
        });

        // Cancel Button
        cancelBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame5.setVisible(false);
                frame1(); // back to frame 1
            }
        });

        // JFrame Layout
        GroupLayout layout = new GroupLayout(frame5.getContentPane());
        frame5.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addComponent(Frame5Title))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addComponent(NamaTitle, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NoTelTitle, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NoKPTitle, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(FieldNama, GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
                                    .addComponent(FieldNoKP)
                                    .addComponent(FieldNoTel)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(AlamatTitle, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TarikhTitle, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(FieldTarikh)
                                    .addComponent(FieldAlamat))))))
                .addGap(36, 36, 36))
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tempahBtn, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cancelBtn, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(Frame5Title)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(NamaTitle, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                    .addComponent(FieldNama, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(NoKPTitle, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                    .addComponent(FieldNoKP, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(NoTelTitle, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                    .addComponent(FieldNoTel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(AlamatTitle, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                    .addComponent(FieldAlamat, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(TarikhTitle, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                    .addComponent(FieldTarikh, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(tempahBtn, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelBtn, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        // Set JFrame properties
        frame5.pack();
        frame5.setTitle("Sistem Tempahan Kek");
        frame5.setResizable(false);
        frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame5.setSize(800, 500);
        frame5.setLocationRelativeTo(null);

        // Make JFrame visible
        frame5.setVisible(true);
    }

    /* Frame 6 */
    public static void frame6() {
        // JFrame initialization
        frame6 = new JFrame();

        // Font initialization and size
        Font title = new Font("Arial", 0, 24);
        Font text = new Font("Arial", 1, 13);
        Font button = new Font("Arial", 1, 14);

        // Variables declarations, initializations and set font
        JLabel Frame6Title = new JLabel();
        Frame6Title.setFont(title);
        JLabel NamaKek = new JLabel();
        NamaKek.setFont(text);
        JLabel BeratKek = new JLabel();
        BeratKek.setFont(text);
        JLabel HargaKek = new JLabel();
        HargaKek.setFont(text);
        JLabel Nama = new JLabel();
        Nama.setFont(text);
        JLabel NoKP = new JLabel();
        NoKP.setFont(text);
        JLabel NoTel = new JLabel();
        NoTel.setFont(text);
        JLabel Alamat = new JLabel();
        Alamat.setFont(text);
        JLabel TarikhAmbil = new JLabel();
        TarikhAmbil.setFont(text);
        JButton printBtn = new JButton();
        printBtn.setFont(button);

        // Set text to JButton and JLabels
        Frame6Title.setText("Resit");
        NamaKek.setText(cake_selected);
        BeratKek.setText(cake_weight);
        HargaKek.setText("RM " + cake_price);
        Nama.setText("Nama : " + nama);
        NoKP.setText("No. K/P : " + nokp);
        NoTel.setText("No. Telefon : " + notel);
        Alamat.setText("Alamat : " + alamat);
        TarikhAmbil.setText("Tarikh Ambil : " + tarikh);
        printBtn.setText("Cetak");

        // Print Button (Dummy)
        printBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // from this section, system already ended. back to frame1
                frame6.setVisible(false);
                frame1();
            }
        });

        // JFrame Layout
        GroupLayout layout = new GroupLayout(frame6.getContentPane());
        frame6.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(printBtn)
                .addGap(133, 133, 133))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(Frame6Title))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(NamaKek, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BeratKek, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(HargaKek, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Nama, GroupLayout.PREFERRED_SIZE, 320, GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(NoKP, GroupLayout.PREFERRED_SIZE, 320, GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(NoTel, GroupLayout.PREFERRED_SIZE, 320, GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Alamat, GroupLayout.PREFERRED_SIZE, 320, GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(TarikhAmbil, GroupLayout.PREFERRED_SIZE, 320, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(Frame6Title)
                .addGap(18, 18, 18)
                .addComponent(NamaKek, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BeratKek, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HargaKek, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Nama, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NoKP, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NoTel, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Alamat, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TarikhAmbil, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(printBtn)
                .addGap(23, 23, 23))
        );

        // Set JFrame properties
        frame6.pack();
        frame6.setTitle("Sistem Tempahan Kek");
        frame6.setResizable(false);
        frame6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame6.setSize(350, 450);
        frame6.setLocationRelativeTo(null);

        // Make JFrame visible
        frame6.setVisible(true);
    }

    /* Method for resize image */
    public static BufferedImage resize(Image kek, int width, int height) {
        BufferedImage bi = new BufferedImage(width, height, BufferedImage.TRANSLUCENT);
        Graphics2D g2d = (Graphics2D) bi.createGraphics();
        g2d.addRenderingHints(new RenderingHints(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY));
        g2d.drawImage(kek, 0, 0, width, height, null);
        g2d.dispose();
        return bi;
    }
}