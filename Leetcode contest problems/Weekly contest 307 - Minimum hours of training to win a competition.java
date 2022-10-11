class Solution {
    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int currentEnergy = initialEnergy;
        int currentExperience = initialExperience;
        int ans = 0;
        int diff = 0;
        for (int i = 0; i < energy.length; i++) {
            if (energy[i] >= currentEnergy) {   
                diff = energy[i] - currentEnergy + 1;
                ans = ans + diff;
                currentEnergy = currentEnergy + diff;
            }
            currentEnergy = currentEnergy - energy[i];
            if (experience[i] >= currentExperience) {
                diff = experience[i] - currentExperience + 1;
                ans = ans + diff;
                currentExperience = currentExperience + diff;
            }
            currentExperience = currentExperience + experience[i];
        }
        return ans;
    }
}
