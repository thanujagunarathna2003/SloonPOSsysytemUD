package SwingComponent;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPanel;

public class RoundPanel2 extends JPanel {

    private Color gradientStart = new Color(0, 153, 255);
    private Color gradientEnd = new Color(0, 51, 153);
    private int cornerRadius = 30;
    private float transparency = 1.0f; // 1.0 = fully opaque, 0.0 = fully transparent

    public RoundPanel2() {
        initComponents();
        setOpaque(false); // Important for transparent drawing
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g.create();

        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Apply transparency
        g2.setComposite(java.awt.AlphaComposite.getInstance(java.awt.AlphaComposite.SRC_OVER, transparency));

        // Create gradient
        GradientPaint gp = new GradientPaint(
                0, 0, gradientStart,
                0, getHeight(), gradientEnd);

        g2.setPaint(gp);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), cornerRadius, cornerRadius);

        g2.dispose();
    }

    // -------------------- Properties (editable in NetBeans) --------------------

    public Color getGradientStart() {
        return gradientStart;
    }

    public void setGradientStart(Color gradientStart) {
        this.gradientStart = gradientStart;
        repaint();
    }

    public Color getGradientEnd() {
        return gradientEnd;
    }

    public void setGradientEnd(Color gradientEnd) {
        this.gradientEnd = gradientEnd;
        repaint();
    }

    public int getCornerRadius() {
        return cornerRadius;
    }

    public void setCornerRadius(int cornerRadius) {
        this.cornerRadius = cornerRadius;
        repaint();
    }

    public float getTransparency() {
        return transparency;
    }

    public void setTransparency(float transparency) {
        if (transparency < 0f) transparency = 0f;
        if (transparency > 1f) transparency = 1f;
        this.transparency = transparency;
        repaint();
    }
}
