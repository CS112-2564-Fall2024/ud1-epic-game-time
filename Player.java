public class Player {
    
    /* Still lots of work to do
     * need to set up abstract method for attacking dependent on the class type (most likley 4)
     * class types must be factored in aswell but those classes will be built seperatly
     */


    // setting default variables
    public final static String DEFAULT_PLAYER_NAME = "Thorfin";
    public final static String DEFAULT_CLASS_TYPE = "Viking";
    public final static int DEFAULT_HEALTH_POINTS = 10;
    public final static int DEFAULT_ACTION_POINTS = 5;
    //public final static String DEFAULT_WEAPON = "fist";
    //public final static String DEFAULT_ARMOR = null;

    // will add variable weapon/armor after those classes have been created 
    String name;
    String classType;
    int health;
    int actionPoints;
    //String weapon
    //String armor

    //CONSTRUCTORS
    public Player() {
        this(DEFAULT_PLAYER_NAME, DEFAULT_CLASS_TYPE, DEFAULT_HEALTH_POINTS, DEFAULT_ACTION_POINTS);
    }

    public Player(String name, String classType, int health, int actionPoints) {
        this.name = name;
        this.classType = classType;
        this.health = health;
        this.actionPoints = actionPoints;
    }

    //MUTATOR METHODS (GETTER/SETTERS)
    public String getName() {
        return name;
    }

    public boolean setName(String name) {
        if (name != null && name.length() > 0) {    
            this.name = name;
            return true;
        } else {
            return false;
        }
    }


    public String getClassType(){
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }


    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }


    public int getActionPoints() {
        return actionPoints;
    }

    public void setActionPoints(int actionPoints) {
        this.actionPoints = actionPoints;
    }

    //Will build setter/getters for weapon and armor 
    @Override
    public String toString() {
        return "\n[Name: " + name  + "]" +
                "\n[Class Type: " + classType + "]" +
                "\n[Current HP: " + health + "]" +
                "\n[Action Points: " + actionPoints + "]"; //+
              //"\n[Weapon: " + weapon + "]" +
             //"\n[Armor: " + armor + "]";
    }

}