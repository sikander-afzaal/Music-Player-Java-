package studiplayer.audio;

public enum SortCriterion {
    DEFAULT("Default"),
    ALBUM("Album"),
    TITLE("Title"),
    AUTHOR("Author"),
    DURATION("Duration");

    private final String displayName;

    SortCriterion(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return displayName;
    }
}