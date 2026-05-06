package OopPillars.MyFitnessPal.model.entities;

public class Food {
    private String name;
    private Double calories;
    private Double protein;

    public Food() {
    }

    public Food(String name, Double calories, Double protein) {
        setName(name);
        setCalories(calories);
        setProtein(protein);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Food name cannot be empty.");
        }
        this.name = name;
    }

    public Double getCalories() {
        return calories;
    }

    public void setCalories(Double calories) {
        if (calories == null || calories < 0) {
            throw new IllegalArgumentException("Calories cannot be negative.");
        }
        this.calories = calories;
    }

    public Double getProtein() {
        return protein;
    }

    public void setProtein(Double protein) {
        if (protein == null || protein < 0) {
            throw new IllegalArgumentException("Protein cannot be negative.");
        }
        this.protein = protein;
    }

    @Override
    public String toString() {
        return String.format("%s - %.2f kcal - %.2fg protein", name, calories, protein);
    }
}
