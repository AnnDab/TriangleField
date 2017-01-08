package homework.anna.two;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class TriangleFieldTest {
        @Test
        public void canCalculateTriangleArea() {
            TriangleField triangle = new TriangleField(4, 6);
            double expectedField = 12;
            double calculatedField = triangle.triangleArea();
            Assertions.assertThat(calculatedField).isEqualTo(expectedField);
        }
    }

