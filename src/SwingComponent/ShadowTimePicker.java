package SwingComponent;

import javax.swing.*;
import java.awt.*;
import java.time.LocalTime;
import java.util.Calendar;

public class ShadowTimePicker extends JPanel {

    private final JSpinner spinner;

    public ShadowTimePicker() {
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(140, 40));
        setOpaque(false);

        SpinnerDateModel model = new SpinnerDateModel();
        spinner = new JSpinner(model);

        JSpinner.DateEditor editor = new JSpinner.DateEditor(spinner, "HH:mm");
        spinner.setEditor(editor);

        spinner.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        spinner.setBorder(BorderFactory.createEmptyBorder(5, 12, 5, 12));
        spinner.getEditor().getComponent(0).setBackground(Color.WHITE);

        add(spinner, BorderLayout.CENTER);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Shadow
        g2.setColor(new Color(0, 0, 0, 60));
        g2.fillRoundRect(3, 5, getWidth() - 6, getHeight() - 6, 20, 20);

        // Main box
        g2.setColor(Color.WHITE);
        g2.fillRoundRect(0, 0, getWidth() - 6, getHeight() - 6, 20, 20);

        g2.dispose();
    }

    public LocalTime getTime() {
        java.util.Date d = (java.util.Date) spinner.getValue();
        Calendar c = Calendar.getInstance();
        c.setTime(d);
        return LocalTime.of(c.get(Calendar.HOUR_OF_DAY), c.get(Calendar.MINUTE));
    }

    public void setTime(LocalTime t) {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.HOUR_OF_DAY, t.getHour());
        c.set(Calendar.MINUTE, t.getMinute());
        spinner.setValue(c.getTime());
    }
}
