public abstract class skills {
    
    //variables to hold skill data and name
    protected String name;
    protected String skillType;
    protected int skillLevel;
    
    //constructor for abstract class
    public skills(String name, String skillType, int skillLevel){
        this.name = name;
        this.skillType = skillType;
        this.skillLevel = skillLevel;
    }
    
    //getter methods for name, skillType, and skillLevel
    public String getName(){
        return name;
    }
    
    public String getSkillType(){
        return skillType;
    }
    
    public int getSkillLevel(){
        return skillLevel;
    }
    
    //abstract method that identifies the skill, level of skill, and name
    public abstract void whatSkill();
    
}