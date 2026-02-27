package String;

public class BufferBuilderPerformance {

        public static void main(String[] args) {

            int iterations = 100000;

            // -------- StringBuffer Test --------
            long startTime = System.nanoTime();
            StringBuffer buffer = new StringBuffer("java");

            for (int i = 0; i < iterations; i++) {
                buffer.append("DSA");
            }

            long bufferTime = System.nanoTime() - startTime;
            System.out.println("StringBuffer time: " + bufferTime + " ns");


            // -------- StringBuilder Test --------
            startTime = System.nanoTime();
            StringBuilder builder = new StringBuilder("java");

            for (int i = 0; i < iterations; i++) {
                builder.append("DSA");
            }

            long builderTime = System.nanoTime() - startTime;
            System.out.println("StringBuilder time: " + builderTime + " ns");


            // -------- Performance Comparison --------
            if (bufferTime > builderTime) {
                System.out.println("StringBuilder is faster by "
                        + (bufferTime - builderTime) + " ns");
            } else if (builderTime > bufferTime) {
                System.out.println("StringBuffer is faster by "
                        + (builderTime - bufferTime) + " ns");
            } else {
                System.out.println("Both took the same time.");
            }
        }
    }