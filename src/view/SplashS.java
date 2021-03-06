package view;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.*;

/**
 * Splash GUI object.
 * <p>
 * GUI design for the Splash Screen.
 */
public class SplashS extends JPanel {

    /**
     * Draws Splash window.
     * <p>
     * Draws Splash window. Generated by computer
     */
    public SplashS() {

        JLabel letterCraze = new JLabel("BUILD LETTERCRAZE");
        letterCraze.setHorizontalAlignment(SwingConstants.CENTER);
        letterCraze.setFont(new Font("SansSerif", Font.PLAIN, 90));

        JLabel vanadium = new JLabel("GROUP:Vanadium");
        vanadium.setFont(new Font("Lucida Grande", Font.PLAIN, 50));

        JLabel group = new JLabel("Yifei Jin, Emily Hao, Ming Xu, Fan Mo, Zixin Luo");
        GroupLayout groupLayout = new GroupLayout(this);
        groupLayout.setHorizontalGroup(
                groupLayout.createParallelGroup(Alignment.TRAILING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(letterCraze, GroupLayout.DEFAULT_SIZE, 1005, Short.MAX_VALUE))
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addGap(103)
                                                .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                                                        .addComponent(group, GroupLayout.PREFERRED_SIZE, 456, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(vanadium, GroupLayout.PREFERRED_SIZE, 446, GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap())
        );
        groupLayout.setVerticalGroup(
                groupLayout.createParallelGroup(Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGap(93)
                                .addComponent(letterCraze, GroupLayout.PREFERRED_SIZE, 196, GroupLayout.PREFERRED_SIZE)
                                .addGap(18)
                                .addComponent(vanadium, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(ComponentPlacement.RELATED)
                                .addComponent(group, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(89, Short.MAX_VALUE))
        );
        setLayout(groupLayout);

    }

}