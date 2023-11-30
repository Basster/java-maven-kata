package de.kata;

public class XmasTree implements Tree {
    private static String drawLog(int width) {
        if (width < 1) {
            return "I";
        }

        return padBoth(width, "I");
    }

    private static String padBoth(int width, String input) {
        if (width < 2 || input.length() == width) {
            return input;
        }
        
        
        return String.format("%" + width / 2 + "s", " ")
                + input +
                String.format("%" + width / 2 + "s", " ");
    }

    @Override
    public String draw(int height) {
        int width = getWidth(height);
        
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i <= height; i++) {
            builder.append(padBoth(width, "X".repeat(getWidth(i))));
            builder.append("\n");
        }

        builder.append(padBoth(width, "I"));
        builder.append("\n");
        return builder.toString();
    }

    private static int getWidth(int height) {
        if (height < 1) {
            return 1;
        }
        // return getWidth(height - 1) + 2;
        // return height / 2 + 1;
        return height * 2 - 1;
    }
}
