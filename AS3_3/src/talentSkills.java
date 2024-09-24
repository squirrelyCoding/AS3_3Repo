public class talentSkills extends skills {
    //talent skills class that gets the name of skill, skill level, and skill type

    public talentSkills(String name, int skillLevel){
        //gets the protected information in the variables located in the skills file
        super(name, "talent", skillLevel);
    }

    //method that outputs the skill type, name of skill, and skill level
    public void whatSkill() {
        System.out.println("The " + skillType + " skill of " + getName() + " has a skill level of " + getSkillLevel());
    }
}