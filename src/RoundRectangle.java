import java.awt.*;

public class RoundRectangle extends Shape{
    private int arcWidth;
    private int arcHeight;

    public RoundRectangle()
    {
        super();
        arcWidth = 20;
        arcHeight = 50;
    }

    @Override
    public void draw(Graphics g)
    {
        g.setColor(getColor());

        g.drawRoundRect(getMinX(), getMinY(), getWidth(), getHeight(), arcWidth, arcHeight);
    }
}
