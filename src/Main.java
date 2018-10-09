public class Main {

    public static void main(String[] args) {

        User Jessalyn = new User("Jessalyn", "Chen", "jessalyn.chen@mail.utoronto.ca", 85);

        System.out.println("My First name is " + Jessalyn.getFirstName() );

        System.out.println("My last name is " + Jessalyn.getLastName());

        System.out.println("My Email address is " + Jessalyn.getEmail());

        System.out.println("My goal for complete meals is " + Jessalyn.getTargetAdherence() + "%");

        Food Icecream = new Food("Icecream", 15, 50, 10, Category.Fat);
        Food Salad = new Food("Salad", 45, 70, 80, Category.Vegetable);
        Food Candy = new Food("Candy", 10, 20, 10, Category.Fat);

        System.out.println("I'm eating in this meal is " + Icecream.getName());

        Icecream.addCategory(Category.Fat);

        System.out.println("The main food group is" + Icecream.getCategory());

        System.out.println("Roti has " + Salad.getCalories() + " calories");

        System.out.println("Roti has " + Salad.getCarbs() + " grams of carbohydrates");

        System.out.println("Roti has " + Salad.getFat() + " grams of fat");

        System.out.println("Roti has " + Salad.getProtein() + " grams of protein");

        System.out.println("....");

        Meal meal = new Meal("Dinner");

        meal.addFood(Salad);
        meal.addFood(Icecream);
        meal.addFood(Candy);

        System.out.println("This meal is called " + meal.getName());
        System.out.println("This meal consists of");
        meal.viewFoods();

        System.out.println("....");

        System.out.println("I am eating Dinner at " + meal.getMealTime());
        System.out.println("Dinner has " + meal.getCalories() + " calories");
        System.out.println("Dinner has " + meal.getCarbs() + " carbs");
        System.out.println("Dinner has " + meal.getProtein() + " protein");
        System.out.println("Dinner has " + meal.getFat() + " fat");

        if (meal.isComplete()) {
            System.out.println("Dinner is complete");
        } else {
            System.out.println("Dinner is not complete");
        }

        System.out.println(".....");

        MealTracker Monday = new MealTracker(userMeal);
        Monday.addMeal(meal);

        System.out.println("My meals for the day include");
        Monday.viewMeals();

        if (Monday.onTrack()) {
            System.out.println("This meal is keeping me on track");
        } else {
            System.out.println("I am not currently on track for my daily eating needs");
        }

        System.out.println("Today I have eaten a total of " + Monday.getMealCount() + " meals");
        System.out.println("Today I had a total of " + Monday.getAdherence() + " complete meals");
    }
    }
