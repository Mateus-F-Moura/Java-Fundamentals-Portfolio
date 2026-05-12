package br.com.mfmoura.fundamentals.oop.myfitnesspal.model.entities;

import br.com.mfmoura.fundamentals.oop.myfitnesspal.model.enums.Activity;
import br.com.mfmoura.fundamentals.oop.myfitnesspal.model.enums.Gender;
import br.com.mfmoura.fundamentals.oop.myfitnesspal.model.enums.Goal;

public class User {
    private String name;
    private Gender gender;
    private Integer age;
    private Double weight;
    private Double height;
    private Activity activity;
    private Goal goal;

    public User() {
    }

    public User(String name, Gender gender, Integer age, Double weight, Double height, Activity activity, Goal goal) {
        setName(name);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setHeight(height);
        setActivity(activity);
        setGoal(goal);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        if (gender == null) {
            throw new IllegalArgumentException("Gender cannot be null.");
        }
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if (age == null || age <= 0) {
            throw new IllegalArgumentException("Age must be greater than zero.");
        }
        this.age = age;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        if (weight == null || weight <= 0) {
            throw new IllegalArgumentException("Weight must be greater than zero.");
        }
        this.weight = weight;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        if (height == null || height <= 0) {
            throw new IllegalArgumentException("Height must be greater than zero.");
        }
        this.height = height;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        if (activity == null) {
            throw new IllegalArgumentException("Activity cannot be null.");
        }
        this.activity = activity;
    }

    public Goal getGoal() {
        return goal;
    }

    public void setGoal(Goal goal) {
        if (goal == null) {
            throw new IllegalArgumentException("Goal cannot be null.");
        }
        this.goal = goal;
    }

    public Double bmi() {
        double heightInMeters = height / 100.0;
        return weight / Math.pow(heightInMeters, 2);
    }

    public Double bmr() {
        return switch (gender) {
            case MALE -> 66.5 + (13.75 * weight) + (5.003 * height) - (6.755 * age);
            case FEMALE -> 655.1 + (9.563 * weight) + (1.85 * height) - (4.676 * age);
        };
    }

    public Double tdee() {
        return switch (activity) {
            case SEDENTARY -> bmr() * 1.2;
            case LIGHT -> bmr() * 1.375;
            case MODERATE -> bmr() * 1.55;
            case HEAVY -> bmr() * 1.725;
        };
    }

    public Double dailyCaloriesGoal() {
        return switch (goal) {
            case LOSE_WEIGHT -> tdee() - 500;
            case GAIN_WEIGHT -> tdee() + 500;
            case STAY_HEALTHY -> tdee();
        };
    }

    public Double dailyProteinGoal() {
        return switch (goal) {
            case LOSE_WEIGHT -> weight * 2.0;
            case GAIN_WEIGHT -> weight * 1.8;
            case STAY_HEALTHY -> weight * 1.5;
        };
    }

    @Override
    public String toString() {
        return String.format("""
                User Profile
                Name: %s
                Gender: %s
                Age: %d
                Weight: %.2f kg
                Height: %.2f cm
                Activity level: %s
                Goal: %s
                
                BMI: %.2f
                BMR: %.2f kcal
                TDEE: %.2f kcal
                Daily calories goal: %.2f kcal
                Daily protein goal: %.2fg
                """,
                name,
                gender,
                age,
                weight,
                height,
                activity,
                goal,
                bmi(),
                bmr(),
                tdee(),
                dailyCaloriesGoal(),
                dailyProteinGoal()
        );
    }
}
