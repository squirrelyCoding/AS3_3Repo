public class hardSkills extends skills {
    //hard skills class that gets the name of skill, skill level, and skill type

    public hardSkills(String name, int skillLevel){
        //gets the protected information in the variables located in the skills file
        super(name, "hard", skillLevel);
    }

    //method that outputs the skill type, name of skill, and skill level
    public void whatSkill(){
        System.out.println("The " + skillType + " skill of " + getName() + " has a skill level of " + getSkillLevel());
    }
}
