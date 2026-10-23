package com.awakhiwe.smartpantrymanager.data;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

/**
 * One item in the user's pantry. Each object becomes a row in the "ingredients" table.
 */
@Entity(tableName = "ingredients")
public class Ingredient {

    @PrimaryKey(autoGenerate = true)
    public int id;

    public String name;        // e.g. "tomato"
    public double quantity;    // e.g. 3
    public String unit;        // e.g. "pcs", "g", "ml"
    public String expiryDate;  // optional, format yyyy-MM-dd, may be null

    public Ingredient(String name, double quantity, String unit, String expiryDate) {
        this.name = name;
        this.quantity = quantity;
        this.unit = unit;
        this.expiryDate = expiryDate;
    }
}