package SwingComponent;

import javax.swing.*;
import java.awt.*;
import java.time.LocalTime;
import java.util.Calendar;

public class MinimalTimePicker extends JPanel {

    private final JSpinner spinner;

    public MinimalTimePicker() {
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(110, 30));
        setOpaque(false);

        SpinnerDateModel model = new SpinnerDateModel();
        spinner = new JSpinner(model);

        JSpinner.DateEditor editor = new JSpinner.DateEditor(spinner, "HH:mm");
        spinner.setEditor(editor);

        spinner.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        spinner.setBorder(null);  
        spinner.getEditor().getComponent(0).setBackground(new Color(245, 245, 245));

        add(spinner, BorderLayout.CENTER);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setColor(new Color(220, 220, 220));
        g2.drawLine(0, getHeight() - 1, getWidth(), getHeight() - 1);
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
