package ch.bbw.streams.start;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class Uebungen3 {

    public static void main(String[] args) {

        HashMap<String, ArrayList<Person>> contacts = new HashMap<>();
        contacts.put("phoneBook1", new ArrayList<>());
        contacts.put("phoneBook2", new ArrayList<>());
        contacts.put("phoneBook3", new ArrayList<>());

        {
            contacts.get("phoneBook1").add( new Person("Zenia", "Estes", 1.82, 37));
            contacts.get("phoneBook1").add( new Person("Tatyana", "Ramirez", 1.65, 37));
            contacts.get("phoneBook1").add( new Person("Abbot", "Burris", 1.82, 38));
            contacts.get("phoneBook1").add( new Person("Keaton", "Riddle", 1.53, 43));
            contacts.get("phoneBook1").add( new Person("Dorian", "Rasmussen", 1.57, 38));
            contacts.get("phoneBook1").add( new Person("Kylee", "Boyd", 1.66, 41));
            contacts.get("phoneBook1").add( new Person("Ferdinand", "Hernandez", 1.82, 44));
            contacts.get("phoneBook1").add( new Person("Jorden", "Gamble", 1.68, 37));
            contacts.get("phoneBook1").add( new Person("Evelyn", "Pugh", 1.55, 41));
            contacts.get("phoneBook1").add( new Person("Tamara", "Bradshaw", 1.63, 42));
            contacts.get("phoneBook1").add( new Person("Ezekiel", "Morrow", 1.55, 41));
            contacts.get("phoneBook1").add( new Person("Sara", "Warner", 1.8, 40));
            contacts.get("phoneBook1").add( new Person("Driscoll", "Burch", 1.74, 35));
            contacts.get("phoneBook1").add( new Person("Charissa", "Fulton", 1.91, 42));
            contacts.get("phoneBook1").add( new Person("Hilel", "Tyson", 1.52, 41));
            contacts.get("phoneBook1").add( new Person("Warren", "Holmes", 1.86, 42));
            contacts.get("phoneBook1").add( new Person("Aladdin", "Meyer", 1.76, 42));
            contacts.get("phoneBook1").add( new Person("Geoffrey", "Lindsay", 1.67, 39));
            contacts.get("phoneBook1").add( new Person("Bevis", "Wilcox", 1.59, 43));
            contacts.get("phoneBook1").add( new Person("Kylee", "Barber", 1.61, 44));
            contacts.get("phoneBook1").add( new Person("Gretchen", "Mcintyre", 1.68, 44));
            contacts.get("phoneBook1").add( new Person("Lucius", "Bauer", 1.83, 42));
            contacts.get("phoneBook1").add( new Person("Lillian", "Welch", 1.76, 44));
            contacts.get("phoneBook1").add( new Person("Steel", "Hoffman", 1.66, 39));

            contacts.get("phoneBook2").add( new Person("Brenden", "Wong", 1.7, 40));
            contacts.get("phoneBook2").add( new Person("Michael", "Boyd", 1.53, 38));
            contacts.get("phoneBook2").add( new Person("Aurelia", "Holt", 1.92, 35));
            contacts.get("phoneBook2").add( new Person("Mercedes", "Arnold", 1.66, 44));
            contacts.get("phoneBook2").add( new Person("Patience", "Vaughan", 1.54, 44));
            contacts.get("phoneBook2").add( new Person("Lionel", "Day", 1.5, 41));
            contacts.get("phoneBook2").add( new Person("Orlando", "Compton", 1.85, 37));
            contacts.get("phoneBook2").add( new Person("Cora", "Holmes", 1.74, 41));
            contacts.get("phoneBook2").add( new Person("Lydia", "Mccormick", 1.73, 38));
            contacts.get("phoneBook2").add( new Person("Lysandra", "Rollins", 1.61, 44));
            contacts.get("phoneBook2").add( new Person("Brenda", "Mercer", 1.6, 44));
            contacts.get("phoneBook2").add( new Person("Roary", "Ruiz", 1.88, 38));
            contacts.get("phoneBook2").add( new Person("Kyra", "Roy", 1.86, 42));
            contacts.get("phoneBook2").add( new Person("Maggy", "Ray", 1.76, 40));
            contacts.get("phoneBook2").add( new Person("Darrel", "Browning", 1.79, 38));
            contacts.get("phoneBook2").add( new Person("Hanae", "Brock", 1.59, 44));
            contacts.get("phoneBook2").add( new Person("Kaye", "Day", 1.54, 42));
            contacts.get("phoneBook2").add( new Person("Lev", "Parks", 1.52, 37));
            contacts.get("phoneBook2").add( new Person("Brenden", "Fields", 1.74, 38));
            contacts.get("phoneBook2").add( new Person("Noel", "Sharp", 1.9, 35));
            contacts.get("phoneBook2").add( new Person("Hamilton", "Poole", 1.61, 42));
            contacts.get("phoneBook2").add( new Person("Jonah", "Roach", 1.71, 37));
            contacts.get("phoneBook2").add( new Person("Joel", "Rasmussen", 1.57, 42));
            contacts.get("phoneBook2").add( new Person("Rudyard", "Bass", 1.59, 44));
            contacts.get("phoneBook2").add( new Person("Simone", "Adkins", 1.58, 42));
            contacts.get("phoneBook2").add( new Person("Quintessa", "Ball", 1.79, 40));
            contacts.get("phoneBook2").add( new Person("Caleb", "Barton", 1.84, 43));
            contacts.get("phoneBook2").add( new Person("Cassady", "Britt", 1.65, 41));
            contacts.get("phoneBook2").add( new Person("Chancellor", "Roberts", 1.84, 38));
            contacts.get("phoneBook2").add( new Person("Moses", "Kent", 1.66, 41));
            contacts.get("phoneBook2").add( new Person("Ivy", "Mathis", 1.87, 44));
            contacts.get("phoneBook2").add( new Person("Yuri", "Boyd", 1.67, 42));
            contacts.get("phoneBook2").add( new Person("Oliver", "Hancock", 1.91, 36));
            contacts.get("phoneBook2").add( new Person("Rogan", "Travis", 1.94, 43));
            contacts.get("phoneBook2").add( new Person("Teagan", "Christensen", 1.92, 36));
            contacts.get("phoneBook2").add( new Person("Drew", "Mccray", 1.57, 37));
            contacts.get("phoneBook2").add( new Person("Lillith", "Perry", 1.85, 35));
            contacts.get("phoneBook2").add( new Person("Paki", "Beasley", 1.55, 40));
            contacts.get("phoneBook2").add( new Person("Ignatius", "Hancock", 1.83, 36));
            contacts.get("phoneBook2").add( new Person("Regina", "Faulkner", 1.64, 38));
            contacts.get("phoneBook2").add( new Person("Garrison", "Murphy", 1.59, 36));
            contacts.get("phoneBook2").add( new Person("Clark", "Hopkins", 1.67, 40));
            contacts.get("phoneBook2").add( new Person("Warren", "Wise", 1.81, 44));
            contacts.get("phoneBook2").add( new Person("Maggy", "Collins", 1.87, 38));
            contacts.get("phoneBook2").add( new Person("Amela", "Solomon", 1.71, 42));
            contacts.get("phoneBook2").add( new Person("Maryam", "Perry", 1.67, 36));
            contacts.get("phoneBook2").add( new Person("Deacon", "Perry", 1.84, 43));
            contacts.get("phoneBook2").add( new Person("TaShya", "Sutton", 1.51, 44));
            contacts.get("phoneBook2").add( new Person("Stacey", "Glover", 1.56, 42));
            contacts.get("phoneBook2").add( new Person("Shay", "Wheeler", 1.76, 39));
            contacts.get("phoneBook2").add( new Person("Carla", "Velazquez", 1.61, 42));
            contacts.get("phoneBook2").add( new Person("Chase", "Boyd", 1.73, 38));

            contacts.get("phoneBook3").add( new Person("Keegan", "Shannon", 1.86, 43));
            contacts.get("phoneBook3").add( new Person("Ciaran", "Farmer", 1.94, 36));
            contacts.get("phoneBook3").add( new Person("Tyrone", "Moreno", 1.84, 42));
            contacts.get("phoneBook3").add( new Person("Sierra", "Burt", 1.8, 44));
            contacts.get("phoneBook3").add( new Person("Judah", "Barnes", 1.77, 39));
            contacts.get("phoneBook3").add( new Person("Maxwell", "Strong", 1.61, 37));
            contacts.get("phoneBook3").add( new Person("Tashya", "Garner", 1.83, 40));
            contacts.get("phoneBook3").add( new Person("Jaquelyn", "Osborne", 1.74, 42));
            contacts.get("phoneBook3").add( new Person("Leandra", "Wilkins", 1.79, 37));
            contacts.get("phoneBook3").add( new Person("Colt", "Hoffman", 1.94, 41));
            contacts.get("phoneBook3").add( new Person("Calvin", "Ingram", 1.66, 36));
            contacts.get("phoneBook3").add( new Person("Pamela", "Atkinson", 1.67, 44));
            contacts.get("phoneBook3").add( new Person("Nadine", "Russo", 1.74, 42));
            contacts.get("phoneBook3").add( new Person("Flavia", "Logan", 1.83, 41));
            contacts.get("phoneBook3").add( new Person("Duncan", "Tate", 1.72, 40));
            contacts.get("phoneBook3").add( new Person("Yasir", "Cobb", 1.74, 43));
            contacts.get("phoneBook3").add( new Person("Elijah", "Anderson", 1.76, 40));
            contacts.get("phoneBook3").add( new Person("Gail", "Wong", 1.53, 44));
            contacts.get("phoneBook3").add( new Person("Macy", "Moss", 1.5, 39));
            contacts.get("phoneBook3").add( new Person("Callum", "Day", 1.82, 44));
            contacts.get("phoneBook3").add( new Person("Kylan", "Walls", 1.64, 39));
            contacts.get("phoneBook3").add( new Person("Cynthia", "Black", 1.72, 42));
            contacts.get("phoneBook3").add( new Person("Natalie", "Hancock", 1.54, 42));
            contacts.get("phoneBook3").add( new Person("Walker", "Justice", 1.66, 39));
        }

    }

}
