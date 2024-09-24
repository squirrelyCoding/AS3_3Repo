public class hardSkills extends skills {
    
    public hardSkills(String name, int skillLevel){
        super(name, "hard", skillLevel);
    }


    public void whatSkill(){
        System.out.println("The " + skillType + " skill of " + getName() + " has a skill level of " + getSkillLevel());
    }
}
