package homework.anna.two;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TriangleFieldTest {
    @Test
    public void canCalculateTriangleArea() {
        TriangleField triangle = new TriangleField(4, 6);
        double expectedField = 12;
        double calculatedField = triangle.triangleArea();
        assertThat(calculatedField).isEqualTo(expectedField);
    }
}

