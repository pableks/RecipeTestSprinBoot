package com.duoc.seguridad_calidad.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Recipe {
    private String id;
    private String name;
    private String createdBy;
    private int preparationTime;
    private String difficulty;
    private String ingredients; // This will hold the raw string from the form
    private List<String> ingredientList; // This will hold the parsed list of ingredients
    private String preparation;

    // Default constructor
    public Recipe() {}

    // Constructor with List<String> for ingredients
    public Recipe(String id, String name, String createdBy, int preparationTime, String difficulty, List<String> ingredientList, String preparation) {
        this.id = id;
        this.name = name;
        this.createdBy = createdBy;
        this.preparationTime = preparationTime;
        this.difficulty = difficulty;
        this.setIngredientList(ingredientList);
        this.preparation = preparation;
    }

    // Constructor with String for ingredients
    public Recipe(String id, String name, String createdBy, int preparationTime, String difficulty, String ingredients, String preparation) {
        this.id = id;
        this.name = name;
        this.createdBy = createdBy;
        this.preparationTime = preparationTime;
        this.difficulty = difficulty;
        this.setIngredients(ingredients);
        this.preparation = preparation;
    }

    // Getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public int getPreparationTime() {
        return preparationTime;
    }

    public void setPreparationTime(int preparationTime) {
        this.preparationTime = preparationTime;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
        this.ingredientList = ingredients != null ? Arrays.asList(ingredients.split("\\r?\\n")) : new ArrayList<>();
    }

    public List<String> getIngredientList() {
        return ingredientList;
    }

    public void setIngredientList(List<String> ingredientList) {
        this.ingredientList = ingredientList;
        this.ingredients = ingredientList != null ? String.join("\n", ingredientList) : "";
    }

    public String getPreparation() {
        return preparation;
    }

    public void setPreparation(String preparation) {
        this.preparation = preparation;
    }
}