package br.com.mfmoura.fundamentals.oop.myfitnesspal.model.entities;

import java.util.ArrayList;
import java.util.List;

public class DailyLog {
    private List<Food> foods = new ArrayList<>();

    public DailyLog() {
    }

    public List<Food> getFoods() {
        return foods;
    }

    public void addFood(Food food) {
        if (food == null) {
            throw new IllegalArgumentException("Food cannot be null.");
        }
        foods.add(food);
    }

    public void removeFood(Food food) {
        foods.remove(food);
    }

    public Double totalConsumedCalories() {
        double total = 0.0;

        for (Food food : foods) {
            total += food.getCalories();
        }

        return total;
    }

    public Double totalConsumedProtein() {
        double total = 0.0;

        for (Food food : foods) {
            total += food.getProtein();
        }

        return total;
    }

    public Double remainingCalories(User user) {
        return user.dailyCaloriesGoal() - totalConsumedCalories();
    }

    public Double remainingProtein(User user) {
        return user.dailyProteinGoal() - totalConsumedProtein();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Daily Log\n");

        if (foods.isEmpty()) {
            sb.append("No foods registered yet.\n");
        } else {
            sb.append("Foods:\n");

            for (int i = 0; i < foods.size(); i++) {
                sb.append(i + 1)
                        .append(" - ")
                        .append(foods.get(i))
                        .append("\n");
            }
        }

        sb.append(String.format("""
                
                Total consumed calories: %.2f kcal
                Total consumed protein: %.2fg
                """,
                totalConsumedCalories(),
                totalConsumedProtein()
        ));

        return sb.toString();
    }
}
