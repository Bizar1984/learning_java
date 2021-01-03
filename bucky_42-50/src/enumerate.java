public enum enumerate {
    bomba("boss", "36"),
    ellen("sexy", "14"),
    corneel("bigMistake", "17"),
    ioana("sweet", "26"),
    nabiz("africanFlower", "34"),
    ayla("iwish", "32");



    private final String desc;
    private final String grades;

    enumerate(String description, String grade) {
        desc = description;
        grades = grade;

    }

    public String getDesc() {
        return desc;

    }

    public String getGrade() {
        return grades;

    }
}
