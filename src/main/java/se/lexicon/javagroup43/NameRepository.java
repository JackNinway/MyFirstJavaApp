package se.lexicon.javagroup43;
import java.util.Arrays;

public class NameRepository {

    private static String[] names = new String[0];

    public static void main(String[] args) {
        String ourStrArr[] = {"Klar Diamant", "Röd Rubin", "Blå Safir", "Klar Kristall", "Äkta Rubin"};
        String[] fStrArr;
        System.out.println("Calling getSize, length is:  " + getSize());
        setNames(ourStrArr);
        fStrArr = findAll();
        System.out.println("returned string array to main is:  ");
        System.out.println(Arrays.toString(fStrArr));
        System.out.println("calling find for name: Grön Smaragd  ");
//        find("Röd Rubin");
        System.out.println("found the string:  " + find("Röd Rubin"));
        System.out.println("Adding an element to the array:  ");
        add("Grön Smaragd");
        System.out.println("The new array is :  " + Arrays.toString(names));
        System.out.println("Calling findByFirstName for firstname: - Klar -");
//        findByFirstName("Rubin");
        System.out.println(Arrays.toString(findByFirstName("Klar")));
        System.out.println("Calling findByLasttName for lastname: - Rubin -");
        System.out.println(Arrays.toString(findByLastName("Rubin")));
        System.out.println("Calling update for name: - Blå Safir-");
        update("Blå Safir", "Blå Opal");
        System.out.println(Arrays.toString(names));
        remove("Röd Rubin");
        System.out.println(Arrays.toString(names));
        clear();
    }

    //Returns number of elements in the array
    public static int getSize() {
//        System.out.println("Calling getSize, length is:  " + names.length );
        return names.length;
    }

    // Sends in an array that set the private static array.
// This should replace all existing names.
    public static void setNames(String[] names) {
        NameRepository.names = Arrays.copyOf(names, names.length);
        System.out.println("Calling setNames");
        System.out.println(Arrays.toString(NameRepository.names));
    }

    //    Should completely empty the array.
    public static void clear() {
        names = new String[0];
        System.out.println("Calling clear which array length is:  " + names.length);
        System.out.println(Arrays.toString(names));
    }

    //    Returns all names in a new array
    public static String[] findAll() {
        String[] foundNames;//= new String[1];
        System.out.println("Calling findAll  ");
        foundNames = Arrays.copyOf(names, names.length);
        System.out.println(Arrays.toString(foundNames));

        return foundNames;
    }

    //    Returns name if found and null if not found.
    public static String find(final String fullName) {
        String foundName = fullName;

        for (int i = 0; i < names.length; i++) {
            if (fullName == names[i])
                return fullName;
        }
        return null;
    }

    //    Should add a new name to the array. Returns true when name was added and false when the array contains
    //    the name
    public static boolean add(final String fullName) {
        String[] tmpArr;
        for (int i = 0; i < names.length; i++) {
            if (fullName == names[i]) {
                System.out.println("Name already exists in the array");
                return false;
            }
        }
        tmpArr = Arrays.copyOf(names, (names.length + 1));
        tmpArr[names.length] = fullName;
        names = Arrays.copyOf(tmpArr, tmpArr.length);
        return true;
    }

    //    Searches the array trying to find all names that has passed in first name. Returns a String array containing all
    //    matches.
    public static String[] findByFirstName(final String firstName) {
        String[] foundNames = new String[0];
        int c = 0;
        for (int i = 0; i < names.length; i++) {
            if (names[i].startsWith(firstName)) {
                foundNames = Arrays.copyOf(foundNames, c + 1);
                foundNames[c] = names[i];
                c++;
            }
        }
        return foundNames;

    }
//    Searches the array trying to find all names that has passed in last name. Returns a String array containing all
//    matches.

    /**
     * Should find a name and replace it with new fullName if available.Returns true if name was found and updated
     * with the new name. False if name could not be updated because name wasn’t found or name was found but an
     * existing name matching the updatedName already exists.
     */

    public static boolean update(final String original, final String updatedName) {
        boolean rF = false;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(original)) {
                names[i] = updatedName;
                rF = true;
            } else if (names[i].equalsIgnoreCase(updatedName)) {
                System.out.println("already updated");
                rF = false;
            } else if (!(names[i].equalsIgnoreCase(original))) {
                rF = false;
            }
        }
        return rF;
    }

    public static String[] findByLastName(final String lastName) {
        String[] foundNames = new String[0];
        int c = 0;
        for (int i = 0; i < names.length; i++) {
            if (names[i].endsWith(lastName)) {
                foundNames = Arrays.copyOf(foundNames, c + 1);
                foundNames[c] = names[i];
                c++;
            }
        }
        return foundNames;
    }

    //    Should remove a name from the array. Returns true if name was removed and false if the name was not
//    removed for some reason
    public static boolean remove(final String fullName) {
        String[] tmpArr = new String[names.length];
        boolean rF = false;
        int c = 0;
        for (int i = 0; i < names.length; i++) {
            if (!names[i].equals(fullName)) {
                tmpArr[c] = names[i];
                c++;
                rF = false;
            }
            if (names[i].equals(fullName))
                tmpArr = Arrays.copyOf(tmpArr,tmpArr.length-1);
        }
        names = Arrays.copyOf(tmpArr, tmpArr.length);
        if (tmpArr.length < names.length)
            return true;
        else
            return rF;
    }
}