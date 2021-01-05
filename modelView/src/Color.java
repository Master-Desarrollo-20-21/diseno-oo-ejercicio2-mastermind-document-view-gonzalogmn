public enum Color {
    r, y, b, g, p, o;

    public static Color getColor(char character) {
        assert(isCorrectColor(character));

        for(Color color: Color.values()) {
            if(color.name().toLowerCase().equals(String.valueOf(character).toLowerCase())) {
                return color;
            }
        }
        return null;
    }

    public static boolean isCorrectColor(char character) {
        boolean isCorrectColor = false;
        for(Color color: Color.values()) {
            if(color.name().toLowerCase().equals(String.valueOf(character).toLowerCase())) {
                isCorrectColor = true;
            }
        }
        return isCorrectColor;
    }
}
