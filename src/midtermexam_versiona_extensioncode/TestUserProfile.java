package midtermexam_versiona_extensioncode;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
import java.util.Scanner;

public class TestUserProfile 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to My Page!");

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Choose your favorite genre:");
        System.out.println("1. Action");
        System.out.println("2. Comedy");
        System.out.println("3. Drama");
        System.out.println("4. Mystery");
        System.out.println("5. Horror");

        
        System.out.print("Enter the number corresponding to your favorite genre: ");
        int genreChoice = scanner.nextInt();
        String genre;
        switch (genreChoice) {
            case 1:
                genre = "Action";
                break;
            case 2:
                genre = "Comedy";
                break;
            case 3:
                genre = "Drama";
                break;
            case 4:
                genre = "Mystery";
                break;
            case 5:
                genre = "Horror";
                break;
            default:
                genre = "Unknown";
                break;
        }

        UserProfile userProfile = new UserProfile(name, genre);
        System.out.println("Your user profile was created successfully.");
        System.out.println(userProfile);
    }
}

class UserProfile {
    private String name;
    private String favoriteGenre;

    public UserProfile(String name, String favoriteGenre) {
        this.name = name;
        this.favoriteGenre = favoriteGenre;
    }

    @Override
    public String toString() {
        return "User Profile {" +
                "Name: '" + name + '\'' +
                ", Favorite Genre: '" + favoriteGenre + '\'' +
                '}';
    }
}
